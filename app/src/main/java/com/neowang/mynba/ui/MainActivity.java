package com.neowang.mynba.ui;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.neowang.mynba.R;
import com.neowang.mynba.base.MainPresenter;
import com.neowang.mynba.base.MainView;
import com.neowang.mynba.base.MvpActivity;
import com.neowang.mynba.model.MainModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends MvpActivity<MainPresenter> implements MainView{
    @BindView(R.id.txtView) TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mvpPresenter.loadData();
        initToolBarAsHome("NBA");
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }


    @Override
    public void getDataSuccess(MainModel model) {
        Log.i("sss",model.getResult().toString());

//        GameResultModel gameResultModel =
    }

    @Override
    public void getDataFail(String msg) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }
}
