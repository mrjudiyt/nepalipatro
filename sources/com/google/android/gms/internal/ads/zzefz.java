package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.zzb;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzefz implements zzefa {
    private final Context zza;
    private final zzcrs zzb;
    private final Executor zzc;

    public zzefz(Context context, zzcrs zzcrs, Executor executor) {
        this.zza = context;
        this.zzb = zzcrs;
        this.zzc = executor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfde r7, com.google.android.gms.internal.ads.zzfcr r8, com.google.android.gms.internal.ads.zzeex r9) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzhD
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0077
            boolean r0 = r8.zzai
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r9.zzb
            com.google.android.gms.internal.ads.zzfej r0 = (com.google.android.gms.internal.ads.zzfej) r0
            com.google.android.gms.internal.ads.zzbpg r0 = r0.zzc()
            if (r0 == 0) goto L_0x0067
            com.google.android.gms.dynamic.IObjectWrapper r2 = r0.zze()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch:{ RemoteException -> 0x0060 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ RemoteException -> 0x0060 }
            boolean r0 = r0.zzf()     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x0053
            if (r0 == 0) goto L_0x007f
            com.google.common.util.concurrent.e r0 = com.google.android.gms.internal.ads.zzfzt.zzh(r1)
            com.google.android.gms.internal.ads.zzefx r3 = new com.google.android.gms.internal.ads.zzefx
            r3.<init>(r6, r2, r8)
            com.google.android.gms.internal.ads.zzgad r2 = com.google.android.gms.internal.ads.zzcbg.zze
            com.google.common.util.concurrent.e r0 = com.google.android.gms.internal.ads.zzfzt.zzn(r0, r3, r2)
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            r2 = r0
            android.view.View r2 = (android.view.View) r2     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            goto L_0x007f
        L_0x004a:
            r7 = move-exception
            goto L_0x004d
        L_0x004c:
            r7 = move-exception
        L_0x004d:
            com.google.android.gms.internal.ads.zzfds r8 = new com.google.android.gms.internal.ads.zzfds
            r8.<init>(r7)
            throw r8
        L_0x0053:
            com.google.android.gms.internal.ads.zzfds r7 = new com.google.android.gms.internal.ads.zzfds
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "BannerAdapterWrapper interscrollerView should not be null"
            r8.<init>(r9)
            r7.<init>(r8)
            throw r7
        L_0x0060:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzfds r8 = new com.google.android.gms.internal.ads.zzfds
            r8.<init>(r7)
            throw r8
        L_0x0067:
            java.lang.String r7 = "getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."
            com.google.android.gms.internal.ads.zzcat.zzg(r7)
            com.google.android.gms.internal.ads.zzfds r8 = new com.google.android.gms.internal.ads.zzfds
            java.lang.Exception r9 = new java.lang.Exception
            r9.<init>(r7)
            r8.<init>(r9)
            throw r8
        L_0x0077:
            java.lang.Object r0 = r9.zzb
            com.google.android.gms.internal.ads.zzfej r0 = (com.google.android.gms.internal.ads.zzfej) r0
            android.view.View r2 = r0.zza()
        L_0x007f:
            com.google.android.gms.internal.ads.zzcrs r0 = r6.zzb
            java.lang.String r3 = r9.zza
            com.google.android.gms.internal.ads.zzctm r4 = new com.google.android.gms.internal.ads.zzctm
            r4.<init>(r7, r8, r3)
            java.lang.Object r7 = r9.zzb
            com.google.android.gms.internal.ads.zzcrc r3 = new com.google.android.gms.internal.ads.zzcrc
            com.google.android.gms.internal.ads.zzfej r7 = (com.google.android.gms.internal.ads.zzfej) r7
            com.google.android.gms.internal.ads.zzefy r5 = new com.google.android.gms.internal.ads.zzefy
            r5.<init>(r7)
            java.util.List r7 = r8.zzw
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            com.google.android.gms.internal.ads.zzfcs r7 = (com.google.android.gms.internal.ads.zzfcs) r7
            r3.<init>(r2, r1, r5, r7)
            com.google.android.gms.internal.ads.zzcqw r7 = r0.zza(r4, r3)
            com.google.android.gms.internal.ads.zzdex r8 = r7.zzg()
            r8.zza(r2)
            com.google.android.gms.internal.ads.zzcyk r8 = r7.zzd()
            java.lang.Object r0 = r9.zzb
            com.google.android.gms.internal.ads.zzcol r1 = new com.google.android.gms.internal.ads.zzcol
            com.google.android.gms.internal.ads.zzfej r0 = (com.google.android.gms.internal.ads.zzfej) r0
            r1.<init>(r0)
            java.util.concurrent.Executor r0 = r6.zzc
            r8.zzo(r1, r0)
            com.google.android.gms.internal.ads.zzcyv r8 = r9.zzc
            com.google.android.gms.internal.ads.zzegq r8 = (com.google.android.gms.internal.ads.zzegq) r8
            com.google.android.gms.internal.ads.zzekh r9 = r7.zzj()
            r8.zzc(r9)
            com.google.android.gms.internal.ads.zzcqv r7 = r7.zza()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefz.zza(com.google.android.gms.internal.ads.zzfde, com.google.android.gms.internal.ads.zzfcr, com.google.android.gms.internal.ads.zzeex):java.lang.Object");
    }

    public final void zzb(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        zzq zza2;
        zzq zzq = zzfde.zza.zza.zze;
        if (zzq.zzn) {
            zza2 = new zzq(this.zza, zzb.zzd(zzq.zze, zzq.zzb));
        } else {
            if (!((Boolean) zzba.zzc().zzb(zzbci.zzhD)).booleanValue() || !zzfcr.zzai) {
                zza2 = zzfdr.zza(this.zza, zzfcr.zzw);
            } else {
                zza2 = new zzq(this.zza, zzb.zze(zzq.zze, zzq.zzb));
            }
        }
        zzq zzq2 = zza2;
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzhD)).booleanValue() || !zzfcr.zzai) {
            Object obj = zzeex.zzb;
            Context context = this.zza;
            zzfdn zzfdn = zzfde.zza.zza;
            ((zzfej) obj).zzm(context, zzq2, zzfdn.zzd, zzfcr.zzx.toString(), zzbw.zzl(zzfcr.zzu), (zzbpd) zzeex.zzc);
            return;
        }
        Object obj2 = zzeex.zzb;
        Context context2 = this.zza;
        zzfdn zzfdn2 = zzfde.zza.zza;
        ((zzfej) obj2).zzn(context2, zzq2, zzfdn2.zzd, zzfcr.zzx.toString(), zzbw.zzl(zzfcr.zzu), (zzbpd) zzeex.zzc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzc(View view, zzfcr zzfcr, Object obj) {
        return zzfzt.zzh(zzcsj.zza(this.zza, view, zzfcr));
    }
}
