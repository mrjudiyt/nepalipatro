package n9;

import kotlin.jvm.internal.m;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import y8.l;

@IgnoreJRERequirement
/* compiled from: ExceptionsConstructor.kt */
final class c extends j {

    /* renamed from: a  reason: collision with root package name */
    public static final c f15793a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final a f15794b = new a();

    /* compiled from: ExceptionsConstructor.kt */
    public static final class a extends ClassValue<l<? super Throwable, ? extends Throwable>> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public l<Throwable, Throwable> computeValue(Class<?> cls) {
            m.d(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
            return m.b(cls);
        }
    }

    private c() {
    }

    public l<Throwable, Throwable> a(Class<? extends Throwable> cls) {
        return (l) f15794b.get(cls);
    }
}
