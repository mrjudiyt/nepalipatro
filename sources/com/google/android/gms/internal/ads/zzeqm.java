package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeqm implements zzetw {
    private final Context zza;
    private final zzgad zzb;

    zzeqm(Context context, zzgad zzgad) {
        this.zza = context;
        this.zzb = zzgad;
    }

    public final int zza() {
        return 18;
    }

    public final e zzb() {
        return this.zzb.zzb(new zzeqj(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeql zzc() {
        String str;
        Bundle bundle;
        zzt.zzp();
        String str2 = "";
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzfY)).booleanValue()) {
            str = str2;
        } else {
            str = this.zza.getSharedPreferences("mobileads_consent", 0).getString("consent_string", str2);
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzga)).booleanValue()) {
            str2 = this.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", str2);
        }
        zzt.zzp();
        Context context = this.zza;
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzfZ)).booleanValue()) {
            bundle = null;
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i10 = 0; i10 < 4; i10++) {
                String str3 = strArr[i10];
                if (defaultSharedPreferences.contains(str3)) {
                    bundle.putString(str3, defaultSharedPreferences.getString(str3, (String) null));
                }
            }
        }
        return new zzeql(str, str2, bundle, (zzeqk) null);
    }
}
