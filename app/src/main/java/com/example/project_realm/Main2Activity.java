package com.example.project_realm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import io.realm.Realm;

public class Main2Activity extends AppCompatActivity {

    ArrayList<String> students;
    ArrayAdapter adapter;
    ListView listView;

    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView=(ListView)findViewById(R.id.listview);

        realm=realm.getDefaultInstance();
        RealmHelper helper=new RealmHelper(realm);
        students=helper.retrieve();
        adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,students);
        listView.setAdapter(adapter);
    }
}
