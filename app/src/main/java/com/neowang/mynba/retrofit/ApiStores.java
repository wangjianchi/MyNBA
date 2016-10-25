package com.neowang.mynba.retrofit;

import com.neowang.mynba.model.MainModel;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by cd14 on 2016/10/11.
 */

public interface ApiStores {
    String API_BASE_URL = "http://op.juhe.cn";
    String KEY = "a94b0d90b5b9446215c355ac36a856cd";

    @GET("/onebox/basketball/nba")
    Observable<MainModel> loadData(@Query("key") String key);
}
