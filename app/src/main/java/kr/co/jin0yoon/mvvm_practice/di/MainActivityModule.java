package kr.co.jin0yoon.mvvm_practice.di;



import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import kr.co.jin0yoon.mvvm_practice.view.ui.MainActivity;

@Module
public abstract class MainActivityModule {
    @ContributesAndroidInjector(modules = FragmentBuildersModule.class)
    abstract MainActivity contributeMainActivity();
}
