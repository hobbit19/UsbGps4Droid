package org.broeuschmeul.android.gps.usb.provider;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Preferences activity was deprecated and so now we make a preferences
 * fragment and make an activity to display that fragment.
 * <p>
 * All this activity does is display the fragment, the fragment handles
 * everything else.
 * <p>
 * Created by Oliver Bell 5/12/15
 */

public class USBGpsActivity extends Activity {

    private int LOCATION_REQUEST = 234234;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display the fragment as the main content.
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new USBGpsSettingsFragment())
                .commit();
    }

    private boolean hasPermission(String perm) {
        return (PackageManager.PERMISSION_GRANTED == ContextCompat.checkSelfPermission(this, perm));
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
