package s3;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import q3.d;
import s3.d;

@AutoValue
/* compiled from: TransportContext */
public abstract class p {

    @AutoValue.Builder
    /* compiled from: TransportContext */
    public static abstract class a {
        public abstract p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(d dVar);
    }

    public static a a() {
        return new d.b().d(q3.d.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract q3.d d();

    public boolean e() {
        return c() != null;
    }

    public p f(q3.d dVar) {
        return a().b(b()).d(dVar).c(c()).a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
