package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzehz {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final zzgal zzc;
    private final List zzd = new ArrayList();
    private final Set zze = new HashSet();
    private Object zzf;
    private int zzg = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private final String zzh;
    private final int zzi;
    private final zzeio zzj;
    private zzfcr zzk;

    zzehz(zzfde zzfde, zzeio zzeio, zzgal zzgal) {
        this.zzi = zzfde.zzb.zzb.zzp;
        this.zzj = zzeio;
        this.zzc = zzgal;
        this.zzh = zzeiu.zzc(zzfde);
        List list = zzfde.zzb.zza;
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.put((zzfcr) list.get(i10), Integer.valueOf(i10));
        }
        this.zzb.addAll(list);
    }

    private final synchronized void zzf() {
        this.zzj.zzi(this.zzk);
        Object obj = this.zzf;
        if (obj != null) {
            this.zzc.zzc(obj);
        } else {
            this.zzc.zzd(new zzeir(3, this.zzh));
        }
    }

    private final synchronized boolean zzg(boolean z10) {
        for (zzfcr zzfcr : this.zzb) {
            Integer num = (Integer) this.zza.get(zzfcr);
            Integer valueOf = Integer.valueOf(num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER);
            if (z10 || !this.zze.contains(zzfcr.zzau)) {
                if (valueOf.intValue() < this.zzg) {
                    return true;
                }
                if (valueOf.intValue() > this.zzg) {
                    break;
                }
            }
        }
        return false;
    }

    private final synchronized boolean zzh() {
        boolean z10;
        Iterator it = this.zzd.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            Integer num = (Integer) this.zza.get((zzfcr) it.next());
            if (Integer.valueOf(num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER).intValue() < this.zzg) {
                z10 = true;
                break;
            }
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean zzi() {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 1
            boolean r1 = r2.zzg(r0)     // Catch:{ all -> 0x0014 }
            if (r1 != 0) goto L_0x0012
            boolean r1 = r2.zzh()     // Catch:{ all -> 0x0014 }
            if (r1 == 0) goto L_0x000f
            goto L_0x0012
        L_0x000f:
            r0 = 0
            monitor-exit(r2)
            return r0
        L_0x0012:
            monitor-exit(r2)
            return r0
        L_0x0014:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzehz.zzi():boolean");
    }

    /* access modifiers changed from: package-private */
    public final synchronized zzfcr zza() {
        int i10 = 0;
        while (i10 < this.zzb.size()) {
            zzfcr zzfcr = (zzfcr) this.zzb.get(i10);
            String str = zzfcr.zzau;
            if (this.zze.contains(str)) {
                i10++;
            } else {
                if (!TextUtils.isEmpty(str)) {
                    this.zze.add(str);
                }
                this.zzd.add(zzfcr);
                return (zzfcr) this.zzb.remove(i10);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzb(java.lang.Throwable r1, com.google.android.gms.internal.ads.zzfcr r2) {
        /*
            r0 = this;
            monitor-enter(r0)
            java.util.List r1 = r0.zzd     // Catch:{ all -> 0x0020 }
            r1.remove(r2)     // Catch:{ all -> 0x0020 }
            java.util.Set r1 = r0.zze     // Catch:{ all -> 0x0020 }
            java.lang.String r2 = r2.zzau     // Catch:{ all -> 0x0020 }
            r1.remove(r2)     // Catch:{ all -> 0x0020 }
            boolean r1 = r0.zzd()     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x001e
            boolean r1 = r0.zzi()     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x001e
            r0.zzf()     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)
            return
        L_0x001e:
            monitor-exit(r0)
            return
        L_0x0020:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzehz.zzb(java.lang.Throwable, com.google.android.gms.internal.ads.zzfcr):void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzc(Object obj, zzfcr zzfcr) {
        this.zzd.remove(zzfcr);
        if (!zzd()) {
            Integer num = (Integer) this.zza.get(zzfcr);
            Integer valueOf = Integer.valueOf(num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER);
            if (valueOf.intValue() > this.zzg) {
                this.zzj.zzm(zzfcr);
                return;
            }
            if (this.zzf != null) {
                this.zzj.zzm(this.zzk);
            }
            this.zzg = valueOf.intValue();
            this.zzf = obj;
            this.zzk = zzfcr;
            if (!zzi()) {
                zzf();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean zzd() {
        return this.zzc.isDone();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zze() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzd()     // Catch:{ all -> 0x001d }
            r1 = 0
            if (r0 != 0) goto L_0x001b
            java.util.List r0 = r3.zzd     // Catch:{ all -> 0x001d }
            int r2 = r3.zzi     // Catch:{ all -> 0x001d }
            int r0 = r0.size()     // Catch:{ all -> 0x001d }
            if (r0 >= r2) goto L_0x001b
            boolean r0 = r3.zzg(r1)     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001b
            r0 = 1
            monitor-exit(r3)
            return r0
        L_0x001b:
            monitor-exit(r3)
            return r1
        L_0x001d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzehz.zze():boolean");
    }
}
