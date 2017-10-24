package com.example.parsejsonbygson.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.parsejsonbygson.Models.jsoninfo;
import com.example.parsejsonbygson.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tmb on 10/24/17.
 */

public class jsonInfoAdpter extends RecyclerView.Adapter<MyViewholder> {
    private List<jsoninfo> list=new ArrayList<>();

    public jsonInfoAdpter(List<jsoninfo> list) {
        this.list = list;
    }

    @Override
    public MyViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return new MyViewholder(view);

    }

    @Override
    public void onBindViewHolder(MyViewholder holder, int position) {
        holder.system.setText(list.get(position).getSystem());
        holder.version.setText(list.get(position).getVersion());
        holder.path.setText(list.get(position).getPath());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

class MyViewholder extends RecyclerView.ViewHolder{
    TextView system,version,path;
    public MyViewholder(View itemView) {
        super(itemView);
        system=(TextView)itemView.findViewById(R.id.txt1);
        version=(TextView)itemView.findViewById(R.id.txt2);
        path=(TextView)itemView.findViewById(R.id.txt3);
    }
}
