package com.hojjatmehri.hometoast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {

    LayoutInflater inflater;
    View layout;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        inflater = getLayoutInflater();
        layout = inflater.inflate(R.layout.activity_toast,
                (ViewGroup) findViewById(R.id.toast_layout_root));

        text = (TextView) layout.findViewById(R.id.text);

    }
    public void show(@NonNull String toastText,@Nullable int toastTextColor){
        text.setText(toastText);
        if(toastTextColor != 0)
        text.setTextColor(toastTextColor);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
}