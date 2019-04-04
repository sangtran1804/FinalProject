package com.example.finalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class muonsach_adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<muonsach> muonsachList;

    public muonsach_adapter(Context context, int layout, List<muonsach> muonsachList) {
        this.context = context;
        this.layout = layout;
        this.muonsachList = muonsachList;
    }

    @Override
    public int getCount() {
        return muonsachList.size();
    }

    @Override
    public Object getItem(int position) {
        return muonsachList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);
        muonsach item = muonsachList.get(position);
        TextView tv_tennguoimuon = (TextView)convertView.findViewById(R.id.tv_nguoimuon);
        TextView tv_sachmuon = (TextView)convertView.findViewById(R.id.sach_muon);
        TextView tv_soluong = (TextView)convertView.findViewById(R.id.soluong);
        Button btn_trasach = (Button) convertView.findViewById(R.id.btn_trasach);

        final muonsach muonsach = muonsachList.get(position);

        tv_tennguoimuon.setText(muonsach.getTennguoimuon());
        tv_sachmuon.setText(muonsach.getTensachmuon());
        tv_soluong.setText(String.valueOf(muonsach.getSoluong()));
        btn_trasach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                muonsachList.remove(muonsach);
                notifyDataSetChanged();
            }
        });
        return convertView;
    }
}
