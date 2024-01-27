package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
class zzgsn extends zzgsm {
    protected final byte[] zza;

    zzgsn(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgsr) || zzd() != ((zzgsr) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgsn)) {
            return obj.equals(this);
        }
        zzgsn zzgsn = (zzgsn) obj;
        int zzr = zzr();
        int zzr2 = zzgsn.zzr();
        if (zzr == 0 || zzr2 == 0 || zzr == zzr2) {
            return zzg(zzgsn, 0, zzd());
        }
        return false;
    }

    public byte zza(int i10) {
        return this.zza[i10];
    }

    /* access modifiers changed from: package-private */
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    /* access modifiers changed from: protected */
    public int zzc() {
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    /* access modifiers changed from: protected */
    public void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, i10, bArr, i11, i12);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg(zzgsr zzgsr, int i10, int i11) {
        if (i11 <= zzgsr.zzd()) {
            int i12 = i10 + i11;
            if (i12 > zzgsr.zzd()) {
                int zzd = zzgsr.zzd();
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + zzd);
            } else if (!(zzgsr instanceof zzgsn)) {
                return zzgsr.zzk(i10, i12).equals(zzk(0, i11));
            } else {
                zzgsn zzgsn = (zzgsn) zzgsr;
                byte[] bArr = this.zza;
                byte[] bArr2 = zzgsn.zza;
                int zzc = zzc() + i11;
                int zzc2 = zzc();
                int zzc3 = zzgsn.zzc() + i10;
                while (zzc2 < zzc) {
                    if (bArr[zzc2] != bArr2[zzc3]) {
                        return false;
                    }
                    zzc2++;
                    zzc3++;
                }
                return true;
            }
        } else {
            int zzd2 = zzd();
            throw new IllegalArgumentException("Length too large: " + i11 + zzd2);
        }
    }

    /* access modifiers changed from: protected */
    public final int zzi(int i10, int i11, int i12) {
        return zzguj.zzb(i10, this.zza, zzc() + i11, i12);
    }

    /* access modifiers changed from: protected */
    public final int zzj(int i10, int i11, int i12) {
        int zzc = zzc() + i11;
        return zzgxi.zzf(i10, this.zza, zzc, i12 + zzc);
    }

    public final zzgsr zzk(int i10, int i11) {
        int zzq = zzgsr.zzq(i10, i11, zzd());
        if (zzq == 0) {
            return zzgsr.zzb;
        }
        return new zzgsk(this.zza, zzc() + i10, zzq);
    }

    public final zzgsz zzl() {
        return zzgsz.zzI(this.zza, zzc(), zzd(), true);
    }

    /* access modifiers changed from: protected */
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    public final void zzo(zzgsg zzgsg) {
        zzgsg.zza(this.zza, zzc(), zzd());
    }

    public final boolean zzp() {
        int zzc = zzc();
        return zzgxi.zzj(this.zza, zzc, zzd() + zzc);
    }
}
