package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList */
public class d0 extends c<String> implements e0, RandomAccess {

    /* renamed from: j  reason: collision with root package name */
    private static final d0 f2730j;

    /* renamed from: k  reason: collision with root package name */
    public static final e0 f2731k;

    /* renamed from: i  reason: collision with root package name */
    private final List<Object> f2732i;

    static {
        d0 d0Var = new d0();
        f2730j = d0Var;
        d0Var.h();
        f2731k = d0Var;
    }

    public d0() {
        this(10);
    }

    private static String c(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h) {
            return ((h) obj).y();
        }
        return z.j((byte[]) obj);
    }

    public List<?> E() {
        return Collections.unmodifiableList(this.f2732i);
    }

    public e0 J() {
        return Y() ? new n1(this) : this;
    }

    public Object L(int i10) {
        return this.f2732i.get(i10);
    }

    public /* bridge */ /* synthetic */ boolean Y() {
        return super.Y();
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b */
    public void add(int i10, String str) {
        a();
        this.f2732i.add(i10, str);
        this.modCount++;
    }

    public void clear() {
        a();
        this.f2732i.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public String get(int i10) {
        Object obj = this.f2732i.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String y10 = hVar.y();
            if (hVar.l()) {
                this.f2732i.set(i10, y10);
            }
            return y10;
        }
        byte[] bArr = (byte[]) obj;
        String j10 = z.j(bArr);
        if (z.g(bArr)) {
            this.f2732i.set(i10, j10);
        }
        return j10;
    }

    /* renamed from: e */
    public d0 q(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f2732i);
            return new d0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public String remove(int i10) {
        a();
        Object remove = this.f2732i.remove(i10);
        this.modCount++;
        return c(remove);
    }

    /* renamed from: g */
    public String set(int i10, String str) {
        a();
        return c(this.f2732i.set(i10, str));
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public int size() {
        return this.f2732i.size();
    }

    public void w(h hVar) {
        a();
        this.f2732i.add(hVar);
        this.modCount++;
    }

    public d0(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    public boolean addAll(int i10, Collection<? extends String> collection) {
        a();
        if (collection instanceof e0) {
            collection = ((e0) collection).E();
        }
        boolean addAll = this.f2732i.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private d0(ArrayList<Object> arrayList) {
        this.f2732i = arrayList;
    }
}
