package com.example.myapplication;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.utils.widget.ImageFilterView;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact> {
    private int resourceId;
    public ContactAdapter(Context context, int textViewResourceId,
                        List<Contact> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        class ViewHolder{
            ImageFilterView avatar;
            TextView nickName;
        }
        ViewHolder holder = new ViewHolder();
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            holder.avatar = (ImageFilterView) convertView.findViewById(R.id.iv_avatar);
            holder.nickName = (TextView) convertView.findViewById(R.id.tv_name);
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }
        Contact Contact = getItem(position);
        holder.avatar.setImageResource(Contact.getAvatarId());
        holder.nickName.setText(Contact.getName());
        return convertView;
    }
}