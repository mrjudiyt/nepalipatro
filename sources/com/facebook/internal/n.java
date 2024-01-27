package com.facebook.internal;

import android.graphics.Bitmap;
import com.facebook.internal.ImageRequest;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ImageRequest f6079h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Exception f6080i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f6081j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Bitmap f6082k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ ImageRequest.Callback f6083l;

    public /* synthetic */ n(ImageRequest imageRequest, Exception exc, boolean z10, Bitmap bitmap, ImageRequest.Callback callback) {
        this.f6079h = imageRequest;
        this.f6080i = exc;
        this.f6081j = z10;
        this.f6082k = bitmap;
        this.f6083l = callback;
    }

    public final void run() {
        ImageDownloader.m102issueResponse$lambda4(this.f6079h, this.f6080i, this.f6081j, this.f6082k, this.f6083l);
    }
}
