package com.android.billingclient.api;

import android.content.Context;
import com.google.android.datatransport.cct.a;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzfz;
import q3.b;
import q3.c;
import q3.f;
import s3.u;
import z1.z;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
final class q {

    /* renamed from: a  reason: collision with root package name */
    private boolean f5530a;

    /* renamed from: b  reason: collision with root package name */
    private f f5531b;

    q(Context context) {
        try {
            u.f(context);
            this.f5531b = u.c().g(a.f6191g).a("PLAY_BILLING_LIBRARY", zzfz.class, b.b("proto"), z.f13135a);
        } catch (Throwable unused) {
            this.f5530a = true;
        }
    }

    public final void a(zzfz zzfz) {
        if (this.f5530a) {
            zzb.zzj("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.f5531b.a(c.d(zzfz));
        } catch (Throwable unused) {
            zzb.zzj("BillingLogger", "logging failed.");
        }
    }
}
