package com.neowang.mynba.retrofit;

import retrofit2.adapter.rxjava.HttpException;
import rx.Subscriber;

/**
 * Created by cd14 on 2016/10/11.
 */

public abstract class ApiCallback<M> extends Subscriber<M> {
    public abstract void onSuccess(M model);

    public abstract void onFailure(int code, String msg);

    public abstract void onFinish();

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        e.printStackTrace();
        if (e instanceof HttpException) {
            HttpException httpException = (HttpException) e;
            //httpException.response().errorBody().string()
            int code = httpException.code();
            String msg = httpException.getMessage();
            if (code == 504) {
                msg = "网络不给力";
            }
            if (code == 502 || code == 404) {
                msg = "服务器异常，请稍后再试";
            }
            onFailure(code, msg);
        } else {
            onFailure(0, e.getMessage());
        }
        onFinish();
    }

    @Override
    public void onNext(M m) {
        onSuccess(m);
    }
}
