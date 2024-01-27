package com.facebook.appevents.codeless;

import com.facebook.appevents.codeless.ViewIndexingTrigger;
import com.facebook.internal.FetchedAppSettings;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements ViewIndexingTrigger.OnShakeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FetchedAppSettings f5957a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f5958b;

    public /* synthetic */ b(FetchedAppSettings fetchedAppSettings, String str) {
        this.f5957a = fetchedAppSettings;
        this.f5958b = str;
    }

    public final void onShake() {
        CodelessManager.m49onActivityResumed$lambda0(this.f5957a, this.f5958b);
    }
}
