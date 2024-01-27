package s3;

import java.util.Set;
import q3.b;
import q3.e;
import q3.f;
import q3.g;

/* compiled from: TransportFactoryImpl */
final class q implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f11400a;

    /* renamed from: b  reason: collision with root package name */
    private final p f11401b;

    /* renamed from: c  reason: collision with root package name */
    private final t f11402c;

    q(Set<b> set, p pVar, t tVar) {
        this.f11400a = set;
        this.f11401b = pVar;
        this.f11402c = tVar;
    }

    public <T> f<T> a(String str, Class<T> cls, b bVar, e<T, byte[]> eVar) {
        if (this.f11400a.contains(bVar)) {
            return new s(this.f11401b, str, bVar, eVar, this.f11402c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f11400a}));
    }
}
