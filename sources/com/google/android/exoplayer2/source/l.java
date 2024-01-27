package com.google.android.exoplayer2.source;

import a6.m0;
import android.os.Handler;
import com.google.android.exoplayer2.source.k;
import e4.c;
import e4.j;
import g5.h;
import g5.i;
import g5.m;
import g5.n;
import g5.o;
import g5.p;
import g5.q;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MediaSourceEventListener */
public interface l {

    /* compiled from: MediaSourceEventListener */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f7465a;

        /* renamed from: b  reason: collision with root package name */
        public final k.a f7466b;

        /* renamed from: c  reason: collision with root package name */
        private final CopyOnWriteArrayList<C0118a> f7467c;

        /* renamed from: d  reason: collision with root package name */
        private final long f7468d;

        /* renamed from: com.google.android.exoplayer2.source.l$a$a  reason: collision with other inner class name */
        /* compiled from: MediaSourceEventListener */
        private static final class C0118a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f7469a;

            /* renamed from: b  reason: collision with root package name */
            public l f7470b;

            public C0118a(Handler handler, l lVar) {
                this.f7469a = handler;
                this.f7470b = lVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, (k.a) null, 0);
        }

        private long h(long j10) {
            long e10 = c.e(j10);
            if (e10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f7468d + e10;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void k(l lVar, i iVar) {
            lVar.z(this.f7465a, this.f7466b, iVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void l(l lVar, h hVar, i iVar) {
            lVar.l(this.f7465a, this.f7466b, hVar, iVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void m(l lVar, h hVar, i iVar) {
            lVar.k0(this.f7465a, this.f7466b, hVar, iVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void n(l lVar, h hVar, i iVar, IOException iOException, boolean z10) {
            lVar.n(this.f7465a, this.f7466b, hVar, iVar, iOException, z10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void o(l lVar, h hVar, i iVar) {
            lVar.l0(this.f7465a, this.f7466b, hVar, iVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void p(l lVar, k.a aVar, i iVar) {
            lVar.d0(this.f7465a, aVar, iVar);
        }

        public void A(h hVar, int i10, int i11, j jVar, int i12, Object obj, long j10, long j11) {
            h hVar2 = hVar;
            B(hVar, new i(i10, i11, jVar, i12, obj, h(j10), h(j11)));
        }

        public void B(h hVar, i iVar) {
            Iterator<C0118a> it = this.f7467c.iterator();
            while (it.hasNext()) {
                C0118a next = it.next();
                m0.z0(next.f7469a, new n(this, next.f7470b, hVar, iVar));
            }
        }

        public void C(l lVar) {
            Iterator<C0118a> it = this.f7467c.iterator();
            while (it.hasNext()) {
                C0118a next = it.next();
                if (next.f7470b == lVar) {
                    this.f7467c.remove(next);
                }
            }
        }

        public void D(int i10, long j10, long j11) {
            long j12 = j10;
            E(new i(1, i10, (j) null, 3, (Object) null, h(j10), h(j11)));
        }

        public void E(i iVar) {
            k.a aVar = (k.a) a6.a.e(this.f7466b);
            Iterator<C0118a> it = this.f7467c.iterator();
            while (it.hasNext()) {
                C0118a next = it.next();
                m0.z0(next.f7469a, new g5.l(this, next.f7470b, aVar, iVar));
            }
        }

        public a F(int i10, k.a aVar, long j10) {
            return new a(this.f7467c, i10, aVar, j10);
        }

        public void g(Handler handler, l lVar) {
            a6.a.e(handler);
            a6.a.e(lVar);
            this.f7467c.add(new C0118a(handler, lVar));
        }

        public void i(int i10, j jVar, int i11, Object obj, long j10) {
            j(new i(1, i10, jVar, i11, obj, h(j10), -9223372036854775807L));
        }

        public void j(i iVar) {
            Iterator<C0118a> it = this.f7467c.iterator();
            while (it.hasNext()) {
                C0118a next = it.next();
                m0.z0(next.f7469a, new q(this, next.f7470b, iVar));
            }
        }

        public void q(h hVar, int i10) {
            r(hVar, i10, -1, (j) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }

        public void r(h hVar, int i10, int i11, j jVar, int i12, Object obj, long j10, long j11) {
            h hVar2 = hVar;
            s(hVar, new i(i10, i11, jVar, i12, obj, h(j10), h(j11)));
        }

        public void s(h hVar, i iVar) {
            Iterator<C0118a> it = this.f7467c.iterator();
            while (it.hasNext()) {
                C0118a next = it.next();
                m0.z0(next.f7469a, new o(this, next.f7470b, hVar, iVar));
            }
        }

        public void t(h hVar, int i10) {
            u(hVar, i10, -1, (j) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }

        public void u(h hVar, int i10, int i11, j jVar, int i12, Object obj, long j10, long j11) {
            h hVar2 = hVar;
            v(hVar, new i(i10, i11, jVar, i12, obj, h(j10), h(j11)));
        }

        public void v(h hVar, i iVar) {
            Iterator<C0118a> it = this.f7467c.iterator();
            while (it.hasNext()) {
                C0118a next = it.next();
                m0.z0(next.f7469a, new m(this, next.f7470b, hVar, iVar));
            }
        }

        public void w(h hVar, int i10, int i11, j jVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            h hVar2 = hVar;
            y(hVar, new i(i10, i11, jVar, i12, obj, h(j10), h(j11)), iOException, z10);
        }

        public void x(h hVar, int i10, IOException iOException, boolean z10) {
            w(hVar, i10, -1, (j) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        public void y(h hVar, i iVar, IOException iOException, boolean z10) {
            Iterator<C0118a> it = this.f7467c.iterator();
            while (it.hasNext()) {
                C0118a next = it.next();
                m0.z0(next.f7469a, new p(this, next.f7470b, hVar, iVar, iOException, z10));
            }
        }

        public void z(h hVar, int i10) {
            A(hVar, i10, -1, (j) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }

        private a(CopyOnWriteArrayList<C0118a> copyOnWriteArrayList, int i10, k.a aVar, long j10) {
            this.f7467c = copyOnWriteArrayList;
            this.f7465a = i10;
            this.f7466b = aVar;
            this.f7468d = j10;
        }
    }

    void d0(int i10, k.a aVar, i iVar);

    void k0(int i10, k.a aVar, h hVar, i iVar);

    void l(int i10, k.a aVar, h hVar, i iVar);

    void l0(int i10, k.a aVar, h hVar, i iVar);

    void n(int i10, k.a aVar, h hVar, i iVar, IOException iOException, boolean z10);

    void z(int i10, k.a aVar, i iVar);
}
