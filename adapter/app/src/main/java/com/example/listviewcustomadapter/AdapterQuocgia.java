package com.example.listviewcustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterQuocgia extends BaseAdapter {
        Context context;
        ArrayList<quoc_gia> arrayList;
        int layoutResource;

        public AdapterQuocgia ( Context mycontext, int layout,  ArrayList<quoc_gia> myarraylist){
                context = mycontext;
                arrayList = myarraylist;
                layoutResource = layout;
        }


        @Override
        public int getCount() {
                return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
                return null;
        }

        @Override
        public long getItemId(int position) {
                return 0;
        }

        private class ViewHolder {
                ImageView imagehinh;
                TextView txtMoTa, txtSo;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
               ViewHolder viewHolder;
               if (convertView == null) {
                       // LayoutInflater là 1 component giúp bạn chuyển layout file(Xml) thành View(Java code) trong Android.
                       LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                       // hoac LayoutInflater layoutInflater = LayoutInflater.from(context);
                       convertView = inflater.inflate(layoutResource, null);
                       viewHolder = new ViewHolder();

                       // anh xa
                       viewHolder.txtMoTa = (TextView) convertView.findViewById(R.id.tenquocgia);
                       viewHolder.txtSo = (TextView) convertView.findViewById(R.id.So);
                       viewHolder.imagehinh = (ImageView) convertView.findViewById(R.id.imagehinh);
                       convertView.setTag(viewHolder); // giu trang thai anh xa
               }else
               {
                       viewHolder = (ViewHolder) convertView.getTag();
               }

               // GIA TRI
                quoc_gia quocGia = arrayList.get(position);
               viewHolder.txtMoTa.setText(quocGia.getName());
               viewHolder.txtSo.setText(quocGia.getPopulate());
               viewHolder.imagehinh.setImageResource(quocGia.getImage());

                return convertView;
        }
}
