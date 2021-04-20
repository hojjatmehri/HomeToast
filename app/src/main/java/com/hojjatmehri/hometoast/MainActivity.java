package com.hojjatmehri.hometoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HomeToast.show(this,"Simple");
        HomeToast.showSuccess(this,"Success");
        HomeToast.showError(this,"Error");
        HomeToast.showWarning(this,"Warning");
        HomeToast.showInformation(this,"Information");
    }
}