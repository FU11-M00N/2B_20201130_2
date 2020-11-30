package org.techtown.a2b_2019201134;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class ViewFragment extends Fragment {
    ImageView imageView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_view, container, false);

        imageView = rootView.findViewById(R.id.imageView2);
        //imageView.setImageResource(R.drawable.dream02);

        return rootView;
    }

    public void setImage(int resId){
        imageView.setImageResource(resId);
    }

}
