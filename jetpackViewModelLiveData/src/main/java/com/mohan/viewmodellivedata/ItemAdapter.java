package com.mohan.viewmodellivedata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.Objects;

public class ItemAdapter extends PagedListAdapter<Item, ItemAdapter.ItemViewHolder> {

    private Context mCtx;
    protected ItemAdapter(Context mCtx) {
        super(DIFF_CALLBACK);
        this.mCtx=mCtx;
    }

    protected ItemAdapter(@NonNull AsyncDifferConfig<Item> config) {
        super(config);
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView= LayoutInflater.from(mCtx).inflate(R.layout.pagging_items,parent,false);
        return new ItemViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item mItem= getItem(position);
        if(mItem!=null){
            Glide.with(mCtx).load(mItem.owner.profile_image).into(holder.mImgVwProfile);
            holder.mTxtVwName.setText(mItem.owner.display_name);
        }else{
            Toast.makeText(mCtx,"Item is Null",Toast.LENGTH_LONG).show();
        }
    }

    public static DiffUtil.ItemCallback<Item> DIFF_CALLBACK= new DiffUtil.ItemCallback<Item>() {
        @Override
        public boolean areItemsTheSame(@NonNull Item oldItem, @NonNull Item newItem) {
            return oldItem.answer_id == newItem.answer_id;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Item oldItem, @NonNull Item newItem) {
            return Objects.equals(oldItem, newItem);
        }
    };

    class ItemViewHolder extends RecyclerView.ViewHolder{

        ImageView mImgVwProfile;
        TextView mTxtVwName;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            mImgVwProfile = itemView.findViewById(R.id.imgVw_Profile);
            mTxtVwName = itemView.findViewById(R.id.txtVw_Name);
        }
    }
}
