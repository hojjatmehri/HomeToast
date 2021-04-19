package com.hojjatmehri.hometoast;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import carbon.widget.RelativeLayout;

public class HomeToast {

    Activity activity;
    int gravity = Gravity.BOTTOM;
    int xOffset = 0;
    int yOffset = 100;
    int toastDuration = Toast.LENGTH_LONG;
    int toastTextColor = 0xff353c47;
    int toastBGColor = 0xFFf9b8c8;
    String toastMessage = "Hojjat Mehri test toast";
    RelativeLayout relbg;

    public HomeToast(Activity activity) {
        this.activity = activity;
    }


    public void show(@NonNull String toastMessage){
        this.toastMessage = toastMessage;
        viewToast(0);
    }

    public void showSuccess(@NonNull String toastMessage){
        this.toastMessage = toastMessage;
        viewToast(1);
    }
    public void show(@NonNull String toastMessage , @Nullable int toastTextColor){
        this.toastMessage = toastMessage;
        this.toastTextColor = toastTextColor;
        viewToast(0);
    }
    public void show(@NonNull String toastMessage , @Nullable int toastTextColor
            , @Nullable int toastBGColor){
        this.toastMessage = toastMessage;
        this.toastTextColor = toastTextColor;
        this.toastBGColor = toastBGColor;
        viewToast(0);
    }
    public void show(@NonNull String toastMessage , @Nullable int toastTextColor
            , @Nullable int toastBGColor , @Nullable int toastDuration){
        this.toastMessage = toastMessage;
        this.toastTextColor = toastTextColor;
        this.toastBGColor = toastBGColor;
        this.toastDuration = toastDuration;
        viewToast(0);
    }


    private void viewToast(int iStatus){
        LayoutInflater inflater;
        View layout;
        TextView text;
        inflater = activity.getLayoutInflater();
        layout = inflater.inflate(R.layout.activity_toast,
                (ViewGroup) activity.findViewById(R.id.toast_layout_root));

        relbg = layout.findViewById(R.id.toast_layout_root);
        text = (TextView) layout.findViewById(R.id.text);
        switch (iStatus){
            case 1:
                relbg.setBackgroundDrawable(activity.getDrawable(R.drawable.bg_success));
                relbg.setElevationShadowColor(activity.getColor(R.color.success));
                break;
            case 2:
                relbg.setBackgroundDrawable(activity.getDrawable(R.drawable.bg_error));
                relbg.setElevationShadowColor(activity.getColor(R.color.error));
                break;
            default:
                relbg.setBackgroundColor(toastBGColor);
        }

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