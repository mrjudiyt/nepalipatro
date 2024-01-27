package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.client.zzfh;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.common.util.concurrent.e;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzeid implements zzeeu {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    public final e zza(zzfde zzfde, zzfcr zzfcr) {
        zzfcr zzfcr2 = zzfcr;
        String optString = zzfcr2.zzx.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzfdn zzfdn = zzfde.zza.zza;
        zzfdl zzfdl = new zzfdl();
        zzfdl.zzp(zzfdn);
        zzfdl.zzs(optString);
        Bundle zzd = zzd(zzfdn.zzd.zzm);
        Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        String optString2 = zzfcr2.zzx.optString("mad_hac", (String) null);
        if (optString2 != null) {
            zzd2.putString("mad_hac", optString2);
        }
        String optString3 = zzfcr2.zzx.optString("adJson", (String) null);
        if (optString3 != null) {
            zzd2.putString("_ad", optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzfcr2.zzF.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzfcr2.zzF.optString(next, (String) null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        zzl zzl = zzfdn.zzd;
        int i10 = zzl.zzd;
        List list = zzl.zze;
        boolean z10 = zzl.zzf;
        int i11 = zzl.zzg;
        boolean z11 = zzl.zzh;
        String str = zzl.zzi;
        zzfh zzfh = zzl.zzj;
        int i12 = zzl.zzw;
        int i13 = zzl.zza;
        Location location = zzl.zzk;
        String str2 = zzl.zzx;
        zzl zzl2 = r5;
        zzl zzl3 = new zzl(i13, zzl.zzb, zzd2, i10, list, z10, i11, z11, str, zzfh, location, zzl.zzl, zzd, zzl.zzn, zzl.zzo, zzl.zzp, zzl.zzq, zzl.zzr, zzl.zzs, zzl.zzt, zzl.zzu, zzl.zzv, i12, str2, zzl.zzy);
        zzfdl.zzE(zzl2);
        zzfdn zzG = zzfdl.zzG();
        Bundle bundle = new Bundle();
        zzfde zzfde2 = zzfde;
        zzfcv zzfcv = zzfde2.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList(zzfcv.zza));
        bundle2.putInt("refresh_interval", zzfcv.zzc);
        bundle2.putString("gws_query_id", zzfcv.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        zzfdn zzfdn2 = zzfde2.zza.zza;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", zzfdn2.zzf);
        zzfcr zzfcr3 = zzfcr;
        bundle3.putString("allocation_id", zzfcr3.zzy);
        bundle3.putStringArrayList("click_urls", new ArrayList(zzfcr3.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList(zzfcr3.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList(zzfcr3.zzr));
        bundle3.putStringArrayList("fill_urls", new ArrayList(zzfcr3.zzo));
        bundle3.putStringArrayList("video_start_urls", new ArrayList(zzfcr3.zzi));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList(zzfcr3.zzj));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList(zzfcr3.zzk));
        bundle3.putString(FirebaseAnalytics.Param.TRANSACTION_ID, zzfcr3.zzl);
        bundle3.putString("valid_from_timestamp", zzfcr3.zzm);
        bundle3.putBoolean("is_closable_area_disabled", zzfcr3.zzR);
        bundle3.putString("recursive_server_response_data", zzfcr3.zzaq);
        if (zzfcr3.zzn != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzfcr3.zzn.zzb);
            bundle4.putString("rb_type", zzfcr3.zzn.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzG, bundle, zzfcr3, zzfde2);
    }

    public final boolean zzb(zzfde zzfde, zzfcr zzfcr) {
        return !TextUtils.isEmpty(zzfcr.zzx.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    /* access modifiers changed from: protected */
    public abstract e zzc(zzfdn zzfdn, Bundle bundle, zzfcr zzfcr, zzfde zzfde);
}
