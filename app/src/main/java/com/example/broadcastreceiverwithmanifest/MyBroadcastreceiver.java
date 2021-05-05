package com.example.broadcastreceiverwithmanifest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyBroadcastreceiver extends BroadcastReceiver {
    private static final String TAG = "MyBroadcastreceiver";
    @Override
    public void onReceive(Context context, Intent intent) {

        Log.i(TAG, "onReceive: " + intent.getAction());
    }
}
