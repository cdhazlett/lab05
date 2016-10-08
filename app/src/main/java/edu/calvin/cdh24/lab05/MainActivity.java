/* This is the main activity for lab05, CS262, Fall 2016.  This app shows a settings screen created
    with a settings fragment.

   @author: Christiaan Hazlett
   @version: 1.0
*/

package edu.calvin.cdh24.lab05;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

// This is the main activity class for the app
public class MainActivity extends AppCompatActivity {

    // Create a variable to hold the SharedPreferences object
    private SharedPreferences myPrefs;


    // Run this code when the activity first loads
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a new PreferenceManager to querying the XML prefs file
        myPrefs = PreferenceManager.getDefaultSharedPreferences(this);

    }

    // This method runs whenever the view comes back from a hidden position
    @Override
    protected void onResume() {
        super.onResume();

        // Get access to the textview so we can display a message
        final TextView txtvw = (TextView) findViewById(R.id.textView);

        // If the setting is checked, then say so.  Otherwise, do the same.
        if (myPrefs.getBoolean("checkbox_preference", true)) {
            txtvw.setText("Hello, Lab05!  The preference is currently set to true!");
        }
        else {
            txtvw.setText("Hello, Lab05!  The preference is currently set to false.");
        }
    }

    // Runs when the options menu is created
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    // Runs when an option is selected from the menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.show_activity:

                // Launch the settings activity
                Intent intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
