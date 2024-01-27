package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzceo implements zzbjj {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            zzcat.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcen zzcen;
        zzcef zzcef;
        Map map2 = map;
        zzcdc zzcdc = (zzcdc) obj;
        if (zzcat.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map2);
            jSONObject.remove("google.afma.Notify_dt");
            zzcat.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzceg zzy = zzt.zzy();
        if (!map2.containsKey("abort")) {
            String str = (String) map2.get("src");
            Integer zzb = zzb(map2, "periodicReportIntervalMs");
            Integer zzb2 = zzb(map2, "exoPlayerRenderingIntervalMs");
            Integer zzb3 = zzb(map2, "exoPlayerIdleIntervalMs");
            zzcdb zzcdb = new zzcdb((String) map2.get("flags"));
            boolean z10 = zzcdb.zzl;
            if (str != null) {
                String[] strArr = {str};
                String str2 = (String) map2.get("demuxed");
                if (str2 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str2);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            strArr2[i10] = jSONArray.getString(i10);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused) {
                        zzcat.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                        strArr = null;
                    }
                }
                if (strArr == null) {
                    strArr = new String[]{str};
                }
                if (z10) {
                    Iterator it = zzy.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            zzcef = null;
                            break;
                        }
                        zzcef zzcef2 = (zzcef) it.next();
                        if (zzcef2.zza == zzcdc && str.equals(zzcef2.zze())) {
                            zzcef = zzcef2;
                            break;
                        }
                    }
                } else {
                    zzcef = zzy.zza(zzcdc);
                }
                if (zzcef != null) {
                    zzcat.zzj("Precache task is already running.");
                    return;
                } else if (zzcdc.zzj() == null) {
                    zzcat.zzj("Precache requires a dependency provider.");
                    return;
                } else {
                    Integer zzb4 = zzb(map2, "player");
                    if (zzb4 == null) {
                        zzb4 = 0;
                    }
                    if (zzb != null) {
                        zzcdc.zzA(zzb.intValue());
                    }
                    if (zzb2 != null) {
                        zzcdc.zzy(zzb2.intValue());
                    }
                    if (zzb3 != null) {
                        zzcdc.zzx(zzb3.intValue());
                    }
                    int intValue = zzb4.intValue();
                    zzcdz zzcdz = zzcdc.zzj().zzb;
                    if (intValue > 0) {
                        int i11 = zzcdb.zzh;
                        int zzu = zzcct.zzu();
                        if (zzu < i11) {
                            zzcen = new zzcew(zzcdc, zzcdb);
                        } else if (zzu < zzcdb.zzb) {
                            zzcen = new zzcet(zzcdc, zzcdb);
                        } else {
                            zzcen = new zzcer(zzcdc);
                        }
                    } else {
                        zzcen = new zzceq(zzcdc);
                    }
                    new zzcef(zzcdc, zzcen, str, strArr).zzb();
                }
            } else {
                zzcef zza = zzy.zza(zzcdc);
                if (zza != null) {
                    zzcen = zza.zzb;
                } else {
                    zzcat.zzj("Precache must specify a source.");
                    return;
                }
            }
            Integer zzb5 = zzb(map2, "minBufferMs");
            if (zzb5 != null) {
                zzcen.zzs(zzb5.intValue());
            }
            Integer zzb6 = zzb(map2, "maxBufferMs");
            if (zzb6 != null) {
                zzcen.zzr(zzb6.intValue());
            }
            Integer zzb7 = zzb(map2, "bufferForPlaybackMs");
            if (zzb7 != null) {
                zzcen.zzp(zzb7.intValue());
            }
            Integer zzb8 = zzb(map2, "bufferForPlaybackAfterRebufferMs");
            if (zzb8 != null) {
                zzcen.zzq(zzb8.intValue());
            }
        } else if (!zzy.zzd(zzcdc)) {
            zzcat.zzj("Precache abort but no precache task running.");
        }
    }
}
