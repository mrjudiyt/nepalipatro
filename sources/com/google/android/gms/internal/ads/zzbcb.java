package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbcb {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (zzbca zzb2 : this.zzb) {
            String str = (String) zzba.zzc().zzb(zzb2);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbcm.zza());
        return arrayList;
    }

    public final List zzb() {
        List zza2 = zza();
        for (zzbca zzb2 : this.zzc) {
            String str = (String) zzba.zzc().zzb(zzb2);
            if (!TextUtils.isEmpty(str)) {
                zza2.add(str);
            }
        }
        zza2.addAll(zzbcm.zzb());
        return zza2;
    }

    public final void zzc(zzbca zzbca) {
        this.zzb.add(zzbca);
    }

    public final void zzd(zzbca zzbca) {
        this.zza.add(zzbca);
    }

    public final void zze(SharedPreferences.Editor editor, int i10, JSONObject jSONObject) {
        for (zzbca zzbca : this.zza) {
            if (zzbca.zze() == 1) {
                zzbca.zzd(editor, zzbca.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzcat.zzg("Flag Json is null.");
        }
    }
}
