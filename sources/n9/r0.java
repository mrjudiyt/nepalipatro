package n9;

import i9.n2;
import kotlin.jvm.internal.m;
import r8.g;

/* compiled from: ThreadContext.kt */
final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public final g f15844a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f15845b;

    /* renamed from: c  reason: collision with root package name */
    private final n2<Object>[] f15846c;

    /* renamed from: d  reason: collision with root package name */
    private int f15847d;

    public r0(g gVar, int i10) {
        this.f15844a = gVar;
        this.f15845b = new Object[i10];
        this.f15846c = new n2[i10];
    }

    public final void a(n2<?> n2Var, Object obj) {
        Object[] objArr = this.f15845b;
        int i10 = this.f15847d;
        objArr[i10] = obj;
        n2<Object>[] n2VarArr = this.f15846c;
        this.f15847d = i10 + 1;
        m.d(n2Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        n2VarArr[i10] = n2Var;
    }

    public final void b(g gVar) {
        int length = this.f15846c.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                n2<Object> n2Var = this.f15846c[length];
                m.c(n2Var);
                n2Var.r0(gVar, this.f15845b[length]);
                if (i10 >= 0) {
                    length = i10;
                } else {
                    return;
                }
            }
        }
    }
}
