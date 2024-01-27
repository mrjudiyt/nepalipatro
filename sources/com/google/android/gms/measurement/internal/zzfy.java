package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.util.Clock;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class zzfy extends zzmo {
    public zzfy(zzmp zzmp) {
        super(zzmp);
    }

    public final /* bridge */ /* synthetic */ zzmz g_() {
        return super.g_();
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    /* access modifiers changed from: protected */
    public final boolean zzc() {
        return false;
    }

    public final /* bridge */ /* synthetic */ zzae zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ zzaf zze() {
        return super.zze();
    }

    public final /* bridge */ /* synthetic */ zzba zzf() {
        return super.zzf();
    }

    public final /* bridge */ /* synthetic */ zzt zzg() {
        return super.zzg();
    }

    public final /* bridge */ /* synthetic */ zzao zzh() {
        return super.zzh();
    }

    public final /* bridge */ /* synthetic */ zzfq zzi() {
        return super.zzi();
    }

    public final /* bridge */ /* synthetic */ zzfr zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ zzgd zzk() {
        return super.zzk();
    }

    public final /* bridge */ /* synthetic */ zzgy zzl() {
        return super.zzl();
    }

    public final /* bridge */ /* synthetic */ zzgp zzm() {
        return super.zzm();
    }

    public final /* bridge */ /* synthetic */ zzls zzn() {
        return super.zzn();
    }

    public final /* bridge */ /* synthetic */ zzmn zzo() {
        return super.zzo();
    }

    public final /* bridge */ /* synthetic */ zznd zzq() {
        return super.zzq();
    }

    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    public final boolean zzu() {
        zzak();
        ConnectivityManager connectivityManager = (ConnectivityManager) zza().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    /* access modifiers changed from: private */
    public static byte[] zza(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream2 = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream2.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream2.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }
}
