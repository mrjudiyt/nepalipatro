package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgwb extends zzgsr {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Api.BaseClientBuilder.API_PRIORITY_OTHER};
    private final int zzc;
    /* access modifiers changed from: private */
    public final zzgsr zzd;
    /* access modifiers changed from: private */
    public final zzgsr zze;
    private final int zzf;
    private final int zzg;

    private zzgwb(zzgsr zzgsr, zzgsr zzgsr2) {
        this.zzd = zzgsr;
        this.zze = zzgsr2;
        int zzd2 = zzgsr.zzd();
        this.zzf = zzd2;
        this.zzc = zzd2 + zzgsr2.zzd();
        this.zzg = Math.max(zzgsr.zzf(), zzgsr2.zzf()) + 1;
    }

    static zzgsr zzC(zzgsr zzgsr, zzgsr zzgsr2) {
        if (zzgsr2.zzd() == 0) {
            return zzgsr;
        }
        if (zzgsr.zzd() == 0) {
            return zzgsr2;
        }
        int zzd2 = zzgsr.zzd() + zzgsr2.zzd();
        if (zzd2 < 128) {
            return zzD(zzgsr, zzgsr2);
        }
        if (zzgsr instanceof zzgwb) {
            zzgwb zzgwb = (zzgwb) zzgsr;
            if (zzgwb.zze.zzd() + zzgsr2.zzd() < 128) {
                return new zzgwb(zzgwb.zzd, zzD(zzgwb.zze, zzgsr2));
            }
            if (zzgwb.zzd.zzf() > zzgwb.zze.zzf() && zzgwb.zzg > zzgsr2.zzf()) {
                return new zzgwb(zzgwb.zzd, new zzgwb(zzgwb.zze, zzgsr2));
            }
        }
        if (zzd2 >= zzc(Math.max(zzgsr.zzf(), zzgsr2.zzf()) + 1)) {
            return new zzgwb(zzgsr, zzgsr2);
        }
        return zzgvx.zza(new zzgvx((zzgvw) null), zzgsr, zzgsr2);
    }

    private static zzgsr zzD(zzgsr zzgsr, zzgsr zzgsr2) {
        int zzd2 = zzgsr.zzd();
        int zzd3 = zzgsr2.zzd();
        byte[] bArr = new byte[(zzd2 + zzd3)];
        zzgsr.zzz(bArr, 0, 0, zzd2);
        zzgsr2.zzz(bArr, 0, zzd2, zzd3);
        return new zzgsn(bArr);
    }

    static int zzc(int i10) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i10 >= 47) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return iArr[i10];
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgsr)) {
            return false;
        }
        zzgsr zzgsr = (zzgsr) obj;
        if (this.zzc != zzgsr.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzgsr.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzgvz zzgvz = new zzgvz(this, (zzgvy) null);
        zzgsm zza2 = zzgvz.next();
        zzgvz zzgvz2 = new zzgvz(zzgsr, (zzgvy) null);
        zzgsm zza3 = zzgvz2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int zzd2 = zza2.zzd() - i10;
            int zzd3 = zza3.zzd() - i11;
            int min = Math.min(zzd2, zzd3);
            if (i10 == 0) {
                z10 = zza2.zzg(zza3, i11, min);
            } else {
                z10 = zza3.zzg(zza2, i10, min);
            }
            if (!z10) {
                return false;
            }
            i12 += min;
            int i13 = this.zzc;
            if (i12 < i13) {
                if (min == zzd2) {
                    zza2 = zzgvz.next();
                    i10 = 0;
                } else {
                    i10 += min;
                }
                if (min == zzd3) {
                    zza3 = zzgvz2.next();
                    i11 = 0;
                } else {
                    i11 += min;
                }
            } else if (i12 == i13) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzgvv(this);
    }

    public final byte zza(int i10) {
        zzgsr.zzy(i10, this.zzc);
        return zzb(i10);
    }

    /* access modifiers changed from: package-private */
    public final byte zzb(int i10) {
        int i11 = this.zzf;
        if (i10 < i11) {
            return this.zzd.zzb(i10);
        }
        return this.zze.zzb(i10 - i11);
    }

    public final int zzd() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            this.zzd.zze(bArr, i10, i11, i12);
        } else if (i10 >= i14) {
            this.zze.zze(bArr, i10 - i14, i11, i12);
        } else {
            int i15 = i14 - i10;
            this.zzd.zze(bArr, i10, i11, i15);
            this.zze.zze(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    /* access modifiers changed from: protected */
    public final int zzf() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    /* access modifiers changed from: protected */
    public final int zzi(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzi(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzi(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzi(this.zzd.zzi(i10, i11, i15), 0, i12 - i15);
    }

    /* access modifiers changed from: protected */
    public final int zzj(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzj(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzj(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzj(this.zzd.zzj(i10, i11, i15), 0, i12 - i15);
    }

    public final zzgsr zzk(int i10, int i11) {
        int zzq = zzgsr.zzq(i10, i11, this.zzc);
        if (zzq == 0) {
            return zzgsr.zzb;
        }
        if (zzq == this.zzc) {
            return this;
        }
        int i12 = this.zzf;
        if (i11 <= i12) {
            return this.zzd.zzk(i10, i11);
        }
        if (i10 >= i12) {
            return this.zze.zzk(i10 - i12, i11 - i12);
        }
        zzgsr zzgsr = this.zzd;
        return new zzgwb(zzgsr.zzk(i10, zzgsr.zzd()), this.zze.zzk(0, i11 - this.zzf));
    }

    public final zzgsz zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList<>();
        zzgvz zzgvz = new zzgvz(this, (zzgvy) null);
        while (zzgvz.hasNext()) {
            arrayList.add(zzgvz.next().zzn());
        }
        int i10 = zzgsz.zzd;
        boolean z10 = false;
        int i11 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i11 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z10 |= true;
            } else {
                z10 = byteBuffer.isDirect() ? z10 | true : z10 | true;
            }
        }
        if (z10) {
            return new zzgsv(arrayList, i11, true, (zzgsu) null);
        }
        return zzgsz.zzH(new zzgum(arrayList), 4096);
    }

    /* access modifiers changed from: protected */
    public final String zzm(Charset charset) {
        return new String(zzA(), charset);
    }

    public final ByteBuffer zzn() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final void zzo(zzgsg zzgsg) {
        this.zzd.zzo(zzgsg);
        this.zze.zzo(zzgsg);
    }

    public final boolean zzp() {
        zzgsr zzgsr = this.zzd;
        zzgsr zzgsr2 = this.zze;
        if (zzgsr2.zzj(zzgsr.zzj(0, 0, this.zzf), 0, zzgsr2.zzd()) == 0) {
            return true;
        }
        return false;
    }

    public final zzgsl zzs() {
        return new zzgvv(this);
    }
}
