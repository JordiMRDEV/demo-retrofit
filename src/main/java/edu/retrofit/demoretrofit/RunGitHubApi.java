package edu.retrofit.demoretrofit;

import edu.retrofit.demoretrofit.services.GitHubService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@Configuration
public class RunGitHubApi implements ApplicationRunner {

    private final String TOKEN = "put your personal GitHub Token here";

    public void listRepos() throws IOException {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GitHubService service = retrofit.create(GitHubService.class);

        var reposApiResponse = service.listRepos("JordiMRDEV",
                "Bearer " + TOKEN).execute();

        if (reposApiResponse.isSuccessful()) {
            var repos = reposApiResponse.body();
            System.out.println(repos);
        }
        else {
            var error = reposApiResponse.errorBody();
            System.out.println(error.string());
        }

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        listRepos();
    }
}
