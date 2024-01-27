package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzet;
import com.google.android.gms.internal.gtm.zzeu;
import com.google.android.gms.internal.gtm.zzez;
import com.google.android.gms.internal.gtm.zzfa;
import com.google.android.gms.internal.gtm.zzfq;
import com.google.android.gms.internal.gtm.zzfr;
import com.google.android.gms.internal.gtm.zzft;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class GoogleAnalytics extends zza {
    private static List<Runnable> zzb = new ArrayList();
    private boolean zzc;
    private Set<zzv> zzd = new HashSet();
    private boolean zze;
    private boolean zzf;
    private volatile boolean zzg;
    private boolean zzh;

    @VisibleForTesting
    public GoogleAnalytics(zzbv zzbv) {
        super(zzbv);
    }

    public static GoogleAnalytics getInstance(Context context) {
        return zzbv.zzg(context).zzc();
    }

    public static void zzf() {
        synchronized (GoogleAnalytics.class) {
            List<Runnable> list = zzb;
            if (list != null) {
                for (Runnable run : list) {
                    run.run();
                }
                zzb = null;
            }
        }
    }

    public void dispatchLocalHits() {
        zzb().zzf().zzc();
    }

    @TargetApi(14)
    public void enableAutoActivityReports(Application application) {
        if (!this.zze) {
            application.registerActivityLifecycleCallbacks(new zze(this));
            this.zze = true;
        }
    }

    public boolean getAppOptOut() {
        return this.zzg;
    }

    @Deprecated
    public Logger getLogger() {
        return zzfa.zza();
    }

    public boolean isDryRunEnabled() {
        return this.zzf;
    }

    public Tracker newTracker(int i10) {
        Tracker tracker;
        zzfr zzfr;
        synchronized (this) {
            tracker = new Tracker(zzb(), (String) null, (zzez) null);
            if (i10 > 0 && (zzfr = (zzfr) new zzfq(zzb()).zza(i10)) != null) {
                tracker.zzm(zzfr);
            }
            tracker.zzX();
        }
        return tracker;
    }

    public void reportActivityStart(Activity activity) {
        if (!this.zze) {
            zzh(activity);
        }
    }

    public void reportActivityStop(Activity activity) {
        if (!this.zze) {
            zzi(activity);
        }
    }

    public void setAppOptOut(boolean z10) {
        this.zzg = z10;
        if (this.zzg) {
            zzb().zzf().zzg();
        }
    }

    public void setDryRun(boolean z10) {
        this.zzf = z10;
    }

    public void setLocalDispatchPeriod(int i10) {
        zzb().zzf().zzl(i10);
    }

    @Deprecated
    public void setLogger(Logger logger) {
        zzfa.zzc(logger);
        if (!this.zzh) {
            zzet<String> zzet = zzeu.zzc;
            String zzb2 = zzet.zzb();
            String zzb3 = zzet.zzb();
            StringBuilder sb = new StringBuilder(zzb3.length() + 112);
            sb.append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.");
            sb.append(zzb3);
            sb.append(" DEBUG");
            this.zzh = true;
        }
    }

    public final void zzg() {
        zzft zzq = zzb().zzq();
        zzq.zzf();
        if (zzq.zze()) {
            setDryRun(zzq.zzc());
        }
        zzq.zzf();
        this.zzc = true;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzh(Activity activity) {
        for (zzv zza : this.zzd) {
            zza.zza(activity);
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzi(Activity activity) {
        for (zzv zzb2 : this.zzd) {
            zzb2.zzb(activity);
        }
    }

    public final boolean zzj() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final void zzk(zzv zzv) {
        this.zzd.add(zzv);
        Context zza = zzb().zza();
        if (zza instanceof Application) {
            enableAutoActivityReports((Application) zza);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzl(zzv zzv) {
        this.zzd.remove(zzv);
    }

    public Tracker newTracker(String str) {
        Tracker tracker;
        synchronized (this) {
            tracker = new Tracker(zzb(), str, (zzez) null);
            tracker.zzX();
        }
        return tracker;
    }
}
