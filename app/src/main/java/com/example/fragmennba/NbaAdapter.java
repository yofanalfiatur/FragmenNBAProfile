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


public class NbaAdapter extends RecyclerView.Adapter<NbaAdapter.ViewHolder> {

    private Context context;
    private ArrayList<NbaModel> nbaList;


    public NbaAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<NbaModel> getNbaList() {
        return nbaList;
    }

    public void setNbaList(ArrayList<NbaModel> nbaList) {
        this.nbaList = nbaList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.item_list, viewGroup, false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        Glide.with(context).load(getNbaList().get(i).getThumbnail()).into(viewHolder.ivThumbnail);
        viewHolder.tvTitle.setText(getNbaList().get(i).getTitle());
        viewHolder.btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,DetailNbaActivity.class);


                intent.putExtra("img_url", getNbaList().get(i).getThumbnail());
                intent.putExtra("title",getNbaList().get(i).getTitle());
                intent.putExtra("detail",getNbaList().get(i).getDetail());
                context.startActivity(intent);
            }
        });

        viewHolder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String teamName = "Your Team Is "+getNbaList().get(i).getTitle();
                intent.putExtra(Intent.EXTRA_TEXT,teamName);
                context.startActivity(Intent.createChooser(intent,"Share Using"));
            }
        });
    }

    @Override
    public int getItemCount() {
        return getNbaList().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivThumbnail;
        TextView tvTitle;
        Button btnShow,btnShare;

        public ViewHolder(View itemView) {
            super(itemView);
            ivThumbnail = itemView.findViewById(R.id.team_thumbnail);
            tvTitle = itemView.findViewById(R.id.team_name);
            btnShow = itemView.findViewById(R.id.btn_lihat);
            btnShare = itemView.findViewById(R.id.btn_share);
        }
    }
}
