package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.project1.model.Drink;
import com.example.project1.model.DrinkMokup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void btnSubmitOnClick(View view) {
        DrinkMokup database = new DrinkMokup();

        ArrayList<Drink> result = database.getDrinks("view");
        String str="";
        for(Drink d: result){
            str += (d.getName() + "\n");

        }
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
}