package org.techtown.a2b_20201005_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnFirst, btnSecond, btnThird,btnRun;
        btnFirst = findViewById(R.id.btnFirst);
        btnRun= findViewById(R.id.btnRun);

        btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnFirst.setTextSize(30);
                btnFirst.setText("첫번째 버튼");
            }
        });


}
}
