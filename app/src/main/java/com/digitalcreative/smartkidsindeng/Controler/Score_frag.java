package com.digitalcreative.smartkidsindeng.Controler;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.digitalcreative.smartkidsindeng.Entity.MenuFragment;
import com.digitalcreative.smartkidsindeng.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Score_frag extends Fragment {

    public Score_frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_score_frag, container, false);

        //Toolbar
        TextView toolbar_text =  view.findViewById(R.id.text_toolbar);
        Toolbar mToolbar = getActivity().findViewById(R.id.toolbar);
        final AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(mToolbar);
        toolbar_text.setText("Score Kuis");

        //Button Exit
        Button btn_exit = view.findViewById(R.id.btn_exit);
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.finish();
                System.exit(0);
            }
        });


        Bundle bundle = getArguments();
        int getScore = bundle.getInt("score");
        System.out.println(getScore);

        //Tampil Nilai Score
        TextView tampilscore = view.findViewById(R.id.score);
        tampilscore.setText(String.valueOf(getScore));

        //Button Kembali
        Button btn_kembali = view.findViewById(R.id.btn_backscore);
        btn_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MenuFragment menuFragment = new MenuFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, menuFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}