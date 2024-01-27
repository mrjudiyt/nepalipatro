package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzff;
import com.google.android.gms.internal.play_billing.zzfm;
import com.google.android.gms.internal.play_billing.zzfy;
import com.google.android.gms.internal.play_billing.zzfz;
import com.google.android.gms.internal.play_billing.zzgd;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
final class p implements n {

    /* renamed from: a  reason: collision with root package name */
    private final zzfm f5528a;

    /* renamed from: b  reason: collision with root package name */
    private final q f5529b;

    p(Context context, zzfm zzfm) {
        this.f5529b = new q(context);
        this.f5528a = zzfm;
    }

    public final void a(zzgd zzgd) {
        try {
            zzfy zzv = zzfz.zzv();
            zzfm zzfm = this.f5528a;
            if (zzfm != null) {
                zzv.zzk(zzfm);
            }
            zzv.zzl(zzgd);
            this.f5529b.a((zzfz) zzv.zzc());
        } catch (Throwable unused) {
            zzb.zzj("BillingLogger", "Unable to log.");
        }
    }

    public final void b(zzfb zzfb) {
        try {
            zzfy zzv = zzfz.zzv();
            zzfm zzfm = this.f5528a;
            if (zzfm != null) {
                zzv.zzk(zzfm);
            }
            zzv.zzi(zzfb);
            this.f5529b.a((zzfz) zzv.zzc());
        } catch (Throwable unused) {
            zzb.zzj("BillingLogger", "Unable to log.");
        }
    }

    public final void c(zzff zzff) {
        try {
            zzfy zzv = zzfz.zzv();
            zzfm zzfm = this.f5528a;
            if (zzfm != null) {
                zzv.zzk(zzfm);
            }
            zzv.zzj(zzff);
            this.f5529b.a((zzfz) zzv.zzc());
        } catch (Throwable unused) {
            zzb.zzj("BillingLogger", "Unable to log.");
        }
    }
}
