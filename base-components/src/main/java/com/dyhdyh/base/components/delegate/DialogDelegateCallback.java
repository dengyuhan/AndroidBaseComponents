package com.dyhdyh.base.components.delegate;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.View;

/**
 * @author dengyuhan
 * created 2019/3/15 17:53
 */
public interface DialogDelegateCallback {

    @NonNull
    Dialog get();

    @NonNull
    DialogDelegate delegate();

    void onBeforeViews();

    @LayoutRes
    int getLayoutId();

    void onAfterViews();

    void setSize(float widthScale, float heightScale);

    View getView();

    Context getRawContext();
}
