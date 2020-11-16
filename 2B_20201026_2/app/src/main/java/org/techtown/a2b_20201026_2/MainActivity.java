package org.techtown.a2b_20201026_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {
    RatingBar rBar1, rBar2, rBar3;
    Button btnInc, btnDec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rBar1 = findViewById(R.id.rBar1);
        rBar2 = findViewById(R.id.rBar2);
        rBar3 = findViewById(R.id.rBar3);

        btnInc = findViewById(R.id.btnInc);
        btnDec = findViewById(R.id.btnDec);

        btnInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rBar1.setRating(rBar1.getRating()+rBar1.getStepSize());
                rBar2.setRating(rBar2.getRating()+rBar2.getStepSize());
                rBar3.setRating(rBar3.getRating()+rBar3.getStepSize());
            }
        });

        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rBar1.setRating(rBar1.getRating()-rBar1.getStepSize());
                rBar2.setRating(rBar2.getRating()-rBar2.getStepSize());
                rBar3.setRating(rBar3.getRating()-rBar3.getStepSize());
            }
        });
    }
}