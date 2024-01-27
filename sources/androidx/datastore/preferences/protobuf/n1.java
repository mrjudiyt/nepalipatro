package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList */
public class n1 extends AbstractList<String> implements e0, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final e0 f2847h;

    /* compiled from: UnmodifiableLazyStringList */
    class a implements ListIterator<String> {

        /* renamed from: h  reason: collision with root package name */
        ListIterator<String> f2848h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f2849i;

        a(int i10) {
            this.f2849i = i10;
            this.f2848h = n1.this.f2847h.listIterator(i10);
        }

        /* renamed from: b */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public String next() {
            return this.f2848h.next();
        }

        /* renamed from: d */
        public String previous() {
            return this.f2848h.previous();
        }

        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f2848h.hasNext();
        }

        public boolean hasPrevious() {
            return this.f2848h.hasPrevious();
        }

        public int nextIndex() {
            return this.f2848h.nextIndex();
        }

        public int previousIndex() {
            return this.f2848h.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList */
    class b implements Iterator<String> {

        /* renamed from: h  reason: collision with root package name */
        Iterator<String> f2851h;

        b() {
            this.f2851h = n1.this.f2847h.iterator();
        }

        /* renamed from: b */
        public String next() {
            return this.f2851h.next();
        }

        public boolean hasNext() {
            return this.f2851h.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public n1(e0 e0Var) {
        this.f2847h = e0Var;
    }

    public List<?> E() {
        return this.f2847h.E();
    }

    public e0 J() {
        return this;
    }

    public Object L(int i10) {
        return this.f2847h.L(i10);
    }

    /* renamed from: b */
    public String get(int i10) {
        return (String) this.f2847h.get(i10);
    }

    public Iterator<String> iterator() {
        return new b();
    }

    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    public int size() {
        return this.f2847h.size();
    }

    public void w(h hVar) {
        throw new UnsupportedOperationException();
    }
}
