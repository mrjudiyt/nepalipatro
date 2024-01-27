package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzflf implements zzfld {
    private final zzfld zza;

    public zzflf(zzfld zzfld) {
        this.zza = zzfld;
    }

    public final JSONObject zza(View view) {
        boolean z10 = false;
        JSONObject zza2 = zzfln.zza(0, 0, 0, 0);
        int zzb = zzflq.zzb();
        int i10 = zzb - 1;
        if (zzb != 0) {
            if (i10 == 0) {
                z10 = true;
            }
            try {
                zza2.put("noOutputDevice", z10);
            } catch (JSONException e10) {
                zzflo.zza("Error with setting output device status", e10);
            }
            return zza2;
        }
        throw null;
    }

    public final void zzb(View view, JSONObject jSONObject, zzflc zzflc, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        zzfku zza2 = zzfku.zza();
        if (zza2 != null) {
            Collection<zzfkg> zzb = zza2.zzb();
            int size = zzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (zzfkg zzf : zzb) {
                View zzf2 = zzf.zzf();
                if (zzf2 != null && zzf2.isAttachedToWindow() && zzf2.isShown()) {
                    View view2 = zzf2;
                    while (true) {
                        if (view2 != null) {
                            if (view2.getAlpha() == 0.0f) {
                                break;
                            }
                            ViewParent parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        } else {
                            View rootView = zzf2.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float zza3 = zzflt.zza(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i10 = size2 - 1;
                                    if (zzflt.zza((View) arrayList.get(i10)) <= zza3) {
                                        break;
                                    }
                                    size2 = i10;
                                }
                                arrayList.add(size2, rootView);
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i11 = 0; i11 < size3; i11++) {
            zzflc.zza((View) arrayList.get(i11), this.zza, jSONObject, z11);
        }
    }
}
