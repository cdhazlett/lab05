/* This is the settings fragment for lab05, CS262, Fall 2016.  This app shows a settings screen created
    with a settings fragment.

   @author: Christiaan Hazlett
   @version: 1.0
*/
package layout;


import android.os.Bundle;
import android.preference.PreferenceFragment;

import edu.calvin.cdh24.lab05.R;

// Class for settings fragment, implementing default methods
public class SettingsFragment extends PreferenceFragment {


    // onCreate method is run when the fragment is first loaded
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Generate the preferences fragment from the preferences XML file
        addPreferencesFromResource(R.xml.preferences_xml);
    }

}
