package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzgsr implements Iterable, Serializable {
    private static final Comparator zza = new zzgsi();
    public static final zzgsr zzb = new zzgsn(zzguj.zzd);
    private static final zzgsq zzd = new zzgsq((zzgsp) null);
    private int zzc = 0;

    static {
        int i10 = zzgsc.zza;
    }

    zzgsr() {
    }

    private static zzgsr zzc(Iterator it, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i10)}));
        } else if (i10 == 1) {
            return (zzgsr) it.next();
        } else {
            int i11 = i10 >>> 1;
            zzgsr zzc2 = zzc(it, i11);
            zzgsr zzc3 = zzc(it, i10 - i11);
            if (Api.BaseClientBuilder.API_PRIORITY_OTHER - zzc2.zzd() >= zzc3.zzd()) {
                return zzgwb.zzC(zzc2, zzc3);
            }
            int zzd2 = zzc2.zzd();
            int zzd3 = zzc3.zzd();
            throw new IllegalArgumentException("ByteString would be too long: " + zzd2 + "+" + zzd3);
        }
    }

    static int zzq(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        } else if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
        }
    }

    public static zzgso zzt() {
        return new zzgso(128);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzgsr zzu(java.lang.Iterable r3) {
        /*
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 != 0) goto L_0x0015
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L_0x0009:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0019
            r0.next()
            int r1 = r1 + 1
            goto L_0x0009
        L_0x0015:
            int r1 = r3.size()
        L_0x0019:
            if (r1 != 0) goto L_0x001e
            com.google.android.gms.internal.ads.zzgsr r3 = zzb
            return r3
        L_0x001e:
            java.util.Iterator r3 = r3.iterator()
            com.google.android.gms.internal.ads.zzgsr r3 = zzc(r3, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgsr.zzu(java.lang.Iterable):com.google.android.gms.internal.ads.zzgsr");
    }

    public static zzgsr zzv(byte[] bArr, int i10, int i11) {
        zzq(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzgsn(bArr2);
    }

    public static zzgsr zzw(String str) {
        return new zzgsn(str.getBytes(zzguj.zzb));
    }

    static void zzy(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return;
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zzc;
        if (i10 == 0) {
            int zzd2 = zzd();
            i10 = zzi(zzd2, 0, zzd2);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zzc = i10;
        }
        return i10;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzgwr.zza(this) : zzgwr.zza(zzk(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final byte[] zzA() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzguj.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }

    public abstract byte zza(int i10);

    /* access modifiers changed from: package-private */
    public abstract byte zzb(int i10);

    public abstract int zzd();

    /* access modifiers changed from: protected */
    public abstract void zze(byte[] bArr, int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public abstract int zzf();

    /* access modifiers changed from: protected */
    public abstract boolean zzh();

    /* access modifiers changed from: protected */
    public abstract int zzi(int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public abstract int zzj(int i10, int i11, int i12);

    public abstract zzgsr zzk(int i10, int i11);

    public abstract zzgsz zzl();

    /* access modifiers changed from: protected */
    public abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    /* access modifiers changed from: package-private */
    public abstract void zzo(zzgsg zzgsg);

    public abstract boolean zzp();

    /* access modifiers changed from: protected */
    public final int zzr() {
        return this.zzc;
    }

    /* renamed from: zzs */
    public zzgsl iterator() {
        return new zzgsh(this);
    }

    public final String zzx(Charset charset) {
        return zzd() == 0 ? "" : zzm(charset);
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i10, int i11, int i12) {
        zzq(0, i12, zzd());
        zzq(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            zze(bArr, 0, i11, i12);
        }
    }
}
