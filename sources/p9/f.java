package p9;

import i9.k1;
import r8.g;

/* compiled from: Dispatcher.kt */
public class f extends k1 {

    /* renamed from: k  reason: collision with root package name */
    private final int f16250k;

    /* renamed from: l  reason: collision with root package name */
    private final int f16251l;

    /* renamed from: m  reason: collision with root package name */
    private final long f16252m;

    /* renamed from: n  reason: collision with root package name */
    private final String f16253n;

    /* renamed from: o  reason: collision with root package name */
    private a f16254o = N0();

    public f(int i10, int i11, long j10, String str) {
        this.f16250k = i10;
        this.f16251l = i11;
        this.f16252m = j10;
        this.f16253n = str;
    }

    private final a N0() {
        return new a(this.f16250k, this.f16251l, this.f16252m, this.f16253n);
    }

    public void K0(g gVar, Runnable runnable) {
        a.E(this.f16254o, runnable, (i) null, false, 6, (Object) null);
    }

    public final void O0(Runnable runnable, i iVar, boolean z10) {
        this.f16254o.w(runnable, iVar, z10);
    }
}
