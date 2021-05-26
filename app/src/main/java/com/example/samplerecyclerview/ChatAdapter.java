package com.example.samplerecyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatHolder> {
    private ArrayList<UserModel> list;
    Context context;

    public ChatAdapter(Context context, ArrayList<UserModel> list) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ChatHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_resource, parent, false);
        return new ChatHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatHolder holder, int position) {
        String name = list.get(position).getNameTv();
        String msg = list.get(position).getMsgTv();
        String time = list.get(position).getTimeTv();
        int img = list.get(position).getAvatar();

        holder.nameTv.setText(name);
        holder.msgTv.setText(msg);
        holder.timeTv.setText(time);
        holder.avatar.setImageResource(img);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ChatHolder extends RecyclerView.ViewHolder{

        TextView nameTv;
        TextView msgTv;
        TextView timeTv;
        ImageView avatar;
        RelativeLayout relativeLayout;

        public ChatHolder(@NonNull View itemView) {
            super(itemView);
            nameTv = itemView.findViewById(R.id.nameTv);
            msgTv = itemView.findViewById(R.id.msgTv);
            timeTv = itemView.findViewById(R.id.timeTv);
            avatar = itemView.findViewById(R.id.avatar);
            relativeLayout = itemView.findViewById(R.id.chatClick);
        }
    }
}
