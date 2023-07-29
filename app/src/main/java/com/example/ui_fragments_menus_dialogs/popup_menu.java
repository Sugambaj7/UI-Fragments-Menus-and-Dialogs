package com.example.ui_fragments_menus_dialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class popup_menu extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);
        b1 = findViewById(R.id.click_btn);
    }
    public void buttonClicked(View v){
        PopupMenu popupMenu = new PopupMenu(this,b1);
        popupMenu.getMenuInflater().inflate(R.menu.my_popup_menus,popupMenu.getMenu());
        popupMenu.show();
    }

}