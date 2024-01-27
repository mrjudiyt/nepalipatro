package com.google.android.exoplayer2.source;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import k4.k;
import k4.x;
import z5.g;

/* compiled from: ProgressiveMediaExtractor */
public interface m {

    /* compiled from: ProgressiveMediaExtractor */
    public interface a {
        m a();
    }

    void b(long j10, long j11);

    int c(x xVar);

    long d();

    void e();

    void f(g gVar, Uri uri, Map<String, List<String>> map, long j10, long j11, k kVar);

    void release();
}
