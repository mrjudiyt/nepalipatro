package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.i;
import j4.l;
import j4.m;
import j4.p;
import j4.t;

/* compiled from: DrmSessionManager */
public interface j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f6579a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final j f6580b;

    /* compiled from: DrmSessionManager */
    class a implements j {
        a() {
        }

        public /* synthetic */ b a(Looper looper, i.a aVar, e4.j jVar) {
            return l.a(this, looper, aVar, jVar);
        }

        public Class<t> b(e4.j jVar) {
            if (jVar.f8099v != null) {
                return t.class;
            }
            return null;
        }

        public /* synthetic */ void c() {
            l.b(this);
        }

        public DrmSession d(Looper looper, i.a aVar, e4.j jVar) {
            if (jVar.f8099v == null) {
                return null;
            }
            return new m(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        public /* synthetic */ void release() {
            l.c(this);
        }
    }

    /* compiled from: DrmSessionManager */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f6581a = m.f15384b;

        void release();
    }

    static {
        a aVar = new a();
        f6579a = aVar;
        f6580b = aVar;
    }

    b a(Looper looper, i.a aVar, e4.j jVar);

    Class<? extends p> b(e4.j jVar);

    void c();

    DrmSession d(Looper looper, i.a aVar, e4.j jVar);

    void release();
}
