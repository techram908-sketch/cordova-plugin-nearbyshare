package com.example.nearbysharepluginnative;

import android.content.Context;
import android.content.Intent;

public class NearbyShareHelper {

    private Context context;

    public NearbyShareHelper(Context context) {
        this.context = context;
    }

    public void shareText(String text) {
        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND);
        shareIntent.putExtra(Intent.EXTRA_TEXT, text);
        shareIntent.setType("text/plain");
        context.startActivity(Intent.createChooser(shareIntent, "Share via Nearby"));
    }
}
