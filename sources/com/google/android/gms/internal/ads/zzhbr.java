package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.e;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzhbr extends e {
    private final WeakReference zza;

    public zzhbr(zzbdj zzbdj) {
        this.zza = new WeakReference(zzbdj);
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, c cVar) {
        zzbdj zzbdj = (zzbdj) this.zza.get();
        if (zzbdj != null) {
            zzbdj.zzc(cVar);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zzbdj zzbdj = (zzbdj) this.zza.get();
        if (zzbdj != null) {
            zzbdj.zzd();
        }
    }
}
