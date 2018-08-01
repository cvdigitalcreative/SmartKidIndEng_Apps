package com.digitalcreative.smartkidsindeng.Adapters;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.digitalcreative.smartkidsindeng.Boundary.Finalgambar_Frag;
import com.digitalcreative.smartkidsindeng.Model.Model;
import com.digitalcreative.smartkidsindeng.R;

import java.util.List;

/**
 * Created by digitalcreative on 04/06/18.
 */

public class ListviewAdapter extends RecyclerView.Adapter<ListviewAdapter.ViewHolder>{
    Finalgambar_Frag finalgambar_frag;
    private List<Model> listmodel;

    public ListviewAdapter(List<Model> modelList) {

        listmodel = modelList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_custom, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final Model model = listmodel.get(position);
        holder.ivGambar.setImageResource(model.getGambar());
        //holder.tvNamaGambar.setText(model.getNama_gambar());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCompatActivity activity = (AppCompatActivity) view.getContext();

                //mengambil id pada list sebagai acuan.
                Bundle bundle = new Bundle();
                bundle.putString("kodefinal", model.getKode());
                finalgambar_frag =  new Finalgambar_Frag();
                finalgambar_frag.setArguments(bundle);

                activity.getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container,finalgambar_frag)
                        .addToBackStack(null)
                        .commit();

                System.out.println(getItemCount());
            }
        });
    }

    @Override
    public int getItemCount(){
        return listmodel.size();
    }

    // inner class of adapter
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivGambar;
        public TextView tvNamaGambar;

        public  ViewHolder(View itemView) {
            super(itemView);

            ivGambar = itemView.findViewById(R.id.imageView);
           // tvNamaGambar = itemView.findViewById(R.id.textView);
        }
    }
}
