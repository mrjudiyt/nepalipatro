package r3;

import android.util.SparseArray;

/* compiled from: QosTier */
public enum p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: o  reason: collision with root package name */
    private static final SparseArray<p> f11015o = null;

    /* renamed from: h  reason: collision with root package name */
    private final int f11017h;

    static {
        p pVar;
        p pVar2;
        p pVar3;
        p pVar4;
        p pVar5;
        p pVar6;
        SparseArray<p> sparseArray = new SparseArray<>();
        f11015o = sparseArray;
        sparseArray.put(0, pVar);
        sparseArray.put(1, pVar2);
        sparseArray.put(2, pVar3);
        sparseArray.put(3, pVar4);
        sparseArray.put(4, pVar5);
        sparseArray.put(-1, pVar6);
    }

    private p(int i10) {
        this.f11017h = i10;
    }
}
