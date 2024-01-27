package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzguy extends zzgsb implements RandomAccess, zzguh, zzgvq {
    private static final zzguy zza = new zzguy(new long[0], 0, false);
    private long[] zzb;
    private int zzc;

    zzguy() {
        this(new long[10], 0, true);
    }

    public static zzguy zzf() {
        return zza;
    }

    private final String zzh(int i10) {
        int i11 = this.zzc;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void zzi(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzh(i10));
        }
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        zzbM();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzh(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.zzb;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[(((i11 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.zzb, i10, jArr2, i12, this.zzc - i10);
            this.zzb = jArr2;
        }
        this.zzb[i10] = longValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zzbM();
        byte[] bArr = zzguj.zzd;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zzguy)) {
            return super.addAll(collection);
        }
        zzguy zzguy = (zzguy) collection;
        int i10 = zzguy.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.zzb;
            if (i12 > jArr.length) {
                this.zzb = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(zzguy.zzb, 0, this.zzb, this.zzc, zzguy.zzc);
            this.zzc = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzguy)) {
            return super.equals(obj);
        }
        zzguy zzguy = (zzguy) obj;
        if (this.zzc != zzguy.zzc) {
            return false;
        }
        long[] jArr = zzguy.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (this.zzb[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        zzi(i10);
        return Long.valueOf(this.zzb[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            long j10 = this.zzb[i11];
            byte[] bArr = zzguj.zzd;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.zzc;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzb[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzbM();
        zzi(i10);
        long[] jArr = this.zzb;
        long j10 = jArr[i10];
        int i11 = this.zzc;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        zzbM();
        if (i11 >= i10) {
            long[] jArr = this.zzb;
            System.arraycopy(jArr, i11, jArr, i10, this.zzc - i11);
            this.zzc -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzbM();
        zzi(i10);
        long[] jArr = this.zzb;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    public final int size() {
        return this.zzc;
    }

    /* renamed from: zza */
    public final zzguh zzd(int i10) {
        if (i10 >= this.zzc) {
            return new zzguy(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i10) {
        zzi(i10);
        return this.zzb[i10];
    }

    public final void zzg(long j10) {
        zzbM();
        int i10 = this.zzc;
        long[] jArr = this.zzb;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[(((i10 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        jArr3[i11] = j10;
    }

    private zzguy(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.zzb = jArr;
        this.zzc = i10;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }
}
