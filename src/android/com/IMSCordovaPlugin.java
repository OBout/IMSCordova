/**
 */
package com.example;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

import java.util.Date;


public class IMSCordovaPlugin extends CordovaPlugin {
  private static final String TAG = "IMSCordovaPlugin";

  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);

    Log.d(TAG, "Initializing IMSCordovaPlugin");
  }

  public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
    if (action.equals("registerIMSevent")) {


      
      // An example of returning data back to the web layer
      final PluginResult result = new PluginResult(PluginResult.Status.OK, ("registered"));
      callbackContext.sendPluginResult(result);
    }
    return true;
  }

}
// NET WORK MANAGER PLUGIN
// https://git-wip-us.apache.org/repos/asf?p=cordova-plugin-network-information.git;a=blob;f=src/android/NetworkManager.java;h=e2ac500ccc885db641d5df6dab8eae23026a5828;hb=HEAD

// http://www.andygup.net/using-custom-events-in-android-apps/

// https://stackoverflow.com/questions/10171225/how-do-i-get-my-inputmethodservice

// https://stackoverflow.com/questions/8292712/android-custom-event-listener
