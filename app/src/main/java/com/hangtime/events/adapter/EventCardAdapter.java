package com.hangtime.events.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hangtime.events.R;
import com.hangtime.events.model.Event;

import java.util.List;

public class EventCardAdapter extends RecyclerView.Adapter<EventCardAdapter.ViewHolder> {

    public static final String TAG = EventCardAdapter.class.getSimpleName();

    private List<Event> events;

    public EventCardAdapter(List<Event> events) {
        this.events = events;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        // Create a new view.
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.adapter_event_card, viewGroup, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }



    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        Log.d(TAG, "Element " + position + " set.");

        // Get element from your dataset at this position and replace the contents of the view
        // with that element
        viewHolder.getTitleView().setText(events.get(position).getTitle());
    }


    // Return the size of the dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return events.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView titleView;

        public ViewHolder(View v) {
            super(v);
            titleView = (TextView) v.findViewById(R.id.event_title);
        }

        public TextView getTitleView() {
            return titleView;
        }
    }
}
