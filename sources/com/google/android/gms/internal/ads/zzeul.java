package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.common.util.concurrent.e;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeul implements zzetw {
    private final zzg zza;
    private final Context zzb;
    private final zzgad zzc;
    private final ScheduledExecutorService zzd;
    private final zzees zze;
    private final zzfdn zzf;

    zzeul(zzg zzg, Context context, zzgad zzgad, ScheduledExecutorService scheduledExecutorService, zzees zzees, zzfdn zzfdn) {
        this.zza = zzg;
        this.zzb = context;
        this.zzc = zzgad;
        this.zzd = scheduledExecutorService;
        this.zze = zzees;
        this.zzf = zzfdn;
    }

    public final int zza() {
        return 56;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0038, code lost:
        if (r0.zzd.zzy != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.e zzb() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzjC
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0074
            com.google.android.gms.ads.internal.util.zzg r0 = r5.zza
            boolean r0 = r0.zzR()
            if (r0 == 0) goto L_0x0074
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzjF
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x003a
            com.google.android.gms.internal.ads.zzfdn r0 = r5.zzf
            com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState r1 = com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED
            int r1 = r1.getValue()
            com.google.android.gms.ads.internal.client.zzl r0 = r0.zzd
            int r0 = r0.zzy
            if (r0 == r1) goto L_0x0074
        L_0x003a:
            com.google.android.gms.internal.ads.zzees r0 = r5.zze
            r1 = 0
            com.google.common.util.concurrent.e r0 = r0.zza(r1)
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzjD
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.util.concurrent.ScheduledExecutorService r3 = r5.zzd
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.e r0 = com.google.android.gms.internal.ads.zzfzt.zzo(r0, r1, r4, r3)
            com.google.android.gms.internal.ads.zzfzk r0 = com.google.android.gms.internal.ads.zzfzk.zzu(r0)
            com.google.android.gms.internal.ads.zzgad r1 = r5.zzc
            com.google.android.gms.internal.ads.zzeuj r2 = com.google.android.gms.internal.ads.zzeuj.zza
            com.google.common.util.concurrent.e r0 = com.google.android.gms.internal.ads.zzfzt.zzn(r0, r2, r1)
            com.google.android.gms.internal.ads.zzeuk r1 = new com.google.android.gms.internal.ads.zzeuk
            r1.<init>(r5)
            com.google.android.gms.internal.ads.zzgad r2 = r5.zzc
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            com.google.common.util.concurrent.e r0 = com.google.android.gms.internal.ads.zzfzt.zzf(r0, r3, r1, r2)
            return r0
        L_0x0074:
            com.google.android.gms.internal.ads.zzeun r0 = new com.google.android.gms.internal.ads.zzeun
            r1 = -1
            r2 = 0
            java.lang.String r3 = ""
            r0.<init>(r3, r1, r2)
            com.google.common.util.concurrent.e r0 = com.google.android.gms.internal.ads.zzfzt.zzh(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeul.zzb():com.google.common.util.concurrent.e");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzc(Throwable th) {
        zzeun zzeun;
        zzbty.zza(this.zzb).zzf(th, "TopicsSignal.fetchTopicsSignal");
        if (th instanceof SecurityException) {
            zzeun = new zzeun("", 2, (zzeum) null);
        } else if (th instanceof IllegalStateException) {
            zzeun = new zzeun("", 3, (zzeum) null);
        } else if (th instanceof IllegalArgumentException) {
            zzeun = new zzeun("", 4, (zzeum) null);
        } else if (th instanceof TimeoutException) {
            zzeun = new zzeun("", 5, (zzeum) null);
        } else {
            zzeun = new zzeun("", 0, (zzeum) null);
        }
        return zzfzt.zzh(zzeun);
    }
}
