package com.facebook.share.internal;

import android.content.Intent;
import com.facebook.FacebookCallback;
import com.facebook.internal.CallbackManagerImpl;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements CallbackManagerImpl.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6158a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FacebookCallback f6159b;

    public /* synthetic */ b(int i10, FacebookCallback facebookCallback) {
        this.f6158a = i10;
        this.f6159b = facebookCallback;
    }

    public final boolean onActivityResult(int i10, Intent intent) {
        return ShareInternalUtility.m155registerSharerCallback$lambda1(this.f6158a, this.f6159b, i10, intent);
    }
}
