package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import k6.c;
import k6.d;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final class zzl implements c {
    private final zzas zza;
    private final zzx zzb;
    private final zzbq zzc;
    private final Object zzd = new Object();
    private final Object zze = new Object();
    private boolean zzf = false;
    private boolean zzg = false;
    private d zzh = new d.a().a();

    public zzl(zzas zzas, zzx zzx, zzbq zzbq) {
        this.zza = zzas;
        this.zzb = zzx;
        this.zzc = zzbq;
    }

    public final boolean canRequestAds() {
        int i10;
        if (!zzc()) {
            i10 = 0;
        } else {
            i10 = this.zza.zza();
        }
        if (i10 == 1 || i10 == 3) {
            return true;
        }
        return false;
    }

    public final int getConsentStatus() {
        if (!zzc()) {
            return 0;
        }
        return this.zza.zza();
    }

    public final c.C0257c getPrivacyOptionsRequirementStatus() {
        if (!zzc()) {
            return c.C0257c.UNKNOWN;
        }
        return this.zza.zzb();
    }

    public final boolean isConsentFormAvailable() {
        return this.zzc.zzf();
    }

    public final void requestConsentInfoUpdate(Activity activity, d dVar, c.b bVar, c.a aVar) {
        synchronized (this.zzd) {
            this.zzf = true;
        }
        this.zzh = dVar;
        this.zzb.zzc(activity, dVar, bVar, aVar);
    }

    public final void reset() {
        this.zzc.zzd((zzbs) null);
        this.zza.zze();
        synchronized (this.zzd) {
            this.zzf = false;
        }
    }

    public final void zza(Activity activity) {
        if (!zzc() || zzd()) {
            boolean zzc2 = zzc();
            boolean zzd2 = zzd();
            StringBuilder sb = new StringBuilder();
            sb.append("Retry request is not executed. consentInfoUpdateHasBeenCalled=");
            sb.append(zzc2);
            sb.append(", retryRequestIsInProgress=");
            sb.append(zzd2);
            return;
        }
        zzb(true);
        this.zzb.zzc(activity, this.zzh, new zzj(this), new zzk(this));
    }

    public final void zzb(boolean z10) {
        synchronized (this.zze) {
            this.zzg = z10;
        }
    }

    public final boolean zzc() {
        boolean z10;
        synchronized (this.zzd) {
            z10 = this.zzf;
        }
        return z10;
    }

    public final boolean zzd() {
        boolean z10;
        synchronized (this.zze) {
            z10 = this.zzg;
        }
        return z10;
    }
}
