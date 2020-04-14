package com.smart.demofragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    Button btnignoka, btnigirvan, btngit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getSupportActionBar().setTitle("HEROES");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnigirvan = (Button) findViewById(R.id.buttonig);
        btnignoka = (Button) findViewById(R.id.buttonig2);
        btngit  = (Button) findViewById(R.id.buttongit);
        btnignoka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoIgNoka();
            }
        });
        btnigirvan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoIgIrvan();
            }
        });
        btngit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoGit();
            }
        });
    }

    public void gotoIgNoka(){
        String url = "https://www.instagram.com/xecteus/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void gotoIgIrvan(){
        String url = "https://www.instagram.com/irvan_bagus_026/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void gotoGit(){
        String url = "https://github.com/xecteus/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
