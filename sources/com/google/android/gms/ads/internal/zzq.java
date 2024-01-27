package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzaro;
import com.google.android.gms.internal.ads.zzcat;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzq extends AsyncTask {
    final /* synthetic */ zzs zza;

    /* synthetic */ zzq(zzs zzs, zzp zzp) {
        this.zza = zzs;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        zzs zzs = this.zza;
        String str = (String) obj;
        if (zzs.zzf != null && str != null) {
            zzs.zzf.loadUrl(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: zza */
    public final String doInBackground(Void... voidArr) {
        try {
            zzs zzs = this.zza;
            zzs.zzh = (zzaro) zzs.zzc.get(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e10) {
            zzcat.zzk("", e10);
        } catch (TimeoutException e11) {
            zzcat.zzk("", e11);
        }
        return this.zza.zzp();
    }
}
