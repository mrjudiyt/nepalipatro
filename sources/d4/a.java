package d4;

import android.util.SparseArray;
import java.util.HashMap;
import q3.d;

/* compiled from: PriorityMapping */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static SparseArray<d> f7949a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<d, Integer> f7950b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        f7950b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        f7950b.put(d.VERY_LOW, 1);
        f7950b.put(d.HIGHEST, 2);
        for (d next : f7950b.keySet()) {
            f7949a.append(f7950b.get(next).intValue(), next);
        }
    }

    public static int a(d dVar) {
        Integer num = f7950b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = f7949a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
