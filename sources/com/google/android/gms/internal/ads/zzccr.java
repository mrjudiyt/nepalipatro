package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzccr {
    private final Context zza;
    private final zzcdc zzb;
    private final ViewGroup zzc;
    private zzccq zzd;

    public zzccr(Context context, ViewGroup viewGroup, zzcgb zzcgb) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcgb;
        this.zzd = null;
    }

    public final zzccq zza() {
        return this.zzd;
    }

    public final Integer zzb() {
        zzccq zzccq = this.zzd;
        if (zzccq != null) {
            return zzccq.zzl();
        }
        return null;
    }

    public final void zzc(int i10, int i11, int i12, int i13) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzccq zzccq = this.zzd;
        if (zzccq != null) {
            zzccq.zzF(i10, i11, i12, i13);
        }
    }

    public final void zzd(int i10, int i11, int i12, int i13, int i14, boolean z10, zzcdb zzcdb) {
        if (this.zzd == null) {
            zzbcs.zza(this.zzb.zzm().zza(), this.zzb.zzk(), "vpr2");
            Context context = this.zza;
            zzcdc zzcdc = this.zzb;
            zzccq zzccq = new zzccq(context, zzcdc, i14, z10, zzcdc.zzm().zza(), zzcdb);
            this.zzd = zzccq;
            this.zzc.addView(zzccq, 0, new ViewGroup.LayoutParams(-1, -1));
            int i15 = i10;
            int i16 = i11;
            int i17 = i12;
            int i18 = i13;
            this.zzd.zzF(i10, i11, i12, i13);
            this.zzb.zzz(false);
        }
    }

    public final void zze() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzccq zzccq = this.zzd;
        if (zzccq != null) {
            zzccq.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzccq zzccq = this.zzd;
        if (zzccq != null) {
            zzccq.zzu();
        }
    }

    public final void zzg(int i10) {
        zzccq zzccq = this.zzd;
        if (zzccq != null) {
            zzccq.zzC(i10);
        }
    }
}
