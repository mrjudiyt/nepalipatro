package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzcen implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcen(zzcdc zzcdc) {
        Context context = zzcdc.getContext();
        this.zza = context;
        this.zzb = zzt.zzp().zzc(context, zzcdc.zzn().zza);
        this.zzc = new WeakReference(zzcdc);
    }

    static /* bridge */ /* synthetic */ void zze(zzcen zzcen, String str, Map map) {
        zzcdc zzcdc = (zzcdc) zzcen.zzc.get();
        if (zzcdc != null) {
            zzcdc.zzd("onPrecacheEvent", map);
        }
    }

    public void release() {
    }

    public abstract void zzf();

    public final void zzg(String str, String str2, String str3, String str4) {
        zzcam.zza.post(new zzcem(this, str, str2, str3, str4));
    }

    /* access modifiers changed from: protected */
    public final void zzh(String str, String str2, int i10) {
        zzcam.zza.post(new zzcek(this, str, str2, i10));
    }

    public final void zzj(String str, String str2, long j10) {
        zzcam.zza.post(new zzcel(this, str, str2, j10));
    }

    public final void zzn(String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        zzcam.zza.post(new zzcej(this, str, str2, i10, i11, j10, j11, z10, i12, i13));
    }

    public final void zzo(String str, String str2, long j10, long j11, boolean z10, long j12, long j13, long j14, int i10, int i11) {
        Handler handler = zzcam.zza;
        zzcei zzcei = r0;
        zzcei zzcei2 = new zzcei(this, str, str2, j10, j11, j12, j13, j14, z10, i10, i11);
        handler.post(zzcei);
    }

    /* access modifiers changed from: protected */
    public void zzp(int i10) {
    }

    /* access modifiers changed from: protected */
    public void zzq(int i10) {
    }

    /* access modifiers changed from: protected */
    public void zzr(int i10) {
    }

    /* access modifiers changed from: protected */
    public void zzs(int i10) {
    }

    public abstract boolean zzt(String str);

    public boolean zzu(String str, String[] strArr) {
        return zzt(str);
    }

    public boolean zzw(String str, String[] strArr, zzcef zzcef) {
        return zzt(str);
    }
}
