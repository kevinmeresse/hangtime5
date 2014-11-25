package com.hangtime.events.util;

import android.os.Handler;

import com.hangtime.events.callback.DoneCallback;

public class Utils {

    public static void waitAndRun(final long delay, final DoneCallback callback) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                if (callback != null)
                    callback.done(null);
            }
        }, delay);
    }
}
