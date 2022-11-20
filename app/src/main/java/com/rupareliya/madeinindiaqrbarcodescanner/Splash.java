package com.rupareliya.madeinindiaqrbarcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;
import com.google.firebase.analytics.FirebaseAnalytics;

public class Splash extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        /*AudienceNetworkAds.initialize(this);
        AdSettings.addTestDevice("07761010-a4ce-4f66-96c4-ff723a0e2664");*/
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1000);
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                super.run();
            }
        };
        thread.start();
    }
}