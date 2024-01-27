package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzarf implements zzfol {
    final /* synthetic */ zzfml zza;

    zzarf(zzarh zzarh, zzfml zzfml) {
        this.zza = zzfml;
    }

    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
