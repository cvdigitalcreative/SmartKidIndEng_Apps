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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.digitalcreative.smartkidsindeng.Model.QnA_Model;
import com.digitalcreative.smartkidsindeng.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Kuis_frag extends Fragment {
    Score_frag score_frag;
    List<QnA_Model> quiz = new ArrayList<>();

    RadioGroup ansRadioGroup;
    TextView pertanyaanTexview;

    int posisiPertanyaan = 0;
    int Bscore = 0;

    public Kuis_frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kuis_frag, container, false);

        //Toolbar
        TextView toolbar_text =  view.findViewById(R.id.text_toolbar);
        Toolbar mToolbar = getActivity().findViewById(R.id.toolbar);
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(mToolbar);
        toolbar_text.setText("Kuis");

        //Declare
        final String[] pertanyaan = {"Apa nama hewan berkaki 2? ayam", "Angka Berapa ini? 10", "Apa nama buah ini? jeruk", "Angka Berapa ini? 8"};
        final String[] jawaban = {"Ayam", "Sepuluh", "Jeruk", "Delapan"};
        String[] pengacau = {"Semut", "Jerapah", "Kuda",
                             "Satu", "Dua", "Sembilan",
                             "Semangka", "Anggur", "Pepaya",
                             "Enam", "Satu", "Lima"};
        final ArrayList<String> listpengacau = new ArrayList<>(Arrays.asList(pengacau));

        //Init
        Button btn_next = view.findViewById(R.id.btn_NextKuis);
        pertanyaanTexview = view.findViewById(R.id.soal);
        ansRadioGroup = view.findViewById(R.id.radioGroup1);

        //Randomed Question and Answer
        int length = pertanyaan.length;
        for (int j = 0; j < length; j++){
            quiz.add(new QnA_Model(pertanyaan[j], jawaban[j], listpengacau.subList(j * 3, (j + 1) * 3)));
            Collections.shuffle(quiz);
        }

        //Fill the Question and Answer
        fillInQuestion1();
        posisiPertanyaan++;

        //Button next clicked
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = ansRadioGroup.getCheckedRadioButtonId();
                int maxsoal = 4;
                String jawaban_user = ((RadioButton) ansRadioGroup.findViewById(selectedId)).getText().toString();
                    for (int i = 0; i < maxsoal; i++){
                        if (jawaban_user.equals(jawaban[i])) {
                            Bscore = Bscore + 10;
                        }
                    }
                    for (int i = 0; i < maxsoal; i++) {
                            if (maxsoal > posisiPertanyaan) {
                                //Fill the Question and Answer - update method
                                fillInQuestion1();
                            }
                         else {
                                Bundle bundle = new Bundle();
                                bundle.putInt("score", Bscore);
                                score_frag = new Score_frag();
                                score_frag.setArguments(bundle);

                                //Fragment Transition
                                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                                fragmentTransaction.replace(R.id.container, score_frag);
                                fragmentTransaction.addToBackStack(null);
                                fragmentTransaction.commit();
                            }
                    }
                posisiPertanyaan++;
                    System.out.println(posisiPertanyaan);
                    System.out.println(Bscore);
                }
        });
        return view;
        }

    private void fillInQuestion1() {
        QnA_Model qnA_model = quiz.get(posisiPertanyaan);
        pertanyaanTexview.setText(qnA_model.pertanyaan);

        //Set semua jawaban
        int count = ansRadioGroup.getChildCount();
        for (int j = 0; j < count; j++)
            ((RadioButton) ansRadioGroup.getChildAt(j)).setText(qnA_model.semuaJawaban.get(j));

        // Restore selected answer if exists otherwise clear previous question's choice
        if(qnA_model.selectedId > -1)
            ansRadioGroup.check(qnA_model.selectedId);
        else
            ansRadioGroup.clearCheck();
    }
}
