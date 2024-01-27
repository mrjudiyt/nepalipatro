package androidx.room;

import e1.c;
import java.io.File;

/* compiled from: SQLiteCopyOpenHelperFactory */
class k implements c.C0129c {

    /* renamed from: a  reason: collision with root package name */
    private final String f4444a;

    /* renamed from: b  reason: collision with root package name */
    private final File f4445b;

    /* renamed from: c  reason: collision with root package name */
    private final c.C0129c f4446c;

    k(String str, File file, c.C0129c cVar) {
        this.f4444a = str;
        this.f4445b = file;
        this.f4446c = cVar;
    }

    public c a(c.b bVar) {
        return new j(bVar.f7975a, this.f4444a, this.f4445b, bVar.f7977c.f7974a, this.f4446c.a(bVar));
    }
}
