package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import z1.a0;
import z1.b;
import z1.c0;
import z1.d;
import z1.e;
import z1.f;
import z1.h;
import z1.i;
import z1.j;
import z1.k;
import z1.l;
import z1.m;
import z1.p0;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public abstract class c {

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private volatile s f5356a;

        /* renamed from: b  reason: collision with root package name */
        private final Context f5357b;

        /* renamed from: c  reason: collision with root package name */
        private volatile k f5358c;

        /* renamed from: d  reason: collision with root package name */
        private volatile z1.c f5359d;

        /* synthetic */ a(Context context, p0 p0Var) {
            this.f5357b = context;
        }

        public c a() {
            if (this.f5357b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            } else if (this.f5358c == null) {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            } else if (this.f5356a == null) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            } else if (this.f5358c == null && this.f5359d != null) {
                throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling Alternative Billing.");
            } else if (this.f5358c != null) {
                return new d((String) null, this.f5356a, this.f5357b, this.f5358c, this.f5359d, (n) null);
            } else {
                return new d((String) null, this.f5356a, this.f5357b, (a0) null, (n) null);
            }
        }

        public a b() {
            r rVar = new r((c0) null);
            rVar.a();
            this.f5356a = rVar.b();
            return this;
        }

        public a c(k kVar) {
            this.f5358c = kVar;
            return this;
        }
    }

    public static a h(Context context) {
        return new a(context, (p0) null);
    }

    public abstract void a(z1.a aVar, b bVar);

    public abstract void b(e eVar, f fVar);

    public abstract void c();

    public abstract int d();

    public abstract f e(String str);

    public abstract boolean f();

    public abstract f g(Activity activity, e eVar);

    public abstract void i(h hVar, h hVar2);

    public abstract void j(l lVar, i iVar);

    public abstract void k(m mVar, j jVar);

    public abstract void l(d dVar);
}
