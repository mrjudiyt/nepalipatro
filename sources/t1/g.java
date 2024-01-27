package t1;

import android.content.Context;
import x1.a;

/* compiled from: Trackers */
public class g {

    /* renamed from: e  reason: collision with root package name */
    private static g f11592e;

    /* renamed from: a  reason: collision with root package name */
    private a f11593a;

    /* renamed from: b  reason: collision with root package name */
    private b f11594b;

    /* renamed from: c  reason: collision with root package name */
    private e f11595c;

    /* renamed from: d  reason: collision with root package name */
    private f f11596d;

    private g(Context context, a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f11593a = new a(applicationContext, aVar);
        this.f11594b = new b(applicationContext, aVar);
        this.f11595c = new e(applicationContext, aVar);
        this.f11596d = new f(applicationContext, aVar);
    }

    public static synchronized g c(Context context, a aVar) {
        g gVar;
        synchronized (g.class) {
            if (f11592e == null) {
                f11592e = new g(context, aVar);
            }
            gVar = f11592e;
        }
        return gVar;
    }

    public a a() {
        return this.f11593a;
    }

    public b b() {
        return this.f11594b;
    }

    public e d() {
        return this.f11595c;
    }

    public f e() {
        return this.f11596d;
    }
}
