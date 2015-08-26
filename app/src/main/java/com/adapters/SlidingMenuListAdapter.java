package com.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.SlidingMenuActivity;
import com.example.krishna.expensetracker.R;
import com.models.SlidingMenuModel;

import java.util.List;

/**
 * Created by krishna on 8/26/2015.
 */
public class SlidingMenuListAdapter extends BaseAdapter {
    Context context = null;
    List<SlidingMenuModel> slidingMenuItem;

    public SlidingMenuListAdapter(Context context, List<SlidingMenuModel> slidingMenuItem) {
        this.context = context;
        this.slidingMenuItem = slidingMenuItem;
    }

    @Override
    public int getCount() {
        return slidingMenuItem.size();
    }

    @Override
    public Object getItem(int position) {
        return slidingMenuItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= LayoutInflater.from(context);
        convertView=inflater.inflate(R.layout.custom_sliding_menu_list_row,null);
        TextView tv= (TextView) convertView.findViewById(R.id.title);
        ImageView iv= (ImageView) convertView.findViewById(R.id.icon);
        tv.setText(slidingMenuItem.get(position).getMenuName());
        iv.setImageResource(slidingMenuItem.get(position).getImageId());
        return convertView;
    }
}
