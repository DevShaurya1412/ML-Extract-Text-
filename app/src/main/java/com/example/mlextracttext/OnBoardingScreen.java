package com.example.mlextracttext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class OnBoardingScreen extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addFragment(new Step.Builder().setTitle("Get text extracted from images in a click")
                .setContent("This tools helps to scan images and get data into the textual format")
                .setBackgroundColor(Color.parseColor("#313048")) // int background color
                .setDrawable(R.drawable.scan_data) // int top drawable
                .setSummary("Text from every image format at your fingertips")
                .build());

        addFragment(new Step.Builder().setTitle("You can copy and use the extracted text in seconds")
                .setContent("This tools helps to scan images and get data into the textual format")
                .setBackgroundColor(Color.parseColor("#313048")) // int background color
                .setDrawable(R.drawable.copy_data) // int top drawable
                .setSummary("Text from every image format at your fingertips")
                .build());

        addFragment(new Step.Builder().setTitle("This is header")
                .setContent("This tools helps to scan images and get data into the textual format")
                .setBackgroundColor(Color.parseColor("#313048")) // int background color
                .setDrawable(R.drawable.scan_data) // int top drawable
                .setSummary("Text from every image format at your fingertips")
                .build());
    }

    @Override
    public void finishTutorial() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }
    @Override
    public void currentFragmentPosition(int position) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}