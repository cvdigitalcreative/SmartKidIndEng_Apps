package com.digitalcreative.smartkidsindeng.Fragment;


import android.media.MediaPlayer;
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
import android.widget.TextView;

import com.digitalcreative.smartkidsindeng.Model.Model;
import com.digitalcreative.smartkidsindeng.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Finalgambar_Frag extends Fragment {
    List<Model> modelList = new ArrayList<>();
    public Finalgambar_Frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_finalgambar, container, false);
        //Declare
        //Toolbar
        TextView toolbar_text =  view.findViewById(R.id.text_toolbar);
        Toolbar mToolbar = getActivity().findViewById(R.id.toolbar);

        //Content
        TextView indo = view.findViewById(R.id.txt_bahasaindonesia);
        TextView inggris = view.findViewById(R.id.txt_bahasainggris);
        ImageView imageView = view.findViewById(R.id.img_final);
        Button btn_suara_indo = view.findViewById(R.id.btn_suaraindo);
        Button btn_suara_inggris = view.findViewById(R.id.btn_suarainggris);
        Bundle bundle = getArguments();
        System.out.println(modelList.size());

        String getFinalKode = bundle.getString("kodefinal");

// ==================================================================================
// =================================== Part Hewan ===================================
// ==================================================================================
            if (getFinalKode.equals("hwn_angsa")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_angsa);
                indo.setText("Angsa");
                inggris.setText("Flaminggo");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
        } else if (getFinalKode.equals("hwn_anjing")){
            // Set Toolbar
            AppCompatActivity activity = (AppCompatActivity) getActivity();
            activity.setSupportActionBar(mToolbar);
            toolbar_text.setText("Hewan");
            Buttonclicked(view, 1);

            //Set Image, Text Indo dan Eng
            imageView.setImageResource(R.mipmap.hwn_anjing);
            indo.setText("Anjing");
            inggris.setText("Dog");

            //Set Suara indo dan Eng
            btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                    mp_id.start();
                }
            });

            btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                    mp_id.start();
                }
            });
        } else if (getFinalKode.equals("hwn_anjinglaut")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_anjinglaut);
                indo.setText("Anjing Laut");
                inggris.setText("Coyote");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_anoa")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_anoa);
                indo.setText("Anoa");
                inggris.setText("Anoa");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_antelop")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_antelop);
                indo.setText("Antelop");
                inggris.setText("Antelop");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_ayam")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_ayam);
                indo.setText("Ayam");
                inggris.setText("Chicken");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_ayambetina")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_ayambetina);
                indo.setText("Ayam Betina");
                inggris.setText("Hen");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_ayamjantan")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_ayamjantan);
                indo.setText("Ayam Jantan");
                inggris.setText("Cock");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_babi")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_babi);
                indo.setText("Babi");
                inggris.setText("Pig");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_babun")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_babun);
                indo.setText("Babun");
                inggris.setText("Baboon");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_badak")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_badak);
                indo.setText("Badak");
                inggris.setText("Rhinoceros");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_banteng")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_banteng);
                indo.setText("Banteng");
                inggris.setText("Bull");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_bebek")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_bebek);
                indo.setText("Bebek");
                inggris.setText("Duck");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_belalang")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_belalang);
                indo.setText("Belalang");
                inggris.setText("Grasshopper");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_belibis")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_belibis);
                indo.setText("Belibis");
                inggris.setText("Grouse");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_belut")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_belut);
                indo.setText("Belut");
                inggris.setText("Eel");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_beruang")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_beruang);
                indo.setText("Beruang");
                inggris.setText("Bear");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_beruang2")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_beruang2);
                indo.setText("Beruang Kutub");
                inggris.setText("Polar Bear");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_bintanglaut")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_bintanglaut);
                indo.setText("Bintang Laut");
                inggris.setText("Starfish");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_bison")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_bison);
                indo.setText("Bison");
                inggris.setText("Bison");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_buaya")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_buaya);
                indo.setText("Buaya");
                inggris.setText("Crocodile");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_bulldog")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_bulldog);
                indo.setText("BulDog");
                inggris.setText("Bulldog");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_burungbangau")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_burungbangau);
                indo.setText("Burung Bangau");
                inggris.setText("Crane");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_burungbeo")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_burungbeo);
                indo.setText("Burung Beo");
                inggris.setText("Parrot");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_burungbulbul")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_burungbulbul);
                indo.setText("Burung Bulbul");
                inggris.setText("Nightingale");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_burungelang")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_burungelang);
                indo.setText("Burung Elang");
                inggris.setText("Hawk");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_burunggagak")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_burunggagak);
                indo.setText("Burung Gagak");
                inggris.setText("Crow");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_burunggereja")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_burunggereja);
                indo.setText("Burung Gereja");
                inggris.setText("Sparrow");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_burungkakatua")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_burungkakatua);
                indo.setText("Burung KakakTua");
                inggris.setText("Cockatoo");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_burungkolibri")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_burungkolibri);
                indo.setText("Burung Kolibri");
                inggris.setText("Hummingbird");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_burunglayanglayang")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_burunglayanglayang);
                indo.setText("Burung Layang-Layang");
                inggris.setText("Swallow");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_burungmerak")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_burungmerak);
                indo.setText("Burung Merak");
                inggris.setText("Peacock");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_burungmurai")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_burungmurai);
                indo.setText("Burung Murai");
                inggris.setText("Magpie");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_burungpelika")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_burungpelika);
                indo.setText("Burung Pelika");
                inggris.setText("Pelican");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_burungpuyuh")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_burungpuyuh);
                indo.setText("Burung Puyuh");
                inggris.setText("Quail");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_burungunta")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_burungunta);
                indo.setText("Burung Unta");
                inggris.setText("Ostrich");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_cacing")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_cacing);
                indo.setText("Cacing");
                inggris.setText("Worm");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_capung")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_capung);
                indo.setText("Capung");
                inggris.setText("Dragonfly");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_citah")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_citah);
                indo.setText("Citah");
                inggris.setText("Cheetah");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_cumi")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_cumi);
                indo.setText("Cumi-cumi");
                inggris.setText("Chicken");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_domba")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_domba);
                indo.setText("Domba");
                inggris.setText("Sheep");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_flaminggo")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_flaminggo);
                indo.setText("Flamingo");
                inggris.setText("Flamingo");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_gajah")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_gajah);
                indo.setText("Gajah");
                inggris.setText("Elephant");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_gorila")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_gorila);
                indo.setText("Gorila");
                inggris.setText("Gorilla");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_hamster")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_hamster);
                indo.setText("Hamster");
                inggris.setText("Hamster");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_harimau")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_harimau);
                indo.setText("Harimau");
                inggris.setText("Tiger");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_harimaukumbang")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_harimaukumbang);
                indo.setText("Harimau Kumbang");
                inggris.setText("Panther");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_hiena")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_hiena);
                indo.setText("Hiena");
                inggris.setText("Hyena");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_iguana")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_iguana);
                indo.setText("Iguana");
                inggris.setText("Iguana");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_ikanhiu")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_ikanhiu);
                indo.setText("Ikan Hiu");
                inggris.setText("Shark");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_ikankoi")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_ikankoi);
                indo.setText("Ikan Koi");
                inggris.setText("Koi fish");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_ikanlele")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_ikanlele);
                indo.setText("Ikan Lele");
                inggris.setText("Catfish");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_ikanlumba")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_ikanlumba);
                indo.setText("Ikan Lumba-Lumba");
                inggris.setText("Dolphin");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_ikanmas")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_ikanmas);
                indo.setText("Ikan Mas");
                inggris.setText("Goldfish");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_ikanpaus")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_ikanpaus);
                indo.setText("Ikan Paus");
                inggris.setText("Whale");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_ikansalmon")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_ikansalmon);
                indo.setText("Ikan Salmon");
                inggris.setText("Salmon");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_ikansarden")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_ikansarden);
                indo.setText("Ikan Sarden");
                inggris.setText("Sardine");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_jerapah")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_jerapah);
                indo.setText("Jerapah");
                inggris.setText("Giraffe");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kadal")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kadal);
                indo.setText("Kadal");
                inggris.setText("Lizard");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kadalair")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kadalair);
                indo.setText("Kadal Air");
                inggris.setText("Newt");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kalajengking")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kalajengking);
                indo.setText("Kalajengking");
                inggris.setText("Scorpion");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kalkun")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kalkun);
                indo.setText("Kalkun");
                inggris.setText("Turkey");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kambing")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kambing);
                indo.setText("Kambing");
                inggris.setText("Goat");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kangguru")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kangguru);
                indo.setText("Kangguru");
                inggris.setText("Wallaby");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kanggurubesar")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kanggurubesar);
                indo.setText("Kangguru Besar");
                inggris.setText("Kangaroo");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kasuari")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kasuari);
                indo.setText("Kasuari");
                inggris.setText("Kasuari");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_katak")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_katak);
                indo.setText("Katak");
                inggris.setText("Frog");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kedelai")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kedelai);
                indo.setText("Keledai");
                inggris.setText("Donkey");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kelelawar")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kelelawar);
                indo.setText("Kelelawar");
                inggris.setText("Bat");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kelinci")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kelinci);
                indo.setText("Kelinci");
                inggris.setText("Rabbit");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kenari")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kenari);
                indo.setText("Kenari");
                inggris.setText("Walnuts");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kepiting")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kepiting);
                indo.setText("Kepiting");
                inggris.setText("Crab");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kera_madagaskar")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kera_madagaskar);
                indo.setText("Kera Madagaskar");
                inggris.setText("Lemur");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kerabesar_beruk")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kerabesar_beruk);
                indo.setText("Kera Beruk");
                inggris.setText("Ape");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kerang")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kerang);
                indo.setText("Kerang");
                inggris.setText("Clam");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kerang_tiram")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kerang_tiram);
                indo.setText("Kerang Tiram");
                inggris.setText("Oyster");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kerbau")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kerbau);
                indo.setText("Kerbau");
                inggris.setText("Buffalo");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kiwi")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kiwi);
                indo.setText("Kiwi");
                inggris.setText("Kiwi");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_koala")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_koala);
                indo.setText("Koala");
                inggris.setText("Koala");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kucing")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kucing);
                indo.setText("Kucing");
                inggris.setText("Cat");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kucinghutan")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kucinghutan);
                indo.setText("Kucing Hutan");
                inggris.setText("Bobcat");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kuda")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kuda);
                indo.setText("Kuda");
                inggris.setText("Horse");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kudalaut")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kudalaut);
                indo.setText("Kuda Laut");
                inggris.setText("Sea Horse");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kudanil")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kudanil);
                indo.setText("Kuda Nil");
                inggris.setText("Hippopotamus");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kumbang")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kumbang);
                indo.setText("Kumbang");
                inggris.setText("Beetle");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kumbangkecil")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kumbangkecil);
                indo.setText("Kumbang Kecil");
                inggris.setText("Ladybug");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kupu_kupu")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kupu_kupu);
                indo.setText("Kupu-Kupu");
                inggris.setText("Butterfly");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_kura_kura")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kura_kura);
                indo.setText("Kura-kura");
                inggris.setText("Turtle");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }
            else if (getFinalKode.equals("hwn_kuskus")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kuskus);
                indo.setText("Kuskus");
                inggris.setText("Cuscus");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }
            else if (getFinalKode.equals("hwn_kutu_kutu")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_kutu_kutu);
                indo.setText("Kutu");
                inggris.setText("Fleas");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }
            else if (getFinalKode.equals("hwn_laba_laba")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_laba_laba);
                indo.setText("Laba-laba");
                inggris.setText("Spider");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }
            else if (getFinalKode.equals("hwn_lalat")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_lalat);
                indo.setText("Lalat");
                inggris.setText("Fly");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }
            else if (getFinalKode.equals("hwn_landak")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_landak);
                indo.setText("Landak");
                inggris.setText("Hedgehog");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }
            else if (getFinalKode.equals("hwn_laron")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_laron);
                indo.setText("Laron");
                inggris.setText("Flying Ant");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }
            else if (getFinalKode.equals("hwn_lebah")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_lebah);
                indo.setText("Lebah");
                inggris.setText("Bee");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }
            else if (getFinalKode.equals("hwn_lebahbesar")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_lebahbesar);
                indo.setText("Lebah Besar");
                inggris.setText("Hornet");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }
            else if (getFinalKode.equals("hwn_lintah")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_lintah);
                indo.setText("Lintah");
                inggris.setText("Leech");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }
            else if (getFinalKode.equals("hwn_lobster")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_lobster);
                indo.setText("Lobster");
                inggris.setText("Lobster");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }
            else if (getFinalKode.equals("hwn_luak")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_luak);
                indo.setText("Luak");
                inggris.setText("Badger");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }
            else if (getFinalKode.equals("hwn_macantutul")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_macantutul);
                indo.setText("Macan Tutul");
                inggris.setText("Leopard");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }
            else if (getFinalKode.equals("hwn_marmut")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_marmut);
                indo.setText("Marmut");
                inggris.setText("Guinea Pig");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }
            else if (getFinalKode.equals("hwn_merpati")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_merpati);
                indo.setText("Merpati");
                inggris.setText("Dove");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }
            else if (getFinalKode.equals("hwn_monyet")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_monyet);
                indo.setText("Monyet");
                inggris.setText("Monkey");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }
            else if (getFinalKode.equals("hwn_musang")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_musang);
                indo.setText("Musang");
                inggris.setText("Weasel");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }
            else if (getFinalKode.equals("hwn_ngengat")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_ngengat);
                indo.setText("Ngengat");
                inggris.setText("Moth");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }
            else if (getFinalKode.equals("hwn_nyamuk")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_nyamuk);
                indo.setText("Nyamuk");
                inggris.setText("Mosquito");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }
            else if (getFinalKode.equals("hwn_orangutan")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_orangutan);
                indo.setText("Orang Utan");
                inggris.setText("Orang Utan");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_panda")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_panda);
                indo.setText("Panda");
                inggris.setText("Panda");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_pinguin")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_pinguin);
                indo.setText("Penguin");
                inggris.setText("Penguin");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_remis")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_remis);
                indo.setText("Remis");
                inggris.setText("Mussel");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_rubah")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_rubah);
                indo.setText("Rubah");
                inggris.setText("Fox");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_rusa")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_rusa);
                indo.setText("Rusa");
                inggris.setText("Deer");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }  else if (getFinalKode.equals("hwn_sapi")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_sapi);
                indo.setText("Sapi");
                inggris.setText("Cow");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_semut")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_semut);
                indo.setText("Semut");
                inggris.setText("Ant");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_serigala")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_serigala);
                indo.setText("Srigala");
                inggris.setText("Wolf");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_siamang")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_siamang);
                indo.setText("Siamang");
                inggris.setText("Gibbon");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_simpanse")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_simpanse);
                indo.setText("Simpanse");
                inggris.setText("Simpanse");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_singa")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_singa);
                indo.setText("Singa");
                inggris.setText("Lion");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_singalaut")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_singalaut);
                indo.setText("Singa Laut");
                inggris.setText("Sea Lion");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_siput")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_siput);
                indo.setText("Siput");
                inggris.setText("Snail");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_tapir")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_tapir);
                indo.setText("Tapir");
                inggris.setText("Tapir");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_tawon")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_tawon);
                indo.setText("Tawon");
                inggris.setText("Wasp");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_tikus")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_tikus);
                indo.setText("Tikus");
                inggris.setText("Mouse");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_trenggiling")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_trenggiling);
                indo.setText("Trenggiling");
                inggris.setText("Anteater");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_tupai")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_tupai);
                indo.setText("Tupai");
                inggris.setText("Squirrel");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_tupai_tanah")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_tupai_tanah);
                indo.setText("Tupai Tanah");
                inggris.setText("Chipmunk");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_uburubur")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_uburubur);
                indo.setText("Ubur-ubur");
                inggris.setText("Jelly Fish");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_udang")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_udang);
                indo.setText("Udang");
                inggris.setText("Shrimp");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_ular_cobra")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_ular);
                indo.setText("Ular Cobra");
                inggris.setText("Cobra");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_ular2")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_ular2);
                indo.setText("Ular");
                inggris.setText("Snake");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_ulatbulu")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_ulatbulu);
                indo.setText("Ulat Bulu");
                inggris.setText("Caterpillar");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_unta")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_unta);
                indo.setText("Unta");
                inggris.setText("Camel");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hwn_zebra")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");
                Buttonclicked(view, 1);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.hwn_zebra);
                indo.setText("Zebra");
                inggris.setText("Zebra");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }


// ==================================================================================
// =================================== Part Huruf ===================================
// ==================================================================================
            else if (getFinalKode.equals("ha")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_a);
                indo.setText("A");
                inggris.setText("A");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }  else if (getFinalKode.equals("hb")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_b);
                indo.setText("B");
                inggris.setText("B");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }  else if (getFinalKode.equals("hc")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_c);
                indo.setText("C");
                inggris.setText("C");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }  else if (getFinalKode.equals("hd")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_d);
                indo.setText("D");
                inggris.setText("D");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }  else if (getFinalKode.equals("he")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_e);
                indo.setText("E");
                inggris.setText("E");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }  else if (getFinalKode.equals("hf")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_f);
                indo.setText("F");
                inggris.setText("F");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }  else if (getFinalKode.equals("hg")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_g);
                indo.setText("G");
                inggris.setText("G");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }  else if (getFinalKode.equals("hh")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_h);
                indo.setText("H");
                inggris.setText("H");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }  else if (getFinalKode.equals("hi")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_i);
                indo.setText("I");
                inggris.setText("I");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }  else if (getFinalKode.equals("hj")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_j);
                indo.setText("J");
                inggris.setText("J");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }  else if (getFinalKode.equals("hk")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_k);
                indo.setText("K");
                inggris.setText("K");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hl")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_l);
                indo.setText("L");
                inggris.setText("L");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hm")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_m);
                indo.setText("M");
                inggris.setText("M");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hn")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_n);
                indo.setText("N");
                inggris.setText("N");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("ho")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_o);
                indo.setText("O");
                inggris.setText("O");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hp")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_p);
                indo.setText("P");
                inggris.setText("P");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hq")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_q);
                indo.setText("Q");
                inggris.setText("Q");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hr")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_r);
                indo.setText("R");
                inggris.setText("R");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hs")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_s);
                indo.setText("S");
                inggris.setText("S");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("ht")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.ic_launcherh_t);
                indo.setText("T");
                inggris.setText("T");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hu")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_u);
                indo.setText("U");
                inggris.setText("U");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hv")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_v);
                indo.setText("V");
                inggris.setText("V");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hw")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_w);
                indo.setText("W");
                inggris.setText("W");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hx")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_x);
                indo.setText("X");
                inggris.setText("X");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hy")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_y);
                indo.setText("Y");
                inggris.setText("Y");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hz")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                Buttonclicked(view, 2);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.h_z);
                indo.setText("Z");
                inggris.setText("Z");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }

// ==================================================================================
// =================================== Part Angka ===================================
// ==================================================================================
            else if (getFinalKode.equals("anol")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Angka");
                Buttonclicked(view, 3);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.a_nol);
                indo.setText("Nol");
                inggris.setText("Zero");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("asatu")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Angka");
                Buttonclicked(view, 3);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.a_satu);
                indo.setText("Satu");
                inggris.setText("One");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("adua")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Angka");
                Buttonclicked(view, 3);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.a_dua);
                indo.setText("Dua");
                inggris.setText("Two");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("atiga")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Angka");
                Buttonclicked(view, 3);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.a_tiga);
                indo.setText("Tiga");
                inggris.setText("Three");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("aempat")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Angka");
                Buttonclicked(view, 3);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.a_empat);
                indo.setText("Empat");
                inggris.setText("Four");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("alima")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Angka");
                Buttonclicked(view, 3);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.a_lima);
                indo.setText("Lima");
                inggris.setText("Five");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("aenam")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Angka");
                Buttonclicked(view, 3);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.a_enam);
                indo.setText("Enam");
                inggris.setText("Six");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("atujuh")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Angka");
                Buttonclicked(view, 3);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.a_tujuh);
                indo.setText("Tujuh");
                inggris.setText("Seven");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("adelapan")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Angka");
                Buttonclicked(view, 3);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.a_delapan);
                indo.setText("Delapan");
                inggris.setText("Eight");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("asembilan")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Angka");
                Buttonclicked(view, 3);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.a_sembilan);
                indo.setText("Sembilan");
                inggris.setText("Nine");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("asepuluh")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Angka");
                Buttonclicked(view, 3);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.a_sepuluh);
                indo.setText("Sepuluh");
                inggris.setText("Ten");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }

// ==================================================================================
// =================================== Part Anggota Tubuh ===========================
// ==================================================================================
            else if (getFinalKode.equals("bulumata")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Anggota Tubuh");
                Buttonclicked(view, 4);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.agt_bulumata);
                indo.setText("Bulu Mata");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("dagu")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Anggota Tubuh");
                Buttonclicked(view, 4);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.agt_dagu);
                indo.setText("Dagu");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("gigi")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Anggota Tubuh");
                Buttonclicked(view, 4);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.agt_gigi);
                indo.setText("Gigi");
                inggris.setText("Teeth");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("hidung")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Anggota Tubuh");
                Buttonclicked(view, 4);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.agt_hidung);
                indo.setText("Hidung");
                inggris.setText("Nose");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("jari")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Anggota Tubuh");
                Buttonclicked(view, 4);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.agt_jari);
                indo.setText("Jari");
                inggris.setText("Fingger");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("kaki")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Anggota Tubuh");
                Buttonclicked(view, 4);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.agt_kaki);
                indo.setText("Kaki");
                inggris.setText("Foot");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("kepala")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Anggota Tubuh");
                Buttonclicked(view, 4);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.agt_kepala);
                indo.setText("Kepala");
                inggris.setText("Head");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("leher")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Anggota Tubuh");
                Buttonclicked(view, 4);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.agt_leher);
                indo.setText("Leher");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("lidah")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Anggota Tubuh");
                Buttonclicked(view, 4);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.agt_lidah);
                indo.setText("lidah");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("lutut")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Anggota Tubuh");
                Buttonclicked(view, 4);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.agt_lutut);
                indo.setText("Lutut");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("mata")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Anggota Tubuh");
                Buttonclicked(view, 4);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.agt_mata);
                indo.setText("Mata");
                inggris.setText("Eyes");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("mulut")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Anggota Tubuh");
                Buttonclicked(view, 4);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.agt_mulut);
                indo.setText("Mulut");
                inggris.setText("Mouth");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("pipi")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Anggota Tubuh");
                Buttonclicked(view, 4);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.agt_pipi);
                indo.setText("Pipi");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("sikut")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Anggota Tubuh");
                Buttonclicked(view, 4);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.agt_sikut);
                indo.setText("Sikut");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("rambut")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Anggota Tubuh");
                Buttonclicked(view, 4);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.agt_rambut);
                indo.setText("Rambut");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("tangan")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Anggota Tubuh");
                Buttonclicked(view, 4);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.agt_tangan);
                indo.setText("Tangan");
                inggris.setText("Hand");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("telapakkaki")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Anggota Tubuh");
                Buttonclicked(view, 4);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.agt_telapakkaki);
                indo.setText("Telapak Kaki");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("telinga")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Anggota Tubuh");
                Buttonclicked(view, 4);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.agt_telinga);
                indo.setText("Telinga");
                inggris.setText("Ears");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("wajah")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Anggota Tubuh");
                Buttonclicked(view, 4);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.agt_wajah);
                indo.setText("Wajah");
                inggris.setText("Face");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }

// ==================================================================================
// =================================== Part Benda ===================================
// ==================================================================================
            else if (getFinalKode.equals("bda_baju")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_baju);
                indo.setText("Baju");
                inggris.setText("Clothes");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_bolalampu")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                        Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_bolalampu);
                indo.setText("Bola lampu");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_bukutulis")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_bukutulis);
                indo.setText("Buku Tulis");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }
            else if (getFinalKode.equals("bda_celana")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_celana);
                indo.setText("Celana");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_ember")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_ember);
                indo.setText("Ember");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_garpu")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_garpu);
                indo.setText("Garpu");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_gitar")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_gitar);
                indo.setText("Gitar");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_jaket")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_jaket);
                indo.setText("Jaket");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_kacamata")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_kacamata);
                indo.setText("Kacamata");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_kaoskaki")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_kaoskaki);
                indo.setText("Kaos Kaki");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_kipas_angin")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_kipas_angin);
                indo.setText("Kipas Angin");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_krayon")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_krayon);
                indo.setText("Krayon");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_kuali")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_kuali);
                indo.setText("Kuali");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_kulkas")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_kulkas);
                indo.setText("Kulkas");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_kursi")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_kursi);
                indo.setText("Kursi");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_lemari")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_lemari);
                indo.setText("Lemari");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_mangkuk")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_mangkuk);
                indo.setText("Mangkuk");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_meja")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_meja);
                indo.setText("Meja");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_mesincuci")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_mesincuci);
                indo.setText("Mesin Cuci");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_mobil")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_mobil);
                indo.setText("Mobil");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_motor")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_motor);
                indo.setText("Motor");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_panci")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_panci);
                indo.setText("Panci");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_penggaris")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_penggaris);
                indo.setText("Penggaris");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_penghapus")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_penghapus);
                indo.setText("Penghapus");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_penyaring")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_penyaring);
                indo.setText("Penyaring");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_motor")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_motor);
                indo.setText("Motor");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_pulpen")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_pulpen);
                indo.setText("Pulpen");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_sapu")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_sapu);
                indo.setText("Sapu");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_sendok")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_sendok);
                indo.setText("Sendok");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_sepatu")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_sepatu);
                indo.setText("Sepatu");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_sepeda")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_sepeda);
                indo.setText("Sepeda");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_setrika")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_setrika);
                indo.setText("Setrika");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_spidol")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_spidol);
                indo.setText("Spidol");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_telivisi")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_telivisi);
                indo.setText("Televisi");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_tempattidur")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_tempattidur);
                indo.setText("Tempat Tidur");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("bda_vasbunga")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                Buttonclicked(view, 5);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.bda_vasbunga);
                indo.setText("Vas Bunga");
                inggris.setText("-");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_id);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.angsa_eng);
                        mp_id.start();
                    }
                });
            }
        return view;
    }

    private void Buttonclicked(View view, final int id) {
        final Button btn_back =  view.findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putInt("id", id);
                Pilihgambar_Frag pilihgambar_frag = new Pilihgambar_Frag();
                pilihgambar_frag.setArguments(bundle);

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, pilihgambar_frag);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
}
