package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzanv extends zzhal {
    private Date zza;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk = 1.0d;
    private float zzl = 1.0f;
    private zzhav zzm = zzhav.zza;
    private long zzn;

    public zzanv() {
        super("mvhd");
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zza + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + "]";
    }

    public final long zzd() {
        return this.zzj;
    }

    public final long zze() {
        return this.zzi;
    }

    public final void zzf(ByteBuffer byteBuffer) {
        zzi(byteBuffer);
        if (zzh() == 1) {
            this.zza = zzhaq.zza(zzanr.zzf(byteBuffer));
            this.zzh = zzhaq.zza(zzanr.zzf(byteBuffer));
            this.zzi = zzanr.zze(byteBuffer);
            this.zzj = zzanr.zzf(byteBuffer);
        } else {
            this.zza = zzhaq.zza(zzanr.zze(byteBuffer));
            this.zzh = zzhaq.zza(zzanr.zze(byteBuffer));
            this.zzi = zzanr.zze(byteBuffer);
            this.zzj = zzanr.zze(byteBuffer);
        }
        this.zzk = zzanr.zzb(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.zzl = ((float) ((short) ((bArr[1] & 255) | ((short) (65280 & (bArr[0] << 8)))))) / 256.0f;
        zzanr.zzd(byteBuffer);
        zzanr.zze(byteBuffer);
        zzanr.zze(byteBuffer);
        double zzb = zzanr.zzb(byteBuffer);
        double zzb2 = zzanr.zzb(byteBuffer);
        double zza2 = zzanr.zza(byteBuffer);
        this.zzm = new zzhav(zzb, zzb2, zzanr.zzb(byteBuffer), zzanr.zzb(byteBuffer), zza2, zzanr.zza(byteBuffer), zzanr.zza(byteBuffer), zzanr.zzb(byteBuffer), zzanr.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzanr.zze(byteBuffer);
    }
}
