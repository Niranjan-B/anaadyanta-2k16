package org.anaadyanta.anaadyanta2k16.fragments;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

import org.anaadyanta.anaadyanta2k16.R;


/**
 * Created by PRAVEEN on 28-Feb-16.
 */
public class Activity_schedule_day_one extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.activity_schedule_day_one,container,false);
        SubsamplingScaleImageView imageView = (SubsamplingScaleImageView)view.findViewById(R.id.imageday1);
        imageView.setImage(ImageSource.resource(R.mipmap.dayone));

        return  view;
    }
}
