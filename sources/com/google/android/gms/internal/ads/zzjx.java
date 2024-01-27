package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzjx implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzaad, zzpc, zzwa, zzsw, zzia, zzhw, zzim {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzkb zza;

    /* synthetic */ zzjx(zzkb zzkb, zzjw zzjw) {
        this.zza = zzkb;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        zzkb.zzP(this.zza, surfaceTexture);
        this.zza.zzag(i10, i11);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.zza.zzaj((Object) null);
        this.zza.zzag(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.zza.zzag(i10, i11);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.zza.zzag(i11, i12);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzag(0, 0);
    }

    public final void zza(boolean z10) {
        this.zza.zzan();
    }

    public final void zzb(Exception exc) {
        this.zza.zzr.zzv(exc);
    }

    public final void zzc(String str, long j10, long j11) {
        this.zza.zzr.zzw(str, j10, j11);
    }

    public final void zzd(String str) {
        this.zza.zzr.zzx(str);
    }

    public final void zze(zzid zzid) {
        this.zza.zzr.zzy(zzid);
        this.zza.zzL = null;
        this.zza.zzS = null;
    }

    public final void zzf(zzid zzid) {
        this.zza.zzS = zzid;
        this.zza.zzr.zzz(zzid);
    }

    public final void zzg(zzam zzam, zzie zzie) {
        this.zza.zzL = zzam;
        this.zza.zzr.zzA(zzam, zzie);
    }

    public final void zzh(long j10) {
        this.zza.zzr.zzB(j10);
    }

    public final void zzi(Exception exc) {
        this.zza.zzr.zzC(exc);
    }

    public final void zzj(int i10, long j10, long j11) {
        this.zza.zzr.zzD(i10, j10, j11);
    }

    public final void zzk(int i10, long j10) {
        this.zza.zzr.zzE(i10, j10);
    }

    public final void zzl(Object obj, long j10) {
        this.zza.zzr.zzF(obj, j10);
        zzkb zzkb = this.zza;
        if (zzkb.zzN == obj) {
            zzeo zzD = zzkb.zzl;
            zzD.zzd(26, zzjv.zza);
            zzD.zzc();
        }
    }

    public final void zzm(boolean z10) {
        zzkb zzkb = this.zza;
        if (zzkb.zzW != z10) {
            zzkb.zzW = z10;
            zzeo zzD = this.zza.zzl;
            zzD.zzd(23, new zzjt(z10));
            zzD.zzc();
        }
    }

    public final void zzn(Exception exc) {
        this.zza.zzr.zzG(exc);
    }

    public final void zzo(String str, long j10, long j11) {
        this.zza.zzr.zzH(str, j10, j11);
    }

    public final void zzp(String str) {
        this.zza.zzr.zzI(str);
    }

    public final void zzq(zzid zzid) {
        this.zza.zzr.zzJ(zzid);
        this.zza.zzK = null;
        this.zza.zzR = null;
    }

    public final void zzr(zzid zzid) {
        this.zza.zzR = zzid;
        this.zza.zzr.zzK(zzid);
    }

    public final void zzs(long j10, int i10) {
        this.zza.zzr.zzL(j10, i10);
    }

    public final void zzt(zzam zzam, zzie zzie) {
        this.zza.zzK = zzam;
        this.zza.zzr.zzM(zzam, zzie);
    }

    public final void zzu(zzdm zzdm) {
        this.zza.zzab = zzdm;
        zzeo zzD = this.zza.zzl;
        zzD.zzd(25, new zzju(zzdm));
        zzD.zzc();
    }
}
