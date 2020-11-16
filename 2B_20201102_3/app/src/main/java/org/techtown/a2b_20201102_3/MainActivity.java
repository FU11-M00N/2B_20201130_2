package org.techtown.a2b_20201102_3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    MenuItem itemRed, itemGreen, itemBlue, itemZoom,itemRotate;
    Button button1,btnMenu;
    LinearLayout container;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        btnMenu = findViewById(R.id.btnMenu);
        container = findViewById(R.id.container);
        itemRed = findViewById(R.id.itemRed);
        itemGreen = findViewById(R.id.itemGreen);
        itemBlue = findViewById(R.id.itemBlue);
        itemRotate= findViewById(R.id.itemRotate);
        itemZoom = findViewById(R.id.itemZoom);
        registerForContextMenu(btnMenu);



    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();


        if(v == btnMenu){
            menu.setHeaderTitle("배경색 변경");
            menuInflater.inflate(R.menu.menu2,menu);
        }

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.itemRed: container.setBackgroundColor(Color.RED);
                break;
            case R.id.itemGreen: container.setBackgroundColor(Color.GREEN);
                break;
            case R.id.itemBlue: container.setBackgroundColor(Color.BLUE);
                break;

        }

        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflate = getMenuInflater();
        menuInflate.inflate(R.menu.menu1,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemRed: container.setBackgroundColor(Color.RED);
                break;
            case R.id.itemGreen: container.setBackgroundColor(Color.GREEN);
                break;
            case R.id.itemBlue: container.setBackgroundColor(Color.BLUE);
                break;
            case R.id.itemRotate: button1.setRotation(45);
                break;
            case R.id.itemZoom: button1.setScaleX(2);
                button1.setScaleY(2);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}