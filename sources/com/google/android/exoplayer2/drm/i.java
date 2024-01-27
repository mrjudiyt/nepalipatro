package com.google.android.exoplayer2.drm;

import a6.m0;
import android.os.Handler;
import com.google.android.exoplayer2.source.k;
import j4.f;
import j4.g;
import j4.h;
import j4.j;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: DrmSessionEventListener */
public interface i {

    /* compiled from: DrmSessionEventListener */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f6574a;

        /* renamed from: b  reason: collision with root package name */
        public final k.a f6575b;

        /* renamed from: c  reason: collision with root package name */
        private final CopyOnWriteArrayList<C0111a> f6576c;

        /* renamed from: com.google.android.exoplayer2.drm.i$a$a  reason: collision with other inner class name */
        /* compiled from: DrmSessionEventListener */
        private static final class C0111a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f6577a;

            /* renamed from: b  reason: collision with root package name */
            public i f6578b;

            public C0111a(Handler handler, i iVar) {
                this.f6577a = handler;
                this.f6578b = iVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, (k.a) null);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void n(i iVar) {
            iVar.Z(this.f6574a, this.f6575b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void o(i iVar) {
            iVar.P(this.f6574a, this.f6575b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void p(i iVar) {
            iVar.n0(this.f6574a, this.f6575b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void q(i iVar, int i10) {
            iVar.W(this.f6574a, this.f6575b);
            iVar.g0(this.f6574a, this.f6575b, i10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void r(i iVar, Exception exc) {
            iVar.u(this.f6574a, this.f6575b, exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void s(i iVar) {
            iVar.h0(this.f6574a, this.f6575b);
        }

        public void g(Handler handler, i iVar) {
            a6.a.e(handler);
            a6.a.e(iVar);
            this.f6576c.add(new C0111a(handler, iVar));
        }

        public void h() {
            Iterator<C0111a> it = this.f6576c.iterator();
            while (it.hasNext()) {
                C0111a next = it.next();
                m0.z0(next.f6577a, new h(this, next.f6578b));
            }
        }

        public void i() {
            Iterator<C0111a> it = this.f6576c.iterator();
            while (it.hasNext()) {
                C0111a next = it.next();
                m0.z0(next.f6577a, new g(this, next.f6578b));
            }
        }

        public void j() {
            Iterator<C0111a> it = this.f6576c.iterator();
            while (it.hasNext()) {
                C0111a next = it.next();
                m0.z0(next.f6577a, new j4.i(this, next.f6578b));
            }
        }

        public void k(int i10) {
            Iterator<C0111a> it = this.f6576c.iterator();
            while (it.hasNext()) {
                C0111a next = it.next();
                m0.z0(next.f6577a, new j(this, next.f6578b, i10));
            }
        }

        public void l(Exception exc) {
            Iterator<C0111a> it = this.f6576c.iterator();
            while (it.hasNext()) {
                C0111a next = it.next();
                m0.z0(next.f6577a, new j4.k(this, next.f6578b, exc));
            }
        }

        public void m() {
            Iterator<C0111a> it = this.f6576c.iterator();
            while (it.hasNext()) {
                C0111a next = it.next();
                m0.z0(next.f6577a, new f(this, next.f6578b));
            }
        }

        public void t(i iVar) {
            Iterator<C0111a> it = this.f6576c.iterator();
            while (it.hasNext()) {
                C0111a next = it.next();
                if (next.f6578b == iVar) {
                    this.f6576c.remove(next);
                }
            }
        }

        public a u(int i10, k.a aVar) {
            return new a(this.f6576c, i10, aVar);
        }

        private a(CopyOnWriteArrayList<C0111a> copyOnWriteArrayList, int i10, k.a aVar) {
            this.f6576c = copyOnWriteArrayList;
            this.f6574a = i10;
            this.f6575b = aVar;
        }
    }

    void P(int i10, k.a aVar);

    @Deprecated
    void W(int i10, k.a aVar);

    void Z(int i10, k.a aVar);

    void g0(int i10, k.a aVar, int i11);

    void h0(int i10, k.a aVar);

    void n0(int i10, k.a aVar);

    void u(int i10, k.a aVar, Exception exc);
}
