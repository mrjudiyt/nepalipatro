package ea;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;

/* compiled from: ForwardingTimeout.kt */
public class k extends a0 {

    /* renamed from: f  reason: collision with root package name */
    private a0 f14372f;

    public k(a0 a0Var) {
        m.g(a0Var, "delegate");
        this.f14372f = a0Var;
    }

    public a0 a() {
        return this.f14372f.a();
    }

    public a0 b() {
        return this.f14372f.b();
    }

    public long c() {
        return this.f14372f.c();
    }

    public a0 d(long j10) {
        return this.f14372f.d(j10);
    }

    public boolean e() {
        return this.f14372f.e();
    }

    public void f() {
        this.f14372f.f();
    }

    public a0 g(long j10, TimeUnit timeUnit) {
        m.g(timeUnit, "unit");
        return this.f14372f.g(j10, timeUnit);
    }

    public final a0 i() {
        return this.f14372f;
    }

    public final k j(a0 a0Var) {
        m.g(a0Var, "delegate");
        this.f14372f = a0Var;
        return this;
    }
}
