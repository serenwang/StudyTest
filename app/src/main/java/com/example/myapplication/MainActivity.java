package com.example.myapplication;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Contact> contactlist = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initContact();
        ContactAdapter adapter = new ContactAdapter(MainActivity.this,
                R.layout.contact_item, contactlist);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
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