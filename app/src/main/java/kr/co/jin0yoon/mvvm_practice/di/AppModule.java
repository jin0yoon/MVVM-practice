package kr.co.jin0yoon.mvvm_practice.di;

import androidx.lifecycle.ViewModelProvider;



import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import kr.co.jin0yoon.mvvm_practice.service.repository.GitHubService;
import kr.co.jin0yoon.mvvm_practice.viewmodel.ProjectViewModelFactory;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(subcomponents = ViewModelSubComponent.class)
class AppModule {
    @Singleton @Provides
    GitHubService provideGithubService() {
        return new Retrofit.Builder()
                .baseUrl(GitHubService.HTTPS_API_GITHUB_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GitHubService.class);
    }

    @Singleton
    @Provides
    ViewModelProvider.Factory provideViewModelFactory(
            ViewModelSubComponent.Builder viewModelSubComponent) {

        return new ProjectViewModelFactory(viewModelSubComponent.build());
    }
}
