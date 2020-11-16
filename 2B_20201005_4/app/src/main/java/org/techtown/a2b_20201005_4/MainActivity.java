package org.techtown.a2b_20201005_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtNum1,edtNum2;
    Button btnAdd, btnSub , btnMul , btnDiv;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("미니 계산기");
        edtNum1= findViewById(R.id.edtNum1);
        edtNum2= findViewById(R.id.edtNum2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        tvResult = findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edtNum1.getText().toString());
                int num2 = Integer.parseInt(edtNum2.getText().toString());
                tvResult.setText("계산결과" + (num1+num2));
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edtNum1.getText().toString());
                int num2 = Integer.parseInt(edtNum2.getText().toString());
                tvResult.setText("계산결과" + (num1-num2));
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edtNum1.getText().toString());
                int num2 = Integer.parseInt(edtNum2.getText().toString());
                tvResult.setText("계산결과" + (num1*num2));
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
            int num1 = Integer.parseInt(edtNum1.getText().toString());
            int num2 = Integer.parseInt(edtNum2.getText().toString());
            tvResult.setText("계산결과" + (num1/num2));
        }
    });
    }
}
