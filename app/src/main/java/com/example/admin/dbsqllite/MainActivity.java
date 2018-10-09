package com.example.admin.dbsqllite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String DATABASENAME="StudentDetails";
    private static final String TABLENAME="Students";
    private static final String NAME="USERNAME";
    private static final String COLLEGENAME="COLLEGENAME";
    private static final String BRANCHNAME="BRANCHNAME";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
