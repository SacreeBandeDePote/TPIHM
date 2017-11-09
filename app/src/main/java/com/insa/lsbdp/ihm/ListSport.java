package com.insa.lsbdp.ihm;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListSport extends AppCompatActivity {

    private ListView listSport;
    private ArrayAdapter<String> listChoixSport;
    private ArrayAdapter<String> listVoeuxSport;

    private String[] test = {"Tennis", "Danse"};

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.choix_sport:
                    return true;
                case R.id.voeux_sport:
                    return true;
                default :
                    return false;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_sport);

        listSport = (ListView) findViewById(R.id.list_sport);

        listChoixSport = new ArrayAdapter<>(ListSport.this, android.R.layout.simple_list_item_1, test);
        listSport.setAdapter(listChoixSport);


    }

}
