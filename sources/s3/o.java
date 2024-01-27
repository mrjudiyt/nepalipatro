package s3;

import com.google.auto.value.AutoValue;
import q3.b;
import q3.c;
import q3.e;
import s3.c;

@AutoValue
/* compiled from: SendRequest */
abstract class o {

    @AutoValue.Builder
    /* compiled from: SendRequest */
    public static abstract class a {
        public abstract o a();

        /* access modifiers changed from: package-private */
        public abstract a b(b bVar);

        /* access modifiers changed from: package-private */
        public abstract a c(c<?> cVar);

        /* access modifiers changed from: package-private */
        public abstract a d(e<?, byte[]> eVar);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    o() {
    }

    public static a a() {
        return new c.b();
    }

    public abstract b b();

    /* access modifiers changed from: package-private */
    public abstract q3.c<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    /* access modifiers changed from: package-private */
    public abstract e<?, byte[]> e();

    public abstract p f();

    public abstract String g();
}
