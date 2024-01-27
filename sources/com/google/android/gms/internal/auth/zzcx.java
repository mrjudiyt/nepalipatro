package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
final class zzcx extends zzdc {
    zzcx(zzcz zzcz, String str, Double d10, boolean z10) {
        super(zzcz, str, d10, true, (zzdb) null);
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String zzc = super.zzc();
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid double value for ");
            sb.append(zzc);
            sb.append(": ");
            sb.append((String) obj);
            return null;
        }
    }
}
