package a6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: CopyOnWriteMultiset */
public final class g<E> implements Iterable<E> {

    /* renamed from: h  reason: collision with root package name */
    private final Object f179h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private final Map<E, Integer> f180i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private Set<E> f181j = Collections.emptySet();

    /* renamed from: k  reason: collision with root package name */
    private List<E> f182k = Collections.emptyList();

    public void a(E e10) {
        synchronized (this.f179h) {
            ArrayList arrayList = new ArrayList(this.f182k);
            arrayList.add(e10);
            this.f182k = Collections.unmodifiableList(arrayList);
            Integer num = this.f180i.get(e10);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f181j);
                hashSet.add(e10);
                this.f181j = Collections.unmodifiableSet(hashSet);
            }
            Map<E, Integer> map = this.f180i;
            int i10 = 1;
            if (num != null) {
                i10 = 1 + num.intValue();
            }
            map.put(e10, Integer.valueOf(i10));
        }
    }

    public int b(E e10) {
        int intValue;
        synchronized (this.f179h) {
            intValue = this.f180i.containsKey(e10) ? this.f180i.get(e10).intValue() : 0;
        }
        return intValue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(E r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f179h
            monitor-enter(r0)
            java.util.Map<E, java.lang.Integer> r1 = r4.f180i     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x004c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x004c }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return
        L_0x000f:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x004c }
            java.util.List<E> r3 = r4.f182k     // Catch:{ all -> 0x004c }
            r2.<init>(r3)     // Catch:{ all -> 0x004c }
            r2.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x004c }
            r4.f182k = r2     // Catch:{ all -> 0x004c }
            int r2 = r1.intValue()     // Catch:{ all -> 0x004c }
            r3 = 1
            if (r2 != r3) goto L_0x003c
            java.util.Map<E, java.lang.Integer> r1 = r4.f180i     // Catch:{ all -> 0x004c }
            r1.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x004c }
            java.util.Set<E> r2 = r4.f181j     // Catch:{ all -> 0x004c }
            r1.<init>(r2)     // Catch:{ all -> 0x004c }
            r1.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.Set r5 = java.util.Collections.unmodifiableSet(r1)     // Catch:{ all -> 0x004c }
            r4.f181j = r5     // Catch:{ all -> 0x004c }
            goto L_0x004a
        L_0x003c:
            java.util.Map<E, java.lang.Integer> r2 = r4.f180i     // Catch:{ all -> 0x004c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x004c }
            int r1 = r1 - r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x004c }
            r2.put(r5, r1)     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return
        L_0x004c:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.g.c(java.lang.Object):void");
    }

    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f179h) {
            it = this.f182k.iterator();
        }
        return it;
    }

    public Set<E> j() {
        Set<E> set;
        synchronized (this.f179h) {
            set = this.f181j;
        }
        return set;
    }
}
