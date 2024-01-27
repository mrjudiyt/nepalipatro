package l5;

import a6.i0;
import android.util.SparseArray;

/* compiled from: TimestampAdjusterProvider */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<i0> f10106a = new SparseArray<>();

    public i0 a(int i10) {
        i0 i0Var = this.f10106a.get(i10);
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0Var2 = new i0(9223372036854775806L);
        this.f10106a.put(i10, i0Var2);
        return i0Var2;
    }

    public void b() {
        this.f10106a.clear();
    }
}
