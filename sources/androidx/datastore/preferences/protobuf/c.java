package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.z;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: AbstractProtobufList */
abstract class c<E> extends AbstractList<E> implements z.i<E> {

    /* renamed from: h  reason: collision with root package name */
    private boolean f2718h = true;

    c() {
    }

    public boolean Y() {
        return this.f2718h;
    }

    /* access modifiers changed from: protected */
    public void a() {
        if (!this.f2718h) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean add(E e10) {
        a();
        return super.add(e10);
    }

    public boolean addAll(Collection<? extends E> collection) {
        a();
        return super.addAll(collection);
    }

    public void clear() {
        a();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!get(i10).equals(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final void h() {
        this.f2718h = false;
    }

    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    public boolean remove(Object obj) {
        a();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        a();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        a();
        return super.retainAll(collection);
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        a();
        return super.addAll(i10, collection);
    }
}
