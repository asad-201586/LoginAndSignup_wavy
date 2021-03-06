package com.asad.loginandsignup_wavy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText eEmail,ePass;
    private Button bLogin;
    private TextView tForgotPass,tNewUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

        tNewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });

    }

    private void initialize()
    {
        eEmail = findViewById(R.id.email_editText_id);
        ePass = findViewById(R.id.password_editText_id);
        bLogin = findViewById(R.id.login_button_id);
        tForgotPass = findViewById(R.id.forgot_pass_textView_id);
        tNewUser = findViewById(R.id.new_user_textView_id);
    }
}