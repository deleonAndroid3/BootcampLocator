package com.training.android.bootcamplocator;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;



public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.ViewHolder> {

    private BootcampLocation current;
    private Context context;
    private List<BootcampLocation> models;
    private int layout;
    private ViewHolder holder;

    public LocationAdapter(Context context, List<BootcampLocation> models, int layout) {
        this.context = context;
        this.models = models;
        this.layout = layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        final View view = LayoutInflater.from(context).inflate(layout, null);
        holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        current = models.get(position);

        holder.mTitle.setText(current.getTitle());
        holder.mSnippet.setText(current.getSnippet());
        holder.mImg.setImageResource(R.drawable.img);

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView mTitle;
        TextView mSnippet;
        ImageView mImg;

        ViewHolder(View view) {
            super(view);

            mTitle = itemView.findViewById(R.id.Title);
            mSnippet = itemView.findViewById(R.id.Snippet);
            mImg = itemView.findViewById(R.id.img);
        }
    }
}
