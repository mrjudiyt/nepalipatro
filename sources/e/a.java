package e;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.m;

/* compiled from: ActivityResultContract.kt */
public abstract class a<I, O> {

    /* renamed from: e.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityResultContract.kt */
    public static final class C0127a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T f7967a;

        public C0127a(T t10) {
            this.f7967a = t10;
        }

        public final T a() {
            return this.f7967a;
        }
    }

    public abstract Intent createIntent(Context context, I i10);

    public C0127a<O> getSynchronousResult(Context context, I i10) {
        m.f(context, "context");
        return null;
    }

    public abstract O parseResult(int i10, Intent intent);
}
