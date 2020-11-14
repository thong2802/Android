package com.example.gridview_appgallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class AdapterHinhanh extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<Hinhanh> hinhanhArrayList;

    public AdapterHinhanh(Context context, int layout, ArrayList<Hinhanh> hinhanhArrayList) {
        this.context = context;
        this.layout = layout;
        this.hinhanhArrayList = hinhanhArrayList;
    }

    @Override
    public int getCount() {
        return hinhanhArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public class ViewHolder{
        ImageView imageHinh;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder ;
        if (convertView == null){
            holder = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(layout, null);
            // anh xa
            holder.imageHinh = (ImageView) convertView.findViewById(R.id.imagehinh);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        // GAN DU LIEU
        Hinhanh hinhanh = hinhanhArrayList.get(position);
        holder.imageHinh.setImageResource(hinhanh.getImage());
       // holder.imagehinhanh.setImageResource(hinhanhArrayList.get(position).getImage());
        return convertView;
    }
}
