package com.neowang.mynba.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by cd14 on 2016/10/11.
 */

public abstract class MvpActivity<P extends BasePresenter> extends BaseActivity {
    protected  P mvpPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        mvpPresenter = createPresenter();
        super.onCreate(savedInstanceState);
    }
    protected abstract P createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mvpPresenter != null) {
            mvpPresenter.detachView();
        }
    }
}
