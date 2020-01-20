package com.gesa.btapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    EditText Email, Password;
    Button SignIn;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.login_activity);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.Password);
        SignIn = findViewById(R.id.SignIn);

        SignIn.setOnClickListener(view -> {
/*
            if (!Email.getText().toString().trim().equals("test")) {
                Email.requestFocus();
                Email.setError("Invalid Username");
            } else if (!Password.getText().toString().equals("pass")) {
                Password.requestFocus();
                Password.setError("InCorrect Password");
            }else {*/
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
//                }

        });

      /*  imageView.setOnTouchListener(new OnSwipeTouchListener(getApplicationContext()) {
            public void onSwipeTop() {
            }

            public void onSwipeRight() {
                if (count == 0) {
                    imageView.setImageResource(R.drawable.good_night_img);
                    textView.setText("Reader");
                    count = 1;
                } else {
                    imageView.setImageResource(R.drawable.good_morning_img);
                    textView.setText("Reader");
                    count = 0;
                }
            }

            public void onSwipeLeft() {
                if (count == 0) {
                    imageView.setImageResource(R.drawable.good_night_img);
                    textView.setText("Reader");
                    count = 1;
                } else {
                    imageView.setImageResource(R.drawable.good_morning_img);
                    textView.setText("Reader");
                    count = 0;
                }
            }

            public void onSwipeBottom() {
            }

        });*/
    }
}
