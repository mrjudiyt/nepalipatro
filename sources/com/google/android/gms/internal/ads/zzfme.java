package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzfme extends AsyncTask {
    private zzfmf zza;
    protected final zzflw zzd;

    public zzfme(zzflw zzflw) {
        this.zzd = zzflw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: zza */
    public void onPostExecute(String str) {
        zzfmf zzfmf = this.zza;
        if (zzfmf != null) {
            zzfmf.zza(this);
        }
    }

    public final void zzb(zzfmf zzfmf) {
        this.zza = zzfmf;
    }
}
