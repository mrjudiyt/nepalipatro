package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzu;
import java.util.concurrent.Callable;
import z1.e0;
import z1.j;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
final class m0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f5496a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j f5497b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d f5498c;

    m0(d dVar, String str, j jVar) {
        this.f5498c = dVar;
        this.f5496a = str;
        this.f5497b = jVar;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        e0 z10 = d.z(this.f5498c, this.f5496a, 9);
        if (z10.b() != null) {
            this.f5497b.a(z10.a(), z10.b());
            return null;
        }
        this.f5497b.a(z10.a(), zzu.zzk());
        return null;
    }
}
