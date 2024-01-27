package com.facebook.appevents;

import kotlin.jvm.internal.m;

/* compiled from: FlushStatistics.kt */
public final class FlushStatistics {
    private int numEvents;
    private FlushResult result = FlushResult.SUCCESS;

    public final int getNumEvents() {
        return this.numEvents;
    }

    public final FlushResult getResult() {
        return this.result;
    }

    public final void setNumEvents(int i10) {
        this.numEvents = i10;
    }

    public final void setResult(FlushResult flushResult) {
        m.f(flushResult, "<set-?>");
        this.result = flushResult;
    }
}
