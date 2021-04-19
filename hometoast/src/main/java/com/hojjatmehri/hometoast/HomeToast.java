package com.hojjatmehri.hometoast;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import carbon.widget.RelativeLayout;

import static android.view.View.LAYOUT_DIRECTION_LTR;
import static android.view.View.TEXT_DIRECTION_LTR;

public class HomeToast {

    static Activity act;
    static int gravityIn = Gravity.BOTTOM;
    static int xOffsetIn = 0;
    static int yOffsetIn = 100;
    static int toastDurationIn = Toast.LENGTH_LONG;
    static int toastTextColorIn = 0xff353c47;
    //static int toastBGColorIn = 0xFFf9b8c8;
    static String toastMessageIn = "Hojjat Mehri test toast";
    static RelativeLayout relbg;
    static LayoutInflater layoutInflater = null;
    static Drawable bgDrawable;
    static Drawable iconBgDrawable;
    static Drawable iconDrawable;
    static int shadow = 0xFF36264b;
    static int iconC = 0xFF4c4f67;
    static int lDirection = LAYOUT_DIRECTION_LTR;
    static int tDirection = TEXT_DIRECTION_LTR;
    static int lDirection2 = LAYOUT_DIRECTION_LTR;
    static int tDirection2 = TEXT_DIRECTION_LTR;


    public HomeToast(Activity activity) {
        HomeToast.act = activity;
    }

    public HomeToast(@NonNull Activity activity, int layoutDirection) {
        HomeToast.act = activity;
        if(layoutDirection !=0)
            HomeToast.lDirection2 = layoutDirection;
        else
            HomeToast.lDirection2 = LAYOUT_DIRECTION_LTR;
    }
    public HomeToast(@NonNull Activity activity, int layoutDirection, int textDirection) {
        HomeToast.act = activity;
        if(layoutDirection !=0)
            HomeToast.lDirection2 = layoutDirection;
        else
            HomeToast.lDirection2 = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection2 = textDirection;
        else
            HomeToast.tDirection2 = TEXT_DIRECTION_LTR;
    }

    public HomeToast(@NonNull Activity activity, int layoutDirection, int textDirection,  int toastDuration) {
        HomeToast.act = activity;
        if(layoutDirection !=0)
            HomeToast.lDirection2 = layoutDirection;
        else
            HomeToast.lDirection2 = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection2 = textDirection;
        else
            HomeToast.tDirection2 = TEXT_DIRECTION_LTR;
        if(toastDuration !=0)
            HomeToast.toastDurationIn = toastDuration;
    }

    public HomeToast(@NonNull Activity activity, int layoutDirection, int textDirection,  int toastDuration, int toastTextColor) {
        HomeToast.act = activity;
        if(layoutDirection !=0)
            HomeToast.lDirection2 = layoutDirection;
        else
            HomeToast.lDirection2 = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection2 = textDirection;
        else
            HomeToast.tDirection2 = TEXT_DIRECTION_LTR;
        if(toastDuration !=0)
            HomeToast.toastDurationIn = toastDuration;
        if(toastTextColor !=0)
            HomeToast.toastTextColorIn = toastTextColor;
    }
    public HomeToast(@NonNull Activity activity, int layoutDirection, int textDirection,  int toastDuration, int toastTextColor, int gravity) {
        HomeToast.act = activity;
        if(layoutDirection !=0)
            HomeToast.lDirection2 = layoutDirection;
        else
            HomeToast.lDirection2 = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection2 = textDirection;
        else
            HomeToast.tDirection2 = TEXT_DIRECTION_LTR;
        if(toastDuration !=0)
            HomeToast.toastDurationIn = toastDuration;
        if(toastTextColor !=0)
            HomeToast.toastTextColorIn = toastTextColor;
        if(gravity !=0)
            HomeToast.gravityIn = gravity;
    }
    public HomeToast(@NonNull Activity activity, int layoutDirection, int textDirection,  int toastDuration, int toastTextColor, int gravity, int xOffset) {
        HomeToast.act = activity;
        if(layoutDirection !=0)
            HomeToast.lDirection2 = layoutDirection;
        else
            HomeToast.lDirection2 = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection2 = textDirection;
        else
            HomeToast.tDirection2 = TEXT_DIRECTION_LTR;
        if(toastDuration !=0)
            HomeToast.toastDurationIn = toastDuration;
        if(toastTextColor !=0)
            HomeToast.toastTextColorIn = toastTextColor;
        if(gravity !=0)
            HomeToast.gravityIn = gravity;
        if(xOffset !=0)
            HomeToast.xOffsetIn = xOffset;
    }
    public HomeToast(@NonNull Activity activity, int layoutDirection, int textDirection,  int toastDuration, int toastTextColor, int gravity, int xOffset, int yOffset) {
        HomeToast.act = activity;
        if(layoutDirection !=0)
            HomeToast.lDirection2 = layoutDirection;
        else
            HomeToast.lDirection2 = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection2 = textDirection;
        else
            HomeToast.tDirection2 = TEXT_DIRECTION_LTR;
        if(toastDuration !=0)
            HomeToast.toastDurationIn = toastDuration;
        if(toastTextColor !=0)
            HomeToast.toastTextColorIn = toastTextColor;
        if(gravity !=0)
            HomeToast.gravityIn = gravity;
        if(xOffset !=0)
            HomeToast.xOffsetIn = xOffset;
        if(yOffset !=0)
            HomeToast.yOffsetIn = yOffset;
    }
    public HomeToast(@NonNull Activity activity, int layoutDirection, int textDirection,  int toastDuration, int toastTextColor, int gravity, int xOffset, int yOffset, Drawable backgroundDrawable) {
        HomeToast.act = activity;
        if(layoutDirection !=0)
            HomeToast.lDirection2 = layoutDirection;
        else
            HomeToast.lDirection2 = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection2 = textDirection;
        else
            HomeToast.tDirection2 = TEXT_DIRECTION_LTR;
        if(toastDuration !=0)
            HomeToast.toastDurationIn = toastDuration;
        if(toastTextColor !=0)
            HomeToast.toastTextColorIn = toastTextColor;
        if(gravity !=0)
            HomeToast.gravityIn = gravity;
        if(xOffset !=0)
            HomeToast.xOffsetIn = xOffset;
        if(yOffset !=0)
            HomeToast.yOffsetIn = yOffset;
        if(backgroundDrawable != null)
            HomeToast.bgDrawable = backgroundDrawable;
    }
    public HomeToast(@NonNull Activity activity, int layoutDirection, int textDirection,  int toastDuration, int toastTextColor, int gravity, int xOffset, int yOffset, Drawable backgroundDrawable, Drawable iconBackgroundDrawable) {
        HomeToast.act = activity;
        if(layoutDirection !=0)
            HomeToast.lDirection2 = layoutDirection;
        else
            HomeToast.lDirection2 = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection2 = textDirection;
        else
            HomeToast.tDirection2 = TEXT_DIRECTION_LTR;
        if(toastDuration !=0)
            HomeToast.toastDurationIn = toastDuration;
        if(toastTextColor !=0)
            HomeToast.toastTextColorIn = toastTextColor;
        if(gravity !=0)
            HomeToast.gravityIn = gravity;
        if(xOffset !=0)
            HomeToast.xOffsetIn = xOffset;
        if(yOffset !=0)
            HomeToast.yOffsetIn = yOffset;
        if(backgroundDrawable != null)
            HomeToast.bgDrawable = backgroundDrawable;
        if(iconBackgroundDrawable != null)
            HomeToast.iconBgDrawable = iconBackgroundDrawable;
    }
    public HomeToast(@NonNull Activity activity, int layoutDirection, int textDirection,  int toastDuration, int toastTextColor, int gravity, int xOffset, int yOffset, Drawable backgroundDrawable, Drawable iconBackgroundDrawable, Drawable iconImageDrawable) {
        HomeToast.act = activity;
        if(layoutDirection !=0)
            HomeToast.lDirection2 = layoutDirection;
        else
            HomeToast.lDirection2 = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection2 = textDirection;
        else
            HomeToast.tDirection2 = TEXT_DIRECTION_LTR;
        if(toastDuration !=0)
            HomeToast.toastDurationIn = toastDuration;
        if(toastTextColor !=0)
            HomeToast.toastTextColorIn = toastTextColor;
        if(gravity !=0)
            HomeToast.gravityIn = gravity;
        if(xOffset !=0)
            HomeToast.xOffsetIn = xOffset;
        if(yOffset !=0)
            HomeToast.yOffsetIn = yOffset;
        if(backgroundDrawable != null)
            HomeToast.bgDrawable = backgroundDrawable;
        if(iconBackgroundDrawable != null)
            HomeToast.iconBgDrawable = iconBackgroundDrawable;
        if(iconImageDrawable != null)
            HomeToast.iconDrawable = iconImageDrawable;
    }
    public HomeToast(@NonNull Activity activity, int layoutDirection, int textDirection,  int toastDuration, int toastTextColor, int gravity, int xOffset, int yOffset, Drawable backgroundDrawable, Drawable iconBackgroundDrawable, Drawable iconImageDrawable, int shadowColor) {
        HomeToast.act = activity;
        if(layoutDirection !=0)
            HomeToast.lDirection2 = layoutDirection;
        else
            HomeToast.lDirection2 = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection2 = textDirection;
        else
            HomeToast.tDirection2 = TEXT_DIRECTION_LTR;
        if(toastDuration !=0)
            HomeToast.toastDurationIn = toastDuration;
        if(toastTextColor !=0)
            HomeToast.toastTextColorIn = toastTextColor;
        if(gravity !=0)
            HomeToast.gravityIn = gravity;
        if(xOffset !=0)
            HomeToast.xOffsetIn = xOffset;
        if(yOffset !=0)
            HomeToast.yOffsetIn = yOffset;
        if(backgroundDrawable != null)
            HomeToast.bgDrawable = backgroundDrawable;
        if(iconBackgroundDrawable != null)
            HomeToast.iconBgDrawable = iconBackgroundDrawable;
        if(iconImageDrawable != null)
            HomeToast.iconDrawable = iconImageDrawable;
        if(shadowColor !=0)
            HomeToast.shadow = shadowColor;
    }
    public HomeToast(@NonNull Activity activity, int layoutDirection, int textDirection,  int toastDuration, int toastTextColor, int gravity, int xOffset, int yOffset, Drawable backgroundDrawable, Drawable iconBackgroundDrawable, Drawable iconImageDrawable, int shadowColor, int iconColor) {
        HomeToast.act = activity;
        if(layoutDirection !=0)
            HomeToast.lDirection2 = layoutDirection;
        else
            HomeToast.lDirection2 = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection2 = textDirection;
        else
            HomeToast.tDirection2 = TEXT_DIRECTION_LTR;
        if(toastDuration !=0)
        HomeToast.toastDurationIn = toastDuration;
        if(toastTextColor !=0)
        HomeToast.toastTextColorIn = toastTextColor;
        if(gravity !=0)
        HomeToast.gravityIn = gravity;
        if(xOffset !=0)
        HomeToast.xOffsetIn = xOffset;
        if(yOffset !=0)
        HomeToast.yOffsetIn = yOffset;
        if(backgroundDrawable != null)
        HomeToast.bgDrawable = backgroundDrawable;
        if(iconBackgroundDrawable != null)
        HomeToast.iconBgDrawable = iconBackgroundDrawable;
        if(iconImageDrawable != null)
        HomeToast.iconDrawable = iconImageDrawable;
        if(shadowColor !=0)
        HomeToast.shadow = shadowColor;
        if(iconColor !=0)
        HomeToast.iconC = iconColor;
    }


    public void showSuccess(@NonNull String message) {
        toastMessageIn = message;
        viewToast_s(1);
    }

    public static void showSuccess(@NonNull Activity activity, @NonNull String message) {
        toastMessageIn = message;
        act = activity;
        lDirection = LAYOUT_DIRECTION_LTR;
        tDirection = TEXT_DIRECTION_LTR;

        viewToast(1);
    }

    public static void showSuccess(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection) {
        toastMessageIn = message;
        act = activity;
        tDirection = TEXT_DIRECTION_LTR;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        viewToast(1);
    }

    public static void showSuccess(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection , @Nullable int  textDirection) {
        toastMessageIn = message;
        act = activity;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        if (textDirection != 0)
            tDirection = textDirection;
        viewToast(1);
    }

    public static void showSuccess(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection , @Nullable int  textDirection
            , @Nullable int textColor) {
        toastMessageIn = message;
        act = activity;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection = textDirection;
        else
            HomeToast.tDirection = TEXT_DIRECTION_LTR;
        if (textColor != 0)
            toastTextColorIn = textColor;
        viewToast(1);
    }

    public static void showSuccess(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection , @Nullable int  textDirection
            , @Nullable int textColor, @Nullable int durationInMilliSec) {
        toastMessageIn = message;
        act = activity;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection = textDirection;
        else
            HomeToast.tDirection = TEXT_DIRECTION_LTR;
        if (textColor != 0)
            toastTextColorIn = textColor;
        if (durationInMilliSec != 0)
            toastDurationIn = durationInMilliSec;
        viewToast(1);
    }


    public void showError( @NonNull String message) {
        toastMessageIn = message;
        viewToast_s(2);
    }
    public static void showError(@NonNull Activity activity, @NonNull String message) {
        toastMessageIn = message;
        act = activity;
        lDirection = LAYOUT_DIRECTION_LTR;
        tDirection = TEXT_DIRECTION_LTR;
        viewToast(2);
    }

    public static void showError(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection) {
        toastMessageIn = message;
        act = activity;
        tDirection = TEXT_DIRECTION_LTR;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        viewToast(2);
    }

    public static void showError(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection , @Nullable int  textDirection) {
        toastMessageIn = message;
        act = activity;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        if (textDirection != 0)
            tDirection = textDirection;
        viewToast(2);
    }


    public static void showError(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection , @Nullable int  textDirection
            , @Nullable int textColor) {
        toastMessageIn = message;
        act = activity;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection = textDirection;
        else
            HomeToast.tDirection = TEXT_DIRECTION_LTR;
        if (textColor != 0)
            toastTextColorIn = textColor;
        viewToast(2);
    }

    public static void showError(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection , @Nullable int  textDirection
            , @Nullable int textColor, @Nullable int durationInMilliSec) {
        toastMessageIn = message;
        act = activity;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection = textDirection;
        else
            HomeToast.tDirection = TEXT_DIRECTION_LTR;
        if (textColor != 0)
            toastTextColorIn = textColor;
        if (durationInMilliSec != 0)
            toastDurationIn = durationInMilliSec;
        viewToast(2);
    }

    public void showWarning( @NonNull String message) {
        toastMessageIn = message;
        viewToast_s(3);
    }
    public static void showWarning(@NonNull Activity activity, @NonNull String message) {
        toastMessageIn = message;
        act = activity;
        lDirection = LAYOUT_DIRECTION_LTR;
        tDirection = TEXT_DIRECTION_LTR;
        viewToast(3);
    }

    public static void showWarning(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection) {
        toastMessageIn = message;
        act = activity;
        tDirection = TEXT_DIRECTION_LTR;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        viewToast(3);
    }

    public static void showWarning(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection , @Nullable int  textDirection) {
        toastMessageIn = message;
        act = activity;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection = textDirection;
        else
            HomeToast.tDirection = TEXT_DIRECTION_LTR;
        viewToast(3);
    }

    public static void showWarning(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection , @Nullable int  textDirection
            , @Nullable int textColor) {
        toastMessageIn = message;
        act = activity;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection = textDirection;
        else
            HomeToast.tDirection = TEXT_DIRECTION_LTR;
        if (textColor != 0)
            toastTextColorIn = textColor;
        viewToast(3);
    }

    public static void showWarning(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection , @Nullable int  textDirection
            , @Nullable int textColor, @Nullable int durationInMilliSec) {
        toastMessageIn = message;
        act = activity;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection = textDirection;
        else
            HomeToast.tDirection = TEXT_DIRECTION_LTR;
        if (textColor != 0)
            toastTextColorIn = textColor;
        if (durationInMilliSec != 0)
            toastDurationIn = durationInMilliSec;
        viewToast(3);
    }

    public void showInformation( @NonNull String message) {
        toastMessageIn = message;
        viewToast_s(4);
    }
    public static void showInformation(@NonNull Activity activity, @NonNull String message) {
        toastMessageIn = message;
        act = activity;
        lDirection = LAYOUT_DIRECTION_LTR;
        tDirection = TEXT_DIRECTION_LTR;
        viewToast(4);
    }
    public static void showInformation(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection) {
        toastMessageIn = message;
        act = activity;
        tDirection = TEXT_DIRECTION_LTR;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        viewToast(4);
    }

    public static void showInformation(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection , @Nullable int  textDirection) {
        toastMessageIn = message;
        act = activity;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection = textDirection;
        else
            HomeToast.tDirection = TEXT_DIRECTION_LTR;
        viewToast(4);
    }
    public static void showInformation(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection , @Nullable int  textDirection
            , @Nullable int textColor) {
        toastMessageIn = message;
        act = activity;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection = textDirection;
        else
            HomeToast.tDirection = TEXT_DIRECTION_LTR;
        if (textColor != 0)
            toastTextColorIn = textColor;
        viewToast(4);
    }

    public static void showInformation(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection , @Nullable int  textDirection
            , @Nullable int textColor, @Nullable int durationInMilliSec) {
        toastMessageIn = message;
        act = activity;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection = textDirection;
        else
            HomeToast.tDirection = TEXT_DIRECTION_LTR;
        if (textColor != 0)
            toastTextColorIn = textColor;
        if (durationInMilliSec != 0)
            toastDurationIn = durationInMilliSec;
        viewToast(4);
    }

    public void show( @NonNull String message) {
        toastMessageIn = message;
        viewToast_s(0);
    }
    public static void show(@NonNull Activity activity, @NonNull String message) {
        toastMessageIn = message;
        act = activity;
        lDirection = LAYOUT_DIRECTION_LTR;
        tDirection = TEXT_DIRECTION_LTR;
        viewToast(0);
    }
    public static void show(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection) {
        toastMessageIn = message;
        act = activity;
        tDirection = TEXT_DIRECTION_LTR;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        viewToast(0);
    }

    public static void show(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection , @Nullable int  textDirection) {
        toastMessageIn = message;
        act = activity;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection = textDirection;
        else
            HomeToast.tDirection = TEXT_DIRECTION_LTR;
        viewToast(0);
    }

    public static void show(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection , @Nullable int  textDirection, @Nullable int textColor
    ) {
        toastMessageIn = message;
        act = activity;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection = textDirection;
        else
            HomeToast.tDirection = TEXT_DIRECTION_LTR;
        if (textColor != 0)
            toastTextColorIn = textColor;
        bgDrawable = act.getDrawable(R.drawable.bg_default);
        iconBgDrawable = act.getDrawable(R.drawable.bg_default_icon);
        iconDrawable = act.getDrawable(R.drawable.info);
        viewToast(0);
    }

    public static void show(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection , @Nullable int  textDirection, @Nullable int textColor
            , @Nullable int durationInMilliSec) {
        toastMessageIn = message;
        act = activity;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection = textDirection;
        else
            HomeToast.tDirection = TEXT_DIRECTION_LTR;
        if (textColor != 0)
            toastTextColorIn = textColor;
        if (durationInMilliSec != 0)
            toastDurationIn = durationInMilliSec;
        bgDrawable = act.getDrawable(R.drawable.bg_default);
        iconBgDrawable = act.getDrawable(R.drawable.bg_default_icon);
        iconDrawable = act.getDrawable(R.drawable.info);

        viewToast(0);
    }

    public static void show(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection , @Nullable int  textDirection, @Nullable int textColor
            , @Nullable int durationInMilliSec
            , @Nullable Drawable backgroundDrawable) {
        toastMessageIn = message;
        act = activity;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection = textDirection;
        else
            HomeToast.tDirection = TEXT_DIRECTION_LTR;
        if (textColor != 0)
            toastTextColorIn = textColor;
        if (durationInMilliSec != 0)
            toastDurationIn = durationInMilliSec;
        if (backgroundDrawable != null)
            bgDrawable = backgroundDrawable;
        else
            bgDrawable = act.getDrawable(R.drawable.bg_default);

        iconBgDrawable = act.getDrawable(R.drawable.bg_default_icon);
        iconDrawable = act.getDrawable(R.drawable.info);
        viewToast(0);
    }

    public static void show(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection , @Nullable int  textDirection, @Nullable int textColor
            , @Nullable int durationInMilliSec
            , @Nullable Drawable backgroundDrawable, @Nullable Drawable iconBackgroundDrawable) {
        toastMessageIn = message;
        act = activity;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection = textDirection;
        else
            HomeToast.tDirection = TEXT_DIRECTION_LTR;
        if (textColor != 0)
            toastTextColorIn = textColor;
        if (durationInMilliSec != 0)
            toastDurationIn = durationInMilliSec;
        if (backgroundDrawable != null)
            bgDrawable = backgroundDrawable;
        else
            bgDrawable = act.getDrawable(R.drawable.bg_default);
        if (iconBackgroundDrawable != null)
            iconBgDrawable = iconBackgroundDrawable;
        else
            iconBgDrawable = act.getDrawable(R.drawable.bg_default_icon);
        iconDrawable = act.getDrawable(R.drawable.info);
        viewToast(0);
    }

    public static void show(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection , @Nullable int  textDirection, @Nullable int textColor
            , @Nullable int durationInMilliSec
            , @Nullable Drawable backgroundDrawable, @Nullable Drawable iconBackgroundDrawable
            , @Nullable Drawable iconImage) {
        toastMessageIn = message;
        act = activity;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection = textDirection;
        else
            HomeToast.tDirection = TEXT_DIRECTION_LTR;
        if (textColor != 0)
            toastTextColorIn = textColor;
        if (durationInMilliSec != 0)
            toastDurationIn = durationInMilliSec;
        if (backgroundDrawable != null)
            bgDrawable = backgroundDrawable;
        else
            bgDrawable = act.getDrawable(R.drawable.bg_default);
        if (iconBackgroundDrawable != null)
            iconBgDrawable = iconBackgroundDrawable;
        else
            iconBgDrawable = act.getDrawable(R.drawable.bg_default_icon);
        if (iconImage != null)
            iconDrawable = iconImage;
        else
            iconDrawable = act.getDrawable(R.drawable.info);
        viewToast(0);
    }

    public static void show(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection , @Nullable int  textDirection, @Nullable int textColor
            , @Nullable int durationInMilliSec
            , @Nullable Drawable backgroundDrawable, @Nullable Drawable iconBackgroundDrawable
            , @Nullable Drawable iconImage, @Nullable int iconColor) {
        toastMessageIn = message;
        act = activity;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection = textDirection;
        else
            HomeToast.tDirection = TEXT_DIRECTION_LTR;
        if (textColor != 0)
            toastTextColorIn = textColor;
        if (durationInMilliSec != 0)
            toastDurationIn = durationInMilliSec;
        if (backgroundDrawable != null)
            bgDrawable = backgroundDrawable;
        else
            bgDrawable = act.getDrawable(R.drawable.bg_default);
        if (iconBackgroundDrawable != null)
            iconBgDrawable = iconBackgroundDrawable;
        else
            iconBgDrawable = act.getDrawable(R.drawable.bg_default_icon);
        if (iconImage != null)
            iconDrawable = iconImage;
        else
            iconDrawable = act.getDrawable(R.drawable.info);
        if (iconColor != 0)
            iconC = iconColor;
        viewToast(0);
    }

    public static void show(@NonNull Activity activity, @NonNull String message
            , @Nullable int layoutDirection , @Nullable int  textDirection, @Nullable int textColor
            , @Nullable int durationInMilliSec
            , @Nullable Drawable backgroundDrawable, @Nullable Drawable iconBackgroundDrawable
            , @Nullable Drawable iconImage, @Nullable int iconColor, @Nullable int shadowColor) {
        toastMessageIn = message;
        act = activity;
        if (layoutDirection != 0)
            lDirection = layoutDirection;
        else
            HomeToast.lDirection = LAYOUT_DIRECTION_LTR;
        if(textDirection !=0)
            HomeToast.tDirection = textDirection;
        else
            HomeToast.tDirection = TEXT_DIRECTION_LTR;
        if (textColor != 0)
            toastTextColorIn = textColor;
        if (durationInMilliSec != 0)
            toastDurationIn = durationInMilliSec;
        if (backgroundDrawable != null)
            bgDrawable = backgroundDrawable;
        else
            bgDrawable = act.getDrawable(R.drawable.bg_default);
        if (iconBackgroundDrawable != null)
            iconBgDrawable = iconBackgroundDrawable;
        else
            iconBgDrawable = act.getDrawable(R.drawable.bg_default_icon);
        if (iconImage != null)
            iconDrawable = iconImage;
        else
            iconDrawable = act.getDrawable(R.drawable.info);
        if (iconColor != 0)
            iconC = iconColor;
        if (shadowColor != 0)
            shadow = shadowColor;
        viewToast(0);
    }


    @SuppressLint("UseCompatLoadingForDrawables")
    private static void viewToast(int iStatus) {
        View layout;
        TextView text;
        ImageView img, imgClose;
        layoutInflater = act.getLayoutInflater();
        layout = layoutInflater.inflate(R.layout.activity_toast,
                (ViewGroup) act.findViewById(R.id.toast_layout_root));

        layout.setLayoutDirection(lDirection);
        layout.setTextDirection(tDirection);
        relbg = layout.findViewById(R.id.toast_layout_root);
        img = layout.findViewById(R.id.img_symbol);
        imgClose = layout.findViewById(R.id.img_close);
        text = (TextView) layout.findViewById(R.id.text);
        toastTextColorIn = 0xff353c47;
        switch (iStatus) {
            case 1:
                relbg.setBackgroundDrawable(act.getDrawable(R.drawable.bg_success));
                relbg.setElevationShadowColor(act.getColor(R.color.success));
                img.setBackground(act.getDrawable(R.drawable.bg_success_icon));
                img.setImageDrawable(act.getDrawable(R.drawable.check));
                img.setColorFilter(act.getColor(R.color.white));
                break;
            case 2:
                relbg.setBackgroundDrawable(act.getDrawable(R.drawable.bg_error));
                relbg.setElevationShadowColor(act.getColor(R.color.error));
                img.setBackground(act.getDrawable(R.drawable.bg_error_icon));
                img.setImageDrawable(act.getDrawable(R.drawable.close));
                img.setColorFilter(act.getColor(R.color.white));
                break;
            case 3:
                relbg.setBackgroundDrawable(act.getDrawable(R.drawable.bg_warning));
                relbg.setElevationShadowColor(act.getColor(R.color.warning));
                img.setBackground(act.getDrawable(R.drawable.bg_warning_icon));
                img.setImageDrawable(act.getDrawable(R.drawable.warning));
                img.setColorFilter(act.getColor(R.color.white));
                break;
            case 4:
                relbg.setBackgroundDrawable(act.getDrawable(R.drawable.bg_info));
                relbg.setElevationShadowColor(act.getColor(R.color.information));
                img.setBackground(act.getDrawable(R.drawable.bg_information_icon));
                img.setImageDrawable(act.getDrawable(R.drawable.info));
                img.setColorFilter(act.getColor(R.color.white));
                break;
            default:
                if (bgDrawable == null)
                    bgDrawable = act.getDrawable(R.drawable.bg_default);
                if (iconBgDrawable == null)
                    img.setVisibility(View.GONE);
                else
                    img.setBackground(iconBgDrawable);
                    //iconBgDrawable = act.getDrawable(R.drawable.bg_default_icon);
                if (iconDrawable == null)
                    img.setVisibility(View.GONE);
                else
                    img.setImageDrawable(iconDrawable);
                    //iconDrawable = act.getDrawable(R.drawable.info);
                toastTextColorIn = 0xffffffff;
                relbg.setBackgroundDrawable(bgDrawable);
                relbg.setElevationShadowColor(shadow);
                img.setColorFilter(iconC);
        }

        text.setText(toastMessageIn);
        if (toastTextColorIn != 0)
            text.setTextColor(toastTextColorIn);

        Toast toast = new Toast(act);
        toast.setGravity(gravityIn, xOffsetIn, yOffsetIn);
        toast.setDuration(toastDurationIn);
        toast.setView(layout);
        toast.show();
        imgClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.cancel();
            }
        });
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private void viewToast_s(int iStatus) {
        View layout;
        TextView text;
        ImageView img, imgClose;
        layoutInflater = act.getLayoutInflater();
        layout = layoutInflater.inflate(R.layout.activity_toast,
                (ViewGroup) act.findViewById(R.id.toast_layout_root));

        layout.setLayoutDirection(lDirection2);
        layout.setTextDirection(tDirection2);
        relbg = layout.findViewById(R.id.toast_layout_root);
        img = layout.findViewById(R.id.img_symbol);
        imgClose = layout.findViewById(R.id.img_close);
        text = (TextView) layout.findViewById(R.id.text);
        toastTextColorIn = 0xff353c47;
        switch (iStatus) {
            case 1:
                relbg.setBackgroundDrawable(act.getDrawable(R.drawable.bg_success));
                relbg.setElevationShadowColor(act.getColor(R.color.success));
                img.setBackground(act.getDrawable(R.drawable.bg_success_icon));
                img.setImageDrawable(act.getDrawable(R.drawable.check));
                img.setColorFilter(act.getColor(R.color.white));
                break;
            case 2:
                relbg.setBackgroundDrawable(act.getDrawable(R.drawable.bg_error));
                relbg.setElevationShadowColor(act.getColor(R.color.error));
                img.setBackground(act.getDrawable(R.drawable.bg_error_icon));
                img.setImageDrawable(act.getDrawable(R.drawable.close));
                img.setColorFilter(act.getColor(R.color.white));
                break;
            case 3:
                relbg.setBackgroundDrawable(act.getDrawable(R.drawable.bg_warning));
                relbg.setElevationShadowColor(act.getColor(R.color.warning));
                img.setBackground(act.getDrawable(R.drawable.bg_warning_icon));
                img.setImageDrawable(act.getDrawable(R.drawable.warning));
                img.setColorFilter(act.getColor(R.color.white));
                break;
            case 4:
                relbg.setBackgroundDrawable(act.getDrawable(R.drawable.bg_info));
                relbg.setElevationShadowColor(act.getColor(R.color.information));
                img.setBackground(act.getDrawable(R.drawable.bg_information_icon));
                img.setImageDrawable(act.getDrawable(R.drawable.info));
                img.setColorFilter(act.getColor(R.color.white));
                break;
            default:
                if (bgDrawable == null)
                    bgDrawable = act.getDrawable(R.drawable.bg_default);
                if (iconBgDrawable == null)
                    iconBgDrawable = act.getDrawable(R.drawable.bg_default_icon);
                if (iconDrawable == null)
                    iconDrawable = act.getDrawable(R.drawable.info);
                toastTextColorIn = 0xffffffff;
                relbg.setBackgroundDrawable(bgDrawable);
                relbg.setElevationShadowColor(shadow);
                img.setBackground(iconBgDrawable);
                img.setImageDrawable(iconDrawable);
                img.setColorFilter(iconC);
        }

        text.setText(toastMessageIn);
        if (toastTextColorIn != 0)
            text.setTextColor(toastTextColorIn);

        Toast toast = new Toast(act);
        toast.setGravity(gravityIn, xOffsetIn, yOffsetIn);
        toast.setDuration(toastDurationIn);
        toast.setView(layout);
        toast.show();
        imgClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.cancel();
            }
        });
    }
}