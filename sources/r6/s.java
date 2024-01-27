package r6;

import com.google.gson.JsonIOException;
import java.io.IOException;
import u6.f;
import y6.b;
import y6.c;

/* compiled from: TypeAdapter */
public abstract class s<T> {

    /* compiled from: TypeAdapter */
    class a extends s<T> {
        a() {
        }

        public T b(y6.a aVar) {
            if (aVar.I0() != b.NULL) {
                return s.this.b(aVar);
            }
            aVar.s0();
            return null;
        }

        public void d(c cVar, T t10) {
            if (t10 == null) {
                cVar.g0();
            } else {
                s.this.d(cVar, t10);
            }
        }
    }

    public final s<T> a() {
        return new a();
    }

    public abstract T b(y6.a aVar);

    public final l c(T t10) {
        try {
            f fVar = new f();
            d(fVar, t10);
            return fVar.P0();
        } catch (IOException e10) {
            throw new JsonIOException((Throwable) e10);
        }
    }

    public abstract void d(c cVar, T t10);
}
