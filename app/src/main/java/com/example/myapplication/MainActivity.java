package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Contact> contactlist = new ArrayList<>();
    Button   mButtonBack;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initContact();
        ContactAdapter adapter = new ContactAdapter(MainActivity.this,
                R.layout.contact_item, contactlist);
        mListView = (ListView) findViewById(R.id.list_view);
        mListView.setAdapter(adapter);
        initView();
    }

    private void initView() {
        mButtonBack = (Button) findViewById(R.id.btn_back);
        mButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Contact contact = contactlist.get(position);
                Toast.makeText(MainActivity.this, contact.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void initContact() {
        for (int i = 0; i < 10; i++) {
            Contact apple = new Contact("墨雨", R.drawable.avatar1);
            contactlist.add(apple);
            Contact banana = new Contact("风扬帆影", R.drawable.avatar2);
            contactlist.add(banana);
            Contact orange = new Contact("星语心愿", R.drawable.avatar3);
            contactlist.add(orange);
            Contact watermelon = new Contact("青灯夜游", R.drawable.avatar4);
            contactlist.add(watermelon);
        }
    }
}