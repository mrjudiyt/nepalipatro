package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
final class zzcv extends zzdc {
    zzcv(zzcz zzcz, String str, Long l10, boolean z10) {
        super(zzcz, str, l10, true, (zzdb) null);
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String zzc = super.zzc();
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid long value for ");
            sb.append(zzc);
            sb.append(": ");
            sb.append((String) obj);
            return null;
        }
    }
}
