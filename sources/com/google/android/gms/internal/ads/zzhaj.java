package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzhaj implements zzans {
    private static final zzhau zza = zzhau.zzb(zzhaj.class);
    protected final String zzb;
    boolean zzc;
    boolean zzd;
    long zze;
    long zzf = -1;
    zzhao zzg;
    private zzant zzh;
    private ByteBuffer zzi;
    private ByteBuffer zzj = null;

    protected zzhaj(String str) {
        this.zzb = str;
        this.zzd = true;
        this.zzc = true;
    }

    private final synchronized void zzd() {
        String str;
        if (!this.zzd) {
            try {
                zzhau zzhau = zza;
                String str2 = this.zzb;
                if (str2.length() != 0) {
                    str = "mem mapping ".concat(str2);
                } else {
                    str = new String("mem mapping ");
                }
                zzhau.zza(str);
                this.zzi = this.zzg.zzd(this.zze, this.zzf);
                this.zzd = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final void zzb(zzhao zzhao, ByteBuffer byteBuffer, long j10, zzanp zzanp) {
        this.zze = zzhao.zzb();
        byteBuffer.remaining();
        this.zzf = j10;
        this.zzg = zzhao;
        zzhao.zze(zzhao.zzb() + j10);
        this.zzd = false;
        this.zzc = false;
        zzg();
    }

    public final void zzc(zzant zzant) {
        this.zzh = zzant;
    }

    /* access modifiers changed from: protected */
    public abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        String str;
        zzd();
        zzhau zzhau = zza;
        String str2 = this.zzb;
        if (str2.length() != 0) {
            str = "parsing details of ".concat(str2);
        } else {
            str = new String("parsing details of ");
        }
        zzhau.zza(str);
        ByteBuffer byteBuffer = this.zzi;
        if (byteBuffer != null) {
            this.zzc = true;
            byteBuffer.rewind();
            zzf(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzj = byteBuffer.slice();
            }
            this.zzi = null;
        }
    }
}
