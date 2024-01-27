package m1;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.jvm.internal.m;
import m1.f;
import y8.l;

/* compiled from: SpecificationComputer.kt */
final class g<T> extends f<T> {

    /* renamed from: b  reason: collision with root package name */
    private final T f10175b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10176c;

    /* renamed from: d  reason: collision with root package name */
    private final f.b f10177d;

    /* renamed from: e  reason: collision with root package name */
    private final e f10178e;

    public g(T t10, String str, f.b bVar, e eVar) {
        m.f(t10, "value");
        m.f(str, ViewHierarchyConstants.TAG_KEY);
        m.f(bVar, "verificationMode");
        m.f(eVar, "logger");
        this.f10175b = t10;
        this.f10176c = str;
        this.f10177d = bVar;
        this.f10178e = eVar;
    }

    public T a() {
        return this.f10175b;
    }

    public f<T> c(String str, l<? super T, Boolean> lVar) {
        m.f(str, "message");
        m.f(lVar, "condition");
        if (lVar.invoke(this.f10175b).booleanValue()) {
            return this;
        }
        return new d(this.f10175b, this.f10176c, str, this.f10178e, this.f10177d);
    }
}
