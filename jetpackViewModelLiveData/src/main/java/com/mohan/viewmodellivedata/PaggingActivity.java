package com.mohan.viewmodellivedata;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class PaggingActivity extends AppCompatActivity {

    private RecyclerView mPaggingRecycleView;
    TextView mTxtVwQuota;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagging_layout);
        mTxtVwQuota = findViewById(R.id.txtVw_Quota);
        mPaggingRecycleView = findViewById(R.id.recyclerview);
        mPaggingRecycleView.setLayoutManager(new LinearLayoutManager(this));
        mPaggingRecycleView.setHasFixedSize(true);

        //Assign ViewModel
        ItemViewModel mItemViewModel= new ViewModelProvider(this).get(ItemViewModel.class);
        ItemAdapter mItemAdapter = new ItemAdapter(this);
        mItemViewModel.itemPagedList.observe(this, new Observer<PagedList<Item>>() {
            @Override
            public void onChanged(PagedList<Item> items) {
                mItemAdapter.submitList(items);
                mTxtVwQuota.setText(mItemViewModel.itemPagedList.);
            }
        });

        mPaggingRecycleView.setAdapter(mItemAdapter);



        /*Call<StackResponse> mRetroftiApicall = ARetrofitClient.getInstance()
                .getApi()
                .getAnswers(1,20,"desc","activity","stackoverflow");
        mRetroftiApicall.enqueue(new Callback<StackResponse>() {
            @Override
            public void onResponse(Call<StackResponse> call, Response<StackResponse> response) {
                StackResponse mStackResponse=response.body();
                Toast.makeText(PaggingActivity.this,String.valueOf(mStackResponse.items.size()),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<StackResponse> call, Throwable t) {

            }
        });*/

    }
}
