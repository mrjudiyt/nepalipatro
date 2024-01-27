package com.google.android.gms.internal.fido;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
class zzbk extends zzbl {
    final zzbh zzb;
    final Character zzc;

    zzbk(zzbh zzbh, Character ch) {
        this.zzb = zzbh;
        if (ch == null || !zzbh.zzb(ch.charValue())) {
            this.zzc = ch;
            return;
        }
        throw new IllegalArgumentException(zzat.zza("Padding character %s was already in alphabet", ch));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbk) {
            zzbk zzbk = (zzbk) obj;
            if (this.zzb.equals(zzbk.zzb)) {
                Character ch = this.zzc;
                Character ch2 = zzbk.zzc;
                if (ch == ch2) {
                    return true;
                }
                if (ch == null || !ch.equals(ch2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.zzb.hashCode();
        Character ch = this.zzc;
        if (ch == null) {
            i10 = 0;
        } else {
            i10 = ch.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public void zza(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        zzas.zze(0, i11, bArr.length);
        while (i12 < i11) {
            zzc(appendable, bArr, i12, Math.min(this.zzb.zzd, i11 - i12));
            i12 += this.zzb.zzd;
        }
    }

    /* access modifiers changed from: package-private */
    public final int zzb(int i10) {
        zzbh zzbh = this.zzb;
        return zzbh.zzc * zzbn.zza(i10, zzbh.zzd, RoundingMode.CEILING);
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Appendable appendable, byte[] bArr, int i10, int i11) {
        zzas.zze(i10, i10 + i11, bArr.length);
        int i12 = 0;
        zzas.zzc(i11 <= this.zzb.zzd);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | ((long) (bArr[i10 + i13] & 255))) << 8;
        }
        int i14 = ((i11 + 1) * 8) - this.zzb.zzb;
        while (i12 < i11 * 8) {
            zzbh zzbh = this.zzb;
            appendable.append(zzbh.zza(zzbh.zza & ((int) (j10 >>> (i14 - i12)))));
            i12 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i12 < this.zzb.zzd * 8) {
                appendable.append(this.zzc.charValue());
                i12 += this.zzb.zzb;
            }
        }
    }

    zzbk(String str, String str2, Character ch) {
        this(new zzbh(str, str2.toCharArray()), ch);
    }
}
