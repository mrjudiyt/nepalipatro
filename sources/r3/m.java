package r3;

import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
import r3.g;

@AutoValue
/* compiled from: LogRequest */
public abstract class m {

    @AutoValue.Builder
    /* compiled from: LogRequest */
    public static abstract class a {
        public abstract m a();

        public abstract a b(k kVar);

        public abstract a c(List<l> list);

        /* access modifiers changed from: package-private */
        public abstract a d(Integer num);

        /* access modifiers changed from: package-private */
        public abstract a e(String str);

        public abstract a f(p pVar);

        public abstract a g(long j10);

        public abstract a h(long j10);

        public a i(int i10) {
            return d(Integer.valueOf(i10));
        }

        public a j(String str) {
            return e(str);
        }
    }

    public static a a() {
        return new g.b();
    }

    public abstract k b();

    @Encodable.Field(name = "logEvent")
    public abstract List<l> c();

    public abstract Integer d();

    public abstract String e();

    public abstract p f();

    public abstract long g();

    public abstract long h();
}
