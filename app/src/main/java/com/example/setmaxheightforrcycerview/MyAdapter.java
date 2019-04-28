package com.example.setmaxheightforrcycerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    Context context;
    List<String> contentList;

    public MyAdapter(Context context, List<String> contentList) {
        this.context=context;
        this.contentList=contentList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_layout,viewGroup,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        String content=contentList.get(i);
        viewHolder.TVContent.setText(content);
    }

    @Override
    public int getItemCount() {
        if(contentList==null)
            return 0;
        return contentList.size();
    }


    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView TVContent;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            TVContent=(TextView)itemView.findViewById(R.id.tv_content);
        }
    }
}
