package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzzr {
    private final zzyx zza = new zzyx();
    private final zzzn zzb;
    private final zzzq zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzzr(Context context) {
        zzzn zzzn;
        zzzq zzzq = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i10 = zzfk.zza;
            zzzn = zzzp.zzc(applicationContext);
            if (zzzn == null) {
                zzzn = zzzo.zzc(applicationContext);
            }
        } else {
            zzzn = null;
        }
        this.zzb = zzzn;
        this.zzc = zzzn != null ? zzzq.zza() : zzzq;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* synthetic */ void zzb(zzzr zzzr, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            zzzr.zzk = refreshRate;
            zzzr.zzl = (refreshRate * 80) / 100;
            return;
        }
        zzer.zzf("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        zzzr.zzk = -9223372036854775807L;
        zzzr.zzl = -9223372036854775807L;
    }

    private final void zzk() {
        Surface surface;
        if (zzfk.zza >= 30 && (surface = this.zze) != null && this.zzj != Integer.MIN_VALUE && this.zzh != 0.0f) {
            this.zzh = 0.0f;
            zzzm.zza(surface, 0.0f);
        }
    }

    private final void zzl() {
        this.zzm = 0;
        this.zzp = -1;
        this.zzn = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (java.lang.Math.abs(r0 - r10.zzg) >= r2) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r10.zza.zzb() >= 30) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzm() {
        /*
            r10 = this;
            int r0 = com.google.android.gms.internal.ads.zzfk.zza
            r1 = 30
            if (r0 < r1) goto L_0x006d
            android.view.Surface r0 = r10.zze
            if (r0 != 0) goto L_0x000b
            goto L_0x006d
        L_0x000b:
            com.google.android.gms.internal.ads.zzyx r0 = r10.zza
            boolean r0 = r0.zzg()
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzyx r0 = r10.zza
            float r0 = r0.zza()
            goto L_0x001c
        L_0x001a:
            float r0 = r10.zzf
        L_0x001c:
            float r2 = r10.zzg
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0023
            return
        L_0x0023:
            r3 = 1
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0058
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.zzyx r1 = r10.zza
            boolean r1 = r1.zzg()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzyx r1 = r10.zza
            long r6 = r1.zzd()
            r8 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x004b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L_0x004b:
            float r1 = r10.zzg
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0063
            goto L_0x0064
        L_0x0058:
            if (r6 != 0) goto L_0x0068
            com.google.android.gms.internal.ads.zzyx r2 = r10.zza
            int r2 = r2.zzb()
            if (r2 < r1) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r3 = 0
        L_0x0064:
            if (r3 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            return
        L_0x0068:
            r10.zzg = r0
            r10.zzn(r5)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzr.zzm():void");
    }

    private final void zzn(boolean z10) {
        Surface surface;
        if (zzfk.zza >= 30 && (surface = this.zze) != null && this.zzj != Integer.MIN_VALUE) {
            float f10 = 0.0f;
            if (this.zzd) {
                float f11 = this.zzg;
                if (f11 != -1.0f) {
                    f10 = this.zzi * f11;
                }
            }
            if (z10 || this.zzh != f10) {
                this.zzh = f10;
                zzzm.zza(surface, f10);
            }
        }
    }

    public final long zza(long j10) {
        long j11;
        if (this.zzp != -1 && this.zza.zzg()) {
            long zzc2 = this.zza.zzc();
            long j12 = this.zzq + ((long) (((float) (zzc2 * (this.zzm - this.zzp))) / this.zzi));
            if (Math.abs(j10 - j12) > 20000000) {
                zzl();
            } else {
                j10 = j12;
            }
        }
        this.zzn = this.zzm;
        this.zzo = j10;
        zzzq zzzq = this.zzc;
        if (zzzq == null || this.zzk == -9223372036854775807L) {
            return j10;
        }
        long j13 = zzzq.zza;
        if (j13 == -9223372036854775807L) {
            return j10;
        }
        long j14 = this.zzk;
        long j15 = j13 + (((j10 - j13) / j14) * j14);
        if (j10 <= j15) {
            j11 = j15 - j14;
        } else {
            long j16 = j15;
            j15 = j14 + j15;
            j11 = j16;
        }
        long j17 = this.zzl;
        if (j15 - j10 >= j10 - j11) {
            j15 = j11;
        }
        return j15 - j17;
    }

    public final void zzc(float f10) {
        this.zzf = f10;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j10) {
        long j11 = this.zzn;
        if (j11 != -1) {
            this.zzp = j11;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j10 * 1000);
        zzm();
    }

    public final void zze(float f10) {
        this.zzi = f10;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        if (this.zzb != null) {
            zzzq zzzq = this.zzc;
            Objects.requireNonNull(zzzq);
            zzzq.zzb();
            this.zzb.zzb(new zzzk(this));
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzzn zzzn = this.zzb;
        if (zzzn != null) {
            zzzn.zza();
            zzzq zzzq = this.zzc;
            Objects.requireNonNull(zzzq);
            zzzq.zzc();
        }
        zzk();
    }

    public final void zzi(Surface surface) {
        int i10 = zzfk.zza;
        boolean zza2 = zzzl.zza(surface);
        Surface surface2 = this.zze;
        if (true == zza2) {
            surface = null;
        }
        if (surface2 != surface) {
            zzk();
            this.zze = surface;
            zzn(true);
        }
    }

    public final void zzj(int i10) {
        if (this.zzj != i10) {
            this.zzj = i10;
            zzn(true);
        }
    }
}
