package y0;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.core.os.o;
import androidx.privacysandbox.ads.adservices.topics.i;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import o8.q;
import r8.d;

/* compiled from: MeasurementManager.kt */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0214b f12937a = new C0214b((g) null);

    /* renamed from: y0.b$b  reason: collision with other inner class name */
    /* compiled from: MeasurementManager.kt */
    public static final class C0214b {
        private C0214b() {
        }

        public /* synthetic */ C0214b(g gVar) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final b a(Context context) {
            m.f(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            u0.a aVar = u0.a.f11725a;
            sb.append(aVar.a());
            if (aVar.a() >= 5) {
                return new a(context);
            }
            return null;
        }
    }

    public abstract Object a(a aVar, d<? super q> dVar);

    public abstract Object b(d<? super Integer> dVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, d<? super q> dVar);

    public abstract Object d(Uri uri, d<? super q> dVar);

    public abstract Object e(c cVar, d<? super q> dVar);

    public abstract Object f(d dVar, d<? super q> dVar2);

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    /* compiled from: MeasurementManager.kt */
    private static final class a extends b {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final MeasurementManager f12938b;

        public a(MeasurementManager measurementManager) {
            m.f(measurementManager, "mMeasurementManager");
            this.f12938b = measurementManager;
        }

        /* access modifiers changed from: private */
        public final DeletionRequest k(a aVar) {
            new DeletionRequest.Builder();
            throw null;
        }

        /* access modifiers changed from: private */
        public final WebSourceRegistrationRequest l(c cVar) {
            throw null;
        }

        /* access modifiers changed from: private */
        public final WebTriggerRegistrationRequest m(d dVar) {
            throw null;
        }

        public Object a(a aVar, d<? super q> dVar) {
            i9.m mVar = new i9.m(c.b(dVar), 1);
            mVar.z();
            this.f12938b.deleteRegistrations(k(aVar), i.f3908h, o.a(mVar));
            Object w10 = mVar.w();
            if (w10 == d.c()) {
                h.c(dVar);
            }
            if (w10 == d.c()) {
                return w10;
            }
            return q.f16189a;
        }

        public Object b(d<? super Integer> dVar) {
            i9.m mVar = new i9.m(c.b(dVar), 1);
            mVar.z();
            this.f12938b.getMeasurementApiStatus(i.f3908h, o.a(mVar));
            Object w10 = mVar.w();
            if (w10 == d.c()) {
                h.c(dVar);
            }
            return w10;
        }

        public Object c(Uri uri, InputEvent inputEvent, d<? super q> dVar) {
            i9.m mVar = new i9.m(c.b(dVar), 1);
            mVar.z();
            this.f12938b.registerSource(uri, inputEvent, i.f3908h, o.a(mVar));
            Object w10 = mVar.w();
            if (w10 == d.c()) {
                h.c(dVar);
            }
            if (w10 == d.c()) {
                return w10;
            }
            return q.f16189a;
        }

        public Object d(Uri uri, d<? super q> dVar) {
            i9.m mVar = new i9.m(c.b(dVar), 1);
            mVar.z();
            this.f12938b.registerTrigger(uri, i.f3908h, o.a(mVar));
            Object w10 = mVar.w();
            if (w10 == d.c()) {
                h.c(dVar);
            }
            if (w10 == d.c()) {
                return w10;
            }
            return q.f16189a;
        }

        public Object e(c cVar, d<? super q> dVar) {
            i9.m mVar = new i9.m(c.b(dVar), 1);
            mVar.z();
            this.f12938b.registerWebSource(l(cVar), i.f3908h, o.a(mVar));
            Object w10 = mVar.w();
            if (w10 == d.c()) {
                h.c(dVar);
            }
            if (w10 == d.c()) {
                return w10;
            }
            return q.f16189a;
        }

        public Object f(d dVar, d<? super q> dVar2) {
            i9.m mVar = new i9.m(c.b(dVar2), 1);
            mVar.z();
            this.f12938b.registerWebTrigger(m(dVar), i.f3908h, o.a(mVar));
            Object w10 = mVar.w();
            if (w10 == d.c()) {
                h.c(dVar2);
            }
            if (w10 == d.c()) {
                return w10;
            }
            return q.f16189a;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.content.Context r2) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.m.f(r2, r0)
                java.lang.Class<android.adservices.measurement.MeasurementManager> r0 = android.adservices.measurement.MeasurementManager.class
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                kotlin.jvm.internal.m.e(r2, r0)
                android.adservices.measurement.MeasurementManager r2 = (android.adservices.measurement.MeasurementManager) r2
                r1.<init>((android.adservices.measurement.MeasurementManager) r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.b.a.<init>(android.content.Context):void");
        }
    }
}
