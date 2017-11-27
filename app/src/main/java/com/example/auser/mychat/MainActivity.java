package com.example.auser.mychat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
EditText editText;
    ListView listView;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText)findViewById(R.id.editText);
        listView =(ListView)findViewById(R.id.listview);
        adapter =new ArrayAdapter<String>(this,R.layout.simple_list_item_1,R.id.text1);
        listView.setAdapter(adapter);
    }
    public void clickok(View v){
        adapter.add(editText.getText().toString());


    }
}
