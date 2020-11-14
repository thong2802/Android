package com.example.listviewnangcao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Base64;
import java.util.List;

public class TraicayAdapter extends BaseAdapter {
    // Để có thể sử dụng Adapter thì chúng ta cần truyền cho class này dữ liệu dạng danh sách hoặc mảng
  private Context context;
  private int layout;
  private List<Traicay> traicayList;

    public TraicayAdapter(Context context, int layout, List<Traicay> traicayList) {
        this.context = context;
        this.layout = layout;
        this.traicayList = traicayList;
    }

    @Override
    public int getCount() {
        return traicayList.size(); // kich thuoc co bao nhieu dong thi do ra
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Gọi layoutInflater ra để bắt đầu ánh xạ view và data.
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // Đổ dữ liệu vào biến View, view này chính là những gì nằm trong line_trai_cay.xml
        convertView =layoutInflater.inflate(R.layout.line_trai_cay, null);
   /// anh xa vao adapter
        TextView txtTen = (TextView) convertView.findViewById(R.id.textviewTen);
        TextView txtMota = (TextView) convertView.findViewById(R.id.textviewMota);
        ImageView imageHinh =(ImageView) convertView.findViewById(R.id.imageviewHinh);

        Traicay traicay =   traicayList.get(position);
        txtTen.setText(traicay.getName());
        txtMota.setText(traicay.getDescription());
        imageHinh.setImageResource(traicay.getMedia());
        return convertView;
    }
}
