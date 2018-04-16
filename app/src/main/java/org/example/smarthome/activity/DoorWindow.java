package org.example.smarthome.activity;

import android.os.Bundle;

import org.example.smarthome.R;
import org.example.smarthome.activity.base.ActivityFrame;

/**
 * Created by Baymaxyang on 2017/10/28.
 */

public class DoorWindow extends ActivityFrame {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppendMainBody(R.layout.doorwindow);
    }
}
