package com.example.fragmennba;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailProfileNbaActivity extends AppCompatActivity {
    ImageView imgDetail,imgPhotoTeam;
    TextView titleTeam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        imgDetail = findViewById(R.id.img_detail);
        imgPhotoTeam = findViewById(R.id.photo_team);
        titleTeam = findViewById(R.id.title_team);

        getIncomingIntent();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                return true;
            default:return super.onOptionsItemSelected(item);
        }

    }

    private void getIncomingIntent() {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
           int img_profile = bundle.getInt("img_url");
            Glide.with(getApplicationContext()).load(img_profile).into(imgDetail);

            int img_daftar = bundle.getInt("img_zfoto_url");
            Glide.with(getApplicationContext()).load(img_daftar).into(imgPhotoTeam);

            String getTitle = bundle.getString("title_team");
            titleTeam.setText(getTitle);
        }
    }
}
