package com.example.project_realm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login_register extends AppCompatActivity {

    EditText email;
    EditText password;
    Button login;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);

        email=(EditText)findViewById(R.id.email);
        password=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.btnlogin);
        register=(Button) findViewById(R.id.btnregister);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("byives21@gmail.com") && password.getText().toString().equals("yves")) {
                    Intent login;
                    login=new Intent(login_register.this,MainActivity.class);
                    startActivity(login);



                }

                }



        });
    }
}
