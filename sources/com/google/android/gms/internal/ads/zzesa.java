package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.e;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzesa implements zzetw {
    private final zzgad zza;
    private final Context zzb;
    private final Set zzc;

    public zzesa(zzgad zzgad, Context context, Set set) {
        this.zza = zzgad;
        this.zzb = context;
        this.zzc = set;
    }

    public final int zza() {
        return 27;
    }

    public final e zzb() {
        return this.zza.zzb(new zzerz(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        if (r0.contains("banner") == false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzesb zzc() {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzeS
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0056
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzeZ
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0046
            java.util.Set r0 = r3.zzc
            java.lang.String r1 = "rewarded"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0046
            java.lang.String r1 = "interstitial"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0046
            java.lang.String r1 = "native"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0046
            java.lang.String r1 = "banner"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0056
        L_0x0046:
            android.content.Context r0 = r3.zzb
            com.google.android.gms.internal.ads.zzesb r1 = new com.google.android.gms.internal.ads.zzesb
            com.google.android.gms.internal.ads.zzeen r2 = com.google.android.gms.ads.internal.zzt.zzA()
            java.lang.String r0 = r2.zze(r0)
            r1.<init>(r0)
            return r1
        L_0x0056:
            com.google.android.gms.internal.ads.zzesb r0 = new com.google.android.gms.internal.ads.zzesb
            r1 = 0
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzesa.zzc():com.google.android.gms.internal.ads.zzesb");
    }
}
