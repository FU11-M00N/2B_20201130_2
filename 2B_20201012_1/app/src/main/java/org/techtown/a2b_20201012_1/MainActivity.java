package org.techtown.a2b_20201012_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtNum1,edtNum2;
    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9;
    Button btn_add,btn_sub,btn_div,btn_mul;
    TextView tvResult;
    Button arrBtn[] = new Button[10];
    int btnId [] = {R.id.btn_0, R.id.btn_1, R.id.btn_2, R.id.btn_3, R.id.btn_4,
                    R.id.btn_5, R.id.btn_6, R.id.btn_7, R.id.btn_8, R.id.btn_9
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1= findViewById(R.id.edtNum1);
        edtNum2= findViewById(R.id.edtNum2);
        btn_add=findViewById(R.id.btn_add);
        btn_sub=findViewById(R.id.btn_sub);
        btn_mul=findViewById(R.id.btn_mul);
        btn_div=findViewById(R.id.btn_div);
        tvResult=findViewById(R.id.tvResult);

       /* btn_0=findViewById(R.id.btn_0);
        btn_1=findViewById(R.id.btn_1);
        btn_2=findViewById(R.id.btn_2);
        btn_3=findViewById(R.id.btn_3);
        btn_4=findViewById(R.id.btn_4);
        btn_5=findViewById(R.id.btn_5);
        btn_6=findViewById(R.id.btn_6);
        btn_7=findViewById(R.id.btn_7);
        btn_8=findViewById(R.id.btn_8);
        btn_9=findViewById(R.id.btn_9);

        */
        for(int i=0; i<arrBtn.length; i++){
            arrBtn[i] = findViewById(btnId[i]);

        }
        for(int i=0; i<arrBtn.length; i++){
            final int i2=i;
        arrBtn[i].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtNum1.isFocused()) {
                    //  edtNum1.setText(btn_1.getText().toString); 이렇게하면 한개만드감 ex) 1 o 11 x
                    String str = edtNum1.getText().toString() + arrBtn[i2].getText().toString();
                    edtNum1.setText(str);
                     }
                else if (edtNum2.isFocused()){
                    String str = (edtNum2.getText().toString()) + (arrBtn[i2].getText().toString());
                    edtNum2.setText(str);
                     }
                }
            });
        }




        btn_add.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int num1 = Integer.parseInt(edtNum1.getText().toString());
                int num2 = Integer.parseInt(edtNum2.getText().toString());

                tvResult.setText("결괏 값: " + (num1+num2));

                return false;
            }
        });
        btn_sub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int num1 = Integer.parseInt(edtNum1.getText().toString());
                int num2 = Integer.parseInt(edtNum2.getText().toString());

                tvResult.setText("결괏 값: " + (num1-num2));

                return false;
            }
        });
        btn_mul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int num1 = Integer.parseInt(edtNum1.getText().toString());
                int num2 = Integer.parseInt(edtNum2.getText().toString());

                tvResult.setText("결괏 값: " + (num1*num2));

                return false;
            }
        });
        btn_div.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int num1 = Integer.parseInt(edtNum1.getText().toString());
                int num2 = Integer.parseInt(edtNum2.getText().toString());

                tvResult.setText("결괏 값: " + (num1/num2));

                return false;
            }
        });
    }
}
