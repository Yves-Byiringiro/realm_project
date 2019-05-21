package com.example.project_realm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    EditText regnumber,firtsname,lastname;
    Button save,view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        regnumber=(EditText)findViewById(R.id.regnumber);
        firtsname=(EditText)findViewById(R.id.firstname);
        lastname=(EditText)findViewById(R.id.lastname);
        save=(Button)findViewById(R.id.btnsave);
        view=(Button)findViewById(R.id.view);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Realm realm= Realm.getDefaultInstance();

                Integer Reg= Integer.valueOf(regnumber.getText().toString());
                String First=firtsname.getText().toString();
                String Last=lastname.getText().toString();

                realm.beginTransaction();

                Student student1=realm.createObject(Student.class);
                student1.setRegNumber(Reg);
                student1.setFirstName(First);
                student1.setLastName(Last);
                realm.commitTransaction();

                Toast.makeText(getApplicationContext(), "Saved Successfully.",
                        Toast.LENGTH_SHORT).show();


            }
        });

    }

    public void show(View view) {
        Intent show;
        show=new Intent(MainActivity.this, Main2Activity.class);
        startActivity(show);
    }
}
