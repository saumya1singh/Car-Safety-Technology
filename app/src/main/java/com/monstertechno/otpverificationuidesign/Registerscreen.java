package com.monstertechno.otpverificationuidesign;

import android.content.Intent;
import android.graphics.Color;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.chaos.view.PinView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Registerscreen extends AppCompatActivity implements View.OnClickListener {

    private PinView pinView;
    private Button next;
    private TextView topText,textU;
    private EditText userName, userPhone;
    private ConstraintLayout first, second;
    FirebaseDatabase database ;
    DatabaseReference myRef ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*requestWindowFeature(1);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);*/
        setContentView(R.layout.activity_registerscreen);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference();
        topText = findViewById(R.id.topText);
        pinView = findViewById(R.id.pinView);
        next = findViewById(R.id.button);
        userName = findViewById(R.id.username);
        userPhone = findViewById(R.id.userPhone);
        first = findViewById(R.id.first_step);
        second = findViewById(R.id.secondStep);
        textU = findViewById(R.id.textView_noti);
        first.setVisibility(View.VISIBLE);

        next.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (next.getText().equals("Let's go!")) {
            String name = userName.getText().toString();
            String phone = userPhone.getText().toString();
 //           myRef.setValue(phone);
      myRef=database.getReference(phone);
            myRef.child("Name").setValue(name);

        //    myRef.child(phone).setValue(name);
            if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(phone)) {
                next.setText("Verify");
                first.setVisibility(View.GONE);
                second.setVisibility(View.VISIBLE);
                topText.setText("Please wait for a second.\nProcess is complete");
            } else {
                Toast.makeText(Registerscreen.this, "Please enter the details", Toast.LENGTH_SHORT).show();
            }
        } else if (next.getText().equals("Verify")) {
            String OTP = pinView.getText().toString();
            if (OTP.equals("1234")) {
                pinView.setLineColor(Color.GREEN);
                textU.setText("OTP Verified");
                textU.setTextColor(Color.GREEN);
                next.setText("Next");

                Intent intent = new Intent(Registerscreen.this, BottomNavigation.class);
                startActivity(intent);
            } else {
                pinView.setLineColor(Color.RED);
                textU.setText("X Incorrect OTP");
                textU.setTextColor(Color.RED);
            }
        }

    }
}
