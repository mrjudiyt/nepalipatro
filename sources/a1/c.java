package a1;

import e1.d;
import e1.e;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: RoomSQLiteQuery */
public class c implements e, d {

    /* renamed from: p  reason: collision with root package name */
    static final TreeMap<Integer, c> f3p = new TreeMap<>();

    /* renamed from: h  reason: collision with root package name */
    private volatile String f4h;

    /* renamed from: i  reason: collision with root package name */
    final long[] f5i;

    /* renamed from: j  reason: collision with root package name */
    final double[] f6j;

    /* renamed from: k  reason: collision with root package name */
    final String[] f7k;

    /* renamed from: l  reason: collision with root package name */
    final byte[][] f8l;

    /* renamed from: m  reason: collision with root package name */
    private final int[] f9m;

    /* renamed from: n  reason: collision with root package name */
    final int f10n;

    /* renamed from: o  reason: collision with root package name */
    int f11o;

    private c(int i10) {
        this.f10n = i10;
        int i11 = i10 + 1;
        this.f9m = new int[i11];
        this.f5i = new long[i11];
        this.f6j = new double[i11];
        this.f7k = new String[i11];
        this.f8l = new byte[i11][];
    }

    public static c j(String str, int i10) {
        TreeMap<Integer, c> treeMap = f3p;
        synchronized (treeMap) {
            Map.Entry<Integer, c> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                c value = ceilingEntry.getValue();
                value.q(str, i10);
                return value;
            }
            c cVar = new c(i10);
            cVar.q(str, i10);
            return cVar;
        }
    }

    private static void u() {
        TreeMap<Integer, c> treeMap = f3p;
        if (treeMap.size() > 15) {
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            while (true) {
                int i10 = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i10;
                } else {
                    return;
                }
            }
        }
    }

    public void C(int i10, double d10) {
        this.f9m[i10] = 3;
        this.f6j[i10] = d10;
    }

    public void N(int i10, long j10) {
        this.f9m[i10] = 2;
        this.f5i[i10] = j10;
    }

    public void R(int i10, byte[] bArr) {
        this.f9m[i10] = 5;
        this.f8l[i10] = bArr;
    }

    public void a(d dVar) {
        for (int i10 = 1; i10 <= this.f11o; i10++) {
            int i11 = this.f9m[i10];
            if (i11 == 1) {
                dVar.i0(i10);
            } else if (i11 == 2) {
                dVar.N(i10, this.f5i[i10]);
            } else if (i11 == 3) {
                dVar.C(i10, this.f6j[i10]);
            } else if (i11 == 4) {
                dVar.v(i10, this.f7k[i10]);
            } else if (i11 == 5) {
                dVar.R(i10, this.f8l[i10]);
            }
        }
    }

    public void close() {
    }

    public String h() {
        return this.f4h;
    }

    public void i0(int i10) {
        this.f9m[i10] = 1;
    }

    /* access modifiers changed from: package-private */
    public void q(String str, int i10) {
        this.f4h = str;
        this.f11o = i10;
    }

    public void release() {
        TreeMap<Integer, c> treeMap = f3p;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f10n), this);
            u();
        }
    }

    public void v(int i10, String str) {
        this.f9m[i10] = 4;
        this.f7k[i10] = str;
    }
}
