package com.example.ui_fragments_menus_dialogs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.frag_one_btn);
        b2 = findViewById(R.id.frag_two_btn);
    }
    public void fragment1btnClicked(View v){
        Fragment1 fragmentOne = new Fragment1();
        FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_area,fragmentOne);
        transaction.commit();

    }

    public void fragment2btnClicked(View v){
        Fragment2 fragmentTwo = new Fragment2();
        FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_area,fragmentTwo);
        transaction.commit();
    }

}