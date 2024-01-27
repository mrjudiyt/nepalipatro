package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzekr implements zzeeu {
    private final zzbdg zza;
    private final zzgad zzb;
    private final zzfhr zzc;
    /* access modifiers changed from: private */
    public final zzela zzd;

    public zzekr(zzfhr zzfhr, zzgad zzgad, zzbdg zzbdg, zzela zzela) {
        this.zzc = zzfhr;
        this.zzb = zzgad;
        this.zza = zzbdg;
        this.zzd = zzela;
    }

    public final e zza(zzfde zzfde, zzfcr zzfcr) {
        zzcbl zzcbl = new zzcbl();
        zzekw zzekw = new zzekw();
        zzekw.zzd(new zzekq(this, zzcbl, zzfde, zzfcr, zzekw));
        zzfcx zzfcx = zzfcr.zzu;
        zzbdb zzbdb = new zzbdb(zzekw, zzfcx.zzb, zzfcx.zza);
        zzfhl zzfhl = zzfhl.CUSTOM_RENDER_SYN;
        return zzfhb.zzd(new zzekp(this, zzbdb), this.zzb, zzfhl, this.zzc).zzb(zzfhl.CUSTOM_RENDER_ACK).zzd(zzcbl).zza();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.zzu;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzb(com.google.android.gms.internal.ads.zzfde r1, com.google.android.gms.internal.ads.zzfcr r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzbdg r1 = r0.zza
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.internal.ads.zzfcx r1 = r2.zzu
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.zza
            if (r1 == 0) goto L_0x000e
            r1 = 1
            return r1
        L_0x000e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzekr.zzb(com.google.android.gms.internal.ads.zzfde, com.google.android.gms.internal.ads.zzfcr):boolean");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbdb zzbdb) {
        this.zza.zze(zzbdb);
    }
}
