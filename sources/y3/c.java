package y3;

import a4.d;
import b4.a;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import q3.h;
import s3.i;
import s3.p;
import s3.u;
import t3.e;
import t3.m;
import z3.y;

/* compiled from: DefaultScheduler */
public class c implements e {

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f12948f = Logger.getLogger(u.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final y f12949a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f12950b;

    /* renamed from: c  reason: collision with root package name */
    private final e f12951c;

    /* renamed from: d  reason: collision with root package name */
    private final d f12952d;

    /* renamed from: e  reason: collision with root package name */
    private final a f12953e;

    public c(Executor executor, e eVar, y yVar, d dVar, a aVar) {
        this.f12950b = executor;
        this.f12951c = eVar;
        this.f12949a = yVar;
        this.f12952d = dVar;
        this.f12953e = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object d(p pVar, i iVar) {
        this.f12952d.d0(pVar, iVar);
        this.f12949a.b(pVar, 1);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(p pVar, h hVar, i iVar) {
        try {
            m a10 = this.f12951c.a(pVar.b());
            if (a10 == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{pVar.b()});
                f12948f.warning(format);
                hVar.a(new IllegalArgumentException(format));
                return;
            }
            this.f12953e.a(new a(this, pVar, a10.b(iVar)));
            hVar.a((Exception) null);
        } catch (Exception e10) {
            Logger logger = f12948f;
            logger.warning("Error scheduling event " + e10.getMessage());
            hVar.a(e10);
        }
    }

    public void a(p pVar, i iVar, h hVar) {
        this.f12950b.execute(new b(this, pVar, hVar, iVar));
    }
}
