package com.monstertechno.otpverificationuidesign.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.monstertechno.otpverificationuidesign.R;


public class AdhaarActivity extends AppCompatActivity {
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhaar);
        b2=findViewById(R.id.edit2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





            }
        });
    }
}
