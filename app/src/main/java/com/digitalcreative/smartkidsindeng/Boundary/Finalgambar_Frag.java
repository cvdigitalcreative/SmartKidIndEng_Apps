package com.digitalcreative.smartkidsindeng.Boundary;


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
                inggris.setText("Goose");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_2);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_3);
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
                inggris.setText("Seals");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_3);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_4);
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
                    MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_4);
                    mp_id.start();
                }
            });

            btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_5);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_5);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_6);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_6);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_7);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_7);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_8);
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
                inggris.setText("Rooster");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_8);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_9);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_9);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_10);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_10);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_11);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_11);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_12);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_12);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_13);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_13);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_14);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_14);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_15);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_15);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_16);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_16);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_17);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_17);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_18);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_18);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_19);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_19);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_20);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_20);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_21);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_21);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_22);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_22);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_23);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_23);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_24);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_25);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_26);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_26);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_27);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_27);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_28);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_28);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_29);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_29);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_30);
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
                indo.setText("Burung Kakaktua");
                inggris.setText("Parrot");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_30);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_31);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_31);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_32);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_32);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_33);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_33);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_34);
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
                indo.setText("Burung Pelikan");
                inggris.setText("Pelican");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_34);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_35);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_35);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_36);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_36);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_37);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_37);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_38);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_38);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_39);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_39);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_40);
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
                inggris.setText("Squid");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_40);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_41);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_41);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_42);
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
                indo.setText("Elang");
                inggris.setText("Eagle");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_42);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_43);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_43);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_44);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_44);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_45);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_45);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_46);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_47);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_48);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_49);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_50);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_50);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_51);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_51);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_52);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_52);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_53);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_53);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_54);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_54);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_55);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_55);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_56);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_56);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_57);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_57);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_58);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_58);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_59);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_59);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_60);
                        mp_id.start();
                    }
                });
//            } else if (getFinalKode.equals("hwn_jerapah")){
//                // Set Toolbar
//                AppCompatActivity activity = (AppCompatActivity) getActivity();
//                activity.setSupportActionBar(mToolbar);
//                toolbar_text.setText("Hewan");
//                Buttonclicked(view, 1);
//
//                //Set Image, Text Indo dan Eng
//                imageView.setImageResource(R.mipmap.hwn_jerapah);
//                indo.setText("Jerapah");
//                inggris.setText("Giraffe");
//
//                //Set Suara indo dan Eng
//                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_60);
//                        mp_id.start();
//                    }
//                });
//
//                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_61);
//                        mp_id.start();
//                    }
//                });
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_61);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_62);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_62);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_61);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_63);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_63);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_64);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_64);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_65);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_65);
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
                indo.setText("Kangguru Kecil");
                inggris.setText("Small Kangaroo");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_66);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_66);
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
                indo.setText("Kangguru");
                inggris.setText("Kangaroo");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_67);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_67);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_68);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_68);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_69);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_69);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_70);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_70);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_71);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_71);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_72);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_72);
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
                inggris.setText("Canary");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_73);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_73);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_74);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_74);
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
                inggris.setText("Madagaskar Monkey");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_75);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_76);
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
                inggris.setText("Shell");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_77);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_77);
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
                inggris.setText("Oyster Shell");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_78);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_78);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_79);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_79);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_80);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_80);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_81);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_81);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_84);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_84);
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
                inggris.setText("Jungle Cat");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_83);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_83);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_86);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_86);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_85);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_85);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_87);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_87);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_89);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_89);
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
                inggris.setText("Small Beetle");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_88);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_88);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_90);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_90);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_91);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_91);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_92);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_92);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_93);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_93);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_94);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_94);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_95);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_95);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_96);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_96);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_97);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_97);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_99);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_99);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_98);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_98);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_100);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_100);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_101);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_101);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_102);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_102);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_103);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_103);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_104);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_104);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_105);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_105);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_106);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_106);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_107);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_107);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_108);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_108);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_109);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_109);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_110);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_110);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_111);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_111);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_112);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_112);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_113);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_113);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_114);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_114);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_116);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_116);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_117);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_117);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_118);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_119);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_119);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_119);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_120);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_120);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_121);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_121);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_122);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_122);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_123);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_123);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_124);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_124);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_125);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_125);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_126);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_126);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_127);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_127);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_128);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_128);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_129);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_129);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_130);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_130);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_131);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_131);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_132);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_132);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_133);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_133);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_134);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_134);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_135);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_135);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_136);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_136);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_ind_137);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hwn_eng_137);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_1);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_1);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_2);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_2);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_3);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_3);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_4);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_4);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_5);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_5);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_6);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_6);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_7);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_7);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_8);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_8);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_9);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_9);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_10);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_10);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_11);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_11);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_12);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_12);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_13);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_13);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_14);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_14);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_15);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_15);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_16);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_16);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_17);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_17);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_18);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_18);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_19);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_19);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_20);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_20);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_21);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_21);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_22);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_22);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_23);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_23);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_24);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_24);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_25);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_25);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_ind_26);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.hrf_eng_26);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_ind1);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_eng1);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_ind2);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_eng2);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_ind3);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_eng3);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_ind4);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_eng4);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_ind5);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_eng5);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_ind6);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_eng6);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_ind7);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_eng7);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_ind8);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_eng8);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_ind9);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_eng9);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_ind10);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_eng10);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_ind11);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.num_eng11);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_ind_1);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_eng1);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_ind_2);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_eng2);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_ind_3);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_eng3);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_ind_4);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_eng4);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_ind_5);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_eng5);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_ind_6);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_eng6);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_ind_7);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_eng7);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_ind_8);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_eng8);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_ind_9);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_eng9);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_ind_10);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_eng10);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_ind_11);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_eng11);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_ind_12);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_eng12);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_ind_13);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_eng13);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_ind_14);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_eng14);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_ind_15);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_eng15);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_ind_16);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_eng16);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_ind_17);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_eng17);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_ind_18);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_eng18);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_ind_19);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.agt_eng19);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind1);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng1);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind2);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng2);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind3);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng3);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind4);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng4);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind5);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng5);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind6);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng6);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind7);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng7);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind8);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng8);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind9);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng9);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind10);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng10);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind11);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng11);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind12);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng12);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind13);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng13);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind14);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng14);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind15);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng15);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind16);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng16);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind17);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng17);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind18);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng18);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind19);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng19);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind20);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng20);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind21);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng21);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind22);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng22);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind23);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng23);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind24);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng24);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind25);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng25);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind26);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng26);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind27);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng27);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind28);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng28);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind29);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng29);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind30);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng30);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind31);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng31);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind32);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng31);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind33);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng31);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind34);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng31);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind35);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng31);
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
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_ind36);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng31);
                        mp_id.start();
                    }
                });
            }
// ==================================================================================
// =================================== Part Transportasi ============================
// ==================================================================================
            else if (getFinalKode.equals("transportasi_ambulance")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Transportasi");
                Buttonclicked(view, 7);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.transportasi_ambulance);
                indo.setText("Ambulance");
                inggris.setText("Ambulance");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_ind1);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_eng1);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("transportasi_baloonudara")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Transportasi");
                Buttonclicked(view, 7);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.transportasi_baloonudara);
                indo.setText("Balon Udara");
                inggris.setText("Air Balloon");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_ind2);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_eng2);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("transportasi_becak")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Transportasi");
                Buttonclicked(view, 7);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.transportasi_ambulance);
                indo.setText("Becak");
                inggris.setText("Rickshaw");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_ind3);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_eng3);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("transportasi_bus")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Transportasi");
                Buttonclicked(view, 7);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.transportasi_bus);
                indo.setText("Bus");
                inggris.setText("Bus");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_ind4);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_eng4);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("transportasi_gerobak")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Transportasi");
                Buttonclicked(view, 7);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.transportasi_gerobak);
                indo.setText("Gerobak");
                inggris.setText("Cart");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_ind5);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_eng5);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("transportasi_helikopter")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Transportasi");
                Buttonclicked(view, 7);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.transportasi_helikopter);
                indo.setText("Helikopter");
                inggris.setText("Helicopter");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_ind6);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_eng6);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("transportasi_jet")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Transportasi");
                Buttonclicked(view, 7);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.transportasi_jet);
                indo.setText("Pesawat Jet");
                inggris.setText("Jet");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_ind11);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_eng11);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("transportasi_kapal")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Transportasi");
                Buttonclicked(view, 7);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.transportasi_kapal);
                indo.setText("Kapal Fery");
                inggris.setText("Ferry");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_ind8);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_eng8);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("transportasi_kapalselam")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Transportasi");
                Buttonclicked(view, 7);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.transportasi_kapalselam);
                indo.setText("Kapal Selam");
                inggris.setText("Kapal Selam");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_ind7);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_eng7);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("transportasi_keretaapi")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Transportasi");
                Buttonclicked(view, 7);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.transportasi_keretaapi);
                indo.setText("Kereta Api");
                inggris.setText("Train");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_ind9);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.bnd_eng9);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("transportasi_mobil")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Transportasi");
                Buttonclicked(view, 7);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.transportasi_mobil);
                indo.setText("Mobil");
                inggris.setText("Car");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_ind10);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_eng10);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("transportasi_motor")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Transportasi");
                Buttonclicked(view, 7);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.transportasi_motor);
                indo.setText("Sepeda Motor");
                inggris.setText("Motorcycle");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_ind13);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_eng13);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("transportasi_pesawat")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Transportasi");
                Buttonclicked(view, 7);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.transportasi_mobil);
                indo.setText("Pesawat");
                inggris.setText("Airplane");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_ind12);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_eng12);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("transportasi_sepeda")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Transportasi");
                Buttonclicked(view, 7);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.transportasi_sepeda);
                indo.setText("Sepeda");
                inggris.setText("Bike");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_ind14);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_eng14);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("transportasi_skuter")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Transportasi");
                Buttonclicked(view, 7);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.transportasi_skuter);
                indo.setText("Skuter");
                inggris.setText("Scooter");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_ind15);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_eng15);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("transportasi_taksi")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Transportasi");
                Buttonclicked(view, 7);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.transportasi_taksi);
                indo.setText("Taksi");
                inggris.setText("Taxi");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_ind16);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_eng16);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("transportasi_tank")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Transportasi");
                Buttonclicked(view, 7);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.transportasi_tank);
                indo.setText("Tank");
                inggris.setText("Tank");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_ind17);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_eng17);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("transportasi_traktor")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Transportasi");
                Buttonclicked(view, 7);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.transportasi_traktor);
                indo.setText("Traktor");
                inggris.setText("Tractor");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_ind18);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_eng18);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("transportasi_truk")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Transportasi");
                Buttonclicked(view, 7);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.transportasi_truk);
                indo.setText("Truk");
                inggris.setText("Truck");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_ind19);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.trans_eng19);
                        mp_id.start();
                    }
                });
            }

// ==================================================================================
// =================================== Part Warna ===================================
// ==================================================================================
            else if (getFinalKode.equals("warna_abu")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Warna");
                Buttonclicked(view, 8);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.warna_abu);
                indo.setText("Abu-abu");
                inggris.setText("Grey");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_ind1);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_eng1);
                        mp_id.start();
                    }
                });
            }  else if (getFinalKode.equals("warna_birudonker")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Warna");
                Buttonclicked(view, 8);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.warna_birudonker);
                indo.setText("Biru Donker");
                inggris.setText("Navy Blue");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_ind3);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_eng3);
                        mp_id.start();
                    }
                });
            }  else if (getFinalKode.equals("warna_birulaut")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Warna");
                Buttonclicked(view, 8);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.warna_birulaut);
                indo.setText("Biru");
                inggris.setText("Blue");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_ind4);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_eng4);
                        mp_id.start();
                    }
                });
            }  else if (getFinalKode.equals("warna_emas")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Warna");
                Buttonclicked(view, 8);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.warna_emas);
                indo.setText("Emas");
                inggris.setText("Gold");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_ind6);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_eng6);
                        mp_id.start();
                    }
                });
            }  else if (getFinalKode.equals("warna_hijau")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Warna");
                Buttonclicked(view, 8);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.warna_hijau);
                indo.setText("Hijau");
                inggris.setText("Green");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_ind7);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_eng7);
                        mp_id.start();
                    }
                });
            }  else if (getFinalKode.equals("warna_hitam")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Warna");
                Buttonclicked(view, 8);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.warna_hitam);
                indo.setText("Hitam");
                inggris.setText("Black");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_ind8);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_eng8);
                        mp_id.start();
                    }
                });
            }  else if (getFinalKode.equals("warna_kuning")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Warna");
                Buttonclicked(view, 8);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.warna_abu);
                indo.setText("Kuning");
                inggris.setText("Yellow");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_ind9);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_eng9);
                        mp_id.start();
                    }
                });
            }  else if (getFinalKode.equals("warna_merahmarun")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Warna");
                Buttonclicked(view, 8);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.warna_abu);
                indo.setText("Merah Marun");
                inggris.setText("Red");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_ind10);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_eng10);
                        mp_id.start();
                    }
                });
            }  else if (getFinalKode.equals("warna_oranye")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Warna");
                Buttonclicked(view, 8);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.warna_oranye);
                indo.setText("Oranye");
                inggris.setText("Orange");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_ind12);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_eng12);
                        mp_id.start();
                    }
                });
            }  else if (getFinalKode.equals("warna_pink")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Warna");
                Buttonclicked(view, 8);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.warna_pink);
                indo.setText("Merah Muda");
                inggris.setText("Pink");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_ind13);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_eng13);
                        mp_id.start();
                    }
                });
            }  else if (getFinalKode.equals("warna_putih")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Warna");
                Buttonclicked(view, 8);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.warna_putih);
                indo.setText("Putih");
                inggris.setText("White");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_ind14);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_eng14);
                        mp_id.start();
                    }
                });
            } else if (getFinalKode.equals("warna_ungu")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Warna");
                Buttonclicked(view, 8);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.warna_ungu);
                indo.setText("Ungu");
                inggris.setText("Purple");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_ind15);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_eng15);
                        mp_id.start();
                    }
                });
            //}
//            else if (getFinalKode.equals("warna_violet")){
//                // Set Toolbar
//                AppCompatActivity activity = (AppCompatActivity) getActivity();
//                activity.setSupportActionBar(mToolbar);
//                toolbar_text.setText("Warna");
//                Buttonclicked(view, 8);
//
//                //Set Image, Text Indo dan Eng
//                imageView.setImageResource(R.mipmap.warna_violet);
//                indo.setText("Violet");
//                inggris.setText("White");
//
//                //Set Suara indo dan Eng
//                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_ind1);
//                        mp_id.start();
//                    }
//                });
//
//                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_eng1);
//                        mp_id.start();
//                    }
//                });
            } else if (getFinalKode.equals("warna_zaitun")){
                // Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Warna");
                Buttonclicked(view, 8);

                //Set Image, Text Indo dan Eng
                imageView.setImageResource(R.mipmap.warna_zaitun);
                indo.setText("Zaitun");
                inggris.setText("Olive");

                //Set Suara indo dan Eng
                btn_suara_indo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_ind16);
                        mp_id.start();
                    }
                });

                btn_suara_inggris.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp_id =  MediaPlayer.create(Finalgambar_Frag.this.getActivity(), R.raw.warna_eng16);
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
