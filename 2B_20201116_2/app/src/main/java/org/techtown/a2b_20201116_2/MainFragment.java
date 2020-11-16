package org.techtown.a2b_20201116_2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_main, container, false);
        Button btnMenu = rootView.findViewById(R.id.textview);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 메인엑티비티 화면을 메뉴프래그먼트로 전환하기
                MainActivity mainActivity = (MainActivity)getActivity();
                mainActivity.onFragmentChanged(1);
            }
        });
        return rootView;
    }

}