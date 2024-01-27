package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzdki implements zzbfb {
    final /* synthetic */ zzdlf zza;
    final /* synthetic */ ViewGroup zzb;

    zzdki(zzdlf zzdlf, ViewGroup viewGroup) {
        this.zza = zzdlf;
        this.zzb = viewGroup;
    }

    public final JSONObject zza() {
        return this.zza.zzo();
    }

    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    public final void zzc() {
        zzfvs zzfvs = zzdkf.zza;
        Map zzm = this.zza.zzm();
        if (zzm != null) {
            int size = zzfvs.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = zzm.get((String) zzfvs.get(i10));
                i10++;
                if (obj != null) {
                    this.zza.onClick(this.zzb);
                    return;
                }
            }
        }
    }

    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch((View) null, motionEvent);
    }
}
