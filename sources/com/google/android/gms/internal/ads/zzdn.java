package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdn {
    private final zzfvs zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private zzdo zzd;
    private zzdo zze;
    private boolean zzf;

    public zzdn(zzfvs zzfvs) {
        this.zza = zzfvs;
        zzdo zzdo = zzdo.zza;
        this.zzd = zzdo;
        this.zze = zzdo;
        this.zzf = false;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z10;
        ByteBuffer byteBuffer2;
        do {
            int i10 = 0;
            z10 = false;
            while (i10 <= zzi()) {
                int i11 = i10 + 1;
                if (!this.zzc[i10].hasRemaining()) {
                    zzdq zzdq = (zzdq) this.zzb.get(i10);
                    if (!zzdq.zzh()) {
                        if (i10 > 0) {
                            byteBuffer2 = this.zzc[i10 - 1];
                        } else {
                            byteBuffer2 = byteBuffer.hasRemaining() ? byteBuffer : zzdq.zza;
                        }
                        zzdq.zze(byteBuffer2);
                        this.zzc[i10] = zzdq.zzb();
                        boolean z11 = true;
                        if (((long) byteBuffer2.remaining()) - ((long) byteBuffer2.remaining()) <= 0 && !this.zzc[i10].hasRemaining()) {
                            z11 = false;
                        }
                        z10 |= z11;
                    } else if (!this.zzc[i10].hasRemaining() && i10 < zzi()) {
                        ((zzdq) this.zzb.get(i11)).zzd();
                    }
                }
                i10 = i11;
            }
        } while (z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdn)) {
            return false;
        }
        zzdn zzdn = (zzdn) obj;
        if (this.zza.size() != zzdn.zza.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            if (this.zza.get(i10) != zzdn.zza.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzdo zza(zzdo zzdo) {
        if (!zzdo.equals(zzdo.zza)) {
            for (int i10 = 0; i10 < this.zza.size(); i10++) {
                zzdq zzdq = (zzdq) this.zza.get(i10);
                zzdo zza2 = zzdq.zza(zzdo);
                if (zzdq.zzg()) {
                    zzdx.zzf(!zza2.equals(zzdo.zza));
                    zzdo = zza2;
                }
            }
            this.zze = zzdo;
            return zzdo;
        }
        throw new zzdp("Unhandled input format:", zzdo);
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return zzdq.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzi()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzj(zzdq.zza);
        return this.zzc[zzi()];
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = this.zze;
        this.zzf = false;
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            zzdq zzdq = (zzdq) this.zza.get(i10);
            zzdq.zzc();
            if (zzdq.zzg()) {
                this.zzb.add(zzdq);
            }
        }
        this.zzc = new ByteBuffer[this.zzb.size()];
        for (int i11 = 0; i11 <= zzi(); i11++) {
            this.zzc[i11] = ((zzdq) this.zzb.get(i11)).zzb();
        }
    }

    public final void zzd() {
        if (zzh() && !this.zzf) {
            this.zzf = true;
            ((zzdq) this.zzb.get(0)).zzd();
        }
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (zzh() && !this.zzf) {
            zzj(byteBuffer);
        }
    }

    public final void zzf() {
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            zzdq zzdq = (zzdq) this.zza.get(i10);
            zzdq.zzc();
            zzdq.zzf();
        }
        this.zzc = new ByteBuffer[0];
        zzdo zzdo = zzdo.zza;
        this.zzd = zzdo;
        this.zze = zzdo;
        this.zzf = false;
    }

    public final boolean zzg() {
        return this.zzf && ((zzdq) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }
}
