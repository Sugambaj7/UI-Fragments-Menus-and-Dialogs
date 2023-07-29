package com.example.ui_fragments_menus_dialogs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class context_menu_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);

        TextView options_menu;
        options_menu = findViewById(R.id.view_options);
        registerForContextMenu(options_menu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this,"Item 1 is selected", Toast.LENGTH_SHORT).show();
            case R.id.item2:
                Toast.makeText(this,"Item 2 is selected", Toast.LENGTH_SHORT).show();
            default:
                return super.onContextItemSelected(item);
        }
    }
}