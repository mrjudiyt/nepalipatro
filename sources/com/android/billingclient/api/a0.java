package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import z1.c;
import z1.k;
import z1.o0;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5345a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final z f5346b;

    a0(Context context, z1.a0 a0Var, n nVar) {
        this.f5345a = context;
        this.f5346b = new z(this, (z1.a0) null, nVar, (o0) null);
    }

    /* access modifiers changed from: package-private */
    public final z1.a0 b() {
        z1.a0 unused = this.f5346b.f5536b;
        return null;
    }

    /* access modifiers changed from: package-private */
    public final k c() {
        return this.f5346b.f5535a;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.f5346b.d(this.f5345a);
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f5346b.c(this.f5345a, intentFilter);
    }

    a0(Context context, k kVar, c cVar, n nVar) {
        this.f5345a = context;
        this.f5346b = new z(this, kVar, cVar, nVar, (o0) null);
    }
}
