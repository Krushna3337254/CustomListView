package com.example.krushnanrathod.customlistview;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class MyAdapter extends ArrayAdapter<Item> {                            //Adapter acts as bridge between data and GUI
    ArrayList<Item> punjabi;

    public MyAdapter(MainActivity mainActivity, int items, ArrayList<Item> simplelist) {
        super(mainActivity,items,simplelist);     //Constructor of main Activty, and only used for parent class
        punjabi=simplelist;                     //Associating values of simplelist to punjabi objects

    }




    @Override
    public int getCount() {                     //getting count of number of images
         return super.getCount() ;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {                         //getView is an object of Adapter and adapter acts as bridge between data and GUI
        View v=convertView;
        LayoutInflater inflater=(LayoutInflater)  getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE );      //Layout inflater Squizes layouts  //context is just refering to layout inflator service means its just a reference
        v=inflater.inflate( R.layout.custom_items,null );
        TextView txtv=v.findViewById(R.id.customtext);
        ImageView imgv=v.findViewById(R.id.imageView);
        txtv.setText( punjabi.get(position).getImageName() );
        imgv.setImageResource( punjabi.get(position).getImgNo());
        return v ;
    }
}
