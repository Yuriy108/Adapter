package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<MobilePhone> listPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        listPhone=new ArrayList<>();
        MobilePhone huawei=new MobilePhone("Huawei","aaaaaaaaaaaaaaa",R.drawable.huawei);
        MobilePhone htc=new MobilePhone("htc","bbbbbbbbbbbbbbbbb",R.drawable.htc);
        MobilePhone xiaomi=new MobilePhone("Xiaomi","cccccccccccccccccc",R.drawable.xiaomi);
        listPhone.add(huawei);
        listPhone.add(htc);
        listPhone.add(xiaomi);
        String st[]= {"Dnepr","Kiev","Lvov","Odessa"};
        ArrayAdapter<MobilePhone> adapter=
                new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listPhone);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent intent= new Intent(getApplicationContext(),Dnepr.class);
                        startActivity(intent);
                        break;
                }


            }
        });


    }
}
