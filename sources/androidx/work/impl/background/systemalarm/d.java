package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.m;
import com.facebook.AuthenticationTokenClaims;
import java.util.Collections;
import java.util.List;
import o1.b;
import r1.c;
import v1.p;
import w1.j;
import w1.n;

/* compiled from: DelayMetCommandHandler */
public class d implements c, b, n.b {

    /* renamed from: q  reason: collision with root package name */
    private static final String f4803q = m.f("DelayMetCommandHandler");

    /* renamed from: h  reason: collision with root package name */
    private final Context f4804h;

    /* renamed from: i  reason: collision with root package name */
    private final int f4805i;

    /* renamed from: j  reason: collision with root package name */
    private final String f4806j;

    /* renamed from: k  reason: collision with root package name */
    private final e f4807k;

    /* renamed from: l  reason: collision with root package name */
    private final r1.d f4808l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f4809m = new Object();

    /* renamed from: n  reason: collision with root package name */
    private int f4810n = 0;

    /* renamed from: o  reason: collision with root package name */
    private PowerManager.WakeLock f4811o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f4812p = false;

    d(Context context, int i10, String str, e eVar) {
        this.f4804h = context;
        this.f4805i = i10;
        this.f4807k = eVar;
        this.f4806j = str;
        this.f4808l = new r1.d(context, eVar.f(), this);
    }

    private void d() {
        synchronized (this.f4809m) {
            this.f4808l.e();
            this.f4807k.h().c(this.f4806j);
            PowerManager.WakeLock wakeLock = this.f4811o;
            if (wakeLock != null && wakeLock.isHeld()) {
                m.c().a(f4803q, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f4811o, this.f4806j}), new Throwable[0]);
                this.f4811o.release();
            }
        }
    }

    private void g() {
        synchronized (this.f4809m) {
            if (this.f4810n < 2) {
                this.f4810n = 2;
                m c10 = m.c();
                String str = f4803q;
                c10.a(str, String.format("Stopping work for WorkSpec %s", new Object[]{this.f4806j}), new Throwable[0]);
                Intent g10 = b.g(this.f4804h, this.f4806j);
                e eVar = this.f4807k;
                eVar.k(new e.b(eVar, g10, this.f4805i));
                if (this.f4807k.e().g(this.f4806j)) {
                    m.c().a(str, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.f4806j}), new Throwable[0]);
                    Intent f10 = b.f(this.f4804h, this.f4806j);
                    e eVar2 = this.f4807k;
                    eVar2.k(new e.b(eVar2, f10, this.f4805i));
                } else {
                    m.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f4806j}), new Throwable[0]);
                }
            } else {
                m.c().a(f4803q, String.format("Already stopped work for %s", new Object[]{this.f4806j}), new Throwable[0]);
            }
        }
    }

    public void a(String str) {
        m.c().a(f4803q, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        g();
    }

    public void b(List<String> list) {
        g();
    }

    public void c(String str, boolean z10) {
        m.c().a(f4803q, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z10)}), new Throwable[0]);
        d();
        if (z10) {
            Intent f10 = b.f(this.f4804h, this.f4806j);
            e eVar = this.f4807k;
            eVar.k(new e.b(eVar, f10, this.f4805i));
        }
        if (this.f4812p) {
            Intent a10 = b.a(this.f4804h);
            e eVar2 = this.f4807k;
            eVar2.k(new e.b(eVar2, a10, this.f4805i));
        }
    }

    public void e(List<String> list) {
        if (list.contains(this.f4806j)) {
            synchronized (this.f4809m) {
                if (this.f4810n == 0) {
                    this.f4810n = 1;
                    m.c().a(f4803q, String.format("onAllConstraintsMet for %s", new Object[]{this.f4806j}), new Throwable[0]);
                    if (this.f4807k.e().j(this.f4806j)) {
                        this.f4807k.h().b(this.f4806j, AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED, this);
                    } else {
                        d();
                    }
                } else {
                    m.c().a(f4803q, String.format("Already started work for %s", new Object[]{this.f4806j}), new Throwable[0]);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f4811o = j.b(this.f4804h, String.format("%s (%s)", new Object[]{this.f4806j, Integer.valueOf(this.f4805i)}));
        m c10 = m.c();
        String str = f4803q;
        c10.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.f4811o, this.f4806j}), new Throwable[0]);
        this.f4811o.acquire();
        p n10 = this.f4807k.g().q().B().n(this.f4806j);
        if (n10 == null) {
            g();
            return;
        }
        boolean b10 = n10.b();
        this.f4812p = b10;
        if (!b10) {
            m.c().a(str, String.format("No constraints for %s", new Object[]{this.f4806j}), new Throwable[0]);
            e(Collections.singletonList(this.f4806j));
            return;
        }
        this.f4808l.d(Collections.singletonList(n10));
    }
}
