package mohan.com.recyviewdatabinding.presentation.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import mohan.com.recyviewdatabinding.R;
import mohan.com.recyviewdatabinding.data.model.Employee;
import mohan.com.recyviewdatabinding.databinding.RvListitemBinding;

/*
 * Copyright (c) 2019. Created by Mohanraj.S,Innobot Systems on 15/11/19 for KOTLINworkspace
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class EmployeeDataAdapter  extends RecyclerView.Adapter<EmployeeDataAdapter.EmployeeViewHolder>{
private ArrayList<Employee> employees;
    @NonNull
    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        RvListitemBinding mRvListitemBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.rv_listitem,viewGroup,false);

        return new EmployeeViewHolder(mRvListitemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position) {
        Employee currentEmployee=employees.get(position);
        //holder.mRvListitemBinding.setEmployee(currentEmployee);
        holder.mRvListItemBinding.setEmployee(currentEmployee);
    }

    @Override
    public int getItemCount() {
        if (employees != null) {
            return employees.size();
        } else {
            return 0;
        }
    }

    public void setEmployeeList(ArrayList<Employee> employees) {
        this.employees = employees;
        notifyDataSetChanged();
    }

    class EmployeeViewHolder extends RecyclerView.ViewHolder{
        //public RvListitemBinding mRvListitemBinding;
        public RvListitemBinding mRvListItemBinding;
        public EmployeeViewHolder(@NonNull RvListitemBinding mRvListItemBinding) {
            super(mRvListItemBinding.getRoot());
            this.mRvListItemBinding=mRvListItemBinding;
        }
    }
}
