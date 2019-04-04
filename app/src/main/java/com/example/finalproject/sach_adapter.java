package com.example.finalproject;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class sach_adapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<thuvien> thuvienList;


    public sach_adapter(Context context, int layout, List<thuvien> thuvienList ) {
        this.context = context;
        this.layout = layout;
        this.thuvienList = thuvienList;
    }

    @Override
    public int getCount() {
        return thuvienList.size();
    }

    @Override
    public Object getItem(int position) {
        return thuvienList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater =(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);
        // anh xa
        final thuvien item = thuvienList.get(position);
        TextView tvten = (TextView)convertView.findViewById(R.id.tensach);
        TextView tvtheloai = (TextView) convertView.findViewById(R.id.theloai);
        TextView tvsoluong = (TextView) convertView.findViewById(R.id.soluong);
        TextView tvtacgia = (TextView) convertView.findViewById(R.id.tacgia);
        TextView tvnhaxuatban = (TextView) convertView.findViewById(R.id.nxb);
        //ImageView img = (ImageView) convertView.findViewById(R.id.imageSach);
        // truyen du lieu
        ImageView img_update = (ImageView)convertView.findViewById(R.id.img_update);
        ImageView img_delete = (ImageView)convertView.findViewById(R.id.img_delete);
        final thuvien thuvien = thuvienList.get(position);
        tvten.setText(thuvien.getTensach());
        tvtheloai.setText(thuvien.getTheloai());
        tvsoluong.setText(thuvien.getSoluong());
//        tvtacgia.setText(thuvien.getTacgia());
//        tvnhaxuatban.setText(thuvien.getNxb());
        img_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thuvienList.remove(thuvien);
                notifyDataSetChanged();
            }
        });
    //    img_update.setOnClickListener();
        return convertView;
    }
}
