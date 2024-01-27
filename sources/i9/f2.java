package i9;

import kotlin.jvm.internal.m;
import n9.s;
import n9.u;

/* compiled from: JobSupport.kt */
public final class f2 extends s implements p1 {
    public boolean a() {
        return true;
    }

    public f2 c() {
        return this;
    }

    public final String t(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object l10 = l();
        m.d(l10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        boolean z10 = true;
        for (u uVar = (u) l10; !m.a(uVar, this); uVar = uVar.m()) {
            if (uVar instanceof z1) {
                z1 z1Var = (z1) uVar;
                if (z10) {
                    z10 = false;
                } else {
                    sb.append(", ");
                }
                sb.append(z1Var);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        m.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public String toString() {
        return p0.c() ? t("Active") : super.toString();
    }
}
