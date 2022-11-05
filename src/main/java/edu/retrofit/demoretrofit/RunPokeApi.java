package edu.retrofit.demoretrofit;

import edu.retrofit.demoretrofit.services.PokeApiService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@Configuration
public class RunPokeApi implements ApplicationRunner {
    public void listBerries() throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PokeApiService service = retrofit.create(PokeApiService.class);

        var berryApiResponse = service.getBerry(1L).execute();

        if (berryApiResponse.isSuccessful()) {
            var berry = berryApiResponse.body();
            System.out.println(berry);
        }
        else {
            var error = berryApiResponse.errorBody();
            System.out.println(error.string());
        }
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        listBerries();
    }
}
