package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzcat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzdw {
    /* access modifiers changed from: private */
    public final HashSet zza = new HashSet();
    /* access modifiers changed from: private */
    public final Bundle zzb = new Bundle();
    /* access modifiers changed from: private */
    public final HashMap zzc = new HashMap();
    /* access modifiers changed from: private */
    public final HashSet zzd = new HashSet();
    /* access modifiers changed from: private */
    public final Bundle zze = new Bundle();
    /* access modifiers changed from: private */
    public final HashSet zzf = new HashSet();
    /* access modifiers changed from: private */
    public Date zzg;
    /* access modifiers changed from: private */
    public String zzh;
    /* access modifiers changed from: private */
    public final List zzi = new ArrayList();
    /* access modifiers changed from: private */
    public int zzj = -1;
    /* access modifiers changed from: private */
    public String zzk;
    /* access modifiers changed from: private */
    public String zzl;
    /* access modifiers changed from: private */
    public int zzm = -1;
    /* access modifiers changed from: private */
    public boolean zzn;
    /* access modifiers changed from: private */
    public String zzo;
    /* access modifiers changed from: private */
    public int zzp = 60000;

    @Deprecated
    public final void zzA(int i10) {
        this.zzj = i10;
    }

    public final void zzB(int i10) {
        this.zzp = i10;
    }

    @Deprecated
    public final void zzC(boolean z10) {
        this.zzn = z10;
    }

    public final void zzD(List list) {
        this.zzi.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                zzcat.zzj("neighboring content URL should not be null or empty");
            } else {
                this.zzi.add(str);
            }
        }
    }

    public final void zzE(String str) {
        this.zzk = str;
    }

    public final void zzF(String str) {
        this.zzl = str;
    }

    @Deprecated
    public final void zzG(boolean z10) {
        this.zzm = z10 ? 1 : 0;
    }

    public final void zzp(String str) {
        this.zzf.add(str);
    }

    public final void zzq(Class cls, Bundle bundle) {
        if (this.zzb.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.zzb.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        Bundle bundle2 = this.zzb.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        Preconditions.checkNotNull(bundle2);
        bundle2.putBundle(cls.getName(), bundle);
    }

    public final void zzr(String str, String str2) {
        this.zze.putString(str, str2);
    }

    public final void zzs(String str) {
        this.zza.add(str);
    }

    public final void zzt(Class cls, Bundle bundle) {
        this.zzb.putBundle(cls.getName(), bundle);
    }

    @Deprecated
    public final void zzu(NetworkExtras networkExtras) {
        this.zzc.put(networkExtras.getClass(), networkExtras);
    }

    public final void zzv(String str) {
        this.zzd.add(str);
    }

    public final void zzw(String str) {
        this.zzd.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void zzx(String str) {
        this.zzo = str;
    }

    @Deprecated
    public final void zzy(Date date) {
        this.zzg = date;
    }

    public final void zzz(String str) {
        this.zzh = str;
    }
}
