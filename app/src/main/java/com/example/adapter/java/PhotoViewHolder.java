package com.example.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class PhotoViewHolder extends RecyclerView.ViewHolder {
    private Photo itemData;
    private TextView txtTitle;
    private ImageView imagePhoto;

    public PhotoViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
        super(itemView);
        txtTitle = itemView.findViewById(R.id.textTitle);
        imagePhoto = itemView.findViewById(R.id.imagePhoto);

        /**
         * neu gán sự kiện onCLick trong onBindViewHolder, mỗi lần bind nó sẽ gan lại một lần
         * thay vì đó, gán trong khởi tạo ViewHolder, chỉ khi khởi tạo lần đầ tiên mới gán
         */
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onClick(itemData, getAdapterPosition());
                }
            }
        });
    }

    public void bindData(Photo photo) {
        itemData = photo;
        txtTitle.setText(photo.getTitle());
        Glide.with(itemView.getContext())
                .load(photo.getUrl())
                .into(imagePhoto);
    }

}
