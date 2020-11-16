package org.techtown.a2b_20201116_2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MenuFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_menu, container, false);

        Button btnMain = rootView.findViewById(R.id.btnMain);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               MainActivity mainActivity = (MainActivity)getActivity();
               mainActivity.onFragmentChanged(0);
            }
        });

        return rootView;
    }
}