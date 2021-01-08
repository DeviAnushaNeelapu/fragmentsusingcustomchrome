package com.example.customchromeexamplemultiple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       customfragment cu=new customfragment();
        FragmentManager mn=getSupportFragmentManager();
        FragmentTransaction transaction=mn.beginTransaction();
        transaction.add(R.id.customs,cu,"test");
        transaction.commit();
    }

}