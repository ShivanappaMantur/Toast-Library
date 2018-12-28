package com.alloneapps.toastlib;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {

    private static int toastLengths = Toast.LENGTH_SHORT;

    public static void displayToast(Context context, String message){
        Toast.makeText(context, message, toastLengths).show();
    }

    public static void setToastLength(int toastLength){
        toastLengths = toastLength;
    }
}
