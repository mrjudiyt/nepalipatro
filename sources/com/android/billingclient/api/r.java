package com.android.billingclient.api;

import z1.c0;
import z1.d0;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private boolean f5532a;

    /* synthetic */ r(c0 c0Var) {
    }

    public final r a() {
        this.f5532a = true;
        return this;
    }

    public final s b() {
        if (this.f5532a) {
            return new s(true, false, (d0) null);
        }
        throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
    }
}
