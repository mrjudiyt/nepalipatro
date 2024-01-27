package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class zzgq extends zzgn<Boolean> {
    zzgq(zzgv zzgv, String str, Boolean bool, boolean z10) {
        super(zzgv, str, bool);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzfr.zzb.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzfr.zzc.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String zzb = super.zzb();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder("Invalid boolean value for ");
        sb.append(zzb);
        sb.append(": ");
        sb.append(valueOf);
        return null;
    }
}
