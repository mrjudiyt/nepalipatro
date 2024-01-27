package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfdl {
    /* access modifiers changed from: private */
    public zzl zza;
    /* access modifiers changed from: private */
    public zzq zzb;
    /* access modifiers changed from: private */
    public String zzc;
    /* access modifiers changed from: private */
    public zzfl zzd;
    /* access modifiers changed from: private */
    public boolean zze;
    /* access modifiers changed from: private */
    public ArrayList zzf;
    /* access modifiers changed from: private */
    public ArrayList zzg;
    /* access modifiers changed from: private */
    public zzbfc zzh;
    /* access modifiers changed from: private */
    public zzw zzi;
    /* access modifiers changed from: private */
    public AdManagerAdViewOptions zzj;
    /* access modifiers changed from: private */
    public PublisherAdViewOptions zzk;
    /* access modifiers changed from: private */
    public zzcb zzl;
    /* access modifiers changed from: private */
    public int zzm = 1;
    /* access modifiers changed from: private */
    public zzbls zzn;
    /* access modifiers changed from: private */
    public final zzfcy zzo = new zzfcy();
    /* access modifiers changed from: private */
    public boolean zzp = false;
    /* access modifiers changed from: private */
    public zzemk zzq;
    /* access modifiers changed from: private */
    public boolean zzr = false;
    /* access modifiers changed from: private */
    public zzcf zzs;

    public final zzfdl zzA(zzbfc zzbfc) {
        this.zzh = zzbfc;
        return this;
    }

    public final zzfdl zzB(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfdl zzC(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfdl zzD(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzc();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzfdl zzE(zzl zzl2) {
        this.zza = zzl2;
        return this;
    }

    public final zzfdl zzF(zzfl zzfl) {
        this.zzd = zzfl;
        return this;
    }

    public final zzfdn zzG() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfdn(this, (zzfdm) null);
    }

    public final String zzI() {
        return this.zzc;
    }

    public final boolean zzO() {
        return this.zzp;
    }

    public final zzfdl zzQ(zzcf zzcf) {
        this.zzs = zzcf;
        return this;
    }

    public final zzl zze() {
        return this.zza;
    }

    public final zzq zzg() {
        return this.zzb;
    }

    public final zzfcy zzo() {
        return this.zzo;
    }

    public final zzfdl zzp(zzfdn zzfdn) {
        this.zzo.zza(zzfdn.zzo.zza);
        this.zza = zzfdn.zzd;
        this.zzb = zzfdn.zze;
        this.zzs = zzfdn.zzr;
        this.zzc = zzfdn.zzf;
        this.zzd = zzfdn.zza;
        this.zzf = zzfdn.zzg;
        this.zzg = zzfdn.zzh;
        this.zzh = zzfdn.zzi;
        this.zzi = zzfdn.zzj;
        zzq(zzfdn.zzl);
        zzD(zzfdn.zzm);
        this.zzp = zzfdn.zzp;
        this.zzq = zzfdn.zzc;
        this.zzr = zzfdn.zzq;
        return this;
    }

    public final zzfdl zzq(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfdl zzr(zzq zzq2) {
        this.zzb = zzq2;
        return this;
    }

    public final zzfdl zzs(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfdl zzt(zzw zzw) {
        this.zzi = zzw;
        return this;
    }

    public final zzfdl zzu(zzemk zzemk) {
        this.zzq = zzemk;
        return this;
    }

    public final zzfdl zzv(zzbls zzbls) {
        this.zzn = zzbls;
        this.zzd = new zzfl(false, true, false);
        return this;
    }

    public final zzfdl zzw(boolean z10) {
        this.zzp = z10;
        return this;
    }

    public final zzfdl zzx(boolean z10) {
        this.zzr = true;
        return this;
    }

    public final zzfdl zzy(boolean z10) {
        this.zze = z10;
        return this;
    }

    public final zzfdl zzz(int i10) {
        this.zzm = i10;
        return this;
    }
}
