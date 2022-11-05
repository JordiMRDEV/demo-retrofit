package edu.retrofit.demoretrofit.services;

import edu.retrofit.demoretrofit.model.pokeapi.Berry;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PokeApiService {

    @GET("berry/{id}")
    Call<Berry> getBerry(@Path("id") Long id);
}
