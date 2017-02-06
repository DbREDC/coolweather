package com.example.redc.coolweather.util;

/**
 * Created by REDC on 2017/1/12.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
