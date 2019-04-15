### LocationDemo [![Badge](https://img.shields.io/badge/link-996.icu-%23FF4D5B.svg)](https://996.icu/)
基于高德地图定位api进行封装 可应用到组件化开发，此demo未配置安卓6.0以上动态访问权限，安卓6.0以上系统手机试用时请自行前往设置打开定位权限。

[高德地图安卓开发文档](https://lbs.amap.com/api/android-location-sdk/locationsummary/)

把amapservice模块导入项目中并依赖，在AndroidManifest中meta-data标签下填写key
![image.png](https://upload-images.jianshu.io/upload_images/6318561-40ad3e0a5286b628.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

[获取key方式](https://lbs.amap.com/api/android-location-sdk/guide/create-project/get-key)SHA1值按高德文档方法可能不太好取到，建议使用百度经验提供的这种[AS简单获取SHA1值方法](https://jingyan.baidu.com/article/22a299b5f24a7c9e19376ae5.html)


调用处只需几行代码
```
LocationUtils.start(context, new LocationUtils.onLocationListener() {
                    @Override
                    public void getData(AMapLocation aMapLocation) {
                        //to do sth
                    }
                });
```
