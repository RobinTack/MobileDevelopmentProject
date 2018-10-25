package be.pxl.mobiledevelopmentproject;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class RecipesActivity extends AppCompatActivity implements IActionBar {



    @Override
    public void toolbar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Welcome");
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
