package mohan.com.recyviewdatabinding.data.model;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import mohan.com.recyviewdatabinding.data.remote.RetrofitClient;
import mohan.com.recyviewdatabinding.domain.EmployeeDataService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
public class EmployeeRepository {
    private static final String TAG = "EmployeeRepository";
    private ArrayList<Employee> employees = new ArrayList<>();
    private MutableLiveData<List<Employee>> mutableLiveData = new MutableLiveData<>();

    public EmployeeRepository() { }
    public MutableLiveData<List<Employee>> getMutableLiveData() {
        final EmployeeDataService userDataService = RetrofitClient.getService();
        Call<EmployeeDBResponse> call = userDataService.getEmployees();
        call.enqueue(new Callback<EmployeeDBResponse>() {
            @Override
            public void onResponse(Call<EmployeeDBResponse> call, Response<EmployeeDBResponse> response) {
                EmployeeDBResponse employeeDBResponse = response.body();
                if (employeeDBResponse != null  && employeeDBResponse.getEmployee() != null) {
                    employees = (ArrayList<Employee>) employeeDBResponse.getEmployee();
                    mutableLiveData.setValue(employees);
                }
            }

            @Override
            public void onFailure(Call<EmployeeDBResponse> call, Throwable t) {
            }
        });

        return mutableLiveData;
    }

}
