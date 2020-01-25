package com.monstertechno.otpverificationuidesign;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;


public class OnboardingActivity extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        addFragment(
                new Step.Builder()
                        .setTitle(getString(R.string.automatic_data))
                        .setContent(getString(R.string.gm_finds_photos))
                        .setBackgroundColor(Color.parseColor("#FF0957"))
                        .setDrawable(R.drawable.undraw_sentiment_analysis_jp6w)
                        .setSummary(getString(R.string.continue_and_learn))
                        .build());
        addFragment(
                new Step.Builder()
                        .setTitle(getString(R.string.choose_the_song))
                        .setContent(getString(R.string.swap_to_the_tab))
                        .setBackgroundColor(Color.parseColor("#00D4BA"))
                        .setDrawable(R.drawable.undraw_weather_notification_4sbo)
                        .setSummary(getString(R.string.continue_and_update))
                        .build());
        addFragment(
                new Step.Builder()
                        .setTitle(getString(R.string.edit_data))
                        .setContent(getString(R.string.update_easily))
                        .setBackgroundColor(Color.parseColor("#1098FE"))
                        .setDrawable(R.drawable.undraw_add_file2_gvbb)
                        .setSummary(getString(R.string.continue_and_result))
                        .build());
        addFragment(
                new Step.Builder()
                        .setTitle(getString(R.string.result_awesome))
                        .setContent(getString(R.string.after_updating))
                        .setBackgroundColor(Color.parseColor("#CA70F3"))
                        .setDrawable(R.drawable.undraw_hiring_cyhs)
                        .setSummary(getString(R.string.thank_you))
                        .build());
    }

    @Override
    public void finishTutorial() {
        //Toast.makeText(this, "Tutorial finished", Toast.LENGTH_SHORT).show();
        //finish();
        Intent intent = new Intent(OnboardingActivity.this, Registerscreen.class);
        startActivity(intent);
    }

    @Override
    public void currentFragmentPosition(int position) {
        //Toast.makeText(this, "Position : " + position, Toast.LENGTH_SHORT).show();
    }
}
