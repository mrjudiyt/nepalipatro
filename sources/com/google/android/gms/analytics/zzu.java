package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzbi;
import com.google.android.gms.internal.gtm.zzbt;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzex;
import com.google.android.gms.internal.gtm.zzfs;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
final class zzu implements Runnable {
    final /* synthetic */ Map zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ String zzg;
    final /* synthetic */ Tracker zzh;

    zzu(Tracker tracker, Map map, boolean z10, String str, long j10, boolean z11, boolean z12, String str2) {
        this.zzh = tracker;
        this.zza = map;
        this.zzb = z10;
        this.zzc = str;
        this.zzd = j10;
        this.zze = z11;
        this.zzf = z12;
        this.zzg = str2;
    }

    public final void run() {
        double d10;
        if (this.zzh.zze.zzf()) {
            this.zza.put("sc", "start");
        }
        Map map = this.zza;
        GoogleAnalytics zzp = this.zzh.zzp();
        Preconditions.checkNotMainThread("getClientId can not be called from the main thread");
        String zzb2 = zzp.zzb().zzi().zzb();
        if (zzb2 != null && TextUtils.isEmpty((CharSequence) map.get("cid"))) {
            map.put("cid", zzb2);
        }
        String str = (String) this.zza.get("sf");
        if (str != null) {
            try {
                d10 = Double.parseDouble(str);
            } catch (NumberFormatException unused) {
                d10 = 100.0d;
            }
            if (zzfs.zzj(d10, (String) this.zza.get("cid"))) {
                this.zzh.zzG("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d10));
                return;
            }
        }
        zzbi zzb3 = this.zzh.zzr();
        if (this.zzb) {
            Map map2 = this.zza;
            boolean zzb4 = zzb3.zzb();
            if (!map2.containsKey("ate")) {
                map2.put("ate", true != zzb4 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
            }
            zzfs.zzg(this.zza, "adid", zzb3.zza());
        } else {
            this.zza.remove("ate");
            this.zza.remove("adid");
        }
        zzav zza2 = this.zzh.zzu().zza();
        zzfs.zzg(this.zza, "an", zza2.zzf());
        zzfs.zzg(this.zza, "av", zza2.zzg());
        zzfs.zzg(this.zza, "aid", zza2.zzd());
        zzfs.zzg(this.zza, "aiid", zza2.zze());
        this.zza.put("v", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        this.zza.put("_v", zzbt.zzb);
        zzfs.zzg(this.zza, "ul", this.zzh.zzx().zza().zzd());
        zzfs.zzg(this.zza, "sr", this.zzh.zzx().zzb());
        if (this.zzc.equals("transaction") || this.zzc.equals("item") || this.zzh.zzd.zza()) {
            long zza3 = zzfs.zza((String) this.zza.get("ht"));
            if (zza3 == 0) {
                zza3 = this.zzd;
            }
            long j10 = zza3;
            if (this.zze) {
                this.zzh.zzz().zzN("Dry run enabled. Would have sent hit", new zzex(this.zzh, this.zza, j10, this.zzf));
                return;
            }
            String str2 = (String) this.zza.get("cid");
            HashMap hashMap = new HashMap();
            zzfs.zzh(hashMap, "uid", this.zza);
            zzfs.zzh(hashMap, "an", this.zza);
            zzfs.zzh(hashMap, "aid", this.zza);
            zzfs.zzh(hashMap, "av", this.zza);
            zzfs.zzh(hashMap, "aiid", this.zza);
            Preconditions.checkNotNull(str2);
            this.zza.put("_s", String.valueOf(this.zzh.zzs().zza(new zzbx(0, str2, this.zzg, !TextUtils.isEmpty((CharSequence) this.zza.get("adid")), 0, hashMap))));
            this.zzh.zzs().zzh(new zzex(this.zzh, this.zza, j10, this.zzf));
            return;
        }
        this.zzh.zzz().zzc(this.zza, "Too many hits sent too quickly, rate limiting invoked");
    }
}
