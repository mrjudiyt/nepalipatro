package com.bumptech.glide.load.engine;

import e2.e;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Jobs */
final class p {

    /* renamed from: a  reason: collision with root package name */
    private final Map<e, k<?>> f5811a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<e, k<?>> f5812b = new HashMap();

    p() {
    }

    private Map<e, k<?>> b(boolean z10) {
        return z10 ? this.f5812b : this.f5811a;
    }

    /* access modifiers changed from: package-private */
    public k<?> a(e eVar, boolean z10) {
        return b(z10).get(eVar);
    }

    /* access modifiers changed from: package-private */
    public void c(e eVar, k<?> kVar) {
        b(kVar.p()).put(eVar, kVar);
    }

    /* access modifiers changed from: package-private */
    public void d(e eVar, k<?> kVar) {
        Map<e, k<?>> b10 = b(kVar.p());
        if (kVar.equals(b10.get(eVar))) {
            b10.remove(eVar);
        }
    }
}
