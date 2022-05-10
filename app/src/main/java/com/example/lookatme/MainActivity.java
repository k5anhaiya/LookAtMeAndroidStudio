package com.example.lookatme;

import androidx.appcompat.app.*;

import android.net.*;
import android.os.*;

import com.pd.lookatme.LookAtMe;

public class MainActivity extends AppCompatActivity {
    private LookAtMe lookAtMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        getSupportActionBar().hide();

        lookAtMe = findViewById(R.id.lookme);

        lookAtMe.init(this);
        lookAtMe.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.flower));
         //lookAtMe.setVideoPath("https://file-examples.com/wp-content/uploads/2017/04/file_example_MP4_480_1_5MG.mp4");

        lookAtMe.start();
        lookAtMe.setLookMe();
    }
}