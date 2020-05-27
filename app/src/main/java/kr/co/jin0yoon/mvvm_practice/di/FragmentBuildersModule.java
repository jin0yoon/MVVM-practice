package kr.co.jin0yoon.mvvm_practice.di;



import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import kr.co.jin0yoon.mvvm_practice.view.ui.ProjectFragment;
import kr.co.jin0yoon.mvvm_practice.view.ui.ProjectListFragment;

@Module
public abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract ProjectFragment contributeProjectFragment();

    @ContributesAndroidInjector
    abstract ProjectListFragment contributeProjectListFragment();
}
