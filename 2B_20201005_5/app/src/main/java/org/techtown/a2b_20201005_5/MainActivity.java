package org.techtown.a2b_20201005_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView textView2;
    CheckBox chkStart;
    RadioGroup rdoGroup1;
    RadioButton rdoDog, rdoCat, rdoRabbit;
    Button btnOk;
    ImageView ivAnimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("애완동물 사진보기");
        btnOk = findViewById(R.id.btnOK);
        textView2 = findViewById(R.id.textView);
        chkStart = findViewById(R.id.chkStart);
        rdoGroup1 = findViewById(R.id.RRDGriup1);
        rdoCat = findViewById(R.id.rdoCat);
        rdoDog = findViewById(R.id.rdoDog);
        rdoRabbit = findViewById(R.id.radiRabbit);
        ivAnimal = findViewById(R.id.ivAnimal);

        chkStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(chkStart.isChecked()==true){
                    textView2.setVisibility(View.VISIBLE);
                    rdoGroup1.setVisibility(View.VISIBLE);
                    btnOk.setVisibility(View.VISIBLE);
                    ivAnimal.setVisibility(View.VISIBLE);
                }else{
                    textView2.setVisibility(View.INVISIBLE);
                    rdoGroup1.setVisibility(View.INVISIBLE);
                    btnOk.setVisibility(View.INVISIBLE);
                    ivAnimal.setVisibility(View.INVISIBLE);
                }
            }
        });

        rdoGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rdoDog:
                        ivAnimal.setImageResource(R.drawable.dog);
                        break;
                    case R.id.rdoCat:
                        ivAnimal.setImageResource(R.drawable.cat);
                        break;
                    case R.id.radiRabbit:
                        ivAnimal.setImageResource((R.drawable.rabbit));
                }
            }
        });

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (rdoGroup1.getCheckedRadioButtonId()) {
                        case R.id.rdoDog:
                        ivAnimal.setImageResource(R.drawable.dog);
                        break;
                        case R.id.rdoCat:
                            ivAnimal.setImageResource(R.drawable.cat);
                            break;
                        case R.id.radiRabbit:
                            ivAnimal.setImageResource((R.drawable.rabbit));
                }
            }
        });

     /*
        chkStart.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true){
                    textView2.setVisibility(View.VISIBLE);
                    rdoGroup1.setVisibility(View.VISIBLE);
                    btnOk.setVisibility(View.VISIBLE);
                    ivAnimal.setVisibility(View.VISIBLE);
                }else{
                    textView2.setVisibility(View.INVISIBLE);
                    rdoGroup1.setVisibility(View.INVISIBLE);
                    btnOk.setVisibility(View.INVISIBLE);
                    ivAnimal.setVisibility(View.INVISIBLE);
                }
            }
        });*/
    }


}