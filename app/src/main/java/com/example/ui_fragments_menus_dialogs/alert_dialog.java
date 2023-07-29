package com.example.ui_fragments_menus_dialogs;

import androidx.appcompat.app.AlertDialog;

import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class alert_dialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
        AlertDialog.Builder alert_dialog = new AlertDialog.Builder(this);
        alert_dialog.setTitle("Terms & Conditions");
        alert_dialog.setIcon(R.drawable.ic_baseline_info_24);
        alert_dialog.setMessage("Have you read Terms and Conditions?");
        alert_dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(alert_dialog.this,"You have read terms and conditions",Toast.LENGTH_SHORT).show();
            }
        });

        alert_dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(alert_dialog.this,"You have not read terms and conditions",Toast.LENGTH_SHORT).show();
            }
        });
        alert_dialog.show();

    }
}