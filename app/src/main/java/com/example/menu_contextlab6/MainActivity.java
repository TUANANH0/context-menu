package com.example.menu_contextlab6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnChonMau;
    ConstraintLayout manhinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChonMau = findViewById(R.id.button_chonmau);
        manhinh = findViewById(R.id.manhinh);

        registerForContextMenu(btnChonMau);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        getMenuInflater().inflate(R.menu.menu_context, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    public boolean onContextItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.menuDo: {
                manhinh.setBackgroundColor(Color.RED);
            btnChonMau.setText("Mau Do");
            btnChonMau.setBackgroundColor(Color.RED);
                break;
            }

            case R.id.menuVang: {
                manhinh.setBackgroundColor(Color.YELLOW);
                btnChonMau.setText("Mau Vang");
                btnChonMau.setBackgroundColor(Color.YELLOW);
                break;
            }
            case R.id.menuXanh: {
                manhinh.setBackgroundColor(Color.BLUE);
                btnChonMau.setText("Mau Xanh");
                btnChonMau.setBackgroundColor(Color.BLUE);
                break;
            }
        }
        return super.onContextItemSelected(item);
    }

}