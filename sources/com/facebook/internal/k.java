package com.facebook.internal;

import java.io.File;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ File[] f6076h;

    public /* synthetic */ k(File[] fileArr) {
        this.f6076h = fileArr;
    }

    public final void run() {
        FileLruCache.m98clearCache$lambda1(this.f6076h);
    }
}
