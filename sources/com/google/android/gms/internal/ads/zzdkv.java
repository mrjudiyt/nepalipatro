package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdkv {
    private final zzdpt zza;
    private final zzdoi zzb;
    private final zzcqb zzc;
    private final zzdjr zzd;

    public zzdkv(zzdpt zzdpt, zzdoi zzdoi, zzcqb zzcqb, zzdjr zzdjr) {
        this.zza = zzdpt;
        this.zzb = zzdoi;
        this.zzc = zzcqb;
        this.zzd = zzdjr;
    }

    public final View zza() {
        zzcgb zza2 = this.zza.zza(zzq.zzc(), (zzfcr) null, (zzfcv) null);
        ((View) zza2).setVisibility(8);
        zza2.zzad("/sendMessageToSdk", new zzdkq(this));
        zza2.zzad("/adMuted", new zzdkr(this));
        this.zzb.zzj(new WeakReference(zza2), "/loadHtml", new zzdks(this));
        this.zzb.zzj(new WeakReference(zza2), "/showOverlay", new zzdkt(this));
        this.zzb.zzj(new WeakReference(zza2), "/hideOverlay", new zzdku(this));
        return (View) zza2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcgb zzcgb, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcgb zzcgb, Map map) {
        this.zzd.zzg();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Map map, boolean z10, int i10, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzcgb zzcgb, Map map) {
        zzcat.zzi("Showing native ads overlay.");
        zzcgb.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzcgb zzcgb, Map map) {
        zzcat.zzi("Hiding native ads overlay.");
        zzcgb.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}
