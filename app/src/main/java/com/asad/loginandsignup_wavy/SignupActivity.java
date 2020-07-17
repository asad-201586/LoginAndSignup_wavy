package com.asad.loginandsignup_wavy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    private EditText eName,ePhoneNo,eEmail,ePass;
    private Button bSignUp;
    private TextView tAlreadyhaveAcc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        initialize();

        tAlreadyhaveAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private void initialize()
    {
        eName = findViewById(R.id.name_editText_id);
        ePhoneNo = findViewById(R.id.phone_no_editText_id);
        eEmail = findViewById(R.id.email_editText_id);
        ePass = findViewById(R.id.password_editText_id);
        bSignUp = findViewById(R.id.signup_button_id);
        tAlreadyhaveAcc = findViewById(R.id.already_have_an_account);
    }
}