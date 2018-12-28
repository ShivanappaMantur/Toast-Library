package com.alloneapps.toastlib;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {

    public static void displayToast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
