package com.example.bajian.activitybackpressdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * public boolean moveTaskToBack(boolean nonRoot)
 activity里有这个方法，参数说明如下：
 nonRoot=false→ 仅当activity为task根（即首个activity例如启动activity之类的）时才生效
 nonRoot=true→ 忽略上面的限制
 这个方法不会改变task中的activity中的顺序，效果基本等同于home键
 */
public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        FloatingActionButton fab=(FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
            }
        });

    }

    @Override
    protected void onPause() {
        Log.e(TAG, "onPause()");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e(TAG, "onStop()");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e(TAG, "onDestroy()");
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        Log.e(TAG, "onResume()");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.e(TAG, "onStart()");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.e(TAG, "onRestart()");
        super.onRestart();
    }



}
