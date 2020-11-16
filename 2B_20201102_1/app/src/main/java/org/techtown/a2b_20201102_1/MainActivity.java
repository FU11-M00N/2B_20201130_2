package org.techtown.a2b_20201102_1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtNum1, edtNum2;
    Button btnCalc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);
        btnCalc = findViewById(R.id.btnCalc);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                int num1 = Integer.parseInt(edtNum1.getText().toString());
                int num2 = Integer.parseInt(edtNum2.getText().toString());
                intent.putExtra("num1",num1);
                intent.putExtra("num2",num2);
                startActivityForResult(intent,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode==RESULT_OK){
            Toast.makeText(getApplicationContext(),"결과: "+ data.getIntExtra("hap",0),Toast.LENGTH_LONG).show();
        }
    }
}