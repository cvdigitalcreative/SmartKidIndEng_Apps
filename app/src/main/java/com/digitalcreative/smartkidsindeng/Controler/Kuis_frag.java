package com.digitalcreative.smartkidsindeng.Controler;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.digitalcreative.smartkidsindeng.Boundary.Score_frag;
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
    int maxsoal = 5;
    int posisiPertanyaan = 0;
    int Bscore = 0;
    String[] jawaban;
    ArrayList<String> stats =  new ArrayList<>();
    ArrayList<String> soal =  new ArrayList<>();
    ArrayList<String> jawabanpilih =  new ArrayList<>();
    public Kuis_frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kuis_frag, container, false);

        //Toolbar
        final TextView toolbar_text =  view.findViewById(R.id.text_toolbar);
        toolbar_text.setText("Kuis");

        //Init
        gambarpertanyaan = view.findViewById(R.id.pertanyaan_gambar);
        Button btn_next = view.findViewById(R.id.btn_NextKuis);
        pertanyaanTexview = view.findViewById(R.id.soal);
        ansRadioGroup = view.findViewById(R.id.radioGroup1);

        //Declare
        String id = getArguments().getString("id");
        switch (id){
            case "hewan":
                final int[] arrayimage = {R.mipmap.a_satu,R.mipmap.a_sepuluh,R.mipmap.hwn_kucing,R.mipmap.a_tiga,R.mipmap.transportasi_mobil,
                        R.mipmap.warna_hijau, R.mipmap.agt_hidung,R.mipmap.bda_tempattidur,R.mipmap.agt_kaki,R.mipmap.h_y};

                final String[] pertanyaan = {"Angka Berapakah Ini?", "Angka Berapakah Ini?", "Apa Nama Hewan Ini?", "Berapakah Jumlah 2 + 1 = ... ?",
                        "Apakah Nama Transportasi Beroda Empat Ini?", "Warna Apakah Ini?", "Apakah Nama Anggota Tubuh Ini?", "Manakah Benda Untuk Kita Beristirahat?",
                        "Manusia Mempunyai Dua...", "Huruf Apakah Ini?"};

                jawaban = new String[]{"Satu", "Sepuluh", "Kucing", "Tiga",
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

                //Randomed Question and Answer
                int length = pertanyaan.length;
                for (int j = 0; j < length; j++){
                    quiz.add(new QnA_Model(arrayimage[j], pertanyaan[j], jawaban[j], listpengacau.subList(j * 3, (j + 1) * 3)));
                    Collections.shuffle(quiz);
                }

                //Fill the Question and Answer
                fitTheQuestion();
                posisiPertanyaan++;
                btn_next.setOnClickListener(diklik);
                break;

            case "huruf":
                final int[] arrayimage1 = {R.mipmap.a_satu,R.mipmap.a_sepuluh,R.mipmap.hwn_kucing,R.mipmap.a_tiga,R.mipmap.transportasi_mobil,
                        R.mipmap.warna_hijau, R.mipmap.agt_hidung,R.mipmap.bda_tempattidur,R.mipmap.agt_kaki,R.mipmap.h_y};

                final String[] pertanyaan1 = {"Angka Berapakah Ini?", "Angka Berapakah Ini?", "Apa Nama Hewan Ini?", "Berapakah Jumlah 2 + 1 = ... ?",
                        "Apakah Nama Transportasi Beroda Empat Ini?", "Warna Apakah Ini?", "Apakah Nama Anggota Tubuh Ini?", "Manakah Benda Untuk Kita Beristirahat?",
                        "Manusia Mempunyai Dua...", "Huruf Apakah Ini?"};

                jawaban = new String[]{"Satu", "Sepuluh", "Kucing", "Tiga",
                        "Mobil", "Hijau", "Hidung", "Tempat Tidur", "Kaki", "Y"};

                String[] pengacau1 = {"Tiga", "Lima", "Dua",
                        "Empat", "Dua", "Sembilan",
                        "Kambing", "Anjing", "Kerbau",
                        "Lima", "Delapan", "Enam",
                        "Sepeda", "Pesawat", "Becak",
                        "Merah", "Kuning", "Biru",
                        "Tangan", "Kaki", "Telinga",
                        "Panci", "Gitar", "Sepeda",
                        "Gigi", "Jari", "Hidung",
                        "D", "X", "G"};
                final ArrayList<String> listpengacau1 = new ArrayList<>(Arrays.asList(pengacau1));

                //Randomed Question and Answer
                for (int j = 0; j < pertanyaan1.length; j++){
                    quiz.add(new QnA_Model(arrayimage1[j], pertanyaan1[j], jawaban[j], listpengacau1.subList(j * 3, (j + 1) * 3)));
                    Collections.shuffle(quiz);
                }

                //Fill the Question and Answer
                fitTheQuestion();
                posisiPertanyaan++;
                btn_next.setOnClickListener(diklik);
                break;

            case "angka":
                final int[] arrayimage2 = {R.mipmap.a_satu,R.mipmap.a_sepuluh,R.mipmap.hwn_kucing,R.mipmap.a_tiga,R.mipmap.transportasi_mobil,
                        R.mipmap.warna_hijau, R.mipmap.agt_hidung,R.mipmap.bda_tempattidur,R.mipmap.agt_kaki,R.mipmap.h_y};

                final String[] pertanyaan2 = {"Angka Berapakah Ini?", "Angka Berapakah Ini?", "Apa Nama Hewan Ini?", "Berapakah Jumlah 2 + 1 = ... ?",
                        "Apakah Nama Transportasi Beroda Empat Ini?", "Warna Apakah Ini?", "Apakah Nama Anggota Tubuh Ini?", "Manakah Benda Untuk Kita Beristirahat?",
                        "Manusia Mempunyai Dua...", "Huruf Apakah Ini?"};

                jawaban = new String[]{"Satu", "Sepuluh", "Kucing", "Tiga",
                        "Mobil", "Hijau", "Hidung", "Tempat Tidur", "Kaki", "Y"};

                String[] pengacau2 = {"Tiga", "Lima", "Dua",
                        "Empat", "Dua", "Sembilan",
                        "Kambing", "Anjing", "Kerbau",
                        "Lima", "Delapan", "Enam",
                        "Sepeda", "Pesawat", "Becak",
                        "Merah", "Kuning", "Biru",
                        "Tangan", "Kaki", "Telinga",
                        "Panci", "Gitar", "Sepeda",
                        "Gigi", "Jari", "Hidung",
                        "D", "X", "G"};
                final ArrayList<String> listpengacau2 = new ArrayList<>(Arrays.asList(pengacau2));

                //Randomed Question and Answer
                for (int j = 0; j < pertanyaan2.length; j++){
                    quiz.add(new QnA_Model(arrayimage2[j], pertanyaan2[j], jawaban[j], listpengacau2.subList(j * 3, (j + 1) * 3)));
                    Collections.shuffle(quiz);
                }

                //Fill the Question and Answer
                fitTheQuestion();
                posisiPertanyaan++;
                btn_next.setOnClickListener(diklik);
                break;

            case "anggotatubuh":
                final int[] arrayimage3 = {R.mipmap.a_satu,R.mipmap.a_sepuluh,R.mipmap.hwn_kucing,R.mipmap.a_tiga,R.mipmap.transportasi_mobil,
                        R.mipmap.warna_hijau, R.mipmap.agt_hidung,R.mipmap.bda_tempattidur,R.mipmap.agt_kaki,R.mipmap.h_y};

                final String[] pertanyaan3 = {"Angka Berapakah Ini?", "Angka Berapakah Ini?", "Apa Nama Hewan Ini?", "Berapakah Jumlah 2 + 1 = ... ?",
                        "Apakah Nama Transportasi Beroda Empat Ini?", "Warna Apakah Ini?", "Apakah Nama Anggota Tubuh Ini?", "Manakah Benda Untuk Kita Beristirahat?",
                        "Manusia Mempunyai Dua...", "Huruf Apakah Ini?"};

                jawaban = new String[]{"Satu", "Sepuluh", "Kucing", "Tiga",
                        "Mobil", "Hijau", "Hidung", "Tempat Tidur", "Kaki", "Y"};

                String[] pengacau3 = {"Tiga", "Lima", "Dua",
                        "Empat", "Dua", "Sembilan",
                        "Kambing", "Anjing", "Kerbau",
                        "Lima", "Delapan", "Enam",
                        "Sepeda", "Pesawat", "Becak",
                        "Merah", "Kuning", "Biru",
                        "Tangan", "Kaki", "Telinga",
                        "Panci", "Gitar", "Sepeda",
                        "Gigi", "Jari", "Hidung",
                        "D", "X", "G"};
                final ArrayList<String> listpengacau3 = new ArrayList<>(Arrays.asList(pengacau3));

                //Randomed Question and Answer
                for (int j = 0; j < pertanyaan3.length; j++){
                    quiz.add(new QnA_Model(arrayimage3[j], pertanyaan3[j], jawaban[j], listpengacau3.subList(j * 3, (j + 1) * 3)));
                    Collections.shuffle(quiz);
                }

                //Fill the Question and Answer
                fitTheQuestion();
                posisiPertanyaan++;
                btn_next.setOnClickListener(diklik);
                break;

            case "warna":
                final int[] arrayimage4 = {R.mipmap.a_satu,R.mipmap.a_sepuluh,R.mipmap.hwn_kucing,R.mipmap.a_tiga,R.mipmap.transportasi_mobil,
                        R.mipmap.warna_hijau, R.mipmap.agt_hidung,R.mipmap.bda_tempattidur,R.mipmap.agt_kaki,R.mipmap.h_y};

                final String[] pertanyaan4 = {"Angka Berapakah Ini?", "Angka Berapakah Ini?", "Apa Nama Hewan Ini?", "Berapakah Jumlah 2 + 1 = ... ?",
                        "Apakah Nama Transportasi Beroda Empat Ini?", "Warna Apakah Ini?", "Apakah Nama Anggota Tubuh Ini?", "Manakah Benda Untuk Kita Beristirahat?",
                        "Manusia Mempunyai Dua...", "Huruf Apakah Ini?"};

                jawaban = new String[]{"Satu", "Sepuluh", "Kucing", "Tiga",
                        "Mobil", "Hijau", "Hidung", "Tempat Tidur", "Kaki", "Y"};

                String[] pengacau4 = {"Tiga", "Lima", "Dua",
                        "Empat", "Dua", "Sembilan",
                        "Kambing", "Anjing", "Kerbau",
                        "Lima", "Delapan", "Enam",
                        "Sepeda", "Pesawat", "Becak",
                        "Merah", "Kuning", "Biru",
                        "Tangan", "Kaki", "Telinga",
                        "Panci", "Gitar", "Sepeda",
                        "Gigi", "Jari", "Hidung",
                        "D", "X", "G"};
                final ArrayList<String> listpengacau4 = new ArrayList<>(Arrays.asList(pengacau4));

                //Randomed Question and Answer
                for (int j = 0; j < pertanyaan4.length; j++){
                    quiz.add(new QnA_Model(arrayimage4[j], pertanyaan4[j], jawaban[j], listpengacau4.subList(j * 3, (j + 1) * 3)));
                    Collections.shuffle(quiz);
                }

                //Fill the Question and Answer
                fitTheQuestion();
                posisiPertanyaan++;
                btn_next.setOnClickListener(diklik);
                break;

            case "transportasi":
                final int[] arrayimage5 = {R.mipmap.a_satu,R.mipmap.a_sepuluh,R.mipmap.hwn_kucing,R.mipmap.a_tiga,R.mipmap.transportasi_mobil,
                        R.mipmap.warna_hijau, R.mipmap.agt_hidung,R.mipmap.bda_tempattidur,R.mipmap.agt_kaki,R.mipmap.h_y};

                final String[] pertanyaan5 = {"Angka Berapakah Ini?", "Angka Berapakah Ini?", "Apa Nama Hewan Ini?", "Berapakah Jumlah 2 + 1 = ... ?",
                        "Apakah Nama Transportasi Beroda Empat Ini?", "Warna Apakah Ini?", "Apakah Nama Anggota Tubuh Ini?", "Manakah Benda Untuk Kita Beristirahat?",
                        "Manusia Mempunyai Dua...", "Huruf Apakah Ini?"};

                jawaban = new String[]{"Satu", "Sepuluh", "Kucing", "Tiga",
                        "Mobil", "Hijau", "Hidung", "Tempat Tidur", "Kaki", "Y"};

                String[] pengacau5 = {"Tiga", "Lima", "Dua",
                        "Empat", "Dua", "Sembilan",
                        "Kambing", "Anjing", "Kerbau",
                        "Lima", "Delapan", "Enam",
                        "Sepeda", "Pesawat", "Becak",
                        "Merah", "Kuning", "Biru",
                        "Tangan", "Kaki", "Telinga",
                        "Panci", "Gitar", "Sepeda",
                        "Gigi", "Jari", "Hidung",
                        "D", "X", "G"};
                final ArrayList<String> listpengacau5 = new ArrayList<>(Arrays.asList(pengacau5));

                //Randomed Question and Answer
                for (int j = 0; j < pertanyaan5.length; j++){
                    quiz.add(new QnA_Model(arrayimage5[j], pertanyaan5[j], jawaban[j], listpengacau5.subList(j * 3, (j + 1) * 3)));
                    Collections.shuffle(quiz);
                }

                //Fill the Question and Answer
                fitTheQuestion();
                posisiPertanyaan++;
                btn_next.setOnClickListener(diklik);
                break;

            case "benda":
                final int[] arrayimage6 = {R.mipmap.a_satu,R.mipmap.a_sepuluh,R.mipmap.hwn_kucing,R.mipmap.a_tiga,R.mipmap.transportasi_mobil,
                        R.mipmap.warna_hijau, R.mipmap.agt_hidung,R.mipmap.bda_tempattidur,R.mipmap.agt_kaki,R.mipmap.h_y};

                final String[] pertanyaan6 = {"Angka Berapakah Ini?", "Angka Berapakah Ini?", "Apa Nama Hewan Ini?", "Berapakah Jumlah 2 + 1 = ... ?",
                        "Apakah Nama Transportasi Beroda Empat Ini?", "Warna Apakah Ini?", "Apakah Nama Anggota Tubuh Ini?", "Manakah Benda Untuk Kita Beristirahat?",
                        "Manusia Mempunyai Dua...", "Huruf Apakah Ini?"};

                jawaban = new String[]{"Satu", "Sepuluh", "Kucing", "Tiga",
                        "Mobil", "Hijau", "Hidung", "Tempat Tidur", "Kaki", "Y"};

                String[] pengacau6 = {"Tiga", "Lima", "Dua",
                        "Empat", "Dua", "Sembilan",
                        "Kambing", "Anjing", "Kerbau",
                        "Lima", "Delapan", "Enam",
                        "Sepeda", "Pesawat", "Becak",
                        "Merah", "Kuning", "Biru",
                        "Tangan", "Kaki", "Telinga",
                        "Panci", "Gitar", "Sepeda",
                        "Gigi", "Jari", "Hidung",
                        "D", "X", "G"};
                final ArrayList<String> listpengacau6 = new ArrayList<>(Arrays.asList(pengacau6));

                //Randomed Question and Answer
                for (int j = 0; j < pertanyaan6.length; j++){
                    quiz.add(new QnA_Model(arrayimage6[j], pertanyaan6[j], jawaban[j], listpengacau6.subList(j * 3, (j + 1) * 3)));
                    Collections.shuffle(quiz);
                }

                //Fill the Question and Answer
                fitTheQuestion();
                posisiPertanyaan++;
                btn_next.setOnClickListener(diklik);
                break;
        }

        return view;
        }


        private View.OnClickListener diklik = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int selectedId = ansRadioGroup.getCheckedRadioButtonId();
            String jawaban_user = ((RadioButton) ansRadioGroup.findViewById(selectedId)).getText().toString();

            if (posisiPertanyaan < maxsoal){
                doit(jawaban_user);
                cleartheQuestion();
                fitTheQuestion();
            } else{
                doit(jawaban_user);
                Bundle bundle = new Bundle();
                bundle.putInt("score", Bscore);
                bundle.putStringArrayList("stats", stats);
                bundle.putStringArrayList("soal", soal);
                bundle.putStringArrayList("jawabanuser", jawabanpilih);
                //bundle.putStringArray("benarsalah", fillbenar);
                score_frag = new Score_frag();
                score_frag.setArguments(bundle);

                //Fragment Transition
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, score_frag);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
            posisiPertanyaan++;
        }
    };

    private void doit(String jawaban_user) {
        boolean check = false;
        for (int j = 0; j<jawaban.length; j++) {
            if (jawaban_user.contains(jawaban[j])) {
                System.out.println("jawaban benar");
                Bscore = Bscore + 20;
                check = true;
                break;
            } else{
                System.out.println("jawaban salah");
                check = false;
                continue;
                //break;
            }
        }

        System.out.println("jawaban check =" +check);
        if(check){
            stats.add("benar");
            jawabanpilih.add(jawaban_user);
            System.out.println("masuksinicoy");
            MediaPlayer soundright = MediaPlayer.create(getContext(), R.raw.soundeffect_right);
            soundright.start();

        } else{
            stats.add("salah");
            jawabanpilih.add(jawaban_user);
            System.out.println("masuksinicoy2");
            MediaPlayer soundwrong = MediaPlayer.create(getContext(), R.raw.soundeffect_wrong);
            soundwrong.start();

        }
    }

    private void fitTheQuestion() {
        QnA_Model qnA_model = quiz.get(posisiPertanyaan);
        gambarpertanyaan.setImageResource(qnA_model.gambar);
        pertanyaanTexview.setText(qnA_model.pertanyaan);
        soal.add(qnA_model.pertanyaan);

        //Set semua jawaban
        int count = ansRadioGroup.getChildCount();
        for (int j = 0; j < count; j++)
            ((RadioButton) ansRadioGroup.getChildAt(j)).setText(qnA_model.semuaJawaban.get(j));
    }

    private void cleartheQuestion(){
        QnA_Model qnA_model = quiz.get(posisiPertanyaan);
        // Restore selected answer if exists otherwise clear previous question's choice
        if(qnA_model.selectedId > -1)
            ansRadioGroup.check(qnA_model.selectedId);
        else
            ansRadioGroup.clearCheck();
    }

}
