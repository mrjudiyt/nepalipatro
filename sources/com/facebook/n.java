package com.facebook;

import com.facebook.FacebookSdk;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FacebookSdk.InitializeCallback f6150a;

    public /* synthetic */ n(FacebookSdk.InitializeCallback initializeCallback) {
        this.f6150a = initializeCallback;
    }

    public final Object call() {
        return FacebookSdk.m14sdkInitialize$lambda9(this.f6150a);
    }
}
