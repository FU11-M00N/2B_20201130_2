package org.techtown.a2b_20201012_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    View view, view2;
    TextView tvResult;
    GestureDetector detector;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(R.id.view);
        view2 = findViewById(R.id.view2);
        tvResult = findViewById(R.id.tvResult);
        editText = findViewById(R.id.editText);

        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                println("EditText : " + String.valueOf(i));
                return false;
            }
        });
        detector = new GestureDetector(this, new GestureDetector.OnGestureListener() {
            @Override
            public boolean onDown(MotionEvent motionEvent) {
                println("onDown() 호출됨");
                return false;
            }

            @Override
            public void onShowPress(MotionEvent motionEvent) {
                println("onShowPress() 호출됨");
            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                println("onSingleTapUp() 호출됨");
                return true;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
                println("onScroll() 호출됨 : " + v + "," + v1);
                return true;
            }

            @Override
            public void onLongPress(MotionEvent motionEvent) {
                println("onLongPress() 호출됨");
            }

            @Override
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
                println("onFling() 호출됨 : " + v + "," + v1 );
                return true;
            }
        });

        view2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                detector.onTouchEvent(motionEvent);
                return true;
            }
        });
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                float curX = motionEvent.getX();
                float curY = motionEvent.getY();

                if(action == MotionEvent.ACTION_DOWN){
                    println("손가락 눌림 : " + curX + "," + curY);
                }else if(action == MotionEvent.ACTION_UP){
                    println("손가락 뗌 : " + curX + "," + curY);
                }else if(action == MotionEvent.ACTION_MOVE){
                    println("손가락 움직임 : " + curX + "," + curY);
                }
                return true;
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode== KeyEvent.KEYCODE_BACK){
            println("시스템[Back] 버튼이 눌렸습니다.");
        }
        if(keyCode == KeyEvent.KEYCODE_0){
            println("0 버튼을 눌렀습니다.");
        }
        return super.onKeyDown(keyCode, event);
    }

    public void println(String data){
        tvResult.append(data + "\n");
    }
}