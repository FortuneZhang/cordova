package com.learn.cordvoa;

import android.app.Activity;
import android.os.Bundle;

import org.apache.cordova.DroidGap;

public class MainActivity extends DroidGap
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
