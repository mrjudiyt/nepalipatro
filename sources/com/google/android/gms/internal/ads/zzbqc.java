package com.google.android.gms.internal.ads;

import android.location.Location;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbqc implements NativeMediationAdRequest {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final zzbfc zzg;
    private final List zzh = new ArrayList();
    private final boolean zzi;
    private final Map zzj = new HashMap();
    private final String zzk;

    public zzbqc(Date date, int i10, Set set, Location location, boolean z10, int i11, zzbfc zzbfc, List list, boolean z11, int i12, String str) {
        this.zza = date;
        this.zzb = i10;
        this.zzc = set;
        this.zze = location;
        this.zzd = z10;
        this.zzf = i11;
        this.zzg = zzbfc;
        this.zzi = z11;
        this.zzk = str;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(CertificateUtil.DELIMITER, 3);
                    if (split.length == 3) {
                        if (ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(split[2])) {
                            this.zzj.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(split[2])) {
                            this.zzj.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.zzh.add(str2);
                }
            }
        }
    }

    public final float getAdVolume() {
        return zzej.zzf().zza();
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    public final Set<String> getKeywords() {
        return this.zzc;
    }

    public final Location getLocation() {
        return this.zze;
    }

    public final NativeAdOptions getNativeAdOptions() {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        zzbfc zzbfc = this.zzg;
        if (zzbfc == null) {
            return builder.build();
        }
        int i10 = zzbfc.zza;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    builder.setRequestCustomMuteThisAd(zzbfc.zzg);
                    builder.setMediaAspectRatio(zzbfc.zzh);
                }
                builder.setReturnUrlsForImageAssets(zzbfc.zzb);
                builder.setImageOrientation(zzbfc.zzc);
                builder.setRequestMultipleImages(zzbfc.zzd);
                return builder.build();
            }
            zzfl zzfl = zzbfc.zzf;
            if (zzfl != null) {
                builder.setVideoOptions(new VideoOptions(zzfl));
            }
        }
        builder.setAdChoicesPlacement(zzbfc.zze);
        builder.setReturnUrlsForImageAssets(zzbfc.zzb);
        builder.setImageOrientation(zzbfc.zzc);
        builder.setRequestMultipleImages(zzbfc.zzd);
        return builder.build();
    }

    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return zzbfc.zza(this.zzg);
    }

    public final boolean isAdMuted() {
        return zzej.zzf().zzx();
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    public final boolean isTesting() {
        return this.zzd;
    }

    public final boolean isUnifiedNativeAdRequested() {
        return this.zzh.contains("6");
    }

    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    public final Map zza() {
        return this.zzj;
    }

    public final boolean zzb() {
        return this.zzh.contains("3");
    }
}
