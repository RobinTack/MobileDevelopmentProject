package be.pxl.mobiledevelopmentproject;

import android.app.FragmentManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class RecipesActivity extends AppCompatActivity implements IActionBar {
    private ConstraintLayout constraintLayoutIng;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipes_view);

        final TextView recipeTextView = findViewById(R.id.recipeTextView);

        AsyncTask asyncTask = new AsyncTask() {
            @Override
            protected Object doInBackground(Object[] objects) {
                OkHttpClient client = new OkHttpClient();

                Request request = new Request.Builder()
                        .url("https://spoonacular-recipe-food-nutrition-v1.p.mashape.com/recipes/search")
                        .build();

                Response response = null;

                try{
                    response = client.newCall(request).execute();
                    return response.body().string();
                }catch (IOException e){
                    e.printStackTrace();
                }

                return null;
            }

            @Override
            protected void onPostExecute(Object o) {
                recipeTextView.setText(o.toString());

            }
        }.execute();

    }

    @Override
    public void onBackPressed() {
        //clear any existing layouts before popping the stack
        if (constraintLayoutIng != null){
            constraintLayoutIng.removeAllViews();
        }

        //create fragment manager to load previous fragment
        FragmentManager fragmentManager = getFragmentManager();

        //if there are fragments left in the stack, load the previous fragment
        // this may be needed when calling addToBackStack(null) to load fragments
        if (fragmentManager.getBackStackEntryCount() >1){
            fragmentManager.popBackStack();
            return;
        }

        //exit app if there are no more fragments
        super.onBackPressed();
    }

    @Override
    public void toolbar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Welcome");
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
