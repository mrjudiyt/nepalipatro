package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeoj implements zzetw {
    private final zzgad zza;
    private final zzdqj zzb;
    private final zzdur zzc;
    private final zzeol zzd;

    public zzeoj(zzgad zzgad, zzdqj zzdqj, zzdur zzdur, zzeol zzeol) {
        this.zza = zzgad;
        this.zzb = zzdqj;
        this.zzc = zzdur;
        this.zzd = zzeol;
    }

    public final int zza() {
        return 1;
    }

    public final e zzb() {
        zzbca zzbca = zzbci.zzkG;
        if (!((Boolean) zzba.zzc().zzb(zzbca)).booleanValue() || this.zzd.zza() == null) {
            if (zzftl.zzd((String) zzba.zzc().zzb(zzbci.zzbp)) || (!((Boolean) zzba.zzc().zzb(zzbca)).booleanValue() && (this.zzd.zzd() || !this.zzc.zzt()))) {
                return zzfzt.zzh(new zzeok(new Bundle()));
            }
            this.zzd.zzc(true);
            return this.zza.zzb(new zzeoi(this));
        }
        zzeok zza2 = this.zzd.zza();
        Objects.requireNonNull(zza2);
        return zzfzt.zzh(zza2);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:3|4|5|(3:8|9|(1:11))|12|13|(1:15)|16|17|25|23|1) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:4|5|(3:8|9|(1:11))|12|13|(1:15)|16|17|25) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0067 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0076 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d A[Catch:{ zzfds -> 0x0076 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzeok zzc() {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzbp
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ";"
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x007c
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.zzdqj r3 = r8.zzb     // Catch:{ zzfds -> 0x007a }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ zzfds -> 0x007a }
            r4.<init>()     // Catch:{ zzfds -> 0x007a }
            com.google.android.gms.internal.ads.zzfej r3 = r3.zzc(r2, r4)     // Catch:{ zzfds -> 0x007a }
            r3.zzC()     // Catch:{ zzfds -> 0x007a }
            com.google.android.gms.internal.ads.zzdur r4 = r8.zzc     // Catch:{ zzfds -> 0x007a }
            boolean r4 = r4.zzt()     // Catch:{ zzfds -> 0x007a }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ zzfds -> 0x007a }
            r5.<init>()     // Catch:{ zzfds -> 0x007a }
            com.google.android.gms.internal.ads.zzbca r6 = com.google.android.gms.internal.ads.zzbci.zzkG     // Catch:{ zzfds -> 0x007a }
            com.google.android.gms.internal.ads.zzbcg r7 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ zzfds -> 0x007a }
            java.lang.Object r6 = r7.zzb(r6)     // Catch:{ zzfds -> 0x007a }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ zzfds -> 0x007a }
            boolean r6 = r6.booleanValue()     // Catch:{ zzfds -> 0x007a }
            if (r6 == 0) goto L_0x0058
            if (r4 == 0) goto L_0x0067
        L_0x0058:
            com.google.android.gms.internal.ads.zzbrj r4 = r3.zzf()     // Catch:{ zzfds -> 0x0067 }
            if (r4 == 0) goto L_0x0067
            java.lang.String r6 = "sdk_version"
            java.lang.String r4 = r4.toString()     // Catch:{ zzfds -> 0x0067 }
            r5.putString(r6, r4)     // Catch:{ zzfds -> 0x0067 }
        L_0x0067:
            com.google.android.gms.internal.ads.zzbrj r3 = r3.zze()     // Catch:{ zzfds -> 0x0076 }
            if (r3 == 0) goto L_0x0076
            java.lang.String r4 = "adapter_version"
            java.lang.String r3 = r3.toString()     // Catch:{ zzfds -> 0x0076 }
            r5.putString(r4, r3)     // Catch:{ zzfds -> 0x0076 }
        L_0x0076:
            r1.putBundle(r2, r5)     // Catch:{ zzfds -> 0x007a }
            goto L_0x001f
        L_0x007a:
            goto L_0x001f
        L_0x007c:
            com.google.android.gms.internal.ads.zzeok r0 = new com.google.android.gms.internal.ads.zzeok
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzkG
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0098
            com.google.android.gms.internal.ads.zzeol r1 = r8.zzd
            r1.zzb(r0)
        L_0x0098:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeoj.zzc():com.google.android.gms.internal.ads.zzeok");
    }
}
