package com.johnquimbaya.testreigndesign.home.interactor;

import com.johnquimbaya.testreigndesign.home.presenter.HomePresenter;

import com.johnquimbaya.testreigndesign.home.repository.HomeListRepository;
import com.johnquimbaya.testreigndesign.home.repository.HomeListRepositoryImpl;
/**
 * created by john fredy quimbaya on 24/08/18.
 *
 */
public class HomeListInteractorImpl implements HomeListInteractor {

    private HomePresenter homePresenter;
    private HomeListRepository homeListRepository;

    public HomeListInteractorImpl(HomePresenter homePresenter) {
        this.homePresenter = homePresenter;
        homeListRepository =  new HomeListRepositoryImpl(homePresenter);

    }

    @Override
    public void getDataPost() {

        homeListRepository.getDataPost();


    }
}
