package g0;

import java.io.InputStream;
import java.io.OutputStream;
import o8.q;
import r8.d;

/* compiled from: Serializer.kt */
public interface j<T> {
    T a();

    Object b(InputStream inputStream, d<? super T> dVar);

    Object c(T t10, OutputStream outputStream, d<? super q> dVar);
}
