package com.example.a56409.locationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.amap.api.location.AMapLocation;
import com.example.amapservice.LocationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = findViewById(R.id.text);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LocationUtils.start(v.getContext(), new LocationUtils.onLocationListener() {
                    @Override
                    public void getData(AMapLocation aMapLocation) {
                        textView.setText(aMapLocation.getCity());
                    }
                });
            }
        });

    }
}
