package m9;

import java.util.Arrays;
import kotlin.jvm.internal.m;
import m9.c;
import o8.l;
import o8.q;
import r8.d;

/* compiled from: AbstractSharedFlow.kt */
public abstract class a<S extends c<?>> {

    /* renamed from: h  reason: collision with root package name */
    private S[] f15743h;

    /* renamed from: i  reason: collision with root package name */
    private int f15744i;

    /* renamed from: j  reason: collision with root package name */
    private int f15745j;

    /* access modifiers changed from: protected */
    public final S a() {
        S s10;
        synchronized (this) {
            S[] sArr = this.f15743h;
            if (sArr == null) {
                sArr = c(2);
                this.f15743h = sArr;
            } else if (this.f15744i >= sArr.length) {
                S[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                m.e(copyOf, "copyOf(this, newSize)");
                this.f15743h = (c[]) copyOf;
                sArr = (c[]) copyOf;
            }
            int i10 = this.f15745j;
            do {
                s10 = sArr[i10];
                if (s10 == null) {
                    s10 = b();
                    sArr[i10] = s10;
                }
                i10++;
                if (i10 >= sArr.length) {
                    i10 = 0;
                }
                m.d(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!s10.a(this));
            this.f15745j = i10;
            this.f15744i++;
        }
        return s10;
    }

    /* access modifiers changed from: protected */
    public abstract S b();

    /* access modifiers changed from: protected */
    public abstract S[] c(int i10);

    /* access modifiers changed from: protected */
    public final void d(S s10) {
        int i10;
        d[] b10;
        synchronized (this) {
            int i11 = this.f15744i - 1;
            this.f15744i = i11;
            if (i11 == 0) {
                this.f15745j = 0;
            }
            m.d(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            b10 = s10.b(this);
        }
        for (d dVar : b10) {
            if (dVar != null) {
                l.a aVar = l.f16183h;
                dVar.resumeWith(l.a(q.f16189a));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final S[] e() {
        return this.f15743h;
    }
}
