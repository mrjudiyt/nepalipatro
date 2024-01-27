package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.a;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcsk implements zzcyz, zzcyf {
    private final Context zza;
    private final zzcgb zzb;
    private final zzfcr zzc;
    private final zzcaz zzd;
    private zzfkc zze;
    private boolean zzf;

    public zzcsk(Context context, zzcgb zzcgb, zzfcr zzfcr, zzcaz zzcaz) {
        this.zza = context;
        this.zzb = zzcgb;
        this.zzc = zzfcr;
        this.zzd = zzcaz;
    }

    private final synchronized void zza() {
        zzeeo zzeeo;
        zzeep zzeep;
        zzeep zzeep2;
        if (this.zzc.zzV) {
            if (this.zzb != null) {
                if (zzt.zzA().zzj(this.zza)) {
                    zzcaz zzcaz = this.zzd;
                    String str = zzcaz.zzb + "." + zzcaz.zzc;
                    zzfdq zzfdq = this.zzc.zzX;
                    String zza2 = zzfdq.zza();
                    if (zzfdq.zzb() == 1) {
                        zzeeo = zzeeo.zzc;
                        zzeep = zzeep.DEFINED_BY_JAVASCRIPT;
                    } else {
                        zzfcr zzfcr = this.zzc;
                        zzeeo zzeeo2 = zzeeo.HTML_DISPLAY;
                        if (zzfcr.zzf == 1) {
                            zzeep2 = zzeep.ONE_PIXEL;
                        } else {
                            zzeep2 = zzeep.BEGIN_TO_RENDER;
                        }
                        zzeep = zzeep2;
                        zzeeo = zzeeo2;
                    }
                    zzfkc zza3 = zzt.zzA().zza(str, this.zzb.zzG(), "", "javascript", zza2, zzeep, zzeeo, this.zzc.zzan);
                    this.zze = zza3;
                    zzcgb zzcgb = this.zzb;
                    if (zza3 != null) {
                        zzt.zzA().zzh(this.zze, (View) zzcgb);
                        this.zzb.zzap(this.zze);
                        zzt.zzA().zzi(this.zze);
                        this.zzf = true;
                        this.zzb.zzd("onSdkLoaded", new a());
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzq() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzf     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0008
            r3.zza()     // Catch:{ all -> 0x0024 }
        L_0x0008:
            com.google.android.gms.internal.ads.zzfcr r0 = r3.zzc     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.zzV     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.internal.ads.zzfkc r0 = r3.zze     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.internal.ads.zzcgb r0 = r3.zzb     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            androidx.collection.a r1 = new androidx.collection.a     // Catch:{ all -> 0x0024 }
            r1.<init>()     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = "onSdkImpression"
            r0.zzd(r2, r1)     // Catch:{ all -> 0x0024 }
            monitor-exit(r3)
            return
        L_0x0022:
            monitor-exit(r3)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcsk.zzq():void");
    }

    public final synchronized void zzr() {
        if (!this.zzf) {
            zza();
        }
    }
}
