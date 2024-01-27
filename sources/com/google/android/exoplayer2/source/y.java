package com.google.android.exoplayer2.source;

import a6.a;
import a6.f;
import android.util.SparseArray;

/* compiled from: SpannedData */
final class y<V> {

    /* renamed from: a  reason: collision with root package name */
    private int f7603a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<V> f7604b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private final f<V> f7605c;

    public y(f<V> fVar) {
        this.f7605c = fVar;
        this.f7603a = -1;
    }

    public void a(int i10, V v10) {
        boolean z10 = false;
        if (this.f7603a == -1) {
            a.f(this.f7604b.size() == 0);
            this.f7603a = 0;
        }
        if (this.f7604b.size() > 0) {
            SparseArray<V> sparseArray = this.f7604b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i10 >= keyAt) {
                z10 = true;
            }
            a.a(z10);
            if (keyAt == i10) {
                f<V> fVar = this.f7605c;
                SparseArray<V> sparseArray2 = this.f7604b;
                fVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f7604b.append(i10, v10);
    }

    public void b() {
        for (int i10 = 0; i10 < this.f7604b.size(); i10++) {
            this.f7605c.accept(this.f7604b.valueAt(i10));
        }
        this.f7603a = -1;
        this.f7604b.clear();
    }

    public void c(int i10) {
        int size = this.f7604b.size() - 1;
        while (size >= 0 && i10 < this.f7604b.keyAt(size)) {
            this.f7605c.accept(this.f7604b.valueAt(size));
            this.f7604b.removeAt(size);
            size--;
        }
        this.f7603a = this.f7604b.size() > 0 ? Math.min(this.f7603a, this.f7604b.size() - 1) : -1;
    }

    public void d(int i10) {
        int i11 = 0;
        while (i11 < this.f7604b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 >= this.f7604b.keyAt(i12)) {
                this.f7605c.accept(this.f7604b.valueAt(i11));
                this.f7604b.removeAt(i11);
                int i13 = this.f7603a;
                if (i13 > 0) {
                    this.f7603a = i13 - 1;
                }
                i11 = i12;
            } else {
                return;
            }
        }
    }

    public V e(int i10) {
        if (this.f7603a == -1) {
            this.f7603a = 0;
        }
        while (true) {
            int i11 = this.f7603a;
            if (i11 > 0 && i10 < this.f7604b.keyAt(i11)) {
                this.f7603a--;
            }
        }
        while (this.f7603a < this.f7604b.size() - 1 && i10 >= this.f7604b.keyAt(this.f7603a + 1)) {
            this.f7603a++;
        }
        return this.f7604b.valueAt(this.f7603a);
    }

    public V f() {
        SparseArray<V> sparseArray = this.f7604b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean g() {
        return this.f7604b.size() == 0;
    }
}
