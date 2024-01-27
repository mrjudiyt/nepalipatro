package androidx.datastore.preferences.protobuf;

/* compiled from: UnknownFieldSetLiteSchema */
class m1 extends k1<l1, l1> {
    m1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public l1 g(Object obj) {
        return ((x) obj).unknownFields;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public int h(l1 l1Var) {
        return l1Var.f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int i(l1 l1Var) {
        return l1Var.g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public l1 k(l1 l1Var, l1 l1Var2) {
        return l1Var2.equals(l1.e()) ? l1Var : l1.k(l1Var, l1Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public l1 n() {
        return l1.l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void o(Object obj, l1 l1Var) {
        p(obj, l1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void p(Object obj, l1 l1Var) {
        ((x) obj).unknownFields = l1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public l1 r(l1 l1Var) {
        l1Var.j();
        return l1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void s(l1 l1Var, r1 r1Var) {
        l1Var.o(r1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void t(l1 l1Var, r1 r1Var) {
        l1Var.q(r1Var);
    }

    /* access modifiers changed from: package-private */
    public void j(Object obj) {
        g(obj).j();
    }

    /* access modifiers changed from: package-private */
    public boolean q(d1 d1Var) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void a(l1 l1Var, int i10, int i11) {
        l1Var.n(q1.c(i10, 5), Integer.valueOf(i11));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void b(l1 l1Var, int i10, long j10) {
        l1Var.n(q1.c(i10, 1), Long.valueOf(j10));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void c(l1 l1Var, int i10, l1 l1Var2) {
        l1Var.n(q1.c(i10, 3), l1Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void d(l1 l1Var, int i10, h hVar) {
        l1Var.n(q1.c(i10, 2), hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void e(l1 l1Var, int i10, long j10) {
        l1Var.n(q1.c(i10, 0), Long.valueOf(j10));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public l1 f(Object obj) {
        l1 A = g(obj);
        if (A != l1.e()) {
            return A;
        }
        l1 l10 = l1.l();
        p(obj, l10);
        return l10;
    }
}
