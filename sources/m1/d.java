package m1;

import androidx.window.core.WindowStrictModeException;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import m1.f;
import y8.l;

/* compiled from: SpecificationComputer.kt */
final class d<T> extends f<T> {

    /* renamed from: b  reason: collision with root package name */
    private final T f10163b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10164c;

    /* renamed from: d  reason: collision with root package name */
    private final String f10165d;

    /* renamed from: e  reason: collision with root package name */
    private final e f10166e;

    /* renamed from: f  reason: collision with root package name */
    private final f.b f10167f;

    /* renamed from: g  reason: collision with root package name */
    private final WindowStrictModeException f10168g;

    /* compiled from: SpecificationComputer.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10169a;

        static {
            int[] iArr = new int[f.b.values().length];
            iArr[f.b.STRICT.ordinal()] = 1;
            iArr[f.b.LOG.ordinal()] = 2;
            iArr[f.b.QUIET.ordinal()] = 3;
            f10169a = iArr;
        }
    }

    public d(T t10, String str, String str2, e eVar, f.b bVar) {
        m.f(t10, "value");
        m.f(str, ViewHierarchyConstants.TAG_KEY);
        m.f(str2, "message");
        m.f(eVar, "logger");
        m.f(bVar, "verificationMode");
        this.f10163b = t10;
        this.f10164c = str;
        this.f10165d = str2;
        this.f10166e = eVar;
        this.f10167f = bVar;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(b(t10, str2));
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        m.e(stackTrace, "stackTrace");
        Object[] array = k.m(stackTrace, 2).toArray(new StackTraceElement[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        windowStrictModeException.setStackTrace((StackTraceElement[]) array);
        this.f10168g = windowStrictModeException;
    }

    public T a() {
        int i10 = a.f10169a[this.f10167f.ordinal()];
        if (i10 == 1) {
            throw this.f10168g;
        } else if (i10 == 2) {
            this.f10166e.a(this.f10164c, b(this.f10163b, this.f10165d));
            return null;
        } else if (i10 == 3) {
            return null;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public f<T> c(String str, l<? super T, Boolean> lVar) {
        m.f(str, "message");
        m.f(lVar, "condition");
        return this;
    }
}
