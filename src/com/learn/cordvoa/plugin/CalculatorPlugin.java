package com.learn.cordvoa.plugin;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;


public class CalculatorPlugin extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        System.out.println("invoke");
        if ("add".equalsIgnoreCase(action)) {
//            callbackContext.success("Success");
            int first_value = Integer.parseInt(args.getString(0));
            int second_value = Integer.parseInt(args.getString(1));
            System.out.println(first_value + second_value);
            callbackContext.success(String.valueOf(first_value + second_value));
            return true;

        }

        return false;

    }
}
