package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzesx implements zzetw {
    final String zza;
    private final zzgad zzb;
    private final ScheduledExecutorService zzc;
    private final zzelg zzd;
    private final Context zze;
    private final zzfdn zzf;
    private final zzelc zzg;
    private final zzdqj zzh;
    private final zzdut zzi;

    zzesx(zzgad zzgad, ScheduledExecutorService scheduledExecutorService, String str, zzelg zzelg, Context context, zzfdn zzfdn, zzelc zzelc, zzdqj zzdqj, zzdut zzdut) {
        this.zzb = zzgad;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzelg;
        this.zze = context;
        this.zzf = zzfdn;
        this.zzg = zzelc;
        this.zzh = zzdqj;
        this.zzi = zzdut;
    }

    public static /* synthetic */ e zzc(zzesx zzesx) {
        String str;
        Bundle bundle;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjX)).booleanValue()) {
            str = zzesx.zzf.zzf.toLowerCase(Locale.ROOT);
        } else {
            str = zzesx.zzf.zzf;
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzbB)).booleanValue()) {
            bundle = zzesx.zzi.zzg();
        } else {
            bundle = new Bundle();
        }
        ArrayList arrayList = new ArrayList();
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzbK)).booleanValue()) {
            for (Map.Entry entry : ((zzfvv) zzesx.zzd.zzb(zzesx.zza, str)).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(zzesx.zzg(str2, (List) entry.getValue(), zzesx.zzf(str2), true, true));
            }
            zzesx.zzi(arrayList, zzesx.zzd.zzc());
        } else {
            zzesx.zzi(arrayList, zzesx.zzd.zza(zzesx.zza, str));
        }
        return zzfzt.zzb(arrayList).zza(new zzess(arrayList, bundle), zzesx.zzb);
    }

    private final Bundle zzf(String str) {
        Bundle bundle = this.zzf.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzfzk zzg(String str, List list, Bundle bundle, boolean z10, boolean z11) {
        zzfzk zzu = zzfzk.zzu(zzfzt.zzk(new zzesu(this, str, list, bundle, z10, z11), this.zzb));
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzbx)).booleanValue()) {
            zzu = (zzfzk) zzfzt.zzo(zzu, ((Long) zzba.zzc().zzb(zzbci.zzbq)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzfzk) zzfzt.zze(zzu, Throwable.class, new zzesv(str), this.zzb);
    }

    private final void zzh(zzbqv zzbqv, Bundle bundle, List list, zzelj zzelj) {
        zzbqv zzbqv2 = zzbqv;
        zzbqv2.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzelj);
    }

    private final void zzi(List list, Map map) {
        for (Map.Entry value : map.entrySet()) {
            zzelk zzelk = (zzelk) value.getValue();
            String str = zzelk.zza;
            list.add(zzg(str, Collections.singletonList(zzelk.zze), zzf(str), zzelk.zzb, zzelk.zzc));
        }
    }

    public final int zza() {
        return 32;
    }

    public final e zzb() {
        zzfdn zzfdn = this.zzf;
        if (zzfdn.zzq) {
            if (!Arrays.asList(((String) zzba.zzc().zzb(zzbci.zzbD)).split(",")).contains(zzf.zza(zzf.zzb(zzfdn.zzd)))) {
                return zzfzt.zzh(new zzesy(new JSONArray().toString(), new Bundle()));
            }
        }
        return zzfzt.zzk(new zzesr(this), this.zzb);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.common.util.concurrent.e zzd(java.lang.String r9, java.util.List r10, android.os.Bundle r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzcbl r7 = new com.google.android.gms.internal.ads.zzcbl
            r7.<init>()
            r0 = 0
            if (r13 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.zzbca r13 = com.google.android.gms.internal.ads.zzbci.zzbC
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r13 = r1.zzb(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x0026
            com.google.android.gms.internal.ads.zzelc r13 = r8.zzg
            r13.zzb(r9)
            com.google.android.gms.internal.ads.zzelc r13 = r8.zzg
            com.google.android.gms.internal.ads.zzbqv r13 = r13.zza(r9)
            goto L_0x0034
        L_0x0026:
            com.google.android.gms.internal.ads.zzdqj r13 = r8.zzh     // Catch:{ RemoteException -> 0x002d }
            com.google.android.gms.internal.ads.zzbqv r13 = r13.zzb(r9)     // Catch:{ RemoteException -> 0x002d }
            goto L_0x0034
        L_0x002d:
            r13 = move-exception
            java.lang.String r1 = "Couldn't create RTB adapter : "
            com.google.android.gms.internal.ads.zzcat.zzh(r1, r13)
            r13 = r0
        L_0x0034:
            if (r13 != 0) goto L_0x004e
            com.google.android.gms.internal.ads.zzbca r10 = com.google.android.gms.internal.ads.zzbci.zzbs
            com.google.android.gms.internal.ads.zzbcg r11 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r10 = r11.zzb(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.zzelj.zzb(r9, r7)
            goto L_0x00ba
        L_0x004d:
            throw r0
        L_0x004e:
            com.google.android.gms.internal.ads.zzelj r6 = new com.google.android.gms.internal.ads.zzelj
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzt.zzB()
            long r4 = r0.elapsedRealtime()
            r0 = r6
            r1 = r9
            r2 = r13
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbca r9 = com.google.android.gms.internal.ads.zzbci.zzbx
            com.google.android.gms.internal.ads.zzbcg r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r9 = r0.zzb(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x008d
            java.util.concurrent.ScheduledExecutorService r9 = r8.zzc
            com.google.android.gms.internal.ads.zzesw r0 = new com.google.android.gms.internal.ads.zzesw
            r0.<init>(r6)
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzbq
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.schedule(r0, r1, r3)
        L_0x008d:
            if (r12 == 0) goto L_0x00b7
            com.google.android.gms.internal.ads.zzbca r9 = com.google.android.gms.internal.ads.zzbci.zzbE
            com.google.android.gms.internal.ads.zzbcg r12 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r9 = r12.zzb(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00b3
            com.google.android.gms.internal.ads.zzgad r9 = r8.zzb
            com.google.android.gms.internal.ads.zzest r12 = new com.google.android.gms.internal.ads.zzest
            r0 = r12
            r1 = r8
            r2 = r13
            r3 = r11
            r4 = r10
            r5 = r6
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.zza(r12)
            goto L_0x00ba
        L_0x00b3:
            r8.zzh(r13, r11, r10, r6)
            goto L_0x00ba
        L_0x00b7:
            r6.zzd()
        L_0x00ba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzesx.zzd(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):com.google.common.util.concurrent.e");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzbqv zzbqv, Bundle bundle, List list, zzelj zzelj, zzcbl zzcbl) {
        try {
            zzh(zzbqv, bundle, list, zzelj);
        } catch (RemoteException e10) {
            zzcbl.zzd(e10);
        }
    }
}
