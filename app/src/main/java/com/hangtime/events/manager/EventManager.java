package com.hangtime.events.manager;

import android.util.Log;

import com.hangtime.events.model.Event;
import com.hangtime.events.parser.EventParser;

import org.json.JSONException;
import org.json.JSONObject;

public class EventManager {

    public static final String TAG = EventManager.class.getSimpleName();

    public static Event get(String id) {
        // TODO: Retrieve event from local db

        return null;
    }

    public static Event parse(JSONObject json) {
        try {
            return EventParser.parse(json);
        } catch (JSONException e) {
            Log.e(TAG, "Unable to parse Event object from JSON...", e);
        }

        return null;
    }
}
