package m1;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import y8.l;

/* compiled from: SpecificationComputer.kt */
public abstract class f<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f10170a = new a((g) null);

    /* compiled from: SpecificationComputer.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public static /* synthetic */ f b(a aVar, Object obj, String str, b bVar, e eVar, int i10, Object obj2) {
            if ((i10 & 2) != 0) {
                bVar = c.f10161a.a();
            }
            if ((i10 & 4) != 0) {
                eVar = a.f10156a;
            }
            return aVar.a(obj, str, bVar, eVar);
        }

        public final <T> f<T> a(T t10, String str, b bVar, e eVar) {
            m.f(t10, "<this>");
            m.f(str, ViewHierarchyConstants.TAG_KEY);
            m.f(bVar, "verificationMode");
            m.f(eVar, "logger");
            return new g(t10, str, bVar, eVar);
        }
    }

    /* compiled from: SpecificationComputer.kt */
    public enum b {
        STRICT,
        LOG,
        QUIET
    }

    public abstract T a();

    /* access modifiers changed from: protected */
    public final String b(Object obj, String str) {
        m.f(obj, "value");
        m.f(str, "message");
        return str + " value: " + obj;
    }

    public abstract f<T> c(String str, l<? super T, Boolean> lVar);
}
