package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaek {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzaek() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.zza = byteArrayOutputStream;
        this.zzb = new DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzaej zzaej) {
        this.zza.reset();
        try {
            zzb(this.zzb, zzaej.zza);
            String str = zzaej.zzb;
            if (str == null) {
                str = "";
            }
            zzb(this.zzb, str);
            this.zzb.writeLong(zzaej.zzc);
            this.zzb.writeLong(zzaej.zzd);
            this.zzb.write(zzaej.zze);
            this.zzb.flush();
            return this.zza.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
