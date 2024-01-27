package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbq;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdlv {
    private final zzbq zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdlv(zzbq zzbq, Clock clock, Executor executor) {
        this.zza = zzbq;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        long elapsedRealtime = this.zzb.elapsedRealtime();
        boolean z10 = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = this.zzb.elapsedRealtime();
        if (decodeByteArray != null) {
            long j10 = elapsedRealtime2 - elapsedRealtime;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z10 = true;
            }
            zze.zza("Decoded image w: " + width + " h:" + height + " bytes: " + allocationByteCount + " time: " + j10 + " on ui thread: " + z10);
        }
        return decodeByteArray;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Bitmap zza(double d10, boolean z10, zzamc zzamc) {
        byte[] bArr = zzamc.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d10 * 160.0d);
        if (!z10) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgc)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i10 = options.outWidth * options.outHeight;
            if (i10 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i10 - 1) / ((Integer) zzba.zzc().zzb(zzbci.zzgd)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }

    public final e zzb(String str, double d10, boolean z10) {
        return zzfzt.zzm(this.zza.zza(str), new zzdlu(this, d10, z10), this.zzc);
    }
}
