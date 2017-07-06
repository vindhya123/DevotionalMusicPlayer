package com.example.vindya.devotionalmusicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Toolbar toolbar;
    RecyclerView recyclerView;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar)findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(getApplicationContext(),RecyclerData());
    }
    public List<infermation> RecyclerData()
    {
        ArrayList<infermation> DataList=new ArrayList<>();
        int imageID[]={R.drawable.laxmidevi,R.drawable.lordayyappa,R.drawable.lordhanuma,R.drawable.lordsai,R.drawable.lordshiva,R.drawable.lordvenkateswara,R.drawable.lordvinayaka,R.drawable.lordvishnu};
        String texts[]={"Laxmi Devi Stroram","Ayyappa Stroram","Hanuman Slokam","Sai Stroram","shiva Stroram","Venkateswara Stroram","Vinayaka stotram","Vishnu stotram"};
        for(int i=0;i<=imageID.length&&i<=texts.length;i++)
        {
            infermation reqrdInformation=new infermation();
            reqrdInformation.setImageId(imageID[i]);
            reqrdInformation.setTextViewData(texts[i]);
            DataList.add(reqrdInformation);
        }
        return DataList;
    }
}
