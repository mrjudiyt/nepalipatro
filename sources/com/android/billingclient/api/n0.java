package com.android.billingclient.api;

import java.util.concurrent.Callable;
import z1.i;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
final class n0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f5499a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i f5500b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d f5501c;

    n0(d dVar, String str, i iVar) {
        this.f5501c = dVar;
        this.f5499a = str;
        this.f5500b = iVar;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        m N = d.N(this.f5501c, this.f5499a);
        this.f5500b.a(N.a(), N.b());
        return null;
    }
}
