package com.carlosdelachica.sample.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.carlosdelachica.easyrecycleradapters.CommonViewHolder;
import com.carlosdelachica.easyrecycleradapters.sample.R;
import com.squareup.picasso.Picasso;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class ImageBackgroundSelectorViewHolder extends CommonViewHolder<ImageData> {

    @InjectView(R.id.image)
    ImageView image;
    @InjectView(R.id.text)
    TextView title;

    public ImageBackgroundSelectorViewHolder(View view) {
        super(view);
        ButterKnife.inject(this, view);
    }

    @Override
    public void bindTo(ImageData item) {
        Picasso.with(getContext()).load(item.getImageUrl()).placeholder(R.drawable.ic_launcher).into(image);
    }

}
