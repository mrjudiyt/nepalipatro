package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.m;
import java.util.ArrayList;
import java.util.List;
import r1.d;
import v1.p;

/* compiled from: ConstraintsCommandHandler */
class c {

    /* renamed from: e  reason: collision with root package name */
    private static final String f4798e = m.f("ConstraintsCmdHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f4799a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4800b;

    /* renamed from: c  reason: collision with root package name */
    private final e f4801c;

    /* renamed from: d  reason: collision with root package name */
    private final d f4802d;

    c(Context context, int i10, e eVar) {
        this.f4799a = context;
        this.f4800b = i10;
        this.f4801c = eVar;
        this.f4802d = new d(context, eVar.f(), (r1.c) null);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        List<p> g10 = this.f4801c.g().q().B().g();
        ConstraintProxy.a(this.f4799a, g10);
        this.f4802d.d(g10);
        ArrayList<p> arrayList = new ArrayList<>(g10.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (p next : g10) {
            String str = next.f12255a;
            if (currentTimeMillis >= next.a() && (!next.b() || this.f4802d.c(str))) {
                arrayList.add(next);
            }
        }
        for (p pVar : arrayList) {
            String str2 = pVar.f12255a;
            Intent b10 = b.b(this.f4799a, str2);
            m.c().a(f4798e, String.format("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2}), new Throwable[0]);
            e eVar = this.f4801c;
            eVar.k(new e.b(eVar, b10, this.f4800b));
        }
        this.f4802d.e();
    }
}
