package com.google.android.gms.internal.fido;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public abstract class zzbl {
    private static final zzbl zza = new zzbj("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzbl zzb = new zzbj("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzbl zzc = new zzbk("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final zzbl zzd = new zzbk("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final zzbl zze = new zzbi("base16()", "0123456789ABCDEF");

    zzbl() {
    }

    public static zzbl zzd() {
        return zze;
    }

    /* access modifiers changed from: package-private */
    public abstract void zza(Appendable appendable, byte[] bArr, int i10, int i11);

    /* access modifiers changed from: package-private */
    public abstract int zzb(int i10);

    public final String zze(byte[] bArr, int i10, int i11) {
        zzas.zze(0, i11, bArr.length);
        StringBuilder sb = new StringBuilder(zzb(i11));
        try {
            zza(sb, bArr, 0, i11);
            return sb.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
