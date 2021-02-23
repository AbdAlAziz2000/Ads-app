package com.abdalazizabdallah.adsapp;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.textview.MaterialTextView;

import java.util.List;

public class AdsListRecycleViewAdapter extends RecyclerView.Adapter<AdsListRecycleViewAdapter.AdsListViewHolder> {

    private List<Ads> photoList;


    public AdsListRecycleViewAdapter(List<Ads> photoList) {
        this.photoList = photoList;
    }

    @NonNull
    @Override
    public AdsListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_recycle_view, parent, false);
        return new AdsListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdsListViewHolder holder, int position) {
        holder.bind(photoList.get(position));
    }

    @Override
    public int getItemCount() {
        return photoList.size();
    }


    class AdsListViewHolder extends RecyclerView.ViewHolder {

        private MaterialTextView textViewTime;
        private MaterialTextView textViewTitle;
        private MaterialTextView textViewPrice;
        private AppCompatImageView imageView;

        public AdsListViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item_recycle_imageView);
            textViewTime = itemView.findViewById(R.id.item_recycle_textViewTime);
            textViewPrice = itemView.findViewById(R.id.item_recycle_textViewPrice);
            textViewTitle = itemView.findViewById(R.id.item_recycle_textViewtitle);
        }

        @SuppressLint("UseCompatLoadingForDrawables")
        public void bind(Ads photo) {
            //TODO : bind item with view

            Glide.with(imageView)
                    .load(imageView.getContext().getResources().getDrawable(Integer.parseInt(photo.getPhotoPath())))
                    .into(imageView);

            textViewTime.setText(photo.getTime());
            textViewPrice.setText(photo.getPrice());
            textViewTitle.setText(photo.getTitle());
        }
    }
}
