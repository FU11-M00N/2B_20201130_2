package org.techtown.a2b_20201116_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MainFragment mainFragment;
    MenuFragment menuFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainFragment = (MainFragment)getSupportFragmentManager().findFragmentById(R.id.mainFragment);
        menuFragment = new MenuFragment();
    }
    public void onFragmentChanged(int index){

        if(index == 1){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,mainFragment).commit();

        }
        else if(index == 1){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,menuFragment).commit();
        }

    }
}
