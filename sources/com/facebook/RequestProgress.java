package com.facebook;

import android.os.Handler;
import com.facebook.GraphRequest;
import kotlin.jvm.internal.m;

/* compiled from: RequestProgress.kt */
public final class RequestProgress {
    private final Handler callbackHandler;
    private long lastReportedProgress;
    private long maxProgress;
    private long progress;
    private final GraphRequest request;
    private final long threshold = FacebookSdk.getOnProgressThreshold();

    public RequestProgress(Handler handler, GraphRequest graphRequest) {
        m.f(graphRequest, "request");
        this.callbackHandler = handler;
        this.request = graphRequest;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
    }

    /* access modifiers changed from: private */
    /* renamed from: reportProgress$lambda-0  reason: not valid java name */
    public static final void m20reportProgress$lambda0(GraphRequest.Callback callback, long j10, long j11) {
        ((GraphRequest.OnProgressCallback) callback).onProgress(j10, j11);
    }

    public final void addProgress(long j10) {
        long j11 = this.progress + j10;
        this.progress = j11;
        if (j11 >= this.lastReportedProgress + this.threshold || j11 >= this.maxProgress) {
            reportProgress();
        }
    }

    public final void addToMax(long j10) {
        this.maxProgress += j10;
    }

    public final long getMaxProgress() {
        return this.maxProgress;
    }

    public final long getProgress() {
        return this.progress;
    }

    public final void reportProgress() {
        if (this.progress > this.lastReportedProgress) {
            GraphRequest.Callback callback = this.request.getCallback();
            long j10 = this.maxProgress;
            if (j10 > 0 && (callback instanceof GraphRequest.OnProgressCallback)) {
                long j11 = this.progress;
                Handler handler = this.callbackHandler;
                if ((handler == null ? null : Boolean.valueOf(handler.post(new u(callback, j11, j10)))) == null) {
                    ((GraphRequest.OnProgressCallback) callback).onProgress(j11, j10);
                }
                this.lastReportedProgress = this.progress;
            }
        }
    }
}
