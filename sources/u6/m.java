package u6;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import r6.f;
import r6.s;
import u6.i;
import y6.a;
import y6.c;

/* compiled from: TypeAdapterRuntimeTypeWrapper */
final class m<T> extends s<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f f16664a;

    /* renamed from: b  reason: collision with root package name */
    private final s<T> f16665b;

    /* renamed from: c  reason: collision with root package name */
    private final Type f16666c;

    m(f fVar, s<T> sVar, Type type) {
        this.f16664a = fVar;
        this.f16665b = sVar;
        this.f16666c = type;
    }

    private Type e(Type type, Object obj) {
        if (obj != null) {
            return (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type;
        }
        return type;
    }

    public T b(a aVar) {
        return this.f16665b.b(aVar);
    }

    public void d(c cVar, T t10) {
        s<T> sVar = this.f16665b;
        Type e10 = e(this.f16666c, t10);
        if (e10 != this.f16666c) {
            sVar = this.f16664a.l(x6.a.b(e10));
            if (sVar instanceof i.b) {
                s<T> sVar2 = this.f16665b;
                if (!(sVar2 instanceof i.b)) {
                    sVar = sVar2;
                }
            }
        }
        sVar.d(cVar, t10);
    }
}
