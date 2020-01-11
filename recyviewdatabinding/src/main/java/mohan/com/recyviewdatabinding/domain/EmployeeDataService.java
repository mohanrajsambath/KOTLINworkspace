package mohan.com.recyviewdatabinding.domain;

import mohan.com.recyviewdatabinding.data.model.EmployeeDBResponse;
import retrofit2.Call;
import retrofit2.http.GET;

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
public interface EmployeeDataService {
    @GET("users/?per_page=12&amp;page=1")
    Call<EmployeeDBResponse> getEmployees();
}
