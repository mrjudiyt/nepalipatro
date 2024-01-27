package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q1;

/* compiled from: MapEntryLite */
public class i0<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final a<K, V> f2813a;

    /* renamed from: b  reason: collision with root package name */
    private final K f2814b;

    /* renamed from: c  reason: collision with root package name */
    private final V f2815c;

    /* compiled from: MapEntryLite */
    static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final q1.b f2816a;

        /* renamed from: b  reason: collision with root package name */
        public final K f2817b;

        /* renamed from: c  reason: collision with root package name */
        public final q1.b f2818c;

        /* renamed from: d  reason: collision with root package name */
        public final V f2819d;

        public a(q1.b bVar, K k10, q1.b bVar2, V v10) {
            this.f2816a = bVar;
            this.f2817b = k10;
            this.f2818c = bVar2;
            this.f2819d = v10;
        }
    }

    private i0(q1.b bVar, K k10, q1.b bVar2, V v10) {
        this.f2813a = new a<>(bVar, k10, bVar2, v10);
        this.f2814b = k10;
        this.f2815c = v10;
    }

    static <K, V> int b(a<K, V> aVar, K k10, V v10) {
        return t.d(aVar.f2816a, 1, k10) + t.d(aVar.f2818c, 2, v10);
    }

    public static <K, V> i0<K, V> d(q1.b bVar, K k10, q1.b bVar2, V v10) {
        return new i0<>(bVar, k10, bVar2, v10);
    }

    static <K, V> void e(CodedOutputStream codedOutputStream, a<K, V> aVar, K k10, V v10) {
        t.z(codedOutputStream, aVar.f2816a, 1, k10);
        t.z(codedOutputStream, aVar.f2818c, 2, v10);
    }

    public int a(int i10, K k10, V v10) {
        return CodedOutputStream.V(i10) + CodedOutputStream.C(b(this.f2813a, k10, v10));
    }

    /* access modifiers changed from: package-private */
    public a<K, V> c() {
        return this.f2813a;
    }
}
