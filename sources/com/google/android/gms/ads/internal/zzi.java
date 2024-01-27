package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.internal.ads.zzarh;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzarn;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfns;
import com.google.android.gms.internal.ads.zzfom;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzi implements Runnable, zzark {
    protected boolean zza;
    final CountDownLatch zzb = new CountDownLatch(1);
    private final List zzc = new Vector();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    /* access modifiers changed from: private */
    public final zzfmq zzi;
    private Context zzj;
    private final Context zzk;
    private zzcaz zzl;
    private final zzcaz zzm;
    private final boolean zzn;
    private int zzo;

    public zzi(Context context, zzcaz zzcaz) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = zzcaz;
        this.zzm = zzcaz;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzba.zzc().zzb(zzbci.zzcg)).booleanValue();
        this.zzn = booleanValue;
        this.zzi = zzfmq.zza(context, newCachedThreadPool, booleanValue);
        this.zzf = ((Boolean) zzba.zzc().zzb(zzbci.zzcc)).booleanValue();
        this.zzg = ((Boolean) zzba.zzc().zzb(zzbci.zzch)).booleanValue();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzcf)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzdj)).booleanValue()) {
            this.zza = zzc();
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzdc)).booleanValue()) {
            zzcbg.zza.execute(this);
            return;
        }
        zzay.zzb();
        if (zzcam.zzu()) {
            zzcbg.zza.execute(this);
        } else {
            run();
        }
    }

    private final zzark zzj() {
        if (zzi() == 2) {
            return (zzark) this.zze.get();
        }
        return (zzark) this.zzd.get();
    }

    private final void zzm() {
        List list = this.zzc;
        zzark zzj2 = zzj();
        if (!list.isEmpty() && zzj2 != null) {
            for (Object[] objArr : this.zzc) {
                int length = objArr.length;
                if (length == 1) {
                    zzj2.zzk((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    zzj2.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.zzc.clear();
        }
    }

    private final void zzp(boolean z10) {
        this.zzd.set(zzarn.zzu(this.zzl.zza, zzq(this.zzj), z10, this.zzo));
    }

    private static final Context zzq(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final void run() {
        boolean z10;
        long currentTimeMillis;
        try {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzdj)).booleanValue()) {
                this.zza = zzc();
            }
            boolean z11 = this.zzl.zzd;
            z10 = false;
            if (!((Boolean) zzba.zzc().zzb(zzbci.zzaV)).booleanValue() && z11) {
                z10 = true;
            }
            if (zzi() == 1) {
                zzp(z10);
                if (this.zzo == 2) {
                    this.zzh.execute(new zzg(this, z10));
                }
            } else {
                currentTimeMillis = System.currentTimeMillis();
                zzarh zza2 = zzarh.zza(this.zzl.zza, zzq(this.zzj), z10, this.zzn);
                this.zze.set(zza2);
                if (this.zzg && !zza2.zzr()) {
                    this.zzo = 1;
                    zzp(z10);
                }
            }
        } catch (NullPointerException e10) {
            this.zzo = 1;
            zzp(z10);
            this.zzi.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e10);
        } catch (Throwable th) {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
            throw th;
        }
        this.zzb.countDown();
        this.zzj = null;
        this.zzl = null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzarh.zza(this.zzm.zza, zzq(this.zzk), z10, this.zzn).zzp();
        } catch (NullPointerException e10) {
            this.zzi.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e10);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzc() {
        Context context = this.zzj;
        zzh zzh2 = new zzh(this);
        zzfmq zzfmq = this.zzi;
        return new zzfom(this.zzj, zzfns.zzb(context, zzfmq), zzh2, ((Boolean) zzba.zzc().zzb(zzbci.zzcd)).booleanValue()).zzd(1);
    }

    public final boolean zzd() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e10) {
            zzcat.zzk("Interrupted during GADSignals creation.", e10);
            return false;
        }
    }

    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, (Activity) null);
    }

    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!zzd()) {
            return "";
        }
        zzark zzj2 = zzj();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjP)).booleanValue()) {
            zzt.zzp();
            zzt.zzI(view, 4, (MotionEvent) null);
        }
        if (zzj2 == null) {
            return "";
        }
        zzm();
        return zzj2.zzf(zzq(context), str, view, activity);
    }

    public final String zzg(Context context) {
        zzark zzj2;
        if (!zzd() || (zzj2 = zzj()) == null) {
            return "";
        }
        zzm();
        return zzj2.zzg(zzq(context));
    }

    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzjO)).booleanValue()) {
            zzark zzj2 = zzj();
            if (((Boolean) zzba.zzc().zzb(zzbci.zzjP)).booleanValue()) {
                zzt.zzp();
                zzt.zzI(view, 2, (MotionEvent) null);
            }
            return zzj2 != null ? zzj2.zzh(context, view, activity) : "";
        } else if (!zzd()) {
            return "";
        } else {
            zzark zzj3 = zzj();
            if (((Boolean) zzba.zzc().zzb(zzbci.zzjP)).booleanValue()) {
                zzt.zzp();
                zzt.zzI(view, 2, (MotionEvent) null);
            }
            if (zzj3 != null) {
                return zzj3.zzh(context, view, activity);
            }
            return "";
        }
    }

    /* access modifiers changed from: protected */
    public final int zzi() {
        if (!this.zzf || this.zza) {
            return this.zzo;
        }
        return 1;
    }

    public final void zzk(MotionEvent motionEvent) {
        zzark zzj2 = zzj();
        if (zzj2 != null) {
            zzm();
            zzj2.zzk(motionEvent);
            return;
        }
        this.zzc.add(new Object[]{motionEvent});
    }

    public final void zzl(int i10, int i11, int i12) {
        zzark zzj2 = zzj();
        if (zzj2 != null) {
            zzm();
            zzj2.zzl(i10, i11, i12);
            return;
        }
        this.zzc.add(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
    }

    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzark zzj2;
        if (zzd() && (zzj2 = zzj()) != null) {
            zzj2.zzn(stackTraceElementArr);
        }
    }

    public final void zzo(View view) {
        zzark zzj2 = zzj();
        if (zzj2 != null) {
            zzj2.zzo(view);
        }
    }
}
