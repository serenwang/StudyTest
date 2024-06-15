//package com.example.myapplication;
//
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.List;
//
//public class ContactList extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {
//    private List<Contact> mFruitList;
//    static class ViewHolder extends RecyclerView.ViewHolder {
//        ImageView fruitImage;
//        TextView  fruitName;
//        public ViewHolder(View view) {
//            super(view);
//            fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
//            fruitName = (TextView) view.findViewById(R.id.fruit_name);
//        }
//    }
//    public ContactAdapter(List<Contact> contactlist) {
//        mFruitList = contactlist;
//    }
//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.fruit_item, parent, false);
//        ViewHolder holder = new ViewHolder(view);
//        return holder;
//    }
//    @Override
//    public void onBindViewHolder(ViewHolder holder, int position) {
//        Contact Contact = mFruitList.get(position);
//        holder.fruitImage.setImageResource(Contact.getImageId());
//        holder.fruitName.setText(Contact.getName());
//    }
//    @Override
//    public int getItemCount() {
//        return mFruitList.size();
//    }
//}