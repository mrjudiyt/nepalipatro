package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeoc implements zzetw {
    private final zzetw zza;
    private final zzfdn zzb;
    private final Context zzc;
    private final zzcac zzd;

    public zzeoc(zzepw zzepw, zzfdn zzfdn, Context context, zzcac zzcac) {
        this.zza = zzepw;
        this.zzb = zzfdn;
        this.zzc = context;
        this.zzd = zzcac;
    }

    public final int zza() {
        return 7;
    }

    public final e zzb() {
        return zzfzt.zzm(this.zza.zzb(), new zzeob(this), zzcbg.zzf);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeod zzc(zzeub zzeub) {
        boolean z10;
        String str;
        String str2;
        int i10;
        float f10;
        int i11;
        int i12;
        DisplayMetrics displayMetrics;
        zzq zzq = this.zzb.zze;
        zzq[] zzqArr = zzq.zzg;
        if (zzqArr != null) {
            str = null;
            boolean z11 = false;
            boolean z12 = false;
            z10 = false;
            for (zzq zzq2 : zzqArr) {
                boolean z13 = zzq2.zzi;
                if (!z13 && !z11) {
                    str = zzq2.zza;
                    z11 = true;
                }
                if (z13) {
                    if (!z12) {
                        z12 = true;
                        z10 = true;
                    } else {
                        z12 = true;
                    }
                }
                if (z11 && z12) {
                    break;
                }
            }
        } else {
            str = zzq.zza;
            z10 = zzq.zzi;
        }
        Resources resources = this.zzc.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            i11 = 0;
            f10 = 0.0f;
            i10 = 0;
        } else {
            zzcac zzcac = this.zzd;
            f10 = displayMetrics.density;
            i10 = displayMetrics.widthPixels;
            i11 = displayMetrics.heightPixels;
            str2 = zzcac.zzh().zzm();
        }
        StringBuilder sb = new StringBuilder();
        zzq[] zzqArr2 = zzq.zzg;
        if (zzqArr2 != null) {
            boolean z14 = false;
            for (zzq zzq3 : zzqArr2) {
                if (zzq3.zzi) {
                    z14 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i13 = zzq3.zze;
                    if (i13 == -1) {
                        i13 = f10 != 0.0f ? (int) (((float) zzq3.zzf) / f10) : -1;
                    }
                    sb.append(i13);
                    sb.append("x");
                    int i14 = zzq3.zzb;
                    if (i14 == -2) {
                        i14 = f10 != 0.0f ? (int) (((float) zzq3.zzc) / f10) : -2;
                    }
                    sb.append(i14);
                }
            }
            if (z14) {
                if (sb.length() != 0) {
                    i12 = 0;
                    sb.insert(0, "|");
                } else {
                    i12 = 0;
                }
                sb.insert(i12, "320x50");
            }
        }
        return new zzeod(zzq, str, z10, sb.toString(), f10, i10, i11, str2, this.zzb.zzp);
    }
}
