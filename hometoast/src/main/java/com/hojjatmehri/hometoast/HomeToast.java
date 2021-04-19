package com.hojjatmehri.hometoast;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomeToast {

    Activity activity;
    int gravity = Gravity.BOTTOM;
    int xOffset = 0;
    int yOffset = 100;
    int toastDuration = Toast.LENGTH_LONG;
    int toastTextColor = 0xff292929;
    int toastBGColor = 0xffffcc00;
    String toastMessage = "Hojjat Mehri test toast";
    RelativeLayout relbg;

    public HomeToast(Activity activity) {
        this.activity = activity;
    }


    public void show(@NonNull String toastMessage){
        this.toastMessage = toastMessage;
        viewToast();
    }
    public void show(@NonNull String toastMessage , @Nullable int toastTextColor){
        this.toastMessage = toastMessage;
        this.toastTextColor = toastTextColor;
        viewToast();
    }
    public void show(@NonNull String toastMessage , @Nullable int toastTextColor
            , @Nullable int toastBGColor){
        this.toastMessage = toastMessage;
        this.toastTextColor = toastTextColor;
        this.toastBGColor = toastBGColor;
        viewToast();
    }
    public void show(@NonNull String toastMessage , @Nullable int toastTextColor
            , @Nullable int toastBGColor , @Nullable int toastDuration){
        this.toastMessage = toastMessage;
        this.toastTextColor = toastTextColor;
        this.toastBGColor = toastBGColor;
        this.toastDuration = toastDuration;
        viewToast();
    }


    private void viewToast(){
        LayoutInflater inflater;
        View layout;
        TextView text;
        inflater = activity.getLayoutInflater();
        layout = inflater.inflate(R.layout.activity_toast,
                (ViewGroup) activity.findViewById(R.id.toast_layout_root));

        relbg = layout.findViewById(R.id.toast_layout_root);
        relbg.setBackgroundColor(toastBGColor);
        text = (TextView) layout.findViewById(R.id.text);
        text.setText(toastMessage);
        if (toastTextColor != 0)
            text.setTextColor(toastTextColor);

        Toast toast = new Toast(activity);
        toast.setGravity(gravity, xOffset, yOffset);
        toast.setDuration(toastDuration);
        toast.setView(layout);
        toast.show();
    }
}