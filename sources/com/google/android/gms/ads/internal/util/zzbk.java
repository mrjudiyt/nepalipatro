package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzamk;
import com.google.android.gms.internal.ads.zzaml;
import com.google.android.gms.internal.ads.zzank;
import com.google.android.gms.internal.ads.zzcas;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbk extends zzank {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ zzcas zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbk(zzbq zzbq, int i10, String str, zzaml zzaml, zzamk zzamk, byte[] bArr, Map map, zzcas zzcas) {
        super(i10, str, zzaml, zzamk);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzcas;
    }

    public final Map zzl() {
        Map map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzo((String) obj);
    }

    public final byte[] zzx() {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public final void zzz(String str) {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}
