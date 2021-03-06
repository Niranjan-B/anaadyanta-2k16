package org.anaadyanta.anaadyanta2k16.fragments;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;

import org.anaadyanta.anaadyanta2k16.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DevsFragment extends Fragment {

    TextView githubTextLink;


    public DevsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        try {
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("The Team");
        } catch (NullPointerException exception) {
            Log.d("anaadyanta", "" + exception.getMessage());
        }
        View view=inflater.inflate(R.layout.fragment_devs, container, false);
        Shimmer shimmer;

        githubTextLink = (TextView) view.findViewById(R.id.githubTextHolder);

        ShimmerTextView text=(ShimmerTextView)view.findViewById(R.id.prav);
        ShimmerTextView text1=(ShimmerTextView)view.findViewById(R.id.mallu);
        ShimmerTextView text2=(ShimmerTextView)view.findViewById(R.id.nikhil);
        ShimmerTextView text3=(ShimmerTextView)view.findViewById(R.id.chor);
        ShimmerTextView text4=(ShimmerTextView)view.findViewById(R.id.nitte);
        ShimmerTextView text5=(ShimmerTextView)view.findViewById(R.id.ninja);


        shimmer = new Shimmer();
        shimmer.start(text);
        shimmer.start(text1);
        shimmer.start(text2);
        shimmer.start(text3);
        shimmer.start(text4);
        shimmer.start(text5);

        TiltEffectAttacher.attach(view.findViewById(R.id.imageView6ab));
        TiltEffectAttacher.attach(view.findViewById(R.id.imageView7));
        TiltEffectAttacher.attach(view.findViewById(R.id.imageViewg));
        TiltEffectAttacher.attach(view.findViewById(R.id.imageView6g));
        TiltEffectAttacher.attach(view.findViewById(R.id.imageView6));
        TiltEffectAttacher.attach(view.findViewById(R.id.mallu));
        TiltEffectAttacher.attach(view.findViewById(R.id.nikhil));
        TiltEffectAttacher.attach(view.findViewById(R.id.prav));
        TiltEffectAttacher.attach(view.findViewById(R.id.chor));
        TiltEffectAttacher.attach(view.findViewById(R.id.nitte));
        TiltEffectAttacher.attach(view.findViewById(R.id.textView73));
        TiltEffectAttacher.attach(view.findViewById(R.id.textView74));
        TiltEffectAttacher.attach(view.findViewById(R.id.textViewc));
        TiltEffectAttacher.attach(view.findViewById(R.id.textView70));
        TiltEffectAttacher.attach(view.findViewById(R.id.textView69));
        TiltEffectAttacher.attach(view.findViewById(R.id.textView71));
        TiltEffectAttacher.attach(view.findViewById(R.id.textViewb));
        TiltEffectAttacher.attach(view.findViewById(R.id.textViewa));
        TiltEffectAttacher.attach(view.findViewById(R.id.textView76));
        TiltEffectAttacher.attach(view.findViewById(R.id.textView77));
        TiltEffectAttacher.attach(view.findViewById(R.id.imageView6abc));
        TiltEffectAttacher.attach(view.findViewById(R.id.ninja));
        TiltEffectAttacher.attach(view.findViewById(R.id.textView731));
        TiltEffectAttacher.attach(view.findViewById(R.id.textView741));

        githubTextLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent githubIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Niranjan-B/anaadyanta-2k16/"));
                startActivity(githubIntent);
            }
        });

        return view;
    }

}
