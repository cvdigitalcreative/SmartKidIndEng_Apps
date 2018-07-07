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
import android.widget.ImageView;
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
    ImageView gambarpertanyaan;

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
        final int[] arrayimage = {R.mipmap.a_satu,R.mipmap.a_sepuluh,R.mipmap.hwn_kucing,R.mipmap.a_tiga,R.mipmap.transportasi_mobil,
                R.mipmap.warna_hijau, R.mipmap.agt_hidung,R.mipmap.bda_tempattidur,R.mipmap.agt_kaki,R.mipmap.h_y};

        final String[] pertanyaan = {"Angka Berapakah Ini?", "Angka Berapakah Ini?", "Apa Nama Hewan Ini?", "Berapakah Jumlah 2 + 1 = ... ?",
                "Apakah Nama Transportasi Beroda Empat Ini?", "Warna Apakah Ini?", "Apakah Nama Anggota Tubuh Ini?", "Manakah Benda Untuk Kita Beristirahat?",
        "Manusia Mempunyai Dua...", "Huruf Apakah Ini?"};

        final String[] jawaban = {"Satu", "Sepuluh", "Kucing", "Tiga",
                "Mobil", "Hijau", "Hidung", "Tempat Tidur", "Kaki", "Y"};

        String[] pengacau = {"Tiga", "Lima", "Dua",
                             "Empat", "Dua", "Sembilan",
                             "Kambing", "Anjing", "Kerbau",
                             "Lima", "Delapan", "Enam",
                             "Sepeda", "Pesawat", "Becak",
                             "Merah", "Kuning", "Biru",
                "Tangan", "Kaki", "Telinga",
                "Panci", "Gitar", "Sepeda",
                "Gigi", "Jari", "Hidung",
                "D", "X", "G"};
        final ArrayList<String> listpengacau = new ArrayList<>(Arrays.asList(pengacau));

        //Init
        gambarpertanyaan = view.findViewById(R.id.pertanyaan_gambar);
        Button btn_next = view.findViewById(R.id.btn_NextKuis);
        pertanyaanTexview = view.findViewById(R.id.soal);
        ansRadioGroup = view.findViewById(R.id.radioGroup1);

        //Randomed Question and Answer
        int length = pertanyaan.length;
        for (int j = 0; j < length; j++){
            quiz.add(new QnA_Model(arrayimage[j], pertanyaan[j], jawaban[j], listpengacau.subList(j * 3, (j + 1) * 3)));
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
                int maxsoal = 5;
                String jawaban_user = ((RadioButton) ansRadioGroup.findViewById(selectedId)).getText().toString();
                    for (int i = 0; i < jawaban.length; i++){
                        if (jawaban_user.trim().toLowerCase().equals(jawaban[i].trim().toLowerCase())) {
                            Bscore = Bscore + 10;
                        }
                    }
                    for (int i = 0; i < maxsoal; i++) {
                                if (maxsoal > posisiPertanyaan) {
                                    //Fill the Question and Answer - update method
                                    fillInQuestion1();
                                    } else {
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
                System.out.println(jawaban_user);
                }
        });
        return view;
        }

    private void fillInQuestion1() {
        QnA_Model qnA_model = quiz.get(posisiPertanyaan);
        gambarpertanyaan.setImageResource(qnA_model.gambar);
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
