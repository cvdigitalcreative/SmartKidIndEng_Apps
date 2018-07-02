package com.digitalcreative.smartkidsindeng.Entity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.digitalcreative.smartkidsindeng.Controler.Kuis_frag;
import com.digitalcreative.smartkidsindeng.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {

    Button btnhewan, btnhuruf, btnangka, btnanggota_tubuh, btnbenda, btnkuis;
    Pilihgambar_Frag pilihgambar_frag;
    Kuis_frag kuis_frag;

    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        //Init
        btnhewan = view.findViewById(R.id.btn_hewan);
        btnhuruf = view.findViewById(R.id.btn_huruf);
        btnangka = view.findViewById(R.id.btn_angka);
        btnanggota_tubuh = view.findViewById(R.id.btn_anggota_tubuh);
        btnbenda = view.findViewById(R.id.btn_benda);
        btnkuis = view.findViewById(R.id.btn_Kuis_Pertanyaan);
        TextView toolbar_text =  view.findViewById(R.id.text_toolbar);
        Toolbar mToolbar = getActivity().findViewById(R.id.toolbar);

        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(mToolbar);
        toolbar_text.setText("Menu");

        fragHewan();
        fragHuruf();
        fragAngka();
        fragAnggotatubuh();
        fragBenda();
        fragKuis();
        return view;
    }


    public void fragHewan() {
        btnhewan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Passing data menggunakan bundle
                Bundle bundle = new Bundle();
                int id = 1;
                bundle.putInt("id", id);
                pilihgambar_frag = new Pilihgambar_Frag();
                pilihgambar_frag.setArguments(bundle);

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, pilihgambar_frag);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }

    public void fragHuruf() {
        btnhuruf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                int id = 2;
                bundle.putInt("id", id);
                pilihgambar_frag = new Pilihgambar_Frag();
                pilihgambar_frag.setArguments(bundle);

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, pilihgambar_frag);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

    }

    public void fragAngka() {
        btnangka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                int id = 3;
                bundle.putInt("id", id);
                pilihgambar_frag = new Pilihgambar_Frag();
                pilihgambar_frag.setArguments(bundle);

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, pilihgambar_frag);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }

    public void fragAnggotatubuh() {
        btnanggota_tubuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                int id = 4;
                bundle.putInt("id", id);
                pilihgambar_frag = new Pilihgambar_Frag();
                pilihgambar_frag.setArguments(bundle);

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, pilihgambar_frag);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }

    public void fragBenda() {
        btnbenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                int id = 5;
                bundle.putInt("id", id);
                pilihgambar_frag = new Pilihgambar_Frag();
                pilihgambar_frag.setArguments(bundle);

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, pilihgambar_frag);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }

    public void fragKuis() {
        btnkuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                int id = 6;
                bundle.putInt("id", id);
                kuis_frag = new Kuis_frag();
                kuis_frag.setArguments(bundle);

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, kuis_frag);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

    }
}