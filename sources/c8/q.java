package c8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* compiled from: DatabaseWorkerPool */
class q implements o {

    /* renamed from: a  reason: collision with root package name */
    final String f13414a;

    /* renamed from: b  reason: collision with root package name */
    final int f13415b;

    /* renamed from: c  reason: collision with root package name */
    final int f13416c;

    /* renamed from: d  reason: collision with root package name */
    private final LinkedList<k> f13417d = new LinkedList<>();

    /* renamed from: e  reason: collision with root package name */
    private final Set<m> f13418e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final Set<m> f13419f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private final Map<Integer, m> f13420g = new HashMap();

    q(String str, int i10, int i11) {
        this.f13414a = str;
        this.f13415b = i10;
        this.f13416c = i11;
    }

    private synchronized k f(m mVar) {
        k kVar;
        ListIterator listIterator = this.f13417d.listIterator();
        while (true) {
            m mVar2 = null;
            if (!listIterator.hasNext()) {
                return null;
            }
            kVar = (k) listIterator.next();
            if (kVar.a() != null) {
                mVar2 = this.f13420g.get(kVar.a());
            }
            if (mVar2 == null || mVar2 == mVar) {
                listIterator.remove();
            }
        }
        listIterator.remove();
        return kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public synchronized void g(m mVar) {
        HashSet<m> hashSet = new HashSet<>(this.f13418e);
        this.f13419f.remove(mVar);
        this.f13418e.add(mVar);
        if (!mVar.b() && mVar.d() != null) {
            this.f13420g.remove(mVar.d());
        }
        i(mVar);
        for (m i10 : hashSet) {
            i(i10);
        }
    }

    private synchronized void i(m mVar) {
        k f10 = f(mVar);
        if (f10 != null) {
            this.f13419f.add(mVar);
            this.f13418e.remove(mVar);
            if (f10.a() != null) {
                this.f13420g.put(f10.a(), mVar);
            }
            mVar.e(f10);
        }
    }

    public synchronized void a(k kVar) {
        this.f13417d.add(kVar);
        for (m i10 : new HashSet(this.f13418e)) {
            i(i10);
        }
    }

    public synchronized void b() {
        for (m f10 : this.f13418e) {
            f10.f();
        }
        for (m f11 : this.f13419f) {
            f11.f();
        }
    }

    public /* synthetic */ void c(i iVar, Runnable runnable) {
        n.a(this, iVar, runnable);
    }

    /* access modifiers changed from: protected */
    public m e(String str, int i10) {
        return new m(str, i10);
    }

    public synchronized void start() {
        for (int i10 = 0; i10 < this.f13415b; i10++) {
            m e10 = e(this.f13414a + i10, this.f13416c);
            e10.g(new p(this, e10));
            this.f13418e.add(e10);
        }
    }
}
