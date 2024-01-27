package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcad {
    long zza = -1;
    long zzb = -1;
    int zzc = -1;
    int zzd = -1;
    long zze = 0;
    final String zzf;
    int zzg = 0;
    int zzh = 0;
    int zzi = 0;
    private final Object zzj = new Object();
    private final zzg zzk;

    public zzcad(String str, zzg zzg2) {
        this.zzf = str;
        this.zzk = zzg2;
    }

    private final void zzi() {
        if (((Boolean) zzbei.zza.zze()).booleanValue()) {
            synchronized (this.zzj) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final int zza() {
        int i10;
        synchronized (this.zzj) {
            i10 = this.zzi;
        }
        return i10;
    }

    public final Bundle zzb(Context context, String str) {
        Bundle bundle;
        synchronized (this.zzj) {
            bundle = new Bundle();
            if (!this.zzk.zzQ()) {
                bundle.putString("session_id", this.zzf);
            }
            bundle.putLong("basets", this.zzb);
            bundle.putLong("currts", this.zza);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzc);
            bundle.putInt("preqs_in_session", this.zzd);
            bundle.putLong("time_in_session", this.zze);
            bundle.putInt("pclick", this.zzg);
            bundle.putInt("pimp", this.zzh);
            Context zza2 = zzbvu.zza(context);
            int identifier = zza2.getResources().getIdentifier("Theme.Translucent", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "android");
            boolean z10 = false;
            if (identifier == 0) {
                zzcat.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                try {
                    if (identifier == zza2.getPackageManager().getActivityInfo(new ComponentName(zza2.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                        z10 = true;
                    } else {
                        zzcat.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    zzcat.zzj("Fail to fetch AdActivity theme");
                    zzcat.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            bundle.putBoolean("support_transparent_background", z10);
            bundle.putInt("consent_form_action_identifier", zza());
        }
        return bundle;
    }

    public final void zzc() {
        synchronized (this.zzj) {
            this.zzg++;
        }
    }

    public final void zzd() {
        synchronized (this.zzj) {
            this.zzh++;
        }
    }

    public final void zze() {
        zzi();
    }

    public final void zzf() {
        zzi();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzg(com.google.android.gms.ads.internal.client.zzl r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.zzj
            monitor-enter(r0)
            com.google.android.gms.ads.internal.util.zzg r1 = r10.zzk     // Catch:{ all -> 0x0086 }
            long r1 = r1.zzd()     // Catch:{ all -> 0x0086 }
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzt.zzB()     // Catch:{ all -> 0x0086 }
            long r3 = r3.currentTimeMillis()     // Catch:{ all -> 0x0086 }
            long r5 = r10.zzb     // Catch:{ all -> 0x0086 }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0040
            long r1 = r3 - r1
            com.google.android.gms.internal.ads.zzbca r5 = com.google.android.gms.internal.ads.zzbci.zzaS     // Catch:{ all -> 0x0086 }
            com.google.android.gms.internal.ads.zzbcg r6 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x0086 }
            java.lang.Object r5 = r6.zzb(r5)     // Catch:{ all -> 0x0086 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0086 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0086 }
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0033
            r1 = -1
            r10.zzd = r1     // Catch:{ all -> 0x0086 }
            goto L_0x003b
        L_0x0033:
            com.google.android.gms.ads.internal.util.zzg r1 = r10.zzk     // Catch:{ all -> 0x0086 }
            int r1 = r1.zzc()     // Catch:{ all -> 0x0086 }
            r10.zzd = r1     // Catch:{ all -> 0x0086 }
        L_0x003b:
            r10.zzb = r12     // Catch:{ all -> 0x0086 }
            r10.zza = r12     // Catch:{ all -> 0x0086 }
            goto L_0x0042
        L_0x0040:
            r10.zza = r12     // Catch:{ all -> 0x0086 }
        L_0x0042:
            com.google.android.gms.internal.ads.zzbca r12 = com.google.android.gms.internal.ads.zzbci.zzdq     // Catch:{ all -> 0x0086 }
            com.google.android.gms.internal.ads.zzbcg r13 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x0086 }
            java.lang.Object r12 = r13.zzb(r12)     // Catch:{ all -> 0x0086 }
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ all -> 0x0086 }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x0086 }
            r13 = 1
            if (r12 != 0) goto L_0x0065
            android.os.Bundle r11 = r11.zzc     // Catch:{ all -> 0x0086 }
            if (r11 == 0) goto L_0x0065
            java.lang.String r12 = "gw"
            r1 = 2
            int r11 = r11.getInt(r12, r1)     // Catch:{ all -> 0x0086 }
            if (r11 == r13) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            return
        L_0x0065:
            int r11 = r10.zzc     // Catch:{ all -> 0x0086 }
            int r11 = r11 + r13
            r10.zzc = r11     // Catch:{ all -> 0x0086 }
            int r11 = r10.zzd     // Catch:{ all -> 0x0086 }
            int r11 = r11 + r13
            r10.zzd = r11     // Catch:{ all -> 0x0086 }
            if (r11 != 0) goto L_0x007b
            r11 = 0
            r10.zze = r11     // Catch:{ all -> 0x0086 }
            com.google.android.gms.ads.internal.util.zzg r11 = r10.zzk     // Catch:{ all -> 0x0086 }
            r11.zzD(r3)     // Catch:{ all -> 0x0086 }
            goto L_0x0084
        L_0x007b:
            com.google.android.gms.ads.internal.util.zzg r11 = r10.zzk     // Catch:{ all -> 0x0086 }
            long r11 = r11.zze()     // Catch:{ all -> 0x0086 }
            long r3 = r3 - r11
            r10.zze = r3     // Catch:{ all -> 0x0086 }
        L_0x0084:
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            return
        L_0x0086:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcad.zzg(com.google.android.gms.ads.internal.client.zzl, long):void");
    }

    public final void zzh() {
        synchronized (this.zzj) {
            this.zzi++;
        }
    }
}
