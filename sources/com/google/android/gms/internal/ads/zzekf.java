package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.common.util.concurrent.e;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzekf implements zzeeu {
    private final zzeew zza;
    private final zzefa zzb;
    private final zzfhr zzc;
    private final zzgad zzd;

    public zzekf(zzfhr zzfhr, zzgad zzgad, zzeew zzeew, zzefa zzefa) {
        this.zzc = zzfhr;
        this.zzd = zzgad;
        this.zzb = zzefa;
        this.zza = zzeew;
    }

    static final String zze(String str, int i10) {
        return "Error from: " + str + ", code: " + i10;
    }

    public final e zza(zzfde zzfde, zzfcr zzfcr) {
        zzeex zzeex;
        Class<AdMobAdapter> cls = AdMobAdapter.class;
        Iterator it = zzfcr.zzv.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzeex = null;
                break;
            }
            try {
                zzeex = this.zza.zza((String) it.next(), zzfcr.zzx);
                break;
            } catch (zzfds unused) {
            }
        }
        if (zzeex == null) {
            return zzfzt.zzg(new zzehw("Unable to instantiate mediation adapter class."));
        }
        zzcbl zzcbl = new zzcbl();
        zzeex.zzc.zza(new zzeke(this, zzeex, zzcbl));
        if (zzfcr.zzO) {
            Bundle bundle = zzfde.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(cls.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(cls.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfhr zzfhr = this.zzc;
        return zzfhb.zzd(new zzekc(this, zzfde, zzfcr, zzeex), this.zzd, zzfhl.ADAPTER_LOAD_AD_SYN, zzfhr).zzb(zzfhl.ADAPTER_LOAD_AD_ACK).zzd(zzcbl).zzb(zzfhl.ADAPTER_WRAP_ADAPTER).zze(new zzekd(this, zzfde, zzfcr, zzeex)).zza();
    }

    public final boolean zzb(zzfde zzfde, zzfcr zzfcr) {
        return !zzfcr.zzv.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(zzfde zzfde, zzfcr zzfcr, zzeex zzeex, Void voidR) {
        return this.zzb.zza(zzfde, zzfcr, zzeex);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        this.zzb.zzb(zzfde, zzfcr, zzeex);
    }
}
