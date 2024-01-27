package com.google.firebase.concurrent;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ CustomThreadFactory f13812h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Runnable f13813i;

    public /* synthetic */ a(CustomThreadFactory customThreadFactory, Runnable runnable) {
        this.f13812h = customThreadFactory;
        this.f13813i = runnable;
    }

    public final void run() {
        this.f13812h.lambda$newThread$0(this.f13813i);
    }
}
