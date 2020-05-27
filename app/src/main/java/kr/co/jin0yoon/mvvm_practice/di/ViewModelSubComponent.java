package kr.co.jin0yoon.mvvm_practice.di;



import dagger.Subcomponent;
import kr.co.jin0yoon.mvvm_practice.viewmodel.ProjectListViewModel;
import kr.co.jin0yoon.mvvm_practice.viewmodel.ProjectViewModel;

/**
 * A sub component to create ViewModels. It is called by the
 * {@link kr.co.jin0yoon.mvvm_practice.viewmodel.ProjectViewModelFactory}.
 */
@Subcomponent
public interface ViewModelSubComponent {
    @Subcomponent.Builder
    interface Builder {
        ViewModelSubComponent build();
    }

    ProjectListViewModel projectListViewModel();
    ProjectViewModel projectViewModel();
}
