package com.facebook;

import com.facebook.GraphRequestBatch;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ GraphRequestBatch.Callback f6160h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ProgressOutputStream f6161i;

    public /* synthetic */ t(GraphRequestBatch.Callback callback, ProgressOutputStream progressOutputStream) {
        this.f6160h = callback;
        this.f6161i = progressOutputStream;
    }

    public final void run() {
        ProgressOutputStream.m19reportBatchProgress$lambda0(this.f6160h, this.f6161i);
    }
}
