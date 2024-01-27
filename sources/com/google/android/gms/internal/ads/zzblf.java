package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzblf implements zzalz {
    /* access modifiers changed from: private */
    public volatile zzbks zza;
    private final Context zzb;

    public zzblf(Context context) {
        this.zzb = context;
    }

    static /* bridge */ /* synthetic */ void zzc(zzblf zzblf) {
        if (zzblf.zza != null) {
            zzblf.zza.disconnect();
            Binder.flushPendingCommands();
        }
    }

    public final zzamc zza(zzamg zzamg) {
        Parcelable.Creator<zzbkt> creator = zzbkt.CREATOR;
        Map zzl = zzamg.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i10 = 0;
        int i11 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i11] = (String) entry.getKey();
            strArr2[i11] = (String) entry.getValue();
            i11++;
        }
        zzbkt zzbkt = new zzbkt(zzamg.zzk(), strArr, strArr2);
        long elapsedRealtime = zzt.zzB().elapsedRealtime();
        try {
            zzcbl zzcbl = new zzcbl();
            this.zza = new zzbks(this.zzb, zzt.zzt().zzb(), new zzbld(this, zzcbl), new zzble(this, zzcbl));
            this.zza.checkAvailabilityAndConnect();
            zzblb zzblb = new zzblb(this, zzbkt);
            zzgad zzgad = zzcbg.zza;
            e zzo = zzfzt.zzo(zzfzt.zzn(zzcbl, zzblb, zzgad), (long) ((Integer) zzba.zzc().zzb(zzbci.zzep)).intValue(), TimeUnit.MILLISECONDS, zzcbg.zzd);
            zzo.addListener(new zzblc(this), zzgad);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            long elapsedRealtime2 = zzt.zzB().elapsedRealtime() - elapsedRealtime;
            zze.zza("Http assets remote cache took " + elapsedRealtime2 + "ms");
            zzbkv zzbkv = (zzbkv) new zzbve(parcelFileDescriptor).zza(zzbkv.CREATOR);
            if (zzbkv == null) {
                return null;
            }
            if (!zzbkv.zza) {
                if (zzbkv.zze.length != zzbkv.zzf.length) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = zzbkv.zze;
                    if (i10 >= strArr3.length) {
                        return new zzamc(zzbkv.zzc, zzbkv.zzd, (Map) hashMap, zzbkv.zzg, zzbkv.zzh);
                    }
                    hashMap.put(strArr3[i10], zzbkv.zzf[i10]);
                    i10++;
                }
            } else {
                throw new zzamp(zzbkv.zzb);
            }
        } catch (InterruptedException | ExecutionException unused) {
            zze.zza("Http assets remote cache took " + (zzt.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            zze.zza("Http assets remote cache took " + (zzt.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            throw th;
        }
    }
}
