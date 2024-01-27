package n9;

import i9.q0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.q;

/* compiled from: LockFreeLinkedList.kt */
public class u {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15852h;

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15853i;

    /* renamed from: j  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15854j;
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* compiled from: LockFreeLinkedList.kt */
    public static abstract class a extends b<u> {

        /* renamed from: b  reason: collision with root package name */
        public final u f15855b;

        /* renamed from: c  reason: collision with root package name */
        public u f15856c;

        public a(u uVar) {
            this.f15855b = uVar;
        }

        /* renamed from: e */
        public void b(u uVar, Object obj) {
            boolean z10 = obj == null;
            u uVar2 = z10 ? this.f15855b : this.f15856c;
            if (uVar2 != null && androidx.concurrent.futures.b.a(u.f15852h, uVar, this, uVar2) && z10) {
                u uVar3 = this.f15855b;
                u uVar4 = this.f15856c;
                m.c(uVar4);
                uVar3.k(uVar4);
            }
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* synthetic */ class b extends q {
        b(Object obj) {
            super(obj, q0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        public Object get() {
            return q0.a(this.receiver);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<u> cls2 = u.class;
        f15852h = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f15853i = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f15854j = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: n9.u} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (androidx.concurrent.futures.b.a(r4, r3, r2, ((n9.d0) r5).f15796a) != false) goto L_0x0045;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final n9.u i(n9.c0 r9) {
        /*
            r8 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f15853i
            java.lang.Object r0 = r0.get(r8)
            n9.u r0 = (n9.u) r0
            r1 = 0
            r2 = r0
        L_0x000a:
            r3 = r1
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f15852h
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L_0x0020
            if (r0 != r2) goto L_0x0016
            return r2
        L_0x0016:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f15853i
            boolean r0 = androidx.concurrent.futures.b.a(r1, r8, r0, r2)
            if (r0 != 0) goto L_0x001f
            goto L_0x0000
        L_0x001f:
            return r2
        L_0x0020:
            boolean r6 = r8.o()
            if (r6 == 0) goto L_0x0027
            return r1
        L_0x0027:
            if (r5 != r9) goto L_0x002a
            return r2
        L_0x002a:
            boolean r6 = r5 instanceof n9.c0
            if (r6 == 0) goto L_0x0034
            n9.c0 r5 = (n9.c0) r5
            r5.a(r2)
            goto L_0x0000
        L_0x0034:
            boolean r6 = r5 instanceof n9.d0
            if (r6 == 0) goto L_0x0050
            if (r3 == 0) goto L_0x0047
            n9.d0 r5 = (n9.d0) r5
            n9.u r5 = r5.f15796a
            boolean r2 = androidx.concurrent.futures.b.a(r4, r3, r2, r5)
            if (r2 != 0) goto L_0x0045
            goto L_0x0000
        L_0x0045:
            r2 = r3
            goto L_0x000a
        L_0x0047:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f15853i
            java.lang.Object r2 = r4.get(r2)
            n9.u r2 = (n9.u) r2
            goto L_0x000b
        L_0x0050:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.m.d(r5, r3)
            r3 = r5
            n9.u r3 = (n9.u) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.u.i(n9.c0):n9.u");
    }

    private final u j(u uVar) {
        while (uVar.o()) {
            uVar = (u) f15853i.get(uVar);
        }
        return uVar;
    }

    /* access modifiers changed from: private */
    public final void k(u uVar) {
        u uVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15853i;
        do {
            uVar2 = (u) atomicReferenceFieldUpdater.get(uVar);
            if (l() != uVar) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f15853i, uVar, uVar2, this));
        if (o()) {
            uVar.i((c0) null);
        }
    }

    private final d0 r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15854j;
        d0 d0Var = (d0) atomicReferenceFieldUpdater.get(this);
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0Var2 = new d0(this);
        atomicReferenceFieldUpdater.lazySet(this, d0Var2);
        return d0Var2;
    }

    public final boolean h(u uVar) {
        f15853i.lazySet(uVar, this);
        f15852h.lazySet(uVar, this);
        while (l() == this) {
            if (androidx.concurrent.futures.b.a(f15852h, this, this, uVar)) {
                uVar.k(this);
                return true;
            }
        }
        return false;
    }

    public final Object l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15852h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof c0)) {
                return obj;
            }
            ((c0) obj).a(this);
        }
    }

    public final u m() {
        return t.b(l());
    }

    public final u n() {
        u i10 = i((c0) null);
        return i10 == null ? j((u) f15853i.get(this)) : i10;
    }

    public boolean o() {
        return l() instanceof d0;
    }

    public boolean p() {
        return q() == null;
    }

    public final u q() {
        Object l10;
        u uVar;
        do {
            l10 = l();
            if (l10 instanceof d0) {
                return ((d0) l10).f15796a;
            }
            if (l10 == this) {
                return (u) l10;
            }
            m.d(l10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            uVar = (u) l10;
        } while (!androidx.concurrent.futures.b.a(f15852h, this, l10, uVar.r()));
        uVar.i((c0) null);
        return null;
    }

    public final int s(u uVar, u uVar2, a aVar) {
        f15853i.lazySet(uVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15852h;
        atomicReferenceFieldUpdater.lazySet(uVar, uVar2);
        aVar.f15856c = uVar2;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, uVar2, aVar)) {
            return 0;
        }
        return aVar.a(this) == null ? 1 : 2;
    }

    public String toString() {
        return new b(this) + '@' + q0.b(this);
    }
}
