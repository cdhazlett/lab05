/* This is the settings activity for lab05, CS262, Fall 2016.  This app shows a settings screen created
    with a settings fragment.

   @author: Christiaan Hazlett
   @version: 1.0
*/

package edu.calvin.cdh24.lab05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import layout.SettingsFragment;

// This is an activity that will host the settings fragment
public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Set the title of the activity
        setTitle("Lab05 - Settings");

        // Load and display the settings fragment in the current activity
        getFragmentManager().beginTransaction().replace(android.R.id.content, new SettingsFragment()).commit();
    }

}
