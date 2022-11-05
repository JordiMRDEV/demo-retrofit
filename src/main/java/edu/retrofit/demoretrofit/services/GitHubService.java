package edu.retrofit.demoretrofit.services;

import edu.retrofit.demoretrofit.model.github.Repo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

import java.util.List;

public interface GitHubService {

    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user, @Header("authorization") String auth);
}
