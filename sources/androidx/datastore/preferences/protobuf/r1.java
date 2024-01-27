package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.i0;
import java.util.List;
import java.util.Map;

/* compiled from: Writer */
interface r1 {

    /* compiled from: Writer */
    public enum a {
        ASCENDING,
        DESCENDING
    }

    void A(int i10, List<Boolean> list, boolean z10);

    void B(int i10, List<Integer> list, boolean z10);

    void C(int i10, List<Long> list, boolean z10);

    void D(int i10, long j10);

    void E(int i10, float f10);

    @Deprecated
    void F(int i10);

    void G(int i10, List<Integer> list, boolean z10);

    void H(int i10, int i11);

    void I(int i10, List<Long> list, boolean z10);

    void J(int i10, List<Integer> list, boolean z10);

    void K(int i10, List<Double> list, boolean z10);

    <K, V> void L(int i10, i0.a<K, V> aVar, Map<K, V> map);

    void M(int i10, int i11);

    void N(int i10, List<h> list);

    @Deprecated
    void O(int i10, Object obj, e1 e1Var);

    void a(int i10, List<Float> list, boolean z10);

    void b(int i10, int i11);

    void c(int i10, Object obj);

    void d(int i10, int i11);

    void e(int i10, double d10);

    void f(int i10, List<Long> list, boolean z10);

    void g(int i10, List<Long> list, boolean z10);

    void h(int i10, long j10);

    a i();

    void j(int i10, List<?> list, e1 e1Var);

    void k(int i10, List<String> list);

    @Deprecated
    void l(int i10, List<?> list, e1 e1Var);

    void m(int i10, String str);

    void n(int i10, long j10);

    void o(int i10, List<Integer> list, boolean z10);

    void p(int i10, long j10);

    void q(int i10, boolean z10);

    void r(int i10, int i11);

    @Deprecated
    void s(int i10);

    void t(int i10, int i11);

    void u(int i10, List<Long> list, boolean z10);

    void v(int i10, List<Integer> list, boolean z10);

    void w(int i10, h hVar);

    void x(int i10, long j10);

    void y(int i10, List<Integer> list, boolean z10);

    void z(int i10, Object obj, e1 e1Var);
}
