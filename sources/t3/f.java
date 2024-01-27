package t3;

import com.google.auto.value.AutoValue;
import s3.i;
import t3.a;

@AutoValue
/* compiled from: BackendRequest */
public abstract class f {

    @AutoValue.Builder
    /* compiled from: BackendRequest */
    public static abstract class a {
        public abstract f a();

        public abstract a b(Iterable<i> iterable);

        public abstract a c(byte[] bArr);
    }

    public static a a() {
        return new a.b();
    }

    public abstract Iterable<i> b();

    public abstract byte[] c();
}
