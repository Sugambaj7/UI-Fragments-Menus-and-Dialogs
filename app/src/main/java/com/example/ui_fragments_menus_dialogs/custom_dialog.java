package com.example.ui_fragments_menus_dialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class custom_dialog extends AppCompatActivity {
    TextView l,b,result;
    Button calc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_main);
        showDialog();
    }

    public void showDialog(){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_custom_dialog);
        calc= dialog.findViewById(R.id.calc_btn);
        l = dialog.findViewById(R.id.editTextLength);
        b = dialog.findViewById(R.id.editTextBreadth);
        result = dialog.findViewById(R.id.result);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                try{
                    double len = Double.parseDouble(l.getText().toString());
                    double bre = Double.parseDouble(b.getText().toString());

                    double output1 = len*bre;
                    result.setText("Your Area of Rectangle:" +" " + output1);
                }
                catch (NumberFormatException e){
                    result.setText("Please enter valid number!!!");
                }
            }
        });
        dialog.show();
    }
}