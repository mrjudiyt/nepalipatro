package com.facebook.appevents.codeless;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f5963h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ViewIndexer f5964i;

    public /* synthetic */ f(String str, ViewIndexer viewIndexer) {
        this.f5963h = str;
        this.f5964i = viewIndexer;
    }

    public final void run() {
        ViewIndexer.m52sendToServer$lambda1(this.f5963h, this.f5964i);
    }
}
