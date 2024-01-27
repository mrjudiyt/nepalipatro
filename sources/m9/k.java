package m9;

import i9.u1;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import n9.f0;
import r8.g;
import y8.p;

/* compiled from: SafeCollector.common.kt */
public final class k {

    /* compiled from: SafeCollector.common.kt */
    static final class a extends n implements p<Integer, g.b, Integer> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ i<?> f15772h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i<?> iVar) {
            super(2);
            this.f15772h = iVar;
        }

        public final Integer a(int i10, g.b bVar) {
            g.c key = bVar.getKey();
            g.b h10 = this.f15772h.f15765i.h(key);
            if (key != u1.f14995d) {
                return Integer.valueOf(bVar != h10 ? Integer.MIN_VALUE : i10 + 1);
            }
            u1 u1Var = (u1) h10;
            m.d(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            u1 b10 = k.b((u1) bVar, u1Var);
            if (b10 == u1Var) {
                if (u1Var != null) {
                    i10++;
                }
                return Integer.valueOf(i10);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b10 + ", expected child of " + u1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public static final void a(i<?> iVar, g gVar) {
        if (((Number) gVar.w(0, new a(iVar))).intValue() != iVar.f15766j) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + iVar.f15765i + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    public static final u1 b(u1 u1Var, u1 u1Var2) {
        while (u1Var != null) {
            if (u1Var == u1Var2 || !(u1Var instanceof f0)) {
                return u1Var;
            }
            u1Var = u1Var.getParent();
        }
        return null;
    }
}
