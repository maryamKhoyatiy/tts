package com.example.parsejsonbygson;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by أميمة خياتي on 24/10/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewholder> {
private List<contacts>list=new ArrayList<>();

    RecyclerAdapter(List<contacts>list){
        this.list=list;

    }



    @Override
    public MyViewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(MyViewholder holder, int position) {
     holder.system.setText(list.get(position).getSystem());
        holder.version.setText(Float.toString(list.get(position).getVersion()));
        holder.path.setText(list.get(position).getPath());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class MyViewholder extends RecyclerView.ViewHolder{
TextView system,version,path;

        public MyViewholder(View itemView) {
            super(itemView);
            system=(TextView)itemView.findViewById(R.id.txt1);
            version=(TextView)itemView.findViewById(R.id.txt2);
            path=(TextView)itemView.findViewById(R.id.txt3);


        }
    }
}
