package com.example.project_realm;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class RealmHelper {
    Realm realm;

    public RealmHelper(Realm realm) {
        this.realm = realm;
    }

    public  ArrayList<String> retrieve(){
        ArrayList<String> students=new ArrayList<>();
        RealmResults<Student> student3 =realm.where(Student.class).findAll();
        for (Student student2:student3)
            students.add(student2.getFirstName());

      return students;
    }
}
