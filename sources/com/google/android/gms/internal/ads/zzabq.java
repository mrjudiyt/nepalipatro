package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzabq {
    public static int zza(zzabn zzabn, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int zzb = zzabn.zzb(bArr, i10 + i12, i11 - i12);
            if (zzb == -1) {
                break;
            }
            i12 += zzb;
        }
        return i12;
    }

    public static void zzb(boolean z10, String str) {
        if (!z10) {
            throw zzcc.zza(str, (Throwable) null);
        }
    }

    public static boolean zzc(zzabn zzabn, byte[] bArr, int i10, int i11, boolean z10) {
        try {
            return zzabn.zzm(bArr, 0, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static boolean zzd(zzabn zzabn, byte[] bArr, int i10, int i11) {
        try {
            ((zzabc) zzabn).zzn(bArr, i10, i11, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzabn zzabn, int i10) {
        try {
            ((zzabc) zzabn).zzo(i10, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
