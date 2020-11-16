package org.techtown.a2b_20201109_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnOpenMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOpenMenu.findViewById(R.id.btnOpenMenu);
        btnOpenMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                startActivity(intent);
            }
        });

        Toast.makeText(getApplicationContext(), "onCreate() 호출", Toast.LENGTH_SHORT).show();
        println("onCreate() 호출");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart() 호출", Toast.LENGTH_SHORT).show();
        println("onRestart() 호출");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart() 호출", Toast.LENGTH_SHORT).show();
        println("onStart() 호출");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume() 호출", Toast.LENGTH_SHORT).show();
        println("onResume() 호출");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause() 호출", Toast.LENGTH_SHORT).show();
        println("onPause 호출");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop() 호출", Toast.LENGTH_SHORT).show();
        println("onStop() 호출");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy() 호출", Toast.LENGTH_SHORT).show();
        println("onDestroy() 호출");
    }

    private void println(String data) {
        Log.d("2B", data);
    }
}