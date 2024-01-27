package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbe;
import com.google.android.gms.ads.internal.util.zzbf;
import com.google.android.gms.ads.internal.util.zzbh;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcdd {
    private final Context zza;
    private final String zzb;
    private final zzcaz zzc;
    private final zzbcx zzd;
    private final zzbda zze;
    private final zzbh zzf;
    private final long[] zzg;
    private final String[] zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = false;
    private boolean zzm;
    private zzcci zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq = -1;

    public zzcdd(Context context, zzcaz zzcaz, String str, zzbda zzbda, zzbcx zzbcx) {
        zzbf zzbf = new zzbf();
        zzbf zzbf2 = zzbf;
        zzbf2.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbf2.zza("1_5", 1.0d, 5.0d);
        zzbf2.zza("5_10", 5.0d, 10.0d);
        zzbf2.zza("10_20", 10.0d, 20.0d);
        zzbf2.zza("20_30", 20.0d, 30.0d);
        zzbf2.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.zzf = zzbf.zzb();
        this.zza = context;
        this.zzc = zzcaz;
        this.zzb = str;
        this.zze = zzbda;
        this.zzd = zzbcx;
        String str2 = (String) zzba.zzc().zzb(zzbci.zzA);
        if (str2 == null) {
            this.zzh = new String[0];
            this.zzg = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.zzh = new String[length];
        this.zzg = new long[length];
        for (int i10 = 0; i10 < split.length; i10++) {
            try {
                this.zzg[i10] = Long.parseLong(split[i10]);
            } catch (NumberFormatException e10) {
                zzcat.zzk("Unable to parse frame hash target time number.", e10);
                this.zzg[i10] = -1;
            }
        }
    }

    public final void zza(zzcci zzcci) {
        zzbcs.zza(this.zze, this.zzd, "vpc2");
        this.zzi = true;
        this.zze.zzd("vpn", zzcci.zzj());
        this.zzn = zzcci;
    }

    public final void zzb() {
        if (this.zzi && !this.zzj) {
            zzbcs.zza(this.zze, this.zzd, "vfr2");
            this.zzj = true;
        }
    }

    public final void zzc() {
        this.zzm = true;
        if (this.zzj && !this.zzk) {
            zzbcs.zza(this.zze, this.zzd, "vfp2");
            this.zzk = true;
        }
    }

    public final void zzd() {
        if (((Boolean) zzbeq.zza.zze()).booleanValue() && !this.zzo) {
            Bundle bundle = new Bundle();
            bundle.putString(ShareConstants.MEDIA_TYPE, "native-player-metrics");
            bundle.putString("request", this.zzb);
            bundle.putString("player", this.zzn.zzj());
            for (zzbe zzbe : this.zzf.zza()) {
                String valueOf = String.valueOf(zzbe.zza);
                bundle.putString("fps_c_".concat(valueOf), Integer.toString(zzbe.zze));
                String valueOf2 = String.valueOf(zzbe.zza);
                bundle.putString("fps_p_".concat(valueOf2), Double.toString(zzbe.zzd));
            }
            int i10 = 0;
            while (true) {
                long[] jArr = this.zzg;
                if (i10 < jArr.length) {
                    String str = this.zzh[i10];
                    if (str != null) {
                        bundle.putString("fh_".concat(Long.valueOf(jArr[i10]).toString()), str);
                    }
                    i10++;
                } else {
                    zzt.zzp().zzh(this.zza, this.zzc.zza, "gmob-apps", bundle, true);
                    this.zzo = true;
                    return;
                }
            }
        }
    }

    public final void zze() {
        this.zzm = false;
    }

    public final void zzf(zzcci zzcci) {
        if (this.zzk && !this.zzl) {
            if (zze.zzc() && !this.zzl) {
                zze.zza("VideoMetricsMixin first frame");
            }
            zzbcs.zza(this.zze, this.zzd, "vff2");
            this.zzl = true;
        }
        long nanoTime = zzt.zzB().nanoTime();
        if (this.zzm && this.zzp && this.zzq != -1) {
            this.zzf.zzb(((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (nanoTime - this.zzq)));
        }
        this.zzp = this.zzm;
        this.zzq = nanoTime;
        long longValue = ((Long) zzba.zzc().zzb(zzbci.zzB)).longValue();
        long zza2 = (long) zzcci.zza();
        int i10 = 0;
        while (true) {
            String[] strArr = this.zzh;
            if (i10 >= strArr.length) {
                return;
            }
            if (strArr[i10] == null && longValue > Math.abs(zza2 - this.zzg[i10])) {
                String[] strArr2 = this.zzh;
                int i11 = 8;
                Bitmap bitmap = zzcci.getBitmap(8, 8);
                long j10 = 63;
                long j11 = 0;
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = 0;
                    while (i13 < i11) {
                        int pixel = bitmap.getPixel(i13, i12);
                        j11 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j10);
                        j10--;
                        i13++;
                        i11 = 8;
                    }
                    i12++;
                    i11 = 8;
                }
                strArr2[i10] = String.format("%016X", new Object[]{Long.valueOf(j11)});
                return;
            }
            zzcci zzcci2 = zzcci;
            i10++;
        }
    }
}
