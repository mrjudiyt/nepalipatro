package j5;

import a6.m0;
import android.os.SystemClock;
import android.util.Pair;
import com.google.common.collect.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* compiled from: BaseUrlExclusionList */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Long> f9439a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, Long> f9440b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<List<Pair<String, Integer>>, k5.b> f9441c;

    /* renamed from: d  reason: collision with root package name */
    private final Random f9442d;

    public b() {
        this(new Random());
    }

    private static <T> void b(T t10, long j10, Map<T, Long> map) {
        if (map.containsKey(t10)) {
            j10 = Math.max(j10, ((Long) m0.j(map.get(t10))).longValue());
        }
        map.put(t10, Long.valueOf(j10));
    }

    private List<k5.b> c(List<k5.b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        h(elapsedRealtime, this.f9439a);
        h(elapsedRealtime, this.f9440b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            k5.b bVar = list.get(i10);
            if (!this.f9439a.containsKey(bVar.f9642b) && !this.f9440b.containsKey(Integer.valueOf(bVar.f9643c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static int d(k5.b bVar, k5.b bVar2) {
        int compare = Integer.compare(bVar.f9643c, bVar2.f9643c);
        return compare != 0 ? compare : bVar.f9642b.compareTo(bVar2.f9642b);
    }

    public static int f(List<k5.b> list) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashSet.add(Integer.valueOf(list.get(i10).f9643c));
        }
        return hashSet.size();
    }

    private static <T> void h(long j10, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : map.entrySet()) {
            if (((Long) next.getValue()).longValue() <= j10) {
                arrayList.add(next.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    private k5.b k(List<k5.b> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += list.get(i11).f9644d;
        }
        int nextInt = this.f9442d.nextInt(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            k5.b bVar = list.get(i13);
            i12 += bVar.f9644d;
            if (nextInt < i12) {
                return bVar;
            }
        }
        return (k5.b) f0.c(list);
    }

    public void e(k5.b bVar, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        b(bVar.f9642b, elapsedRealtime, this.f9439a);
        b(Integer.valueOf(bVar.f9643c), elapsedRealtime, this.f9440b);
    }

    public int g(List<k5.b> list) {
        HashSet hashSet = new HashSet();
        List<k5.b> c10 = c(list);
        for (int i10 = 0; i10 < c10.size(); i10++) {
            hashSet.add(Integer.valueOf(c10.get(i10).f9643c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f9439a.clear();
        this.f9440b.clear();
        this.f9441c.clear();
    }

    public k5.b j(List<k5.b> list) {
        List<k5.b> c10 = c(list);
        if (c10.size() < 2) {
            return (k5.b) f0.b(c10, null);
        }
        Collections.sort(c10, a.f15388h);
        ArrayList arrayList = new ArrayList();
        int i10 = c10.get(0).f9643c;
        int i11 = 0;
        while (true) {
            if (i11 >= c10.size()) {
                break;
            }
            k5.b bVar = c10.get(i11);
            if (i10 == bVar.f9643c) {
                arrayList.add(new Pair(bVar.f9642b, Integer.valueOf(bVar.f9644d)));
                i11++;
            } else if (arrayList.size() == 1) {
                return c10.get(0);
            }
        }
        k5.b bVar2 = this.f9441c.get(arrayList);
        if (bVar2 != null) {
            return bVar2;
        }
        k5.b k10 = k(c10.subList(0, arrayList.size()));
        this.f9441c.put(arrayList, k10);
        return k10;
    }

    b(Random random) {
        this.f9441c = new HashMap();
        this.f9442d = random;
        this.f9439a = new HashMap();
        this.f9440b = new HashMap();
    }
}
