package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzamg implements Comparable {
    /* access modifiers changed from: private */
    public final zzamr zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzamk zzf;
    private Integer zzg;
    private zzamj zzh;
    private boolean zzi;
    private zzalp zzj;
    private zzamf zzk;
    private final zzalu zzl;

    public zzamg(int i10, String str, zzamk zzamk) {
        Uri parse;
        String host;
        this.zza = zzamr.zza ? new zzamr() : null;
        this.zze = new Object();
        int i11 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i10;
        this.zzc = str;
        this.zzf = zzamk;
        this.zzl = new zzalu();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i11 = host.hashCode();
        }
        this.zzd = i11;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzamg) obj).zzg.intValue();
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzw();
        Integer num = this.zzg;
        return "[ ] " + this.zzc + " " + "0x".concat(valueOf) + " NORMAL " + num;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzalp zzd() {
        return this.zzj;
    }

    public final zzamg zze(zzalp zzalp) {
        this.zzj = zzalp;
        return this;
    }

    public final zzamg zzf(zzamj zzamj) {
        this.zzh = zzamj;
        return this;
    }

    public final zzamg zzg(int i10) {
        this.zzg = Integer.valueOf(i10);
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract zzamm zzh(zzamc zzamc);

    public final String zzj() {
        int i10 = this.zzb;
        String str = this.zzc;
        if (i10 == 0) {
            return str;
        }
        String num = Integer.toString(1);
        return num + "-" + str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzamr.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzamp zzamp) {
        zzamk zzamk;
        synchronized (this.zze) {
            zzamk = this.zzf;
        }
        zzamk.zza(zzamp);
    }

    /* access modifiers changed from: protected */
    public abstract void zzo(Object obj);

    /* access modifiers changed from: package-private */
    public final void zzp(String str) {
        zzamj zzamj = this.zzh;
        if (zzamj != null) {
            zzamj.zzb(this);
        }
        if (zzamr.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzame(this, str, id));
                return;
            }
            this.zza.zza(str, id);
            this.zza.zzb(toString());
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzr() {
        zzamf zzamf;
        synchronized (this.zze) {
            zzamf = this.zzk;
        }
        if (zzamf != null) {
            zzamf.zza(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzs(zzamm zzamm) {
        zzamf zzamf;
        synchronized (this.zze) {
            zzamf = this.zzk;
        }
        if (zzamf != null) {
            zzamf.zzb(this, zzamm);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzt(int i10) {
        zzamj zzamj = this.zzh;
        if (zzamj != null) {
            zzamj.zzc(this, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzu(zzamf zzamf) {
        synchronized (this.zze) {
            this.zzk = zzamf;
        }
    }

    public final boolean zzv() {
        boolean z10;
        synchronized (this.zze) {
            z10 = this.zzi;
        }
        return z10;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() {
        return null;
    }

    public final zzalu zzy() {
        return this.zzl;
    }
}
