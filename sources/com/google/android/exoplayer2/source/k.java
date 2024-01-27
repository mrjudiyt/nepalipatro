package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.j0;
import g5.j;
import z5.r;

/* compiled from: MediaSource */
public interface k {

    /* compiled from: MediaSource */
    public static final class a extends j {
        public a(Object obj) {
            super(obj);
        }

        public a c(Object obj) {
            return new a(super.a(obj));
        }

        public a(Object obj, long j10, int i10) {
            super(obj, j10, i10);
        }

        public a(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10);
        }

        public a(j jVar) {
            super(jVar);
        }
    }

    /* compiled from: MediaSource */
    public interface b {
        void a(k kVar, a1 a1Var);
    }

    void a(b bVar);

    void c(Handler handler, l lVar);

    void d(l lVar);

    void e(b bVar);

    j0 g();

    j h(a aVar, z5.b bVar, long j10);

    void i(b bVar, r rVar);

    void j(Handler handler, i iVar);

    void k(i iVar);

    void l();

    boolean m();

    void n(j jVar);

    a1 o();

    void p(b bVar);
}
