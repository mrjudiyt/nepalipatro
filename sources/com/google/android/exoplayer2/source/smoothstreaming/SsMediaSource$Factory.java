package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.upstream.g;
import f5.c;
import g5.d;
import g5.r;
import j4.o;
import java.util.Collections;
import java.util.List;
import n5.b;

public final class SsMediaSource$Factory implements r {

    /* renamed from: a  reason: collision with root package name */
    private final b f7548a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0119a f7549b;

    /* renamed from: c  reason: collision with root package name */
    private d f7550c;

    /* renamed from: d  reason: collision with root package name */
    private o f7551d;

    /* renamed from: e  reason: collision with root package name */
    private g f7552e;

    /* renamed from: f  reason: collision with root package name */
    private long f7553f;

    /* renamed from: g  reason: collision with root package name */
    private List<c> f7554g;

    public SsMediaSource$Factory(a.C0119a aVar) {
        this(new n5.a(aVar), aVar);
    }

    public SsMediaSource$Factory(b bVar, a.C0119a aVar) {
        this.f7548a = (b) a6.a.e(bVar);
        this.f7549b = aVar;
        this.f7551d = new com.google.android.exoplayer2.drm.g();
        this.f7552e = new f();
        this.f7553f = 30000;
        this.f7550c = new g5.f();
        this.f7554g = Collections.emptyList();
    }
}
