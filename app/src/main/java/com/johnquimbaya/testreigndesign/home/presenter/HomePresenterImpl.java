package com.johnquimbaya.testreigndesign.home.presenter;

import com.johnquimbaya.testreigndesign.home.interactor.HomeListInteractor;
import com.johnquimbaya.testreigndesign.home.interactor.HomeListInteractorImpl;
import com.johnquimbaya.testreigndesign.home.model.Hit;
import com.johnquimbaya.testreigndesign.home.view.HomeListView;

/**
 * created by john fredy quimbaya on 24/08/18.
 *
 */
public class HomePresenterImpl implements HomePresenter {
    private HomeListView homeListView;
    private HomeListInteractor homeListInteractor;


    public HomePresenterImpl( HomeListView homeListView){
        this.homeListView=homeListView;
        homeListInteractor = new HomeListInteractorImpl(this);

    }


    @Override
    public void getDataPost() {
        homeListInteractor.getDataPost();

    }

    @Override
    public void showDataPost(Hit hit) {
        homeListInteractor.getDataPost();

    }


}
