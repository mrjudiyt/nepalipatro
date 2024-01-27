package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeio {
    /* access modifiers changed from: private */
    public final Clock zza;
    /* access modifiers changed from: private */
    public final zzeip zzb;
    /* access modifiers changed from: private */
    public final zzfjx zzc;
    /* access modifiers changed from: private */
    public final LinkedHashMap zzd = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final boolean zze;
    /* access modifiers changed from: private */
    public final zzeez zzf;
    /* access modifiers changed from: private */
    public boolean zzg;
    private long zzh;
    private long zzi;

    public zzeio(Clock clock, zzeip zzeip, zzeez zzeez, zzfjx zzfjx) {
        this.zza = clock;
        this.zzb = zzeip;
        this.zze = ((Boolean) zzba.zzc().zzb(zzbci.zzgO)).booleanValue();
        this.zzf = zzeez;
        this.zzc = zzfjx;
    }

    /* access modifiers changed from: private */
    public final synchronized boolean zzq(zzfcr zzfcr) {
        zzein zzein = (zzein) this.zzd.get(zzfcr);
        if (zzein == null) {
            return false;
        }
        return zzein.zzc == 8;
    }

    public final synchronized long zza() {
        return this.zzh;
    }

    /* access modifiers changed from: package-private */
    public final synchronized e zzf(zzfde zzfde, zzfcr zzfcr, e eVar, zzfjt zzfjt) {
        zzfcr zzfcr2 = zzfcr;
        e eVar2 = eVar;
        synchronized (this) {
            zzfcv zzfcv = zzfde.zzb.zzb;
            long elapsedRealtime = this.zza.elapsedRealtime();
            String str = zzfcr2.zzy;
            if (str != null) {
                this.zzd.put(zzfcr2, new zzein(str, zzfcr2.zzah, 7, 0, (Integer) null));
                zzfzt.zzr(eVar2, new zzeim(this, elapsedRealtime, zzfcv, zzfcr, str, zzfjt, zzfde), zzcbg.zzf);
            }
        }
        return eVar2;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry value : this.zzd.entrySet()) {
            zzein zzein = (zzein) value.getValue();
            if (zzein.zzc != Integer.MAX_VALUE) {
                arrayList.add(zzein.toString());
            }
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void zzi(zzfcr zzfcr) {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
        if (zzfcr != null) {
            this.zzf.zze(zzfcr);
        }
        this.zzg = true;
    }

    public final synchronized void zzj() {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzk(List list) {
        this.zzi = this.zza.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfcr zzfcr = (zzfcr) it.next();
            if (!TextUtils.isEmpty(zzfcr.zzy)) {
                this.zzd.put(zzfcr, new zzein(zzfcr.zzy, zzfcr.zzah, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, (Integer) null));
            }
        }
    }

    public final synchronized void zzl() {
        this.zzi = this.zza.elapsedRealtime();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzm(com.google.android.gms.internal.ads.zzfcr r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = r1.zzd     // Catch:{ all -> 0x0017 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x0017 }
            com.google.android.gms.internal.ads.zzein r2 = (com.google.android.gms.internal.ads.zzein) r2     // Catch:{ all -> 0x0017 }
            if (r2 == 0) goto L_0x0015
            boolean r0 = r1.zzg     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0015
            r0 = 8
            r2.zzc = r0     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)
            return
        L_0x0015:
            monitor-exit(r1)
            return
        L_0x0017:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeio.zzm(com.google.android.gms.internal.ads.zzfcr):void");
    }
}
