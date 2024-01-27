package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzavz {
    ByteArrayOutputStream zza = new ByteArrayOutputStream(4096);
    Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    public final String toString() {
        try {
            this.zzb.close();
        } catch (IOException e10) {
            zzcat.zzh("HashManager: Unable to convert to Base64.", e10);
        }
        try {
            this.zza.close();
            return this.zza.toString();
        } catch (IOException e11) {
            zzcat.zzh("HashManager: Unable to convert to Base64.", e11);
            return "";
        } finally {
            this.zza = null;
            this.zzb = null;
        }
    }
}
