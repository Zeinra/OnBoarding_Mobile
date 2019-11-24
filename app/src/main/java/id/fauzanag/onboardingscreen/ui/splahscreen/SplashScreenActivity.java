package id.fauzanag.onboardingscreen.ui.splahscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import id.fauzanag.onboardingscreen.R;
import id.fauzanag.onboardingscreen.ui.onboardingscreen.OnBoardingActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreenActivity.this, OnBoardingActivity.class));
                finish();
            }
        },3000);
    }
}
