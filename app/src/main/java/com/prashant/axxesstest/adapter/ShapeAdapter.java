package com.prashant.axxesstest.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.prashant.axxesstest.R;
import com.prashant.axxesstest.activity.DetailsActivity;
import com.prashant.axxesstest.model.ApiResponse.Datum;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class ShapeAdapter extends ArrayAdapter<Datum> {
    private Context context;
    private int layoutResourceId;
    private ArrayList<Datum> data = new ArrayList<>();

    public ShapeAdapter(Context context, int layoutResourceId, ArrayList<Datum> data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    class RecordHolder {
        ImageView imageItem;
        TextView tvTitle;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View row = convertView;
        RecordHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            holder = new RecordHolder();
            holder.imageItem = row.findViewById(R.id.img_shape);
            holder.tvTitle = row.findViewById(R.id.tv_title);
            row.setTag(holder);
        } else {
            holder = (RecordHolder) row.getTag();
        }

        final Datum datum = data.get(position);
        Log.e("getView: ", "" + position);

        if (datum.getTags().size() > 0) {
            holder.tvTitle.setText(datum.getTags().get(0).getName());
        } else {
            holder.tvTitle.setText(datum.getTitle());
        }

        String image = "";
        try {
            if (datum.getIsAlbum() && datum.getImages().get(0).getLink() != null) {

                Picasso.with(context)
                        .load(datum.getImages().get(0).getLink())
                        .resize(400, 400)
                        .onlyScaleDown()
                        .placeholder(R.mipmap.ic_launcher_round)
                        .error(R.mipmap.ic_launcher_round)
                        .into(holder.imageItem);
                image = datum.getImages().get(0).getLink();
            } else {
                Picasso.with(context)
                        .load(datum.getLink())
                        .resize(400, 400)
                        .onlyScaleDown()
                        .placeholder(R.mipmap.ic_launcher_round)
                        .error(R.mipmap.ic_launcher_round)
                        .into(holder.imageItem);
                image = datum.getLink();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        holder.imageItem.setTag(position);
        final RecordHolder finalHolder = holder;
        final String finalImage = image;

        holder.imageItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Passing data to details activity
                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("title", finalHolder.tvTitle.getText().toString());
                i.putExtra("image", finalImage);
                i.putExtra("food_id", datum.getId());
                context.startActivity(i);
            }
        });

        return row;

    }

}



