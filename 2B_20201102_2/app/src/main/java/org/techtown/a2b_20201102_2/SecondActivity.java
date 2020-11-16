package org.techtown.a2b_20201102_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class SecondActivity extends AppCompatActivity {
    Button btnFinish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnFinish = findViewById(R.id.btnFinish);

        Intent intent = getIntent();

        final int num1= intent.getIntExtra("num1",0);
        final int num2= intent.getIntExtra("num2",0);
        final String operator = intent.getStringExtra("operator");

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentResult = new Intent(getApplicationContext(),MainActivity.class);
                if(operator.equals("+")){
                    intentResult.putExtra("result",num1+num2);
                }
                if(operator.equals("-")){
                    intentResult.putExtra("result",num1-num2);
                }
                if(operator.equals("*")){
                    intentResult.putExtra("result",num1*num2);
                }
                if(operator.equals("/")){
                    intentResult.putExtra("result",num1/num2);
                }

                setResult(RESULT_OK,intentResult);
                finish();
            }
        });
    }
}