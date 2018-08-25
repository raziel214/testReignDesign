package com.johnquimbaya.testreigndesign.home.view;

import com.johnquimbaya.testreigndesign.home.model.Hit;

import java.util.List;

/**
 * created by john fredy quimbaya on 24/08/18.
 *
 */

public interface HomeListView {

    void getDataPost();

    void showDataPost(Hit hit);
    void showDataPostList(List<Hit>hitList);


}
