package edu.washington.grassela.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logEvent("onCreate");
        if (savedInstanceState != null) {
            for (String item : savedInstanceState.keySet()) {
                Log.i(TAG, item + ": " + savedInstanceState.get(item));
            }
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        logEvent("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logEvent("onStop");
    }

    @Override
    public void onResume() {
        super.onResume();
        logEvent("onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        logEvent("onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        logEvent("onRestart");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "We're going down, Captain!");

    }

    private void logEvent(String eventName){
        Log.e(TAG, eventName + " event fired");

    }
}
