package com.facebook.share.internal;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements CallbackManagerImpl.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6157a;

    public /* synthetic */ a(int i10) {
        this.f6157a = i10;
    }

    public final boolean onActivityResult(int i10, Intent intent) {
        return ShareInternalUtility.m156registerStaticShareCallback$lambda0(this.f6157a, i10, intent);
    }
}
