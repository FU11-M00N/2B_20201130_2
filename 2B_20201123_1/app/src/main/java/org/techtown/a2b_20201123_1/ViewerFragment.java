package org.techtown.a2b_20201123_1;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class ViewerFragment extends Fragment {
    android.widget.ImageView ImageView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_viewer,container,false);
        ImageView = rootView.findViewById(R.id.imageView);
        ImageView = rootView.findViewById(R.id.imageView);

        return rootView;
    }
    public void setImage(int resld){
        ImageView.setImageResource(resld);
    }
}