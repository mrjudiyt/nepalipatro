package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfmc implements zzflc {
    private static final zzfmc zza = new zzfmc();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public static Handler zzc = null;
    /* access modifiers changed from: private */
    public static final Runnable zzd = new zzfly();
    /* access modifiers changed from: private */
    public static final Runnable zze = new zzflz();
    private final List zzf = new ArrayList();
    private int zzg;
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfle zzj = new zzfle();
    private final zzflv zzk = new zzflv();
    /* access modifiers changed from: private */
    public final zzflw zzl = new zzflw(new zzfmf());
    private long zzm;

    zzfmc() {
    }

    public static zzfmc zzd() {
        return zza;
    }

    static /* bridge */ /* synthetic */ void zzg(zzfmc zzfmc) {
        zzfmc.zzg = 0;
        zzfmc.zzi.clear();
        zzfmc.zzh = false;
        for (zzfkg zzfkg : zzfku.zza().zzb()) {
        }
        zzfmc.zzm = System.nanoTime();
        zzfmc.zzk.zzi();
        long nanoTime = System.nanoTime();
        zzfld zza2 = zzfmc.zzj.zza();
        if (zzfmc.zzk.zze().size() > 0) {
            Iterator it = zzfmc.zzk.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zza2.zza((View) null);
                View zza4 = zzfmc.zzk.zza(str);
                zzfld zzb2 = zzfmc.zzj.zzb();
                String zzc2 = zzfmc.zzk.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzfln.zzb(zza5, str);
                    try {
                        zza5.put("notVisibleReason", zzc2);
                    } catch (JSONException e10) {
                        zzflo.zza("Error with setting not visible reason", e10);
                    }
                    zzfln.zzc(zza3, zza5);
                }
                zzfln.zzf(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfmc.zzl.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzfmc.zzk.zzf().size() > 0) {
            JSONObject zza6 = zza2.zza((View) null);
            zzfmc.zzk((View) null, zza2, zza6, 1, false);
            zzfln.zzf(zza6);
            zzfmc.zzl.zzd(zza6, zzfmc.zzk.zzf(), nanoTime);
        } else {
            zzfmc.zzl.zzb();
        }
        zzfmc.zzk.zzg();
        long nanoTime2 = System.nanoTime() - zzfmc.zzm;
        if (zzfmc.zzf.size() > 0) {
            for (zzfmb zzfmb : zzfmc.zzf) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfmb.zzb();
                if (zzfmb instanceof zzfma) {
                    ((zzfma) zzfmb).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzfld zzfld, JSONObject jSONObject, int i10, boolean z10) {
        zzfld.zzb(view, jSONObject, this, i10 == 1, z10);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    public final void zza(View view, zzfld zzfld, JSONObject jSONObject, boolean z10) {
        int zzk2;
        boolean z11;
        if (zzflt.zzb(view) == null && (zzk2 = this.zzk.zzk(view)) != 3) {
            JSONObject zza2 = zzfld.zza(view);
            zzfln.zzc(jSONObject, zza2);
            String zzd2 = this.zzk.zzd(view);
            if (zzd2 != null) {
                zzfln.zzb(zza2, zzd2);
                try {
                    zza2.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzj(view)));
                } catch (JSONException e10) {
                    zzflo.zza("Error with setting has window focus", e10);
                }
                this.zzk.zzh();
            } else {
                zzflu zzb2 = this.zzk.zzb(view);
                if (zzb2 != null) {
                    zzfkx zza3 = zzb2.zza();
                    JSONArray jSONArray = new JSONArray();
                    ArrayList zzb3 = zzb2.zzb();
                    int size = zzb3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        jSONArray.put((String) zzb3.get(i10));
                    }
                    try {
                        zza2.put("isFriendlyObstructionFor", jSONArray);
                        zza2.put("friendlyObstructionClass", zza3.zzd());
                        zza2.put("friendlyObstructionPurpose", zza3.zza());
                        zza2.put("friendlyObstructionReason", zza3.zzc());
                    } catch (JSONException e11) {
                        zzflo.zza("Error with setting friendly obstruction", e11);
                    }
                    z11 = true;
                } else {
                    z11 = false;
                }
                zzk(view, zzfld, zza2, zzk2, z10 || z11);
            }
            this.zzg++;
        }
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzflx(this));
    }
}
