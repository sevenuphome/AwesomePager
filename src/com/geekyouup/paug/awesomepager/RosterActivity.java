package com.geekyouup.paug.awesomepager;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class RosterActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("This is the Roster tab");
        setContentView(textview);
    }
}
