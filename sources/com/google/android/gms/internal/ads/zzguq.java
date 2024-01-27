package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzguq extends zzgsb implements RandomAccess, zzgur {
    @Deprecated
    public static final zzgur zza;
    private static final zzguq zzb;
    private final List zzc;

    static {
        zzguq zzguq = new zzguq(false);
        zzb = zzguq;
        zza = zzguq;
    }

    public zzguq() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgsr) {
            return ((zzgsr) obj).zzx(zzguj.zzb);
        }
        return zzguj.zzd((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        zzbM();
        this.zzc.add(i10, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i10, Collection collection) {
        zzbM();
        if (collection instanceof zzgur) {
            collection = ((zzgur) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zzbM();
        this.zzc.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzbM();
        Object remove = this.zzc.remove(i10);
        this.modCount++;
        return zzj(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        zzbM();
        return zzj(this.zzc.set(i10, (String) obj));
    }

    public final int size() {
        return this.zzc.size();
    }

    public final /* bridge */ /* synthetic */ zzgui zzd(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.zzc);
            return new zzguq(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final zzgur zze() {
        return zzc() ? new zzgwy(this) : this;
    }

    public final Object zzf(int i10) {
        return this.zzc.get(i10);
    }

    /* renamed from: zzg */
    public final String get(int i10) {
        Object obj = this.zzc.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgsr) {
            zzgsr zzgsr = (zzgsr) obj;
            String zzx = zzgsr.zzx(zzguj.zzb);
            if (zzgsr.zzp()) {
                this.zzc.set(i10, zzx);
            }
            return zzx;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzguj.zzd(bArr);
        if (zzgxi.zzi(bArr)) {
            this.zzc.set(i10, zzd);
        }
        return zzd;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final void zzi(zzgsr zzgsr) {
        zzbM();
        this.zzc.add(zzgsr);
        this.modCount++;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzguq(int i10) {
        super(true);
        ArrayList arrayList = new ArrayList(i10);
        this.zzc = arrayList;
    }

    private zzguq(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzguq(boolean z10) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
