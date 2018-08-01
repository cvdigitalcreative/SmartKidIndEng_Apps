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

import com.digitalcreative.smartkidsindeng.Controler.Kuis_frag;
import com.digitalcreative.smartkidsindeng.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TampilKuisFrag extends Fragment {
    Kuis_frag kuis_frag;

    public TampilKuisFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tampil_kuis, container, false);
        //Toolbar
        TextView toolbar_text =  view.findViewById(R.id.text_toolbar);
        Toolbar mToolbar = getActivity().findViewById(R.id.toolbar);
        final AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(mToolbar);
        toolbar_text.setText("Menu Kuis");

        //Button
        Button btn_hewan = view.findViewById(R.id.btn_kuis_hewan);
        Button btn_huruf = view.findViewById(R.id.btn_kuis_huruf);
        Button btn_angka = view.findViewById(R.id.btn_kuis_angka);
        Button btn_anggotatubuh = view.findViewById(R.id.btn_kuis_anggotatubuh);
        Button btn_warna = view.findViewById(R.id.btn_kuis_warna);
        Button btn_transportasi = view.findViewById(R.id.btn_kuis_transportasi);
        Button btn_benda = view.findViewById(R.id.btn_kuis_benda);

        //Excute The Button
        btn_hewan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                String key = "hewan";
                bundle.putString("id", key);
                kuis_frag = new Kuis_frag();
                kuis_frag.setArguments(bundle);

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, kuis_frag);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        btn_huruf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                String key = "huruf";
                bundle.putString("id", key);
                kuis_frag = new Kuis_frag();
                kuis_frag.setArguments(bundle);

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, kuis_frag);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        btn_angka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                String key = "angka";
                bundle.putString("id", key);
                kuis_frag = new Kuis_frag();
                kuis_frag.setArguments(bundle);

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, kuis_frag);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        btn_anggotatubuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                String key = "anggotatubuh";
                bundle.putString("id", key);
                kuis_frag = new Kuis_frag();
                kuis_frag.setArguments(bundle);

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, kuis_frag);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        btn_warna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                String key = "warna";
                bundle.putString("id", key);
                kuis_frag = new Kuis_frag();
                kuis_frag.setArguments(bundle);

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, kuis_frag);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        btn_transportasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                String key = "transportasi";
                bundle.putString("id", key);
                kuis_frag = new Kuis_frag();
                kuis_frag.setArguments(bundle);

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, kuis_frag);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        btn_benda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                String key = "benda";
                bundle.putString("id", key);
                kuis_frag = new Kuis_frag();
                kuis_frag.setArguments(bundle);

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, kuis_frag);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}
