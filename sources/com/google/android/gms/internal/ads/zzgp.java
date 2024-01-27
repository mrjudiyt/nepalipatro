package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgp implements zzgi {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzgi zzc;
    private zzgi zzd;
    private zzgi zze;
    private zzgi zzf;
    private zzgi zzg;
    private zzgi zzh;
    private zzgi zzi;
    private zzgi zzj;
    private zzgi zzk;

    public zzgp(Context context, zzgi zzgi) {
        this.zza = context.getApplicationContext();
        this.zzc = zzgi;
    }

    private final zzgi zzg() {
        if (this.zze == null) {
            zzgb zzgb = new zzgb(this.zza);
            this.zze = zzgb;
            zzh(zzgb);
        }
        return this.zze;
    }

    private final void zzh(zzgi zzgi) {
        for (int i10 = 0; i10 < this.zzb.size(); i10++) {
            zzgi.zzf((zzhk) this.zzb.get(i10));
        }
    }

    private static final void zzi(zzgi zzgi, zzhk zzhk) {
        if (zzgi != null) {
            zzgi.zzf(zzhk);
        }
    }

    public final int zza(byte[] bArr, int i10, int i11) {
        zzgi zzgi = this.zzk;
        Objects.requireNonNull(zzgi);
        return zzgi.zza(bArr, i10, i11);
    }

    public final long zzb(zzgn zzgn) {
        zzgi zzgi;
        zzdx.zzf(this.zzk == null);
        String scheme = zzgn.zza.getScheme();
        Uri uri = zzgn.zza;
        int i10 = zzfk.zza;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || "file".equals(scheme2)) {
            String path = zzgn.zza.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzgy zzgy = new zzgy();
                    this.zzd = zzgy;
                    zzh(zzgy);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzg();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzg();
        } else if (FirebaseAnalytics.Param.CONTENT.equals(scheme)) {
            if (this.zzf == null) {
                zzgf zzgf = new zzgf(this.zza);
                this.zzf = zzgf;
                zzh(zzgf);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzgi zzgi2 = (zzgi) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.zzg = zzgi2;
                    zzh(zzgi2);
                } catch (ClassNotFoundException unused) {
                    zzer.zzf("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating RTMP extension", e10);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzhm zzhm = new zzhm(2000);
                this.zzh = zzhm;
                zzh(zzhm);
            }
            this.zzk = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                zzgg zzgg = new zzgg();
                this.zzi = zzgg;
                zzh(zzgg);
            }
            this.zzk = this.zzi;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzhi zzhi = new zzhi(this.zza);
                    this.zzj = zzhi;
                    zzh(zzhi);
                }
                zzgi = this.zzj;
            } else {
                zzgi = this.zzc;
            }
            this.zzk = zzgi;
        }
        return this.zzk.zzb(zzgn);
    }

    public final Uri zzc() {
        zzgi zzgi = this.zzk;
        if (zzgi == null) {
            return null;
        }
        return zzgi.zzc();
    }

    public final void zzd() {
        zzgi zzgi = this.zzk;
        if (zzgi != null) {
            try {
                zzgi.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    public final Map zze() {
        zzgi zzgi = this.zzk;
        return zzgi == null ? Collections.emptyMap() : zzgi.zze();
    }

    public final void zzf(zzhk zzhk) {
        Objects.requireNonNull(zzhk);
        this.zzc.zzf(zzhk);
        this.zzb.add(zzhk);
        zzi(this.zzd, zzhk);
        zzi(this.zze, zzhk);
        zzi(this.zzf, zzhk);
        zzi(this.zzg, zzhk);
        zzi(this.zzh, zzhk);
        zzi(this.zzi, zzhk);
        zzi(this.zzj, zzhk);
    }
}
