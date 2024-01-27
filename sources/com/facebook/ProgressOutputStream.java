package com.facebook;

import android.os.Handler;
import com.facebook.GraphRequestBatch;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Map;
import kotlin.jvm.internal.m;

/* compiled from: ProgressOutputStream.kt */
public final class ProgressOutputStream extends FilterOutputStream implements RequestOutputStream {
    private long batchProgress;
    private RequestProgress currentRequestProgress;
    private long lastReportedProgress;
    private final long maxProgress;
    private final Map<GraphRequest, RequestProgress> progressMap;
    private final GraphRequestBatch requests;
    private final long threshold = FacebookSdk.getOnProgressThreshold();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressOutputStream(OutputStream outputStream, GraphRequestBatch graphRequestBatch, Map<GraphRequest, RequestProgress> map, long j10) {
        super(outputStream);
        m.f(outputStream, "out");
        m.f(graphRequestBatch, "requests");
        m.f(map, "progressMap");
        this.requests = graphRequestBatch;
        this.progressMap = map;
        this.maxProgress = j10;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
    }

    private final void addProgress(long j10) {
        RequestProgress requestProgress = this.currentRequestProgress;
        if (requestProgress != null) {
            requestProgress.addProgress(j10);
        }
        long j11 = this.batchProgress + j10;
        this.batchProgress = j11;
        if (j11 >= this.lastReportedProgress + this.threshold || j11 >= this.maxProgress) {
            reportBatchProgress();
        }
    }

    private final void reportBatchProgress() {
        if (this.batchProgress > this.lastReportedProgress) {
            for (GraphRequestBatch.Callback next : this.requests.getCallbacks()) {
                if (next instanceof GraphRequestBatch.OnProgressCallback) {
                    Handler callbackHandler = this.requests.getCallbackHandler();
                    if ((callbackHandler == null ? null : Boolean.valueOf(callbackHandler.post(new t(next, this)))) == null) {
                        ((GraphRequestBatch.OnProgressCallback) next).onBatchProgress(this.requests, this.batchProgress, this.maxProgress);
                    }
                }
            }
            this.lastReportedProgress = this.batchProgress;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: reportBatchProgress$lambda-0  reason: not valid java name */
    public static final void m19reportBatchProgress$lambda0(GraphRequestBatch.Callback callback, ProgressOutputStream progressOutputStream) {
        m.f(callback, "$callback");
        m.f(progressOutputStream, "this$0");
        ((GraphRequestBatch.OnProgressCallback) callback).onBatchProgress(progressOutputStream.requests, progressOutputStream.getBatchProgress(), progressOutputStream.getMaxProgress());
    }

    public void close() {
        super.close();
        for (RequestProgress reportProgress : this.progressMap.values()) {
            reportProgress.reportProgress();
        }
        reportBatchProgress();
    }

    public final long getBatchProgress() {
        return this.batchProgress;
    }

    public final long getMaxProgress() {
        return this.maxProgress;
    }

    public void setCurrentRequest(GraphRequest graphRequest) {
        this.currentRequestProgress = graphRequest != null ? this.progressMap.get(graphRequest) : null;
    }

    public void write(byte[] bArr) {
        m.f(bArr, "buffer");
        this.out.write(bArr);
        addProgress((long) bArr.length);
    }

    public void write(byte[] bArr, int i10, int i11) {
        m.f(bArr, "buffer");
        this.out.write(bArr, i10, i11);
        addProgress((long) i11);
    }

    public void write(int i10) {
        this.out.write(i10);
        addProgress(1);
    }
}
