package com.example.t7.buildu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.firestore.auth.User;

public class UserGovernment extends AppCompatActivity {
    private Button move1;
    private Button move2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_government);

        move1 = findViewById(R.id.uBtn);
        move2 = findViewById(R.id.button2);
        move1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserGovernment.this, Register.class);
                startActivity(intent);
            }
        });
        move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(UserGovernment.this, Register.class);
                startActivity(intent2);
            }
        });

    }
}