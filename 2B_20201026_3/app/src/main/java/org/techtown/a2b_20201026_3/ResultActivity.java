package org.techtown.a2b_20201026_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView tvPic[] = new TextView[9];
    int tvPicId[] = {R.id.textView1,R.id.textView2,R.id.textView3,R.id.textView4,R.id.textView5,
            R.id.textView6,R.id.textView7,R.id.textView8,R.id.textView9};
    Button btnReturn;
    RatingBar rbPic[] =  new RatingBar[9];
    int rbPicId[]={R.id.ratingBar1,R.id.ratingBar2,R.id.ratingBar3,R.id.ratingBar4,R.id.ratingBar5,
            R.id.ratingBar6,R.id.ratingBar7,R.id.ratingBar8,R.id.ratingBar9};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        for(int i=0;i< tvPic.length;i++){
t            rbPic[i].setRating(voteCount[i]);
        }

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); kmn
        });
    }
}