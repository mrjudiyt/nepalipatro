package i9;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import o8.q;
import y8.l;

/* compiled from: CancellableContinuationImpl.kt */
final class y {

    /* renamed from: a  reason: collision with root package name */
    public final Object f15000a;

    /* renamed from: b  reason: collision with root package name */
    public final j f15001b;

    /* renamed from: c  reason: collision with root package name */
    public final l<Throwable, q> f15002c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f15003d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f15004e;

    public y(Object obj, j jVar, l<? super Throwable, q> lVar, Object obj2, Throwable th) {
        this.f15000a = obj;
        this.f15001b = jVar;
        this.f15002c = lVar;
        this.f15003d = obj2;
        this.f15004e = th;
    }

    public static /* synthetic */ y b(y yVar, Object obj, j jVar, l<Throwable, q> lVar, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = yVar.f15000a;
        }
        if ((i10 & 2) != 0) {
            jVar = yVar.f15001b;
        }
        j jVar2 = jVar;
        if ((i10 & 4) != 0) {
            lVar = yVar.f15002c;
        }
        l<Throwable, q> lVar2 = lVar;
        if ((i10 & 8) != 0) {
            obj2 = yVar.f15003d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th = yVar.f15004e;
        }
        return yVar.a(obj, jVar2, lVar2, obj4, th);
    }

    public final y a(Object obj, j jVar, l<? super Throwable, q> lVar, Object obj2, Throwable th) {
        return new y(obj, jVar, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f15004e != null;
    }

    public final void d(m<?> mVar, Throwable th) {
        j jVar = this.f15001b;
        if (jVar != null) {
            mVar.j(jVar, th);
        }
        l<Throwable, q> lVar = this.f15002c;
        if (lVar != null) {
            mVar.n(lVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return m.a(this.f15000a, yVar.f15000a) && m.a(this.f15001b, yVar.f15001b) && m.a(this.f15002c, yVar.f15002c) && m.a(this.f15003d, yVar.f15003d) && m.a(this.f15004e, yVar.f15004e);
    }

    public int hashCode() {
        Object obj = this.f15000a;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        j jVar = this.f15001b;
        int hashCode2 = (hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        l<Throwable, q> lVar = this.f15002c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f15003d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f15004e;
        if (th != null) {
            i10 = th.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f15000a + ", cancelHandler=" + this.f15001b + ", onCancellation=" + this.f15002c + ", idempotentResume=" + this.f15003d + ", cancelCause=" + this.f15004e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, j jVar, l lVar, Object obj2, Throwable th, int i10, g gVar) {
        this(obj, (i10 & 2) != 0 ? null : jVar, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }
}
