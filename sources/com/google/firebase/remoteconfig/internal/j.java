package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.common.util.BiConsumer;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ BiConsumer f14028h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f14029i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ConfigContainer f14030j;

    public /* synthetic */ j(BiConsumer biConsumer, String str, ConfigContainer configContainer) {
        this.f14028h = biConsumer;
        this.f14029i = str;
        this.f14030j = configContainer;
    }

    public final void run() {
        this.f14028h.accept(this.f14029i, this.f14030j);
    }
}
