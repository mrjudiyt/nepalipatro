package com.google.android.exoplayer2.source;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.r;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.d;
import g5.r;
import k4.o;

/* compiled from: DefaultMediaSourceFactory */
public final class e implements r {

    /* renamed from: a  reason: collision with root package name */
    private final a.C0119a f7274a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<r> f7275b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f7276c;

    /* renamed from: d  reason: collision with root package name */
    private long f7277d;

    /* renamed from: e  reason: collision with root package name */
    private long f7278e;

    /* renamed from: f  reason: collision with root package name */
    private long f7279f;

    /* renamed from: g  reason: collision with root package name */
    private float f7280g;

    /* renamed from: h  reason: collision with root package name */
    private float f7281h;

    public e(Context context, o oVar) {
        this((a.C0119a) new d(context), oVar);
    }

    private static SparseArray<r> a(a.C0119a aVar, o oVar) {
        Class<a.C0119a> cls = a.C0119a.class;
        Class<r> cls2 = r.class;
        SparseArray<r> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (r) DashMediaSource.Factory.class.asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{aVar}));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (r) SsMediaSource$Factory.class.asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{aVar}));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (r) HlsMediaSource.Factory.class.asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{aVar}));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (r) Class.forName("com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new r.b(aVar, oVar));
        return sparseArray;
    }

    public e(a.C0119a aVar, o oVar) {
        this.f7274a = aVar;
        SparseArray<g5.r> a10 = a(aVar, oVar);
        this.f7275b = a10;
        this.f7276c = new int[a10.size()];
        for (int i10 = 0; i10 < this.f7275b.size(); i10++) {
            this.f7276c[i10] = this.f7275b.keyAt(i10);
        }
        this.f7277d = -9223372036854775807L;
        this.f7278e = -9223372036854775807L;
        this.f7279f = -9223372036854775807L;
        this.f7280g = -3.4028235E38f;
        this.f7281h = -3.4028235E38f;
    }
}
