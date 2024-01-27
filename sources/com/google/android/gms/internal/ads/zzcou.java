package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.api.Api;
import com.google.common.util.concurrent.e;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcou {
    /* access modifiers changed from: private */
    public final Context zza;
    private final zzg zzb;
    private final zzeeq zzc;
    private final zzdpy zzd;
    /* access modifiers changed from: private */
    public final zzgad zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    /* access modifiers changed from: private */
    public zzbua zzh;

    zzcou(Context context, zzg zzg2, zzeeq zzeeq, zzdpy zzdpy, zzgad zzgad, zzgad zzgad2, ScheduledExecutorService scheduledExecutorService) {
        this.zza = context;
        this.zzb = zzg2;
        this.zzc = zzeeq;
        this.zzd = zzdpy;
        this.zze = zzgad;
        this.zzf = zzgad2;
        this.zzg = scheduledExecutorService;
    }

    private final e zzj(String str, InputEvent inputEvent, Random random) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (!str.contains((CharSequence) zzba.zzc().zzb(zzbci.zzjv)) || this.zzb.zzQ()) {
            return zzfzt.zzh(str);
        }
        long nextInt = (long) random.nextInt(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        buildUpon.appendQueryParameter((String) zzba.zzc().zzb(zzbci.zzjw), String.valueOf(nextInt));
        if (inputEvent == null) {
            buildUpon.appendQueryParameter((String) zzba.zzc().zzb(zzbci.zzjx), "11");
            return zzfzt.zzh(buildUpon.toString());
        }
        return zzfzt.zzf(zzfzt.zzn(zzfzk.zzu(this.zzc.zza()), new zzcoo(this, buildUpon, str, inputEvent), this.zzf), Throwable.class, new zzcop(this, buildUpon), this.zze);
    }

    public final e zzc(String str, Random random) {
        return zzfzt.zzf(zzj(str, this.zzd.zza(), random), Throwable.class, new zzcon(str), this.zze);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzd(Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() == 1) {
            Uri.Builder buildUpon = builder.build().buildUpon();
            buildUpon.appendQueryParameter((String) zzba.zzc().zzb(zzbci.zzjy), AppEventsConstants.EVENT_PARAM_VALUE_YES);
            buildUpon.appendQueryParameter((String) zzba.zzc().zzb(zzbci.zzjx), "12");
            if (str.contains((CharSequence) zzba.zzc().zzb(zzbci.zzjz))) {
                buildUpon.authority((String) zzba.zzc().zzb(zzbci.zzjA));
            }
            return zzfzt.zzn(zzfzk.zzu(this.zzc.zzb(buildUpon.build(), inputEvent)), new zzcoq(builder), this.zzf);
        }
        builder.appendQueryParameter((String) zzba.zzc().zzb(zzbci.zzjx), "10");
        return zzfzt.zzh(builder.toString());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zze(Uri.Builder builder, Throwable th) {
        this.zze.zza(new zzcom(this, th));
        builder.appendQueryParameter((String) zzba.zzc().zzb(zzbci.zzjx), "9");
        return zzfzt.zzh(builder.toString());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(Throwable th) {
        zzbua zza2 = zzbty.zza(this.zza);
        this.zzh = zza2;
        zza2.zzf(th, "AttributionReporting");
    }

    public final void zzi(String str, zzfjx zzfjx, Random random) {
        zzfzt.zzr(zzfzt.zzo(zzj(str, this.zzd.zza(), random), (long) ((Integer) zzba.zzc().zzb(zzbci.zzjB)).intValue(), TimeUnit.MILLISECONDS, this.zzg), new zzcot(this, zzfjx, str), this.zze);
    }
}
