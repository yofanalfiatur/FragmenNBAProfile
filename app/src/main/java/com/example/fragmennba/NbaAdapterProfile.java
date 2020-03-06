package com.example.fragmennba;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class NbaAdapterProfile extends RecyclerView.Adapter<NbaAdapterProfile.ViewHolder> {
    private Context context;
    private ArrayList<NbaModelProfile> nbaProfiles;

    public NbaAdapterProfile(Context context) {
        this.context = context;
    }

    public ArrayList<NbaModelProfile> getNbaProfiles() {
        return nbaProfiles;
    }

    public void setNbaList(ArrayList<NbaModelProfile> nbaList) {
        this.nbaProfiles = nbaList;
    }

    @NonNull
    @Override
    public NbaAdapterProfile.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.item_profile, viewGroup, false);
        return new NbaAdapterProfile.ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        Glide.with(context).load(getNbaProfiles().get(i).getLogo()).into(viewHolder.ivThumbnail);
        viewHolder.tvTitle.setText(getNbaProfiles().get(i).getJudul());
        viewHolder.btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailProfileNbaActivity.class);


                intent.putExtra("img_url", getNbaProfiles().get(i).getLogo());
                intent.putExtra("title_team", getNbaProfiles().get(i).getJudul());
                intent.putExtra("img_zfoto_url", getNbaProfiles().get(i).getTeam());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getNbaProfiles().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivThumbnail;
        TextView tvTitle;
        Button btnShow;

        public ViewHolder(View itemView) {
            super(itemView);
            ivThumbnail = itemView.findViewById(R.id.profile_logo);
            tvTitle = itemView.findViewById(R.id.profile_nama);
            btnShow = itemView.findViewById(R.id.profile_btn_roster);
        }
    }
}
