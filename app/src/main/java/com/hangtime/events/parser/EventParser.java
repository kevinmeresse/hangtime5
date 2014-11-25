package com.hangtime.events.parser;

import com.hangtime.events.manager.EventManager;
import com.hangtime.events.model.Event;

import org.json.JSONException;
import org.json.JSONObject;

public class EventParser {

    public static Event parse(JSONObject json) throws JSONException {
        String id = json.getString("eventId");
        Event event = EventManager.get(id);

        if (event == null)
            event = new Event(id);

        // TODO: Parse event

        return event;
    }
}
