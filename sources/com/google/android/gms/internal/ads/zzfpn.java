package com.google.android.gms.internal.ads;

import android.net.Network;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzfpn extends zzfpb {
    private zzftm<Integer> zza;
    private zzftm<Integer> zzb;
    private zzfpm zzc;
    private HttpURLConnection zzd;

    zzfpn() {
        this(zzfpd.zza, zzfpe.zza, (zzfpm) null);
    }

    zzfpn(zzftm<Integer> zzftm, zzftm<Integer> zzftm2, zzfpm zzfpm) {
        this.zza = zzftm;
        this.zzb = zzftm2;
        this.zzc = zzfpm;
    }

    static /* synthetic */ Integer zzf() {
        return -1;
    }

    static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfpc.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() {
        zzfpc.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfpm zzfpm = this.zzc;
        Objects.requireNonNull(zzfpm);
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfpm.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfpm zzfpm, int i10, int i11) {
        this.zza = new zzfpf(i10);
        this.zzb = new zzfpg(i11);
        this.zzc = zzfpm;
        return zzm();
    }

    public HttpURLConnection zzo(Network network, URL url, int i10, int i11) {
        this.zza = new zzfph(i10);
        this.zzb = new zzfpi(i11);
        this.zzc = new zzfpj(network, url);
        return zzm();
    }

    public URLConnection zzr(URL url, int i10) {
        this.zza = new zzfpk(i10);
        this.zzc = new zzfpl(url);
        return zzm();
    }
}
