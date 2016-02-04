package digvijaykumaryarlagadda.visualstudio.com.weatherforecast;

import android.app.Activity;
import android.content.SharedPreferences;
/**
 * Created by dy5kc on 2/3/2016.
 */
public class PreferenceCity {

    SharedPreferences prefs;

    public PreferenceCity(Activity activity) {
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    String getCity() {
        return prefs.getString("city", "Sydney, AU");
    }

    void setCity(String city) {
        prefs.edit().putString("city", city).commit();
    }
}
