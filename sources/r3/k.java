package r3;

import com.google.auto.value.AutoValue;
import r3.e;

@AutoValue
/* compiled from: ClientInfo */
public abstract class k {

    @AutoValue.Builder
    /* compiled from: ClientInfo */
    public static abstract class a {
        public abstract k a();

        public abstract a b(a aVar);

        public abstract a c(b bVar);
    }

    /* compiled from: ClientInfo */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        

        /* renamed from: h  reason: collision with root package name */
        private final int f10970h;

        private b(int i10) {
            this.f10970h = i10;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract a b();

    public abstract b c();
}
