package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzhb extends zzgj {
    public final zzgn zzb;
    public final int zzc;

    public zzhb(zzgn zzgn, int i10, int i11) {
        super(zzb(AdError.REMOTE_ADS_SERVICE_ERROR, 1));
        this.zzb = zzgn;
        this.zzc = 1;
    }

    public static zzhb zza(IOException iOException, zzgn zzgn, int i10) {
        String message = iOException.getMessage();
        boolean z10 = iOException instanceof SocketTimeoutException;
        int i11 = AdError.INTERNAL_ERROR_CODE;
        if (z10) {
            i11 = AdError.CACHE_ERROR_CODE;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else if (message != null && zzfsc.zza(message).matches("cleartext.*not permitted.*")) {
            i11 = 2007;
        }
        if (i11 == 2007) {
            return new zzha(iOException, zzgn);
        }
        return new zzhb(iOException, zzgn, i11, i10);
    }

    private static int zzb(int i10, int i11) {
        if (i10 != 2000) {
            return i10;
        }
        if (i11 != 1) {
            return 2000;
        }
        return AdError.INTERNAL_ERROR_CODE;
    }

    public zzhb(IOException iOException, zzgn zzgn, int i10, int i11) {
        super((Throwable) iOException, zzb(i10, i11));
        this.zzb = zzgn;
        this.zzc = i11;
    }

    public zzhb(String str, zzgn zzgn, int i10, int i11) {
        super(str, zzb(i10, i11));
        this.zzb = zzgn;
        this.zzc = i11;
    }

    public zzhb(String str, IOException iOException, zzgn zzgn, int i10, int i11) {
        super(str, iOException, zzb(i10, i11));
        this.zzb = zzgn;
        this.zzc = i11;
    }
}
