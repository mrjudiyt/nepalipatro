package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdvh {
    private final zzdur zza;
    private final zzdqg zzb;
    private final Object zzc = new Object();
    private final List zzd;
    private boolean zze;

    zzdvh(zzdur zzdur, zzdqg zzdqg) {
        this.zza = zzdur;
        this.zzb = zzdqg;
        this.zzd = new ArrayList();
    }

    /* access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        boolean z10;
        synchronized (this.zzc) {
            if (!this.zze) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzblg zzblg = (zzblg) it.next();
                    if (((Boolean) zzba.zzc().zzb(zzbci.zzjb)).booleanValue()) {
                        zzdqf zza2 = this.zzb.zza(zzblg.zza);
                        if (zza2 != null) {
                            zzbrj zzbrj = zza2.zzc;
                            if (zzbrj != null) {
                                str = zzbrj.toString();
                            }
                        }
                        str = "";
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    if (((Boolean) zzba.zzc().zzb(zzbci.zzjc)).booleanValue()) {
                        zzdqf zza3 = this.zzb.zza(zzblg.zza);
                        if (zza3 != null) {
                            if (zza3.zzd) {
                                z10 = true;
                                List list2 = this.zzd;
                                String str3 = zzblg.zza;
                                String zzc2 = this.zzb.zzc(str3);
                                boolean z11 = zzblg.zzb;
                                list2.add(new zzdvg(str3, str2, zzc2, z11 ? 1 : 0, zzblg.zzd, zzblg.zzc, z10));
                            }
                        }
                    }
                    z10 = false;
                    List list22 = this.zzd;
                    String str32 = zzblg.zza;
                    String zzc22 = this.zzb.zzc(str32);
                    boolean z112 = zzblg.zzb;
                    list22.add(new zzdvg(str32, str2, zzc22, z112 ? 1 : 0, zzblg.zzd, zzblg.zzc, z10));
                }
                this.zze = true;
            }
        }
    }

    public final JSONArray zza() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (this.zza.zzt()) {
                    zzd(this.zza.zzg());
                } else {
                    zzc();
                    return jSONArray;
                }
            }
            for (zzdvg zza2 : this.zzd) {
                jSONArray.put(zza2.zza());
            }
            return jSONArray;
        }
    }

    public final void zzc() {
        this.zza.zzs(new zzdvf(this));
    }
}
