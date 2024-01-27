package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.facebook.bolts.AppLinks;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzdsj;
import com.google.android.gms.internal.ads.zzdst;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzc {
    /* access modifiers changed from: private */
    public final int zza;
    private final long zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final Map zze;
    /* access modifiers changed from: private */
    public final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final zzdst zzh;
    private Map zzi;

    public zzc(zzdst zzdst) {
        this.zzh = zzdst;
        this.zza = ((Integer) zzba.zzc().zzb(zzbci.zzgU)).intValue();
        this.zzb = ((Long) zzba.zzc().zzb(zzbci.zzgV)).longValue();
        this.zzc = ((Boolean) zzba.zzc().zzb(zzbci.zzha)).booleanValue();
        this.zzd = ((Boolean) zzba.zzc().zzb(zzbci.zzgY)).booleanValue();
        this.zze = Collections.synchronizedMap(new zzb(this));
    }

    private final synchronized void zzg(zzdsj zzdsj) {
        if (this.zzc) {
            ArrayDeque arrayDeque = this.zzg;
            ArrayDeque clone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.zzf;
            ArrayDeque clone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            zzcbg.zza.execute(new zza(this, zzdsj, clone, clone2));
        }
    }

    private final void zzh(zzdsj zzdsj, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdsj.zza());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put(NativeProtocol.WEB_DIALOG_ACTION, "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzf.zza(jSONObject.getJSONObject(AppLinks.KEY_NAME_EXTRAS).getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzj(this.zzi, "e_type", (String) pair.first);
                zzj(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zzf(this.zzi);
        }
    }

    private final synchronized void zzi() {
        long currentTimeMillis = zzt.zzB().currentTimeMillis();
        try {
            Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e10) {
            zzt.zzo().zzu(e10, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void zzj(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    public final synchronized String zzb(String str, zzdsj zzdsj) {
        Pair pair = (Pair) this.zze.get(str);
        zzdsj.zza().put("rid", str);
        if (pair != null) {
            String str2 = (String) pair.second;
            this.zze.remove(str);
            zzdsj.zza().put("mhit", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            return str2;
        }
        zzdsj.zza().put("mhit", "false");
        return null;
    }

    public final synchronized void zzd(String str, String str2, zzdsj zzdsj) {
        this.zze.put(str, new Pair(Long.valueOf(zzt.zzB().currentTimeMillis()), str2));
        zzi();
        zzg(zzdsj);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzdsj zzdsj, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzh(zzdsj, arrayDeque, "to");
        zzh(zzdsj, arrayDeque2, "of");
    }

    public final synchronized void zzf(String str) {
        this.zze.remove(str);
    }
}
