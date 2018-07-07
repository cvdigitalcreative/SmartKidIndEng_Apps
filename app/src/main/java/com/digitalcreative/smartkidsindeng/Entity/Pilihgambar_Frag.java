package com.digitalcreative.smartkidsindeng.Entity;


import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.digitalcreative.smartkidsindeng.Adapters.ListviewAdapter;
import com.digitalcreative.smartkidsindeng.Model.Model;
import com.digitalcreative.smartkidsindeng.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Pilihgambar_Frag extends Fragment {

    private ListviewAdapter listviewAdapter;
    private RecyclerView recyclerView;
    List<Model> modelList = new ArrayList<>();
    Context context;

    public Pilihgambar_Frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pilihgambar_, container, false);

        //Init Recyclew View
        recyclerView = view.findViewById(R.id.recycle_view);
        recyclerView.setHasFixedSize(true);
        TextView toolbar_text =  view.findViewById(R.id.text_toolbar);
        Toolbar mToolbar = getActivity().findViewById(R.id.toolbar);
        Button btn_back =  view.findViewById(R.id.btn_back);
        btn_back.setOnClickListener(hitbutton);

        //set Layout => sebagai wadah untuk recycle view
        recyclerView.setLayoutManager(new LinearLayoutManager(context));

        //clear data when press back
        modelList.clear();

        //passing Data
        final Bundle bundle = getArguments();
        int getID = bundle.getInt("id");

        switch (getID) {
            case 1:
                //Set Toolbar
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(mToolbar);
                toolbar_text.setText("Hewan");

                //Adding data Hewan
                modelList.add(new Model(R.mipmap.hwn_angsa, "Angka Nol", "hwn_angsa"));
                modelList.add(new Model(R.mipmap.hwn_anjing, "Angka_satu", "hwn_anjing"));
                modelList.add(new Model(R.mipmap.hwn_anjinglaut, "Angka_dua", "hwn_anjinglaut"));
                modelList.add(new Model(R.mipmap.hwn_anoa, "Angka_tiga", "hwn_anoa"));
                modelList.add(new Model(R.mipmap.hwn_antelop, "Angka_empat", "hwn_antelop"));
                modelList.add(new Model(R.mipmap.hwn_ayam, "Angka_lima", "hwn_ayam"));
                modelList.add(new Model(R.mipmap.hwn_ayambetina, "Angka_enam", "hwn_ayambetina"));
                modelList.add(new Model(R.mipmap.hwn_ayamjantan, "Angka_tujuh", "hwn_ayamjantan"));
                modelList.add(new Model(R.mipmap.hwn_babi, "Angka_delapan", "hwn_babi"));
                modelList.add(new Model(R.mipmap.hwn_babun, "Angka_sembilan", "hwn_babun"));
                modelList.add(new Model(R.mipmap.hwn_badak, "Angka Nol", "hwn_badak"));
                modelList.add(new Model(R.mipmap.hwn_banteng, "Angka_satu", "hwn_banteng"));
                modelList.add(new Model(R.mipmap.hwn_bebek, "Angka_dua", "hwn_bebek"));
                modelList.add(new Model(R.mipmap.hwn_belalang, "Angka_tiga", "hwn_belalang"));
                modelList.add(new Model(R.mipmap.hwn_belibis, "Angka_empat", "hwn_belibis"));
                modelList.add(new Model(R.mipmap.hwn_belut, "Angka_lima", "hwn_belut"));
                modelList.add(new Model(R.mipmap.hwn_beruang, "beruang_kutub", "hwn_beruang"));
                modelList.add(new Model(R.mipmap.hwn_beruang2, "Angka_tujuh", "hwn_beruang2"));
                modelList.add(new Model(R.mipmap.hwn_bintanglaut, "Angka_delapan", "hwn_bintanglaut"));
                modelList.add(new Model(R.mipmap.hwn_bison, "Angka_sembilan", "hwn_bison"));
                modelList.add(new Model(R.mipmap.hwn_buaya, "Angka_lima", "hwn_buaya"));
                modelList.add(new Model(R.mipmap.hwn_bulldog, "Angka_enam", "hwn_bulldog"));
                modelList.add(new Model(R.mipmap.hwn_burungbangau, "Angka_delapan", "hwn_burungbangau"));
                modelList.add(new Model(R.mipmap.hwn_burungbeo, "Angka_sembilan", "hwn_burungbeo"));
                modelList.add(new Model(R.mipmap.hwn_burungbulbul, "Angka_sembilan", "hwn_burungbulbul"));
                modelList.add(new Model(R.mipmap.hwn_burungelang, "Angka Nol", "hwn_burungelang"));
                modelList.add(new Model(R.mipmap.hwn_burunggagak, "Angka_satu", "hwn_burunggagak"));
                modelList.add(new Model(R.mipmap.hwn_burunggereja, "Angka_dua", "hwn_burunggereja"));
                modelList.add(new Model(R.mipmap.hwn_burungkakatua, "Angka_tiga", "hwn_burungkakatua"));
                modelList.add(new Model(R.mipmap.hwn_burungkolibri, "Angka_empat", "hwn_burungkolibri"));
                modelList.add(new Model(R.mipmap.hwn_burunglayanglayang, "Angka_lima", "hwn_burunglayanglayang"));
                modelList.add(new Model(R.mipmap.hwn_burungmerak, "Angka_enam", "hwn_burungmerak"));
                modelList.add(new Model(R.mipmap.hwn_burungmurai, "Angka_tujuh", "hwn_burungmurai"));
                modelList.add(new Model(R.mipmap.hwn_burungpelika, "Angka_delapan", "hwn_burungpelika"));
                modelList.add(new Model(R.mipmap.hwn_burungpuyuh, "Angka_sembilan", "hwn_burungpuyuh"));
                modelList.add(new Model(R.mipmap.hwn_burungunta, "Angka Nol", "hwn_burungunta"));
                modelList.add(new Model(R.mipmap.hwn_cacing, "Angka_satu", "hwn_cacing"));
                modelList.add(new Model(R.mipmap.hwn_capung, "Angka_dua", "hwn_capung"));
                modelList.add(new Model(R.mipmap.hwn_citah, "Angka_tiga", "hwn_citah"));
                modelList.add(new Model(R.mipmap.hwn_cumi, "Angka_empat", "hwn_cumi"));
                modelList.add(new Model(R.mipmap.hwn_domba, "Angka_lima", "hwn_domba"));
                modelList.add(new Model(R.mipmap.hwn_flaminggo, "Angka_enam", "hwn_flaminggo"));
                modelList.add(new Model(R.mipmap.hwn_gajah, "Angka_tujuh", "hwn_gajah"));
                modelList.add(new Model(R.mipmap.hwn_gorila, "Angka_delapan", "hwn_gorila"));
                modelList.add(new Model(R.mipmap.hwn_hamster, "Angka_sembilan", "hwn_hamster"));
                modelList.add(new Model(R.mipmap.hwn_harimau, "Angka_lima", "hwn_harimau"));
                modelList.add(new Model(R.mipmap.hwn_harimaukumbang, "Angka_enam", "hwn_harimaukumbang"));
                modelList.add(new Model(R.mipmap.hwn_hiena, "Angka_tujuh", "hwn_hiena"));
                modelList.add(new Model(R.mipmap.hwn_iguana, "Angka_delapan", "hwn_iguana"));
                modelList.add(new Model(R.mipmap.hwn_ikanhiu, "Angka_sembilan", "hwn_ikanhiu"));
                modelList.add(new Model(R.mipmap.hwn_ikankoi, "Angka_sembilan", "hwn_ikankoi"));
                modelList.add(new Model(R.mipmap.hwn_ikanlele, "beruang_kutub", "hwn_ikanlele"));
                modelList.add(new Model(R.mipmap.hwn_ikanlumba, "Angka_tujuh", "hwn_ikanlumba"));
                modelList.add(new Model(R.mipmap.hwn_ikanmas, "Angka_delapan", "hwn_ikanmas"));
                modelList.add(new Model(R.mipmap.hwn_ikanpaus, "Angka_sembilan", "hwn_ikanpaus"));
                modelList.add(new Model(R.mipmap.hwn_ikansalmon, "Angka_lima", "hwn_ikansalmon"));
                modelList.add(new Model(R.mipmap.hwn_ikansarden, "Angka_enam", "hwn_ikansarden"));
                modelList.add(new Model(R.mipmap.hwn_jerapah, "Angka_tujuh", "hwn_jerapah"));
                modelList.add(new Model(R.mipmap.hwn_kadal, "Angka_delapan", "hwn_kadal"));
                modelList.add(new Model(R.mipmap.hwn_kadalair, "Angka_sembilan", "hwn_kadalair"));
                modelList.add(new Model(R.mipmap.hwn_kalajengking, "Angka_sembilan", "hwn_kalajengking"));
                modelList.add(new Model(R.mipmap.hwn_kalkun, "Angka Nol", "hwn_kalkun"));
                modelList.add(new Model(R.mipmap.hwn_kambing, "Angka_satu", "hwn_kambing"));
                modelList.add(new Model(R.mipmap.hwn_kangguru, "Kangguru Kecil", "hwn_kangguru"));
                modelList.add(new Model(R.mipmap.hwn_kanggurubesar, "Angka_tiga", "hwn_kanggurubesar"));
                modelList.add(new Model(R.mipmap.hwn_kasuari, "Angka_tujuh", "hwn_kasuari"));
                modelList.add(new Model(R.mipmap.hwn_katak, "Angka_delapan", "hwn_katak"));
                modelList.add(new Model(R.mipmap.hwn_kedelai, "Angka_sembilan", "hwn_kedelai"));
                modelList.add(new Model(R.mipmap.hwn_kelelawar, "Angka Nol", "hwn_kelelawar"));
                modelList.add(new Model(R.mipmap.hwn_kelinci, "Angka_satu", "hwn_kelinci"));
                modelList.add(new Model(R.mipmap.hwn_kenari, "Angka_dua", "hwn_kenari"));
                modelList.add(new Model(R.mipmap.hwn_kepiting, "Angka_tiga", "hwn_kepiting"));
                modelList.add(new Model(R.mipmap.hwn_kera_madagaskar, "Angka_empat", "hwn_kera_madagaskar"));
                modelList.add(new Model(R.mipmap.hwn_kerabesar_beruk, "Angka_lima", "hwn_kerabesar_beruk"));
                modelList.add(new Model(R.mipmap.hwn_kerang, "Angka_enam", "hwn_kerang"));
                modelList.add(new Model(R.mipmap.hwn_kerang_tiram, "Angka_tujuh", "hwn_kerang_tiram"));
                modelList.add(new Model(R.mipmap.hwn_kerbau, "Angka_delapan", "hwn_kerbau"));
                modelList.add(new Model(R.mipmap.hwn_kiwi, "Angka_sembilan", "hwn_kiwi"));
                modelList.add(new Model(R.mipmap.hwn_koala, "Angka_lima", "hwn_koala"));
                modelList.add(new Model(R.mipmap.hwn_kucing, "Angka_enam", "hwn_kucing"));
                modelList.add(new Model(R.mipmap.hwn_kucinghutan, "Angka_tujuh", "hwn_kucinghutan"));
                modelList.add(new Model(R.mipmap.hwn_kuda, "Angka_delapan", "hwn_kuda"));
                modelList.add(new Model(R.mipmap.hwn_kudalaut, "Angka_sembilan", "hwn_kudalaut"));
                modelList.add(new Model(R.mipmap.hwn_kudanil, "Angka_sembilan", "hwn_kudanil"));
                modelList.add(new Model(R.mipmap.hwn_kumbang, "Angka_delapan", "hwn_kumbang"));
                modelList.add(new Model(R.mipmap.hwn_kumbangkecil, "Angka_sembilan", "hwn_kumbangkecil"));
                modelList.add(new Model(R.mipmap.hwn_kupu_kupu, "Angka_lima", "hwn_kupu_kupu"));
                modelList.add(new Model(R.mipmap.hwn_kura_kura, "Angka_enam", "hwn_kura_kura"));
                modelList.add(new Model(R.mipmap.hwn_kuskus, "Angka_tujuh", "hwn_kuskus"));
                modelList.add(new Model(R.mipmap.hwn_kutu_kutu, "Angka_delapan", "hwn_kutu_kutu"));
                modelList.add(new Model(R.mipmap.hwn_laba_laba, "Angka_sembilan", "hwn_laba_laba"));
                modelList.add(new Model(R.mipmap.hwn_lalat, "Angka_sembilan", "hwn_lalat"));
                modelList.add(new Model(R.mipmap.hwn_landak, "beruang_kutub", "hwn_landak"));
                modelList.add(new Model(R.mipmap.hwn_laron, "Angka_tujuh", "hwn_laron"));
                modelList.add(new Model(R.mipmap.hwn_lebah, "Angka_delapan", "hwn_lebah"));
                modelList.add(new Model(R.mipmap.hwn_lebahbesar, "Angka_sembilan", "hwn_lebahbesar"));
                modelList.add(new Model(R.mipmap.hwn_lintah, "Angka_lima", "hwn_lintah"));
                modelList.add(new Model(R.mipmap.hwn_lobster, "Angka_enam", "hwn_lobster"));
                modelList.add(new Model(R.mipmap.hwn_luak, "Angka_tujuh", "hwn_luak"));
                modelList.add(new Model(R.mipmap.hwn_macantutul, "Angka_delapan", "hwn_macantutul"));
                modelList.add(new Model(R.mipmap.hwn_marmut, "Angka_sembilan", "hwn_marmut"));
                modelList.add(new Model(R.mipmap.hwn_merpati, "Angka_sembilan", "hwn_merpati"));
                modelList.add(new Model(R.mipmap.hwn_monyet, "Angka Nol", "hwn_monyet"));
                modelList.add(new Model(R.mipmap.hwn_musang, "Angka_satu", "hwn_musang"));
                modelList.add(new Model(R.mipmap.hwn_ngengat, "Kangguru Kecil", "hwn_ngengat"));
                modelList.add(new Model(R.mipmap.hwn_nyamuk, "Angka_tiga", "hwn_nyamuk"));
                modelList.add(new Model(R.mipmap.hwn_orangutan, "Angka_empat", "hwn_orangutan"));
                modelList.add(new Model(R.mipmap.hwn_panda, "Angka_lima", "hwn_panda"));
                modelList.add(new Model(R.mipmap.hwn_pinguin, "Angka_enam", "hwn_pinguin"));
                modelList.add(new Model(R.mipmap.hwn_remis, "Angka_tujuh", "hwn_remis"));
                modelList.add(new Model(R.mipmap.hwn_rubah, "Angka_delapan", "hwn_rubah"));
                modelList.add(new Model(R.mipmap.hwn_rusa, "Angka_sembilan", "hwn_rusa"));
                modelList.add(new Model(R.mipmap.hwn_sapi, "Angka_satu", "hwn_sapi"));
                modelList.add(new Model(R.mipmap.hwn_semut, "Angka_dua", "hwn_semut"));
                modelList.add(new Model(R.mipmap.hwn_serigala, "Angka_tiga", "hwn_serigala"));
                modelList.add(new Model(R.mipmap.hwn_siamang, "Angka_empat", "hwn_siamang"));
                modelList.add(new Model(R.mipmap.hwn_simpanse, "Angka_lima", "hwn_simpanse"));
                modelList.add(new Model(R.mipmap.hwn_singa, "Angka_enam", "hwn_singa"));
                modelList.add(new Model(R.mipmap.hwn_singalaut, "Angka_tujuh", "hwn_singalaut"));
                modelList.add(new Model(R.mipmap.hwn_siput, "Angka_delapan", "hwn_siput"));
                modelList.add(new Model(R.mipmap.hwn_tapir, "Angka_sembilan", "hwn_tapir"));
                modelList.add(new Model(R.mipmap.hwn_tawon, "Angka_lima", "hwn_tawon"));
                modelList.add(new Model(R.mipmap.hwn_tikus, "Angka_enam", "hwn_tikus"));
                modelList.add(new Model(R.mipmap.hwn_trenggiling, "Angka_tujuh", "hwn_trenggiling"));
                modelList.add(new Model(R.mipmap.hwn_tupai, "Angka_delapan", "hwn_tupai"));
                modelList.add(new Model(R.mipmap.hwn_tupai_tanah, "Angka_sembilan", "hwn_tupai_tanah"));
                modelList.add(new Model(R.mipmap.hwn_uburubur, "Angka_sembilan", "hwn_uburubur"));
                modelList.add(new Model(R.mipmap.hwn_udang, "Angka_delapan", "hwn_udang"));
                modelList.add(new Model(R.mipmap.hwn_ular, "Ular Cobra", "hwn_ular_cobra"));
                modelList.add(new Model(R.mipmap.hwn_ular2, "Angka_lima", "hwn_ular2"));
                modelList.add(new Model(R.mipmap.hwn_ulatbulu, "Angka_enam", "hwn_ulatbulu"));
                modelList.add(new Model(R.mipmap.hwn_unta, "Angka_tujuh", "hwn_unta"));
                modelList.add(new Model(R.mipmap.hwn_zebra, "Angka_delapan", "hwn_zebra"));

                //creating the list adapter
                listviewAdapter = new ListviewAdapter(modelList);
                //menset adapter listviewAdapter ke dalam recycle view
                recyclerView.setAdapter(listviewAdapter);
                break;

            case 2:
                //Set Toolbar
                AppCompatActivity activity2 = (AppCompatActivity) getActivity();
                activity2.setSupportActionBar(mToolbar);
                toolbar_text.setText("Huruf");
                btn_back.setOnClickListener(hitbutton);

                //Adding data Huruf
                modelList.add(new Model(R.mipmap.h_a, "Angka Nol", "ha"));
                modelList.add(new Model(R.mipmap.h_b, "Angka_satu", "hb"));
                modelList.add(new Model(R.mipmap.h_c, "Angka_dua", "hc"));
                modelList.add(new Model(R.mipmap.h_d, "Angka_tiga", "hd"));
                modelList.add(new Model(R.mipmap.h_e, "Angka_empat", "he"));
                modelList.add(new Model(R.mipmap.h_f, "Angka_lima", "hf"));
                modelList.add(new Model(R.mipmap.h_g, "Angka_enam", "hg"));
                modelList.add(new Model(R.mipmap.h_h, "Angka_tujuh", "hh"));
                modelList.add(new Model(R.mipmap.h_i, "Angka_delapan", "hi"));
                modelList.add(new Model(R.mipmap.h_j, "Angka_sembilan", "hj"));
                modelList.add(new Model(R.mipmap.h_k, "Angka Nol", "hk"));
                modelList.add(new Model(R.mipmap.h_l, "Angka_satu", "hl"));
                modelList.add(new Model(R.mipmap.h_m, "Angka_dua", "hn"));
                modelList.add(new Model(R.mipmap.h_n, "Angka_tiga", "hm"));
                modelList.add(new Model(R.mipmap.h_o, "Angka_empat", "ho"));
                modelList.add(new Model(R.mipmap.h_p, "Angka_lima", "hp"));
                modelList.add(new Model(R.mipmap.h_q, "Angka_enam", "hq"));
                modelList.add(new Model(R.mipmap.h_r, "Angka_tujuh", "hr"));
                modelList.add(new Model(R.mipmap.h_s, "Angka_delapan", "hs"));
                modelList.add(new Model(R.mipmap.ic_launcherh_t, "Angka_sembilan", "ht"));
                modelList.add(new Model(R.mipmap.h_u, "Angka_lima", "hu"));
                modelList.add(new Model(R.mipmap.h_v, "Angka_enam", "hv"));
                modelList.add(new Model(R.mipmap.h_w, "Angka_tujuh", "hw"));
                modelList.add(new Model(R.mipmap.h_x, "Angka_delapan", "hx"));
                modelList.add(new Model(R.mipmap.h_y, "Angka_sembilan", "hy"));
                modelList.add(new Model(R.mipmap.h_z, "Angka_sembilan", "hz"));

                //creating the list adapter
                listviewAdapter = new ListviewAdapter(modelList);
                //menset adapter listviewAdapter ke dalam recycle view
                recyclerView.setAdapter(listviewAdapter);
                break;

            case 3:
                //Set Toolbar
                AppCompatActivity activity3 = (AppCompatActivity) getActivity();
                activity3.setSupportActionBar(mToolbar);
                toolbar_text.setText("Angka");
                btn_back.setOnClickListener(hitbutton);

                //Adding data Angka
                modelList.add(new Model(R.mipmap.a_nol, "Angka Nol", "anol"));
                modelList.add(new Model(R.mipmap.a_satu, "Angka_satu", "asatu"));
                modelList.add(new Model(R.mipmap.a_dua, "Angka_dua", "adua"));
                modelList.add(new Model(R.mipmap.a_tiga, "Angka_tiga", "atiga"));
                modelList.add(new Model(R.mipmap.a_empat, "Angka_empat", "aempat"));
                modelList.add(new Model(R.mipmap.a_lima, "Angka_lima", "alima"));
                modelList.add(new Model(R.mipmap.a_enam, "Angka_enam", "aenam"));
                modelList.add(new Model(R.mipmap.a_tujuh, "Angka_tujuh", "atujuh"));
                modelList.add(new Model(R.mipmap.a_delapan, "Angka_delapan", "adelapan"));
                modelList.add(new Model(R.mipmap.a_sembilan, "Angka_sembilan", "asembilan"));
                modelList.add(new Model(R.mipmap.a_sepuluh, "Angka_sepuluh", "asepuluh"));

                //creating the list adapter
                listviewAdapter = new ListviewAdapter(modelList);
                //menset adapter listviewAdapter ke dalam recycle view
                recyclerView.setAdapter(listviewAdapter);
                break;

            case 4:
                //Set Toolbar
                AppCompatActivity activity4 = (AppCompatActivity) getActivity();
                activity4.setSupportActionBar(mToolbar);
                toolbar_text.setText("Anggota Tubuh");
                btn_back.setOnClickListener(hitbutton);

                //Adding data Anggota Tubuh
                modelList.add(new Model(R.mipmap.agt_bulumata, "Angka Nol", "bulumata"));
                modelList.add(new Model(R.mipmap.agt_dagu, "Angka_satu", "dagu"));
                modelList.add(new Model(R.mipmap.agt_gigi, "Angka_dua", "gigi"));
                modelList.add(new Model(R.mipmap.agt_hidung, "Angka_tiga", "hidung"));
                modelList.add(new Model(R.mipmap.agt_jari, "Angka_empat", "jari"));
                modelList.add(new Model(R.mipmap.agt_kaki, "Angka_lima", "kaki"));
                modelList.add(new Model(R.mipmap.agt_kepala, "Angka_enam", "kepala"));
                modelList.add(new Model(R.mipmap.agt_leher, "Angka_tujuh", "leher"));
                modelList.add(new Model(R.mipmap.agt_lidah, "Angka_delapan", "lidah"));
                modelList.add(new Model(R.mipmap.agt_lutut, "Angka_sembilan", "lutut"));
                modelList.add(new Model(R.mipmap.agt_mata, "Angka_sepuluh", "mata"));
                modelList.add(new Model(R.mipmap.agt_mulut, "Angka Nol", "mulut"));
                modelList.add(new Model(R.mipmap.agt_pipi, "Angka_satu", "pipi"));
                modelList.add(new Model(R.mipmap.agt_sikut, "Angka_dua", "sikut"));
                modelList.add(new Model(R.mipmap.agt_rambut, "Angka_tiga", "rambut"));
                modelList.add(new Model(R.mipmap.agt_tangan, "Angka_empat", "tangan"));
                modelList.add(new Model(R.mipmap.agt_telapakkaki, "Angka_lima", "telapakkaki"));
                modelList.add(new Model(R.mipmap.agt_telinga, "Angka_enam", "telinga"));
                modelList.add(new Model(R.mipmap.agt_wajah, "Angka_tujuh", "wajah"));

                //creating the list adapter
                listviewAdapter = new ListviewAdapter(modelList);
                //menset adapter listviewAdapter ke dalam recycle view
                recyclerView.setAdapter(listviewAdapter);
                break;

            case 5:
                //Set Toolbar
                AppCompatActivity activity5 = (AppCompatActivity) getActivity();
                activity5.setSupportActionBar(mToolbar);
                toolbar_text.setText("Benda");
                btn_back.setOnClickListener(hitbutton);

                //Adding data Benda
                modelList.add(new Model(R.mipmap.bda_baju, "Angka Nol", "bda_baju"));
                modelList.add(new Model(R.mipmap.bda_bolalampu, "bda_bolalampu", "bda_bolalampu"));
                modelList.add(new Model(R.mipmap.bda_bukutulis, "bda_bukutulis", "bda_bukutulis"));
                modelList.add(new Model(R.mipmap.bda_celana, "bda_celana", "bda_celana"));
                modelList.add(new Model(R.mipmap.bda_ember, "bda_ember", "bda_ember"));
                modelList.add(new Model(R.mipmap.bda_garpu, "bda_garpu", "bda_garpu"));
                modelList.add(new Model(R.mipmap.bda_gitar, "bda_gitar", "bda_gitar"));
                modelList.add(new Model(R.mipmap.bda_jaket, "bda_jaket", "bda_jaket"));
                modelList.add(new Model(R.mipmap.bda_kacamata, "bda_kacamata", "bda_kacamata"));
                modelList.add(new Model(R.mipmap.bda_kaoskaki, "bda_kaoskaki", "bda_kaoskaki"));
                modelList.add(new Model(R.mipmap.bda_kipas_angin, "bda_kipas_angin", "bda_kipas_angin"));
                modelList.add(new Model(R.mipmap.bda_krayon, "bda_krayon Nol", "bda_krayon"));
                modelList.add(new Model(R.mipmap.bda_kuali, "bda_kuali", "bda_kuali"));
                modelList.add(new Model(R.mipmap.bda_kulkas, "bda_kulkas", "bda_kulkas"));
                modelList.add(new Model(R.mipmap.bda_kursi, "bda_kursi", "bda_kursi"));
                modelList.add(new Model(R.mipmap.bda_lemari, "bda_lemari", "bda_lemari"));
                modelList.add(new Model(R.mipmap.bda_mangkuk, "bda_mangkuk", "bda_mangkuk"));
                modelList.add(new Model(R.mipmap.bda_meja, "bda_meja", "bda_meja"));
                modelList.add(new Model(R.mipmap.bda_mesincuci, "bda_mesincuci", "bda_mesincuci"));
                modelList.add(new Model(R.mipmap.bda_mobil, "bda_mobil", "bda_mobil"));
                modelList.add(new Model(R.mipmap.bda_motor, "bda_motor", "bda_motor"));
                modelList.add(new Model(R.mipmap.bda_panci, "bda_panci", "bda_panci"));
                modelList.add(new Model(R.mipmap.bda_penggaris, "bda_penggaris", "bda_penggaris"));
                modelList.add(new Model(R.mipmap.bda_penghapus, "bda_penghapus", "bda_penghapus"));
                modelList.add(new Model(R.mipmap.bda_penyaring, "bda_penyaring", "bda_penyaring"));
                modelList.add(new Model(R.mipmap.bda_pulpen, "bda_pulpen", "bda_pulpen"));
                modelList.add(new Model(R.mipmap.bda_sapu, "bda_sapu", "bda_sapu"));
                modelList.add(new Model(R.mipmap.bda_sendok, "bda_sendok", "bda_sendok"));
                modelList.add(new Model(R.mipmap.bda_sepatu, "bda_sepatu", "bda_sepatu"));
                modelList.add(new Model(R.mipmap.bda_sepeda, "bda_sepeda", "bda_sepeda"));
                modelList.add(new Model(R.mipmap.bda_setrika, "bda_setrika", "bda_setrika"));
                modelList.add(new Model(R.mipmap.bda_spidol, "bda_spidol", "bda_spidol"));
                modelList.add(new Model(R.mipmap.bda_telivisi, "bda_telivisi", "bda_telivisi"));
                modelList.add(new Model(R.mipmap.bda_tempattidur, "bda_tempattidur", "bda_tempattidur"));
                modelList.add(new Model(R.mipmap.bda_vasbunga, "bda_vasbunga", "bda_vasbunga"));

                //creating the list adapter
                listviewAdapter = new ListviewAdapter(modelList);
                //menset adapter listviewAdapter ke dalam recycle view
                recyclerView.setAdapter(listviewAdapter);
                break;

            case 7:
                //Set Toolbar
                AppCompatActivity activity7 = (AppCompatActivity) getActivity();
                activity7.setSupportActionBar(mToolbar);
                toolbar_text.setText("Transportasi");
                btn_back.setOnClickListener(hitbutton);

                //Adding data Transportasi
                modelList.add(new Model(R.mipmap.transportasi_ambulance, "Angka Nol", "transportasi_ambulance"));
                modelList.add(new Model(R.mipmap.transportasi_baloonudara, "Angka_satu", "transportasi_baloonudara"));
                modelList.add(new Model(R.mipmap.transportasi_becak, "Angka_dua", "transportasi_becak"));
                modelList.add(new Model(R.mipmap.transportasi_bus, "Angka_tiga", "transportasi_bus"));
                modelList.add(new Model(R.mipmap.transportasi_gerobak, "Angka_empat", "transportasi_gerobak"));
                modelList.add(new Model(R.mipmap.transportasi_helikopter, "Angka_lima", "transportasi_helikopter"));
                modelList.add(new Model(R.mipmap.transportasi_jet, "Angka_enam", "transportasi_jet"));
                modelList.add(new Model(R.mipmap.transportasi_kapal, "Angka_tujuh", "transportasi_kapal"));
                modelList.add(new Model(R.mipmap.transportasi_kapalselam, "Angka_delapan", "transportasi_kapalselam"));
                modelList.add(new Model(R.mipmap.transportasi_keretaapi, "Angka_sembilan", "transportasi_keretaapi"));
                modelList.add(new Model(R.mipmap.transportasi_motor, "Angka_sembilan", "transportasi_motor"));
                modelList.add(new Model(R.mipmap.transportasi_mobil, "Angka_sepuluh", "transportasi_mobil"));
                modelList.add(new Model(R.mipmap.transportasi_pesawat, "Angka Nol", "transportasi_pesawat"));
                modelList.add(new Model(R.mipmap.transportasi_sepeda, "Angka_satu", "transportasi_sepeda"));
                modelList.add(new Model(R.mipmap.transportasi_skuter, "Angka_dua", "transportasi_skuter"));
                modelList.add(new Model(R.mipmap.transportasi_taksi, "Angka_tiga", "transportasi_taksi"));
                modelList.add(new Model(R.mipmap.transportasi_tank, "Angka_empat", "transportasi_tank"));
                modelList.add(new Model(R.mipmap.transportasi_traktor, "Angka_lima", "transportasi_traktor"));
                modelList.add(new Model(R.mipmap.transportasi_truk, "Angka_enam", "transportasi_truk"));

                //creating the list adapter
                listviewAdapter = new ListviewAdapter(modelList);
                //menset adapter listviewAdapter ke dalam recycle view
                recyclerView.setAdapter(listviewAdapter);
                break;

            case 8:
                //Set Toolbar
                AppCompatActivity activity8 = (AppCompatActivity) getActivity();
                activity8.setSupportActionBar(mToolbar);
                toolbar_text.setText("Warna");
                btn_back.setOnClickListener(hitbutton);

                //Adding data Warna
                modelList.add(new Model(R.mipmap.warna_abu, "Angka Nol", "warna_abu"));
                modelList.add(new Model(R.mipmap.warna_birudonker, "Angka_satu", "warna_birudonker"));
                modelList.add(new Model(R.mipmap.warna_birulaut, "Angka_dua", "warna_birulaut"));
                modelList.add(new Model(R.mipmap.warna_emas, "Angka_tiga", "warna_emas"));
                modelList.add(new Model(R.mipmap.warna_hijau, "Angka_empat", "warna_hijau"));
                modelList.add(new Model(R.mipmap.warna_hitam, "Angka_lima", "warna_hitam"));
                modelList.add(new Model(R.mipmap.warna_kuning, "Angka_enam", "warna_kuning"));
                modelList.add(new Model(R.mipmap.warna_merahmarun, "Angka_tujuh", "warna_merahmarun"));
                modelList.add(new Model(R.mipmap.warna_oranye, "Angka_delapan", "warna_oranye"));
                modelList.add(new Model(R.mipmap.warna_pink, "Angka_sembilan", "warna_pink"));
                modelList.add(new Model(R.mipmap.warna_putih, "Angka_sepuluh", "warna_putih"));
                modelList.add(new Model(R.mipmap.warna_ungu, "Angka Nol", "warna_ungu"));
                modelList.add(new Model(R.mipmap.warna_violet, "Angka_satu", "warna_violet"));
                modelList.add(new Model(R.mipmap.warna_zaitun, "Angka_dua", "warna_zaitun"));

                //creating the list adapter
                listviewAdapter = new ListviewAdapter(modelList);
                //menset adapter listviewAdapter ke dalam recycle view
                recyclerView.setAdapter(listviewAdapter);
                break;
            }

        return view;
    }
    View.OnClickListener hitbutton = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            MenuFragment menuFragment = new MenuFragment();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container, menuFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    };

}
