package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ImageDownload f13982h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13983i;

    public /* synthetic */ w(ImageDownload imageDownload, TaskCompletionSource taskCompletionSource) {
        this.f13982h = imageDownload;
        this.f13983i = taskCompletionSource;
    }

    public final void run() {
        this.f13982h.lambda$start$0(this.f13983i);
    }
}
