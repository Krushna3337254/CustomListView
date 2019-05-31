package com.example.krushnanrathod.customlistview;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {               //List view only supports the Activity and AppCompactActivtity
    ListView simplelist;
    ArrayList<Item> punjabi=new ArrayList<>(  );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        simplelist=findViewById( R.id.simplelist );
        punjabi.add( new Item("sunanda",R.raw.sunanda_one) );
        punjabi.add( new Item("ruman",R.raw.ruman) );
        punjabi.add( new Item("Joker",R.raw.joker) );
        punjabi.add( new Item("guri",R.raw.guri) );
        punjabi.add( new Item("permish",R.raw.permish ));
        punjabi.add( new Item("jaani",R.raw.jaani ));

        MyAdapter myAdapter=new MyAdapter(this, R.layout.items,punjabi);
        simplelist.setAdapter( myAdapter );
    }
}
