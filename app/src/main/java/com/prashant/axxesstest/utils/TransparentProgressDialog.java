package com.prashant.axxesstest.utils;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;

import com.prashant.axxesstest.R;


public class TransparentProgressDialog extends Dialog {

    public TransparentProgressDialog(Context context) {
        super(context, R.style.NewDialog);

        WindowManager.LayoutParams wlmp = getWindow().getAttributes();

        wlmp.gravity = Gravity.CENTER_HORIZONTAL;
        getWindow().setAttributes(wlmp);
        setTitle(null);
        setCancelable(true);
        setOnCancelListener(null);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_dialog, null);
        setContentView(view);
    }
}