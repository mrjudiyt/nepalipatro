package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzwu extends zzdb {
    /* access modifiers changed from: private */
    public boolean zza;
    /* access modifiers changed from: private */
    public boolean zzb;
    /* access modifiers changed from: private */
    public boolean zzc;
    /* access modifiers changed from: private */
    public boolean zzd;
    /* access modifiers changed from: private */
    public boolean zze;
    /* access modifiers changed from: private */
    public boolean zzf;
    /* access modifiers changed from: private */
    public final SparseArray zzg;
    /* access modifiers changed from: private */
    public final SparseBooleanArray zzh;

    @Deprecated
    public zzwu() {
        this.zzg = new SparseArray();
        this.zzh = new SparseBooleanArray();
        zzv();
    }

    private final void zzv() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
    }

    public final /* synthetic */ zzdb zze(int i10, int i11, boolean z10) {
        super.zze(i10, i11, true);
        return this;
    }

    public final zzwu zzo(int i10, boolean z10) {
        if (this.zzh.get(i10) == z10) {
            return this;
        }
        if (z10) {
            this.zzh.put(i10, true);
        } else {
            this.zzh.delete(i10);
        }
        return this;
    }

    public zzwu(Context context) {
        super.zzd(context);
        Point zzt = zzfk.zzt(context);
        zze(zzt.x, zzt.y, true);
        this.zzg = new SparseArray();
        this.zzh = new SparseBooleanArray();
        zzv();
    }

    /* synthetic */ zzwu(zzww zzww, zzwt zzwt) {
        super(zzww);
        this.zza = zzww.zzH;
        this.zzb = zzww.zzJ;
        this.zzc = zzww.zzL;
        this.zzd = zzww.zzQ;
        this.zze = zzww.zzR;
        this.zzf = zzww.zzT;
        SparseArray zza2 = zzww.zzam;
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < zza2.size(); i10++) {
            sparseArray.put(zza2.keyAt(i10), new HashMap((Map) zza2.valueAt(i10)));
        }
        this.zzg = sparseArray;
        this.zzh = zzww.zzan.clone();
    }
}
