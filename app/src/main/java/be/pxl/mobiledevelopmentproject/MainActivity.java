package be.pxl.mobiledevelopmentproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements IActionBar {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_view);

        getSupportActionBar().hide();


        Button startCookingButton = (Button)findViewById(R.id.startCookingButton);

        Button findMarketButton = (Button)findViewById(R.id.findSupermarketButton);

        startCookingButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, IngredientsViewActivity.class));
            }
        });

        findMarketButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, SuperMarketActivity.class));
            }
        });


    }


    public void toolbar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Welcome");
        actionBar.setDisplayHomeAsUpEnabled(true);
    }



    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}