package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgtq {
    private static final zzgtq zzb = new zzgtq(true);
    final zzgwp zza = new zzgwf(16);
    private boolean zzc;
    private boolean zzd;

    private zzgtq() {
    }

    public static zzgtq zza() {
        throw null;
    }

    private static final void zzd(zzgtp zzgtp, Object obj) {
        boolean z10;
        zzgxj zzb2 = zzgtp.zzb();
        byte[] bArr = zzguj.zzd;
        Objects.requireNonNull(obj);
        zzgxj zzgxj = zzgxj.DOUBLE;
        zzgxk zzgxk = zzgxk.INT;
        switch (zzb2.zza().ordinal()) {
            case 0:
                z10 = obj instanceof Integer;
                break;
            case 1:
                z10 = obj instanceof Long;
                break;
            case 2:
                z10 = obj instanceof Float;
                break;
            case 3:
                z10 = obj instanceof Double;
                break;
            case 4:
                z10 = obj instanceof Boolean;
                break;
            case 5:
                z10 = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zzgsr) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzgub)) {
                    return;
                }
            case 8:
                if ((obj instanceof zzgvj) || (obj instanceof zzguo)) {
                    return;
                }
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzgtp.zza()), zzgtp.zzb().zza(), obj.getClass().getName()}));
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzgtq zzgtq = new zzgtq();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            zzgtq.zzc((zzgtp) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzgtq.zzc((zzgtp) entry.getKey(), entry.getValue());
        }
        zzgtq.zzd = this.zzd;
        return zzgtq;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgtq)) {
            return false;
        }
        return this.zza.equals(((zzgtq) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (!this.zzc) {
            for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
                Map.Entry zzg = this.zza.zzg(i10);
                if (zzg.getValue() instanceof zzgtz) {
                    ((zzgtz) zzg.getValue()).zzaS();
                }
            }
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzc(zzgtp zzgtp, Object obj) {
        if (!zzgtp.zzc()) {
            zzd(zzgtp, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                zzd(zzgtp, arrayList.get(i10));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzguo) {
            this.zzd = true;
        }
        this.zza.put(zzgtp, obj);
    }

    private zzgtq(boolean z10) {
        zzb();
        zzb();
    }
}
