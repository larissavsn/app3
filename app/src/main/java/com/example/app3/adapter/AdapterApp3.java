package com.example.app3.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app3.R;
import com.example.app3.model.App3;

import java.util.List;

public class AdapterApp3 extends RecyclerView.Adapter<AdapterApp3.MyViewHolder> {

    private List<App3> listApp3;

    public AdapterApp3(List<App3> list){
        this.listApp3=list;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_list_app3, parent, false);
        return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        App3 obj = listApp3.get(position);
        holder.name.setText(obj.getName());
        holder.cityState.setText(obj.getCityState());
        holder.img.setImageResource(obj.getImg());
    }

    @Override
    public int getItemCount() {
        return listApp3.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name, cityState;
        ImageView img;

        public MyViewHolder(View view){
            super(view);
            name = view.findViewById(R.id.textViewName);
            cityState = view.findViewById(R.id.textViewCityState);
            img = view.findViewById(R.id.imageViewApp3);
        }
    }


}

