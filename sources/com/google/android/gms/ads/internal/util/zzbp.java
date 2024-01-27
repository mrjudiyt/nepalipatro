package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzamc;
import com.google.android.gms.internal.ads.zzamg;
import com.google.android.gms.internal.ads.zzamm;
import com.google.android.gms.internal.ads.zzand;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.gms.internal.ads.zzcbl;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbp extends zzamg {
    private final zzcbl zza;
    private final zzcas zzb;

    public zzbp(String str, Map map, zzcbl zzcbl) {
        super(0, str, new zzbo(zzcbl));
        this.zza = zzcbl;
        zzcas zzcas = new zzcas((String) null);
        this.zzb = zzcas;
        zzcas.zzd(str, "GET", (Map) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public final zzamm zzh(zzamc zzamc) {
        return zzamm.zzb(zzamc, zzand.zzb(zzamc));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzamc zzamc = (zzamc) obj;
        this.zzb.zzf(zzamc.zzc, zzamc.zza);
        byte[] bArr = zzamc.zzb;
        if (zzcas.zzk() && bArr != null) {
            this.zzb.zzh(bArr);
        }
        this.zza.zzc(zzamc);
    }
}
