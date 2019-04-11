package com.example.foodhealthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FeedbackActivity extends AppCompatActivity {

    //Two variables for edit text field to facilitate details
    private EditText subjectText;
    private EditText messageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        //linking the variable to the edit text id's
        subjectText = findViewById(R.id.subject);
        messageText = findViewById(R.id.message);


        Button sendBtn = findViewById(R.id.send_button);
        //action performed on click event through a listener
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Converts user input to string
                String subject = subjectText.getText().toString();
                String message = messageText.getText().toString();

                //To fill the fields in the email client
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] {""});
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT, message);

                //Filters only the email clients
                intent.setType("message/rfc822");
                //Shows the options menu
                startActivity(Intent.createChooser(intent, "Choose email client!"));
            }
        });
    }
}
