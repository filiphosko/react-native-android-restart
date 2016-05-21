package com.zamiang.RestartAction;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

import java.util.Map;

public class RestartActionModule implements ReactContextBaseJavaModule {

    @Override
    public String getName() {
        return "RestartAction";
    }

    @ReactMethod
    public void restart() {
        Intent i = getBaseContext()
            .getPackageManager()
            .getLaunchIntentForPackage(getBaseContext().getPackageName());
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}
