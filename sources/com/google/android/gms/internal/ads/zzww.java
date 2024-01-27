package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzww extends zzdc {
    public static final zzww zzE;
    @Deprecated
    public static final zzww zzF;
    public static final zzn zzG = zzws.zza;
    private static final String zzU = Integer.toString(1000, 36);
    private static final String zzV = Integer.toString(1001, 36);
    private static final String zzW = Integer.toString(1002, 36);
    private static final String zzX = Integer.toString(1003, 36);
    private static final String zzY = Integer.toString(1004, 36);
    private static final String zzZ = Integer.toString(1005, 36);
    private static final String zzaa = Integer.toString(1006, 36);
    private static final String zzab = Integer.toString(1007, 36);
    private static final String zzac = Integer.toString(1008, 36);
    private static final String zzad = Integer.toString(1009, 36);
    private static final String zzae = Integer.toString(1010, 36);
    private static final String zzaf = Integer.toString(1011, 36);
    private static final String zzag = Integer.toString(1012, 36);
    private static final String zzah = Integer.toString(1013, 36);
    private static final String zzai = Integer.toString(1014, 36);
    private static final String zzaj = Integer.toString(1015, 36);
    private static final String zzak = Integer.toString(1016, 36);
    private static final String zzal = Integer.toString(1017, 36);
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    /* access modifiers changed from: private */
    public final SparseArray zzam;
    /* access modifiers changed from: private */
    public final SparseBooleanArray zzan;

    static {
        zzww zzww = new zzww(new zzwu());
        zzE = zzww;
        zzF = zzww;
    }

    private zzww(zzwu zzwu) {
        super(zzwu);
        this.zzH = zzwu.zza;
        this.zzI = false;
        this.zzJ = zzwu.zzb;
        this.zzK = false;
        this.zzL = zzwu.zzc;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        this.zzP = false;
        this.zzQ = zzwu.zzd;
        this.zzR = zzwu.zze;
        this.zzS = false;
        this.zzT = zzwu.zzf;
        this.zzam = zzwu.zzg;
        this.zzan = zzwu.zzh;
    }

    public static zzww zzd(Context context) {
        return new zzww(new zzwu(context));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzww.class == obj.getClass()) {
            zzww zzww = (zzww) obj;
            if (super.equals(zzww) && this.zzH == zzww.zzH && this.zzJ == zzww.zzJ && this.zzL == zzww.zzL && this.zzQ == zzww.zzQ && this.zzR == zzww.zzR && this.zzT == zzww.zzT) {
                SparseBooleanArray sparseBooleanArray = this.zzan;
                SparseBooleanArray sparseBooleanArray2 = zzww.zzan;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            SparseArray sparseArray = this.zzam;
                            SparseArray sparseArray2 = zzww.zzam;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                int i11 = 0;
                                while (i11 < size2) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i11);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzvx zzvx = (zzvx) entry.getKey();
                                                if (map2.containsKey(zzvx)) {
                                                    if (!zzfk.zzE(entry.getValue(), map2.get(zzvx))) {
                                                    }
                                                }
                                            }
                                            i11++;
                                        }
                                    }
                                }
                                return true;
                            }
                        } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((super.hashCode() + 31) * 31) + (this.zzH ? 1 : 0)) * 961) + (this.zzJ ? 1 : 0)) * 961) + (this.zzL ? 1 : 0)) * 28629151) + (this.zzQ ? 1 : 0)) * 31) + (this.zzR ? 1 : 0)) * 961) + (this.zzT ? 1 : 0)) * 31;
    }

    public final zzwu zzc() {
        return new zzwu(this, (zzwt) null);
    }

    @Deprecated
    public final zzwy zze(int i10, zzvx zzvx) {
        Map map = (Map) this.zzam.get(i10);
        if (map != null) {
            return (zzwy) map.get(zzvx);
        }
        return null;
    }

    public final boolean zzf(int i10) {
        return this.zzan.get(i10);
    }

    @Deprecated
    public final boolean zzg(int i10, zzvx zzvx) {
        Map map = (Map) this.zzam.get(i10);
        return map != null && map.containsKey(zzvx);
    }
}
