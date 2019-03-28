package com.example.foodhealthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.ParseAnalytics;
import com.parse.ParseUser;

public class UserAccountActivity extends AppCompatActivity {

    public void logOutClicked(View view) {
        ParseUser.getCurrentUser().logOut();
        Toast.makeText(this, "Sign out Success!", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_account);

        ParseUser currentUser = ParseUser.getCurrentUser();

        TextView displayUser = findViewById(R.id.usernameTV);
        String userNameString = (String) currentUser.get("username");
        displayUser.setText(userNameString);

        TextView displayEmail = findViewById(R.id.emailTV);
        String emailString = (String) currentUser.get("email");
        displayEmail.setText(emailString);

        ParseAnalytics.trackAppOpenedInBackground(getIntent());
    }
}
