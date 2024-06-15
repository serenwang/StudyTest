package com.example.myapplication;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

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
        Contact Contact = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        ImageView fruitImage = (ImageView) view.findViewById(R.id.iv_avatar);
        TextView  fruitName  = (TextView) view.findViewById(R.id.tv_name);
        fruitImage.setImageResource(Contact.getAvatarId());
        fruitName.setText(Contact.getName());
        return view;
    }
}