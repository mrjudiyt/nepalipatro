package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcn;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.util.zzau;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcml extends zzcn {
    private final Context zza;
    private final zzcaz zzb;
    private final zzdqj zzc;
    private final zzeew zzd;
    private final zzelg zze;
    private final zzdur zzf;
    private final zzbyy zzg;
    private final zzdqo zzh;
    private final zzdvm zzi;
    private final zzbev zzj;
    private final zzfjh zzk;
    private final zzfeh zzl;
    private final zzbcj zzm;
    private boolean zzn = false;

    zzcml(Context context, zzcaz zzcaz, zzdqj zzdqj, zzeew zzeew, zzelg zzelg, zzdur zzdur, zzbyy zzbyy, zzdqo zzdqo, zzdvm zzdvm, zzbev zzbev, zzfjh zzfjh, zzfeh zzfeh, zzbcj zzbcj) {
        this.zza = context;
        this.zzb = zzcaz;
        this.zzc = zzdqj;
        this.zzd = zzeew;
        this.zze = zzelg;
        this.zzf = zzdur;
        this.zzg = zzbyy;
        this.zzh = zzdqo;
        this.zzi = zzdvm;
        this.zzj = zzbev;
        this.zzk = zzfjh;
        this.zzl = zzfeh;
        this.zzm = zzbcj;
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        if (zzt.zzo().zzh().zzP()) {
            String zzl2 = zzt.zzo().zzh().zzl();
            if (!zzt.zzs().zzj(this.zza, zzl2, this.zzb.zza)) {
                zzt.zzo().zzh().zzB(false);
                zzt.zzo().zzh().zzA("");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map zze2 = zzt.zzo().zzh().zzh().zze();
        if (!zze2.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    zzcat.zzk("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            if (this.zzc.zzd()) {
                HashMap hashMap = new HashMap();
                for (zzbos zzbos : zze2.values()) {
                    for (zzbor zzbor : zzbos.zza) {
                        String str = zzbor.zzk;
                        for (String str2 : zzbor.zzc) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((List) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        zzeex zza2 = this.zzd.zza(str3, jSONObject);
                        if (zza2 != null) {
                            zzfej zzfej = (zzfej) zza2.zzb;
                            if (!zzfej.zzC() && zzfej.zzB()) {
                                zzfej.zzj(this.zza, (zzegr) zza2.zzc, (List) entry.getValue());
                                zzcat.zze("Initialized rewarded video mediation adapter " + str3);
                            }
                        }
                    } catch (zzfds e10) {
                        zzcat.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e10);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        zzfer.zzb(this.zza, true);
    }

    public final synchronized float zze() {
        return zzt.zzr().zza();
    }

    public final String zzf() {
        return this.zzb.zza;
    }

    public final List zzg() {
        return this.zzf.zzg();
    }

    public final void zzh(String str) {
        this.zze.zzg(str);
    }

    public final void zzi() {
        this.zzf.zzl();
    }

    public final void zzj(boolean z10) {
        try {
            zzfpx.zzi(this.zza).zzn(z10);
        } catch (IOException e10) {
            throw new RemoteException(e10.getMessage());
        }
    }

    public final synchronized void zzk() {
        if (this.zzn) {
            zzcat.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbci.zza(this.zza);
        this.zzm.zza();
        zzt.zzo().zzs(this.zza, this.zzb);
        zzt.zzc().zzi(this.zza);
        this.zzn = true;
        this.zzf.zzr();
        this.zze.zze();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzdP)).booleanValue()) {
            this.zzh.zzc();
        }
        this.zzi.zzg();
        if (((Boolean) zzba.zzc().zzb(zzbci.zziU)).booleanValue()) {
            zzcbg.zza.execute(new zzcmg(this));
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjZ)).booleanValue()) {
            zzcbg.zza.execute(new zzcmi(this));
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzcD)).booleanValue()) {
            zzcbg.zza.execute(new zzcmh(this));
        }
    }

    public final void zzl(String str, IObjectWrapper iObjectWrapper) {
        String str2;
        zzcmj zzcmj;
        zzbci.zza(this.zza);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzdT)).booleanValue()) {
            zzt.zzp();
            str2 = com.google.android.gms.ads.internal.util.zzt.zzp(this.zza);
        } else {
            str2 = "";
        }
        boolean z10 = true;
        String str3 = true == TextUtils.isEmpty(str2) ? str : str2;
        if (!TextUtils.isEmpty(str3)) {
            boolean booleanValue = ((Boolean) zzba.zzc().zzb(zzbci.zzdN)).booleanValue();
            zzbca zzbca = zzbci.zzaP;
            boolean booleanValue2 = booleanValue | ((Boolean) zzba.zzc().zzb(zzbca)).booleanValue();
            if (((Boolean) zzba.zzc().zzb(zzbca)).booleanValue()) {
                zzcmj = new zzcmj(this, (Runnable) ObjectWrapper.unwrap(iObjectWrapper));
            } else {
                zzcmj = null;
                z10 = booleanValue2;
            }
            zzcmj zzcmj2 = zzcmj;
            if (z10) {
                zzt.zza().zza(this.zza, this.zzb, str3, zzcmj2, this.zzk);
            }
        }
    }

    public final void zzm(zzda zzda) {
        this.zzi.zzh(zzda, zzdvl.API);
    }

    public final void zzn(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzcat.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            zzcat.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        zzau zzau = new zzau(context);
        zzau.zzn(str);
        zzau.zzo(this.zzb.zza);
        zzau.zzr();
    }

    public final void zzo(zzbox zzbox) {
        this.zzl.zzf(zzbox);
    }

    public final synchronized void zzp(boolean z10) {
        zzt.zzr().zzc(z10);
    }

    public final synchronized void zzq(float f10) {
        zzt.zzr().zzd(f10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzr(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            android.content.Context r0 = r7.zza     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.zzbci.zza(r0)     // Catch:{ all -> 0x0031 }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x002f
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzdN     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x0031 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x0031 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002f
            android.content.Context r2 = r7.zza     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.zzcaz r3 = r7.zzb     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.zzfjh r6 = r7.zzk     // Catch:{ all -> 0x0031 }
            com.google.android.gms.ads.internal.zze r1 = com.google.android.gms.ads.internal.zzt.zza()     // Catch:{ all -> 0x0031 }
            r5 = 0
            r4 = r8
            r1.zza(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0031 }
            monitor-exit(r7)
            return
        L_0x002f:
            monitor-exit(r7)
            return
        L_0x0031:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcml.zzr(java.lang.String):void");
    }

    public final void zzs(zzbln zzbln) {
        this.zzf.zzs(zzbln);
    }

    public final void zzt(String str) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjf)).booleanValue()) {
            zzt.zzo().zzw(str);
        }
    }

    public final void zzu(zzff zzff) {
        this.zzg.zzq(this.zza, zzff);
    }

    public final synchronized boolean zzv() {
        return zzt.zzr().zze();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzw() {
        this.zzj.zza(new zzbud());
    }
}
