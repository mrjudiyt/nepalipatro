package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class zzgt extends zzgn<Double> {
    zzgt(zzgv zzgv, String str, Double d10, boolean z10) {
        super(zzgv, str, d10);
    }

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final Double zza(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String zzb = super.zzb();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder("Invalid double value for ");
        sb.append(zzb);
        sb.append(": ");
        sb.append(valueOf);
        return null;
    }
}
