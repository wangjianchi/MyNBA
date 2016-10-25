package com.neowang.mynba.base;

import com.neowang.mynba.model.MainModel;
import com.neowang.mynba.retrofit.ApiCallback;
import com.neowang.mynba.retrofit.ApiStores;

/**
 * Created by cd14 on 2016/10/11.
 */

public class MainPresenter extends BasePresenter<MainView> {
    public MainPresenter(MainView view){
        attachView(view);
    }
    public void loadData(){
        mvpView.showLoading();
        addSubcription(apiStores.loadData(ApiStores.KEY),
                new ApiCallback<MainModel>() {
                    @Override
                    public void onSuccess(MainModel model) {
                        mvpView.getDataSuccess(model);
                    }

                    @Override
                    public void onFailure(int code, String msg) {
                        mvpView.getDataFail(msg);
                    }

                    @Override
                    public void onFinish() {
                        mvpView.hideLoading();
                    }
                });
    }
}
