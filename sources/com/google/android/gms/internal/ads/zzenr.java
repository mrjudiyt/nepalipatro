package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.bolts.AppLinks;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzenr implements zzetv {
    final zzfdn zza;
    private final long zzb;

    public zzenr(zzfdn zzfdn, long j10) {
        Preconditions.checkNotNull(zzfdn, "the targeting must not be null");
        this.zza = zzfdn;
        this.zzb = j10;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzl zzl = this.zza.zzd;
        bundle.putInt("http_timeout_millis", zzl.zzw);
        bundle.putString("slotname", this.zza.zzf);
        int i10 = this.zza.zzo.zza;
        if (i10 != 0) {
            int i11 = i10 - 1;
            boolean z10 = true;
            if (i11 == 1) {
                bundle.putBoolean("is_new_rewarded", true);
            } else if (i11 == 2) {
                bundle.putBoolean("is_rewarded_interstitial", true);
            }
            bundle.putLong("start_signals_timestamp", this.zzb);
            zzfdz.zzf(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzl.zzb)), zzl.zzb != -1);
            zzfdz.zzb(bundle, AppLinks.KEY_NAME_EXTRAS, zzl.zzc);
            int i12 = zzl.zzd;
            zzfdz.zze(bundle, "cust_gender", i12, i12 != -1);
            zzfdz.zzd(bundle, "kw", zzl.zze);
            int i13 = zzl.zzg;
            zzfdz.zze(bundle, "tag_for_child_directed_treatment", i13, i13 != -1);
            if (zzl.zzf) {
                bundle.putBoolean("test_request", true);
            }
            bundle.putInt("ppt_p13n", zzl.zzy);
            zzfdz.zze(bundle, "d_imp_hdr", 1, zzl.zza >= 2 && zzl.zzh);
            String str = zzl.zzi;
            zzfdz.zzf(bundle, "ppid", str, zzl.zza >= 2 && !TextUtils.isEmpty(str));
            Location location = zzl.zzk;
            if (location != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("radius", location.getAccuracy() * 1000.0f);
                bundle2.putLong("lat", (long) (location.getLatitude() * 1.0E7d));
                bundle2.putLong("long", (long) (location.getLongitude() * 1.0E7d));
                bundle2.putLong("time", location.getTime() * 1000);
                bundle.putBundle("uule", bundle2);
            }
            zzfdz.zzc(bundle, "url", zzl.zzl);
            zzfdz.zzd(bundle, "neighboring_content_urls", zzl.zzv);
            zzfdz.zzb(bundle, "custom_targeting", zzl.zzn);
            zzfdz.zzd(bundle, "category_exclusions", zzl.zzo);
            zzfdz.zzc(bundle, "request_agent", zzl.zzp);
            zzfdz.zzc(bundle, "request_pkg", zzl.zzq);
            zzfdz.zzg(bundle, "is_designed_for_families", zzl.zzr, zzl.zza >= 7);
            if (zzl.zza >= 8) {
                int i14 = zzl.zzt;
                if (i14 == -1) {
                    z10 = false;
                }
                zzfdz.zze(bundle, "tag_for_under_age_of_consent", i14, z10);
                zzfdz.zzc(bundle, "max_ad_content_rating", zzl.zzu);
                return;
            }
            return;
        }
        throw null;
    }
}
