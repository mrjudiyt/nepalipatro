package z3;

import a4.d;
import b4.a;
import java.util.concurrent.Executor;
import s3.p;

/* compiled from: WorkInitializer */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f13178a;

    /* renamed from: b  reason: collision with root package name */
    private final d f13179b;

    /* renamed from: c  reason: collision with root package name */
    private final y f13180c;

    /* renamed from: d  reason: collision with root package name */
    private final a f13181d;

    w(Executor executor, d dVar, y yVar, a aVar) {
        this.f13178a = executor;
        this.f13179b = dVar;
        this.f13180c = yVar;
        this.f13181d = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object d() {
        for (p b10 : this.f13179b.I()) {
            this.f13180c.b(b10, 1);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f13181d.a(new u(this));
    }

    public void c() {
        this.f13178a.execute(new v(this));
    }
}
