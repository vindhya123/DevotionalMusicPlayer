package com.example.vindya.devotionalmusicplayer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by vindya on 7/2/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder>
{
private List<infermation>data= Collections.emptyList();
    private Context cntxt;
    Adapter(Context context,List<infermation>dataCollection)
    {
        this.data=dataCollection;
        this.cntxt=context;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rlist_items,parent,false);
        MyViewHolder vh = new MyViewHolder(view);
        return vh;
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position)
    {
        infermation infrmtn = data.get(position);
        holder.ImageViewForRecycler.setImageResource(infrmtn.imageId);
        holder.TextViewForRecycler.setText(infrmtn.textViewData);
    }
    @Override
    public int getItemCount()
    {
        return data.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        private TextView TextViewForRecycler;
        private ImageView ImageViewForRecycler;

        public MyViewHolder(View itemView)
        {
            super(itemView);
            TextViewForRecycler=(TextView)itemView.findViewById(R.id.textview);
            ImageViewForRecycler=(ImageView)itemView.findViewById(R.id.imageView);
        }
    }
}
