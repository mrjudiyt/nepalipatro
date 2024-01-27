package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfmz implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfnx zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzfmq zzf;
    private final long zzg = System.currentTimeMillis();
    private final int zzh;

    public zzfmz(Context context, int i10, int i11, String str, String str2, String str3, zzfmq zzfmq) {
        this.zzb = str;
        this.zzh = i11;
        this.zzc = str2;
        this.zzf = zzfmq;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfnx zzfnx = new zzfnx(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfnx;
        this.zzd = new LinkedBlockingQueue();
        zzfnx.checkAvailabilityAndConnect();
    }

    static zzfoj zza() {
        return new zzfoj((byte[]) null, 1);
    }

    private final void zze(int i10, long j10, Exception exc) {
        this.zzf.zzc(i10, System.currentTimeMillis() - j10, exc);
    }

    public final void onConnected(Bundle bundle) {
        zzfoc zzd2 = zzd();
        if (zzd2 != null) {
            try {
                zzfoj zzf2 = zzd2.zzf(new zzfoh(1, this.zzh, this.zzb, this.zzc));
                zze(5011, this.zzg, (Exception) null);
                this.zzd.put(zzf2);
            } catch (Throwable th) {
                zzc();
                this.zze.quit();
                throw th;
            }
            zzc();
            this.zze.quit();
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zze(4012, this.zzg, (Exception) null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final void onConnectionSuspended(int i10) {
        try {
            zze(4011, this.zzg, (Exception) null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzfoj zzb(int i10) {
        zzfoj zzfoj;
        try {
            zzfoj = (zzfoj) this.zzd.poll(50000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            zze(AdError.INTERSTITIAL_AD_TIMEOUT, this.zzg, e10);
            zzfoj = null;
        }
        zze(AuthApiStatusCodes.AUTH_TOKEN_ERROR, this.zzg, (Exception) null);
        if (zzfoj != null) {
            if (zzfoj.zzc == 7) {
                zzfmq.zzg(3);
            } else {
                zzfmq.zzg(2);
            }
        }
        return zzfoj == null ? zza() : zzfoj;
    }

    public final void zzc() {
        zzfnx zzfnx = this.zza;
        if (zzfnx == null) {
            return;
        }
        if (zzfnx.isConnected() || this.zza.isConnecting()) {
            this.zza.disconnect();
        }
    }

    /* access modifiers changed from: protected */
    public final zzfoc zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
