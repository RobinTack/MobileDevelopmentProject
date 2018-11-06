package be.pxl.mobiledevelopmentproject;

import android.content.Intent;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class IngredientsViewActivityFragment extends android.app.Fragment {
    private ViewGroup container;
    private LayoutInflater inflater;
    private TextView textView;
    private Button button_add;
    private Button findRecipeButton;
    private SQLiteDatabase mDatabase;
    private ConstraintLayout constraintLayoutIng;
    private DatabaseHelper databaseHelper;
    private EditText mEditTextName;


    public IngredientsViewActivityFragment() {
        // Required empty public constructor
    }

/*
    public View initializeUserInterface(){
        View view;

        //if there is already a layout inflated, remove it
        if (container != null){
            container.removeAllViewsInLayout();
        }

        //get screen orientation
        int orientation = getActivity().getResources().getConfiguration().orientation;

        //inflate the appropriate layout based on screen orientation
        if (orientation == Configuration.ORIENTATION_PORTRAIT){
            view = inflater.inflate(R.layout.ingredient_view, container, false);
        }
        else{ // orientation == orientation == Configuration.ORIENTATION_LANDSCAPE
            view = inflater.inflate(R.layout.fragment_ingredients_view_activity, container, false);
        }
        //instantiate widgets from the layout
        button_add = view.findViewById(R.id.button_add);
        findRecipeButton = view.findViewById(R.id.findRecipeButton);


        return view;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Instantiate our container and inflater handles
        this.container = container;
        this.inflater = inflater;

        //Display desired layout and return the view


        return initializeUserInterface();

    }

    /**
     * This is called when the user rotates the device
     * @param newConfig Configuration
     */
/*
    @Override
    public void onConfigurationChanged(Configuration newConfig) {

        //Create the new Layout
        View view = initializeUserInterface();


        //Display the new layout on the screen
        container.addView(view);

        //Call the default method to cover our bases
        super.onConfigurationChanged(newConfig);
    }


    private void onActivityCreated(){
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                mEditTextName = v.findViewById(R.id.edittext_name);
                String name = mEditTextName.getText().toString();

                databaseHelper.insertDataInIngredients(name);

                mEditTextName.getText().clear();

                /*
                Intent intent = new Intent(getActivity(), IngredientsViewActivity.class);
                startActivity(intent);

            }
        });

        findRecipeButton.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), RecipesActivity.class);
                startActivity(intent);
            }
        });
    }

    private void addItem(){

        String name = mEditTextName.getText().toString();
        String neim =
        databaseHelper.insertDataInIngredients(name);
        mEditTextName.getText().clear();

    }
*/
}

