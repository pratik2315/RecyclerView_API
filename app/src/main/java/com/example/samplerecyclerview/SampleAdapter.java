package com.example.samplerecyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SampleAdapter extends RecyclerView.Adapter<SampleAdapter.SampleViewHolder> {

    String[] data;
    int[] data1;
    Context context;

    public SampleAdapter(Context context, String[] data, int[] data1){
        this.data = data;
        this.data1 = data1;
        this.context = context;

    }
    @NonNull
    @Override
    public SampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.sample_file, parent, false);
        return new SampleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SampleViewHolder holder, int position) {
        String title = data[position];
        int image = data1[position];

        holder.textView.setText(title);
        holder.imageView.setImageResource(image);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SecondActivity.class);
                intent.putExtra("data", data[position]);
                intent.putExtra("data1", data1[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class SampleViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        LinearLayout linearLayout;

        public SampleViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.tv);
            linearLayout = itemView.findViewById(R.id.clickLayout);

        }
    }
}
