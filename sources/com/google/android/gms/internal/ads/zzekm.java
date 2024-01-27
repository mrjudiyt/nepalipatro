package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzekm implements zzeeu {
    private final Context zza;
    private final zzcrs zzb;
    private final zzbdg zzc;
    private final zzgad zzd;
    private final zzfhr zze;

    public zzekm(Context context, zzcrs zzcrs, zzfhr zzfhr, zzgad zzgad, zzbdg zzbdg) {
        this.zza = context;
        this.zzb = zzcrs;
        this.zze = zzfhr;
        this.zzd = zzgad;
        this.zzc = zzbdg;
    }

    public final e zza(zzfde zzfde, zzfcr zzfcr) {
        zzekk zzekk = new zzekk(this, new View(this.zza), (zzcgb) null, zzeki.zza, (zzfcs) zzfcr.zzw.get(0));
        zzcqw zza2 = this.zzb.zza(new zzctm(zzfde, zzfcr, (String) null), zzekk);
        zzekl zzk = zza2.zzk();
        zzfcx zzfcx = zzfcr.zzu;
        zzbdb zzbdb = new zzbdb(zzk, zzfcx.zzb, zzfcx.zza);
        zzfhl zzfhl = zzfhl.CUSTOM_RENDER_SYN;
        return zzfhb.zzd(new zzekj(this, zzbdb), this.zzd, zzfhl, this.zze).zzb(zzfhl.CUSTOM_RENDER_ACK).zzd(zzfzt.zzh(zza2.zza())).zza();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.zzu;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzb(com.google.android.gms.internal.ads.zzfde r1, com.google.android.gms.internal.ads.zzfcr r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzbdg r1 = r0.zzc
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzekm.zzb(com.google.android.gms.internal.ads.zzfde, com.google.android.gms.internal.ads.zzfcr):boolean");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbdb zzbdb) {
        this.zzc.zze(zzbdb);
    }
}
