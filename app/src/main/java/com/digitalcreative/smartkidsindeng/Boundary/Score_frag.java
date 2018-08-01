package com.digitalcreative.smartkidsindeng.Boundary;


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

import com.digitalcreative.smartkidsindeng.Boundary.MenuFragment;
import com.digitalcreative.smartkidsindeng.R;

import java.util.ArrayList;

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

        //TextView
        TextView tv_pertama = view.findViewById(R.id.pertama);
        TextView tv_kedua = view.findViewById(R.id.kedua);
        TextView tv_ketiga = view.findViewById(R.id.ketiga);
        TextView tv_keempat = view.findViewById(R.id.keempat);
        TextView tv_kelima= view.findViewById(R.id.kelima);
        TextView tv_pertamasoaljawab = view.findViewById(R.id.soaljawab1);
        TextView tv_keduasoaljawab = view.findViewById(R.id.soaljawab2);
        TextView tv_ketigasoaljawab = view.findViewById(R.id.soaljawab3);
        TextView tv_keempatsoaljawab = view.findViewById(R.id.soaljawab4);
        TextView tv_kelimasoaljawab= view.findViewById(R.id.soaljawab5);
        TextView tv_pertamajawab = view.findViewById(R.id.jawab1);
        TextView tv_keduajawab = view.findViewById(R.id.jawab2);
        TextView tv_ketigajawab = view.findViewById(R.id.jawab3);
        TextView tv_keempatjawab = view.findViewById(R.id.jawab4);
        TextView tv_kelimajawab= view.findViewById(R.id.jawab5);
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
        ArrayList<String> getStats = bundle.getStringArrayList("stats");
        ArrayList<String> getSoals = bundle.getStringArrayList("soal");
        ArrayList<String> getJawabans = bundle.getStringArrayList("jawabanuser");
        System.out.println(getScore);

        //Extract Array
        tv_pertamajawab.setText("Jawaban : " +getJawabans.get(0));
        tv_keduajawab.setText("Jawaban : " +getJawabans.get(1));
        tv_ketigajawab.setText("Jawaban : " +getJawabans.get(2));
        tv_keempatjawab.setText("Jawaban : " +getJawabans.get(3));
        tv_kelimajawab.setText("Jawaban : " +getJawabans.get(4));
        tv_pertamasoaljawab.setText(getSoals.get(0));
        tv_keduasoaljawab.setText(getSoals.get(1));
        tv_ketigasoaljawab.setText(getSoals.get(2));
        tv_keempatsoaljawab.setText(getSoals.get(3));
        tv_kelimasoaljawab.setText(getSoals.get(4));
        tv_pertama.setText(getStats.get(0));
        tv_kedua.setText(getStats.get(1));
        tv_ketiga.setText(getStats.get(2));
        tv_keempat.setText(getStats.get(3));
        tv_kelima.setText(getStats.get(4));
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