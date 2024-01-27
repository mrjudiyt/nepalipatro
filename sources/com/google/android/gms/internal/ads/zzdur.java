package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdur {
    private boolean zza = false;
    private boolean zzb = false;
    /* access modifiers changed from: private */
    public boolean zzc = false;
    /* access modifiers changed from: private */
    public final long zzd;
    /* access modifiers changed from: private */
    public final zzcbl zze = new zzcbl();
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdqj zzh;
    /* access modifiers changed from: private */
    public final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    /* access modifiers changed from: private */
    public final zzdsy zzl;
    private final zzcaz zzm;
    private final Map zzn = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public final zzdeg zzo;
    /* access modifiers changed from: private */
    public final zzfjh zzp;
    private boolean zzq = true;

    public zzdur(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdqj zzdqj, ScheduledExecutorService scheduledExecutorService, zzdsy zzdsy, zzcaz zzcaz, zzdeg zzdeg, zzfjh zzfjh) {
        this.zzh = zzdqj;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdsy;
        this.zzm = zzcaz;
        this.zzo = zzdeg;
        this.zzp = zzfjh;
        this.zzd = zzt.zzB().elapsedRealtime();
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static /* bridge */ /* synthetic */ void zzj(zzdur zzdur, String str) {
        zzdur zzdur2 = zzdur;
        int i10 = 5;
        zzfit zza2 = zzfis.zza(zzdur2.zzf, 5);
        zza2.zzh();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                zzfit zza3 = zzfis.zza(zzdur2.zzf, i10);
                zza3.zzh();
                zza3.zzd(next);
                Object obj = new Object();
                zzcbl zzcbl = new zzcbl();
                e zzo2 = zzfzt.zzo(zzcbl, ((Long) zzba.zzc().zzb(zzbci.zzbM)).longValue(), TimeUnit.SECONDS, zzdur2.zzk);
                zzdur2.zzl.zzc(next);
                zzdur2.zzo.zzc(next);
                long elapsedRealtime = zzt.zzB().elapsedRealtime();
                zzdui zzdui = r1;
                e eVar = zzo2;
                zzdui zzdui2 = new zzdui(zzdur, obj, zzcbl, next, elapsedRealtime, zza3);
                eVar.addListener(zzdui, zzdur2.zzi);
                arrayList.add(eVar);
                zzduq zzduq = new zzduq(zzdur, obj, next, elapsedRealtime, zza3, zzcbl);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i11 = 0;
                        while (i11 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzblq(optString, bundle));
                            i11++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdur2.zzv(next, false, "", 0);
                try {
                    zzdur2.zzj.execute(new zzdum(zzdur, next, zzduq, zzdur2.zzh.zzc(next, new JSONObject()), arrayList2));
                } catch (zzfds unused2) {
                    try {
                        zzduq.zze("Failed to create Adapter.");
                    } catch (RemoteException e10) {
                        zzcat.zzh("", e10);
                    }
                }
                i10 = 5;
            }
            zzfzt.zza(arrayList).zza(new zzduj(zzdur2, zza2), zzdur2.zzi);
        } catch (JSONException e11) {
            zze.zzb("Malformed CLD response", e11);
            zzdur2.zzo.zza("MalformedJson");
            zzdur2.zzl.zza("MalformedJson");
            zzdur2.zze.zzd(e11);
            zzt.zzo().zzu(e11, "AdapterInitializer.updateAdapterStatus");
            zzfjh zzfjh = zzdur2.zzp;
            zza2.zzg(e11);
            zza2.zzf(false);
            zzfjh.zzb(zza2.zzl());
        }
    }

    private final synchronized e zzu() {
        String zzc2 = zzt.zzo().zzh().zzh().zzc();
        if (!TextUtils.isEmpty(zzc2)) {
            return zzfzt.zzh(zzc2);
        }
        zzcbl zzcbl = new zzcbl();
        zzt.zzo().zzh().zzq(new zzduk(this, zzcbl));
        return zzcbl;
    }

    /* access modifiers changed from: private */
    public final void zzv(String str, boolean z10, String str2, int i10) {
        this.zzn.put(str, new zzblg(str, z10, i10, str2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzf(zzfit zzfit) {
        this.zze.zzc(Boolean.TRUE);
        zzfit.zzf(true);
        this.zzp.zzb(zzfit.zzl());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzblg zzblg = (zzblg) this.zzn.get(str);
            arrayList.add(new zzblg(str, zzblg.zzb, zzblg.zzc, zzblg.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        synchronized (this) {
            if (!this.zzc) {
                zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (zzt.zzB().elapsedRealtime() - this.zzd));
                this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                this.zze.zzd(new Exception());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r2.equals("com.google.ads.mediation.admob.AdMobAdapter") == false) goto L_0x000c;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0028 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zzn(java.lang.String r2, com.google.android.gms.internal.ads.zzblk r3, com.google.android.gms.internal.ads.zzfej r4, java.util.List r5) {
        /*
            r1 = this;
            java.lang.String r0 = "com.google.ads.mediation.admob.AdMobAdapter"
            if (r2 == r0) goto L_0x001d
            if (r2 == 0) goto L_0x000c
            boolean r0 = r2.equals(r0)     // Catch:{ zzfds -> 0x0028, RemoteException -> 0x0021 }
            if (r0 != 0) goto L_0x001d
        L_0x000c:
            java.lang.ref.WeakReference r0 = r1.zzg     // Catch:{ zzfds -> 0x0028, RemoteException -> 0x0021 }
            java.lang.Object r0 = r0.get()     // Catch:{ zzfds -> 0x0028, RemoteException -> 0x0021 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ zzfds -> 0x0028, RemoteException -> 0x0021 }
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            android.content.Context r0 = r1.zzf     // Catch:{ zzfds -> 0x0028, RemoteException -> 0x0021 }
        L_0x0019:
            r4.zzi(r0, r3, r5)     // Catch:{ zzfds -> 0x0028, RemoteException -> 0x0021 }
            return
        L_0x001d:
            r3.zzf()     // Catch:{ zzfds -> 0x0028, RemoteException -> 0x0021 }
            return
        L_0x0021:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzftr r3 = new com.google.android.gms.internal.ads.zzftr
            r3.<init>(r2)
            throw r3
        L_0x0028:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0042 }
            r4.<init>()     // Catch:{ RemoteException -> 0x0042 }
            java.lang.String r5 = "Failed to initialize adapter. "
            r4.append(r5)     // Catch:{ RemoteException -> 0x0042 }
            r4.append(r2)     // Catch:{ RemoteException -> 0x0042 }
            java.lang.String r2 = " does not implement the initialize() method."
            r4.append(r2)     // Catch:{ RemoteException -> 0x0042 }
            java.lang.String r2 = r4.toString()     // Catch:{ RemoteException -> 0x0042 }
            r3.zze(r2)     // Catch:{ RemoteException -> 0x0042 }
            return
        L_0x0042:
            r2 = move-exception
            java.lang.String r3 = ""
            com.google.android.gms.internal.ads.zzcat.zzh(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdur.zzn(java.lang.String, com.google.android.gms.internal.ads.zzblk, com.google.android.gms.internal.ads.zzfej, java.util.List):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(zzcbl zzcbl) {
        this.zzi.execute(new zzduh(this, zzcbl));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(Object obj, zzcbl zzcbl, String str, long j10, zzfit zzfit) {
        synchronized (obj) {
            if (!zzcbl.isDone()) {
                zzv(str, false, "Timeout.", (int) (zzt.zzB().elapsedRealtime() - j10));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzfjh zzfjh = this.zzp;
                zzfit.zzc("Timeout");
                zzfit.zzf(false);
                zzfjh.zzb(zzfit.zzl());
                zzcbl.zzc(Boolean.FALSE);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbeh.zza.zze()).booleanValue()) {
            if (this.zzm.zzc >= ((Integer) zzba.zzc().zzb(zzbci.zzbL)).intValue() && this.zzq) {
                if (!this.zza) {
                    synchronized (this) {
                        if (!this.zza) {
                            this.zzl.zzf();
                            this.zzo.zzf();
                            this.zze.addListener(new zzdun(this), this.zzi);
                            this.zza = true;
                            e zzu = zzu();
                            this.zzk.schedule(new zzdug(this), ((Long) zzba.zzc().zzb(zzbci.zzbN)).longValue(), TimeUnit.SECONDS);
                            zzfzt.zzr(zzu, new zzdup(this), this.zzi);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        if (!this.zza) {
            zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
            this.zze.zzc(Boolean.FALSE);
            this.zza = true;
            this.zzb = true;
        }
    }

    public final void zzs(zzbln zzbln) {
        this.zze.addListener(new zzdul(this, zzbln), this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
