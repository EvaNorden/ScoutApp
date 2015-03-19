package eva.scoutapp;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.util.ArrayList;

import eva.logik.GameLog;

/**
 * Her kan foretages fælles initialisering.
 * Resten af programmet bliver først initialiseret efter at objektet og
 * kaldet til metoden onCreate() er afsluttet, så det er vigtigt kun at
 * udføre de allermest nødvendige ting her.
 */
public class SingletonApp extends Application {
    public static SharedPreferences prefs;
    public static SingletonApp instance;
    public static ArrayList<GameLog> games;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        prefs = PreferenceManager.getDefaultSharedPreferences(this);
        games = new ArrayList<GameLog>();
    }
}
