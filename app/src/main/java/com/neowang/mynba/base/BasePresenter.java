package com.neowang.mynba.base;

import com.neowang.mynba.retrofit.ApiStores;
import com.neowang.mynba.retrofit.AppClient;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by cd14 on 2016/10/11.
 */

public class BasePresenter<V> {
    public V mvpView;
    protected ApiStores apiStores;
    private CompositeSubscription mCompositeSubscription;

    public void attachView(V v){
        this.mvpView = v;
        apiStores = AppClient.retrofit().create(ApiStores.class);
    }

    public void detachView(){
        this.mvpView = null;
        onUnsubcribe();
    }

    public void onUnsubcribe(){
        if (mCompositeSubscription != null && mCompositeSubscription.hasSubscriptions()){
            mCompositeSubscription.unsubscribe();
        }
    }

    public void addSubcription(Observable observable, Subscriber subscriber){
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber));
    }
}
