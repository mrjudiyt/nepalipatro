package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.i0;
import java.util.List;
import java.util.Map;

/* compiled from: Reader */
interface d1 {
    int A();

    void B(List<String> list);

    void C(List<String> list);

    h D();

    void E(List<Float> list);

    int F();

    @Deprecated
    <T> void G(List<T> list, e1<T> e1Var, o oVar);

    boolean H();

    int I();

    void J(List<h> list);

    void K(List<Double> list);

    <T> void L(List<T> list, e1<T> e1Var, o oVar);

    long M();

    String N();

    void O(List<Long> list);

    @Deprecated
    <T> T P(e1<T> e1Var, o oVar);

    int a();

    <T> T b(e1<T> e1Var, o oVar);

    void c(List<Integer> list);

    long d();

    long e();

    <T> T f(Class<T> cls, o oVar);

    void g(List<Integer> list);

    void h(List<Long> list);

    void i(List<Integer> list);

    int j();

    boolean k();

    long l();

    void m(List<Long> list);

    @Deprecated
    <T> T n(Class<T> cls, o oVar);

    int o();

    void p(List<Long> list);

    void q(List<Long> list);

    void r(List<Integer> list);

    double readDouble();

    float readFloat();

    void s(List<Integer> list);

    <K, V> void t(Map<K, V> map, i0.a<K, V> aVar, o oVar);

    int u();

    void v(List<Integer> list);

    int w();

    long x();

    void y(List<Boolean> list);

    String z();
}
