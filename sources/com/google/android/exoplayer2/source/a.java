package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import z5.r;

/* compiled from: BaseMediaSource */
public abstract class a implements k {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<k.b> f7096a = new ArrayList<>(1);

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<k.b> f7097b = new HashSet<>(1);

    /* renamed from: c  reason: collision with root package name */
    private final l.a f7098c = new l.a();

    /* renamed from: d  reason: collision with root package name */
    private final i.a f7099d = new i.a();

    /* renamed from: e  reason: collision with root package name */
    private Looper f7100e;

    /* renamed from: f  reason: collision with root package name */
    private a1 f7101f;

    /* access modifiers changed from: protected */
    public abstract void A();

    public final void a(k.b bVar) {
        this.f7096a.remove(bVar);
        if (this.f7096a.isEmpty()) {
            this.f7100e = null;
            this.f7101f = null;
            this.f7097b.clear();
            A();
            return;
        }
        e(bVar);
    }

    public final void c(Handler handler, l lVar) {
        a6.a.e(handler);
        a6.a.e(lVar);
        this.f7098c.g(handler, lVar);
    }

    public final void d(l lVar) {
        this.f7098c.C(lVar);
    }

    public final void e(k.b bVar) {
        boolean z10 = !this.f7097b.isEmpty();
        this.f7097b.remove(bVar);
        if (z10 && this.f7097b.isEmpty()) {
            v();
        }
    }

    public final void i(k.b bVar, r rVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f7100e;
        a6.a.a(looper == null || looper == myLooper);
        a1 a1Var = this.f7101f;
        this.f7096a.add(bVar);
        if (this.f7100e == null) {
            this.f7100e = myLooper;
            this.f7097b.add(bVar);
            y(rVar);
        } else if (a1Var != null) {
            p(bVar);
            bVar.a(this, a1Var);
        }
    }

    public final void j(Handler handler, i iVar) {
        a6.a.e(handler);
        a6.a.e(iVar);
        this.f7099d.g(handler, iVar);
    }

    public final void k(i iVar) {
        this.f7099d.t(iVar);
    }

    public /* synthetic */ boolean m() {
        return g5.k.b(this);
    }

    public /* synthetic */ a1 o() {
        return g5.k.a(this);
    }

    public final void p(k.b bVar) {
        a6.a.e(this.f7100e);
        boolean isEmpty = this.f7097b.isEmpty();
        this.f7097b.add(bVar);
        if (isEmpty) {
            w();
        }
    }

    /* access modifiers changed from: protected */
    public final i.a q(int i10, k.a aVar) {
        return this.f7099d.u(i10, aVar);
    }

    /* access modifiers changed from: protected */
    public final i.a r(k.a aVar) {
        return this.f7099d.u(0, aVar);
    }

    /* access modifiers changed from: protected */
    public final l.a s(int i10, k.a aVar, long j10) {
        return this.f7098c.F(i10, aVar, j10);
    }

    /* access modifiers changed from: protected */
    public final l.a t(k.a aVar) {
        return this.f7098c.F(0, aVar, 0);
    }

    /* access modifiers changed from: protected */
    public final l.a u(k.a aVar, long j10) {
        a6.a.e(aVar);
        return this.f7098c.F(0, aVar, j10);
    }

    /* access modifiers changed from: protected */
    public void v() {
    }

    /* access modifiers changed from: protected */
    public void w() {
    }

    /* access modifiers changed from: protected */
    public final boolean x() {
        return !this.f7097b.isEmpty();
    }

    /* access modifiers changed from: protected */
    public abstract void y(r rVar);

    /* access modifiers changed from: protected */
    public final void z(a1 a1Var) {
        this.f7101f = a1Var;
        Iterator<k.b> it = this.f7096a.iterator();
        while (it.hasNext()) {
            it.next().a(this, a1Var);
        }
    }
}
