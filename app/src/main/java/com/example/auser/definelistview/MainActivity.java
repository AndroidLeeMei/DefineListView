package com.example.auser.definelistview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=(ListView)findViewById(R.id.lv);
        Myadapter myadapter=new Myadapter(this);
        list.setAdapter(myadapter);
    }
}



class Myadapter extends BaseAdapter{
    int[] picture=new int[]{R.drawable.meowth,R.drawable.pikachu,R.drawable.pokeball};
    String[] array1=new String[]{"Logol1","Logol2","Logol3"};
    String[] array2=new String[]{"meowth","pikachu","pokeball"};

    private LayoutInflater myInflater;

    public Myadapter(Context context){
        myInflater=LayoutInflater.from(context);

    }

    @Override
    public int getCount() {

        return picture.length;
    }

    @Override
    public Object getItem(int i) {

        return picture.length;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        convertView=myInflater.inflate(R.layout.mylayout2,null);
        ImageView imglogo=(ImageView)convertView.findViewById(R.id.imageView);
        TextView tv1=(TextView)convertView.findViewById(R.id.textView6);
        TextView tv2=(TextView)convertView.findViewById(R.id.textView7);

        imglogo.setImageResource(picture[i]);
        tv1.setText(array1[i]);
        tv2.setText(array2[i]);
        return convertView;
    }
}
