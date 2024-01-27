package com.facebook;

import com.facebook.internal.FeatureManager;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements FeatureManager.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f6055a;

    public /* synthetic */ f(String str) {
        this.f6055a = str;
    }

    public final void onCompleted(boolean z10) {
        FacebookException.m5_init_$lambda0(this.f6055a, z10);
    }
}
