package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.m;

/* compiled from: ProgressNoopOutputStream.kt */
public final class ProgressNoopOutputStream extends OutputStream implements RequestOutputStream {
    private final Handler callbackHandler;
    private GraphRequest currentRequest;
    private RequestProgress currentRequestProgress;
    private int maxProgress;
    private final Map<GraphRequest, RequestProgress> progressMap = new HashMap();

    public ProgressNoopOutputStream(Handler handler) {
        this.callbackHandler = handler;
    }

    public final void addProgress(long j10) {
        GraphRequest graphRequest = this.currentRequest;
        if (graphRequest != null) {
            if (this.currentRequestProgress == null) {
                RequestProgress requestProgress = new RequestProgress(this.callbackHandler, graphRequest);
                this.currentRequestProgress = requestProgress;
                this.progressMap.put(graphRequest, requestProgress);
            }
            RequestProgress requestProgress2 = this.currentRequestProgress;
            if (requestProgress2 != null) {
                requestProgress2.addToMax(j10);
            }
            this.maxProgress += (int) j10;
        }
    }

    public final int getMaxProgress() {
        return this.maxProgress;
    }

    public final Map<GraphRequest, RequestProgress> getProgressMap() {
        return this.progressMap;
    }

    public void setCurrentRequest(GraphRequest graphRequest) {
        this.currentRequest = graphRequest;
        this.currentRequestProgress = graphRequest != null ? this.progressMap.get(graphRequest) : null;
    }

    public void write(byte[] bArr) {
        m.f(bArr, "buffer");
        addProgress((long) bArr.length);
    }

    public void write(byte[] bArr, int i10, int i11) {
        m.f(bArr, "buffer");
        addProgress((long) i11);
    }

    public void write(int i10) {
        addProgress(1);
    }
}
