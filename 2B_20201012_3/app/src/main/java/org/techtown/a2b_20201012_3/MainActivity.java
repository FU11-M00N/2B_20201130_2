package org.techtown.a2b_20201012_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast = findViewById(R.id.btnToast);
        Toast.makeText(this, "점심메뉴는?", Toast.LENGTH_SHORT).show();
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Toast.makeText(getApplicationContext(),"스팸에 고추장 밥 볶아먹기",Toast.LENGTH_LONG).show();
            }
        });
    }
}
