package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzfvs<E> extends zzfvn<E> implements List<E>, RandomAccess {
    private static final zzfxt zza = new zzfvq(zzfxc.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    zzfvs() {
    }

    static zzfvs zzi(Object[] objArr, int i10) {
        if (i10 == 0) {
            return zzfxc.zza;
        }
        return new zzfxc(objArr, i10);
    }

    public static zzfvs zzj(Collection collection) {
        if (collection instanceof zzfvn) {
            zzfvs zzd2 = ((zzfvn) collection).zzd();
            if (!zzd2.zzf()) {
                return zzd2;
            }
            Object[] array = zzd2.toArray();
            return zzi(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzfxa.zzb(array2, length);
        return zzi(array2, length);
    }

    public static zzfvs zzk(Object[] objArr) {
        if (objArr.length == 0) {
            return zzfxc.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzfxa.zzb(objArr2, length);
        return zzi(objArr2, length);
    }

    public static zzfvs zzl() {
        return zzfxc.zza;
    }

    public static zzfvs zzm(Object obj) {
        Object[] objArr = {obj};
        zzfxa.zzb(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzfvs zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzfxa.zzb(objArr, 2);
        return zzi(objArr, 2);
    }

    public static zzfvs zzo(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzfxa.zzb(objArr, 3);
        return zzi(objArr, 3);
    }

    public static zzfvs zzp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzfxa.zzb(objArr, 5);
        return zzi(objArr, 5);
    }

    public static zzfvs zzq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzfxa.zzb(objArr, 6);
        return zzi(objArr, 6);
    }

    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i10 = 0;
                    while (i10 < size) {
                        if (zzfsr.zza(get(i10), list.get(i10))) {
                            i10++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!zzfsr.zza(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Deprecated
    public final zzfvs zzd() {
        return this;
    }

    public final zzfxs zze() {
        return listIterator(0);
    }

    /* renamed from: zzh */
    public zzfvs subList(int i10, int i11) {
        zzfsw.zzh(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return zzfxc.zza;
        }
        return new zzfvr(this, i10, i12);
    }

    /* renamed from: zzr */
    public final zzfxt listIterator(int i10) {
        zzfsw.zzb(i10, size(), FirebaseAnalytics.Param.INDEX);
        if (isEmpty()) {
            return zza;
        }
        return new zzfvq(this, i10);
    }
}
