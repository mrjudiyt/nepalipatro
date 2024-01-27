package com.facebook.appevents;

import android.content.Context;
import com.facebook.appevents.AppEventsLoggerImpl;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Context f5973h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ AppEventsLoggerImpl f5974i;

    public /* synthetic */ i(Context context, AppEventsLoggerImpl appEventsLoggerImpl) {
        this.f5973h = context;
        this.f5974i = appEventsLoggerImpl;
    }

    public final void run() {
        AppEventsLoggerImpl.Companion.m31initializeLib$lambda4(this.f5973h, this.f5974i);
    }
}
