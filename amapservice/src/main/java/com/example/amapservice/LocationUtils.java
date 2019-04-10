package com.example.amapservice;

import android.content.Context;
import android.content.Intent;

import com.amap.api.location.AMapLocation;

/**
 * Created by wangfei on 2019/4/10.
 */
public class LocationUtils {
    private static onLocationListener onLocationListener;

    public static void start(Context context, onLocationListener myOnLocationListener){
        context.startService(new Intent(context,AMapService.class));
        onLocationListener=myOnLocationListener;
    }

    public static LocationUtils.onLocationListener getOnLocationListener() {
        return onLocationListener;
    }

    public static void setOnLocationListener(LocationUtils.onLocationListener onLocationListener) {
        LocationUtils.onLocationListener = onLocationListener;
    }


    public interface onLocationListener{
        void getData(AMapLocation aMapLocation);
    }
}
