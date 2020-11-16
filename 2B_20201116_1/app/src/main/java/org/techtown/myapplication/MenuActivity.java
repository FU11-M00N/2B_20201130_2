package org.techtown.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    Button btnCustom,btnRevenue,btnProduct;
    public final int REQUEST_Product_CODE = 101;
    public final int REQUEST_Customer_CODE = 102;
    public final int REQUEST_Revenue_CODE = 103;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnCustom = findViewById(R.id.btnCustom);
        btnRevenue = findViewById(R.id.btnRevenue);
        btnProduct = findViewById(R.id.btnProduct);

        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CustomerActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivityForResult(intent,REQUEST_Customer_CODE);
            }
        });
        btnRevenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),RevenueActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivityForResult(intent,REQUEST_Revenue_CODE);
            }
        });
        btnProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),activity_product.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivityForResult(intent,REQUEST_Product_CODE);
            }
        });
    }
}
