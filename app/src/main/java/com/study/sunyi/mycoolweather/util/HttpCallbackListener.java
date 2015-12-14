package com.study.sunyi.mycoolweather.util;

/**
 * Created by SunYi on 2015/12/14/0014.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
