package w0;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import com.google.common.util.concurrent.e;
import i9.a1;
import i9.l0;
import i9.m0;
import i9.n0;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.g;
import o8.m;
import o8.q;
import y8.p;

/* compiled from: MeasurementManagerFutures.kt */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f12577a = new b((g) null);

    /* renamed from: w0.a$a  reason: collision with other inner class name */
    /* compiled from: MeasurementManagerFutures.kt */
    private static final class C0207a extends a {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final y0.b f12578b;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", f = "MeasurementManagerFutures.kt", l = {122}, m = "invokeSuspend")
        /* renamed from: w0.a$a$a  reason: collision with other inner class name */
        /* compiled from: MeasurementManagerFutures.kt */
        static final class C0208a extends k implements p<l0, r8.d<? super q>, Object> {

            /* renamed from: h  reason: collision with root package name */
            int f12579h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ C0207a f12580i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ y0.a f12581j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0208a(C0207a aVar, y0.a aVar2, r8.d<? super C0208a> dVar) {
                super(2, dVar);
                this.f12580i = aVar;
            }

            public final r8.d<q> create(Object obj, r8.d<?> dVar) {
                return new C0208a(this.f12580i, this.f12581j, dVar);
            }

            public final Object invoke(l0 l0Var, r8.d<? super q> dVar) {
                return ((C0208a) create(l0Var, dVar)).invokeSuspend(q.f16189a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.f12579h;
                if (i10 == 0) {
                    m.b(obj);
                    y0.b e10 = this.f12580i.f12578b;
                    y0.a aVar = this.f12581j;
                    this.f12579h = 1;
                    if (e10.a(aVar, this) == c10) {
                        return c10;
                    }
                } else if (i10 == 1) {
                    m.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return q.f16189a;
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {169}, m = "invokeSuspend")
        /* renamed from: w0.a$a$b */
        /* compiled from: MeasurementManagerFutures.kt */
        static final class b extends k implements p<l0, r8.d<? super Integer>, Object> {

            /* renamed from: h  reason: collision with root package name */
            int f12582h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ C0207a f12583i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C0207a aVar, r8.d<? super b> dVar) {
                super(2, dVar);
                this.f12583i = aVar;
            }

            public final r8.d<q> create(Object obj, r8.d<?> dVar) {
                return new b(this.f12583i, dVar);
            }

            public final Object invoke(l0 l0Var, r8.d<? super Integer> dVar) {
                return ((b) create(l0Var, dVar)).invokeSuspend(q.f16189a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.f12582h;
                if (i10 == 0) {
                    m.b(obj);
                    y0.b e10 = this.f12583i.f12578b;
                    this.f12582h = 1;
                    obj = e10.b(this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 == 1) {
                    m.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {133}, m = "invokeSuspend")
        /* renamed from: w0.a$a$c */
        /* compiled from: MeasurementManagerFutures.kt */
        static final class c extends k implements p<l0, r8.d<? super q>, Object> {

            /* renamed from: h  reason: collision with root package name */
            int f12584h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ C0207a f12585i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ Uri f12586j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ InputEvent f12587k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(C0207a aVar, Uri uri, InputEvent inputEvent, r8.d<? super c> dVar) {
                super(2, dVar);
                this.f12585i = aVar;
                this.f12586j = uri;
                this.f12587k = inputEvent;
            }

            public final r8.d<q> create(Object obj, r8.d<?> dVar) {
                return new c(this.f12585i, this.f12586j, this.f12587k, dVar);
            }

            public final Object invoke(l0 l0Var, r8.d<? super q> dVar) {
                return ((c) create(l0Var, dVar)).invokeSuspend(q.f16189a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.f12584h;
                if (i10 == 0) {
                    m.b(obj);
                    y0.b e10 = this.f12585i.f12578b;
                    Uri uri = this.f12586j;
                    InputEvent inputEvent = this.f12587k;
                    this.f12584h = 1;
                    if (e10.c(uri, inputEvent, this) == c10) {
                        return c10;
                    }
                } else if (i10 == 1) {
                    m.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return q.f16189a;
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {141}, m = "invokeSuspend")
        /* renamed from: w0.a$a$d */
        /* compiled from: MeasurementManagerFutures.kt */
        static final class d extends k implements p<l0, r8.d<? super q>, Object> {

            /* renamed from: h  reason: collision with root package name */
            int f12588h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ C0207a f12589i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ Uri f12590j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(C0207a aVar, Uri uri, r8.d<? super d> dVar) {
                super(2, dVar);
                this.f12589i = aVar;
                this.f12590j = uri;
            }

            public final r8.d<q> create(Object obj, r8.d<?> dVar) {
                return new d(this.f12589i, this.f12590j, dVar);
            }

            public final Object invoke(l0 l0Var, r8.d<? super q> dVar) {
                return ((d) create(l0Var, dVar)).invokeSuspend(q.f16189a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.f12588h;
                if (i10 == 0) {
                    m.b(obj);
                    y0.b e10 = this.f12589i.f12578b;
                    Uri uri = this.f12590j;
                    this.f12588h = 1;
                    if (e10.d(uri, this) == c10) {
                        return c10;
                    }
                } else if (i10 == 1) {
                    m.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return q.f16189a;
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {151}, m = "invokeSuspend")
        /* renamed from: w0.a$a$e */
        /* compiled from: MeasurementManagerFutures.kt */
        static final class e extends k implements p<l0, r8.d<? super q>, Object> {

            /* renamed from: h  reason: collision with root package name */
            int f12591h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ C0207a f12592i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ y0.c f12593j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(C0207a aVar, y0.c cVar, r8.d<? super e> dVar) {
                super(2, dVar);
                this.f12592i = aVar;
            }

            public final r8.d<q> create(Object obj, r8.d<?> dVar) {
                return new e(this.f12592i, this.f12593j, dVar);
            }

            public final Object invoke(l0 l0Var, r8.d<? super q> dVar) {
                return ((e) create(l0Var, dVar)).invokeSuspend(q.f16189a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.f12591h;
                if (i10 == 0) {
                    m.b(obj);
                    y0.b e10 = this.f12592i.f12578b;
                    y0.c cVar = this.f12593j;
                    this.f12591h = 1;
                    if (e10.e(cVar, this) == c10) {
                        return c10;
                    }
                } else if (i10 == 1) {
                    m.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return q.f16189a;
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {161}, m = "invokeSuspend")
        /* renamed from: w0.a$a$f */
        /* compiled from: MeasurementManagerFutures.kt */
        static final class f extends k implements p<l0, r8.d<? super q>, Object> {

            /* renamed from: h  reason: collision with root package name */
            int f12594h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ C0207a f12595i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ y0.d f12596j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            f(C0207a aVar, y0.d dVar, r8.d<? super f> dVar2) {
                super(2, dVar2);
                this.f12595i = aVar;
            }

            public final r8.d<q> create(Object obj, r8.d<?> dVar) {
                return new f(this.f12595i, this.f12596j, dVar);
            }

            public final Object invoke(l0 l0Var, r8.d<? super q> dVar) {
                return ((f) create(l0Var, dVar)).invokeSuspend(q.f16189a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.f12594h;
                if (i10 == 0) {
                    m.b(obj);
                    y0.b e10 = this.f12595i.f12578b;
                    y0.d dVar = this.f12596j;
                    this.f12594h = 1;
                    if (e10.f(dVar, this) == c10) {
                        return c10;
                    }
                } else if (i10 == 1) {
                    m.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return q.f16189a;
            }
        }

        public C0207a(y0.b bVar) {
            kotlin.jvm.internal.m.f(bVar, "mMeasurementManager");
            this.f12578b = bVar;
        }

        public com.google.common.util.concurrent.e<Integer> b() {
            return v0.b.c(i.b(m0.a(a1.a()), (r8.g) null, (n0) null, new b(this, (r8.d<? super b>) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public com.google.common.util.concurrent.e<q> c(Uri uri, InputEvent inputEvent) {
            kotlin.jvm.internal.m.f(uri, "attributionSource");
            return v0.b.c(i.b(m0.a(a1.a()), (r8.g) null, (n0) null, new c(this, uri, inputEvent, (r8.d<? super c>) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public com.google.common.util.concurrent.e<q> d(Uri uri) {
            kotlin.jvm.internal.m.f(uri, "trigger");
            return v0.b.c(i.b(m0.a(a1.a()), (r8.g) null, (n0) null, new d(this, uri, (r8.d<? super d>) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public com.google.common.util.concurrent.e<q> f(y0.a aVar) {
            kotlin.jvm.internal.m.f(aVar, "deletionRequest");
            return v0.b.c(i.b(m0.a(a1.a()), (r8.g) null, (n0) null, new C0208a(this, aVar, (r8.d<? super C0208a>) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public com.google.common.util.concurrent.e<q> g(y0.c cVar) {
            kotlin.jvm.internal.m.f(cVar, "request");
            return v0.b.c(i.b(m0.a(a1.a()), (r8.g) null, (n0) null, new e(this, cVar, (r8.d<? super e>) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public com.google.common.util.concurrent.e<q> h(y0.d dVar) {
            kotlin.jvm.internal.m.f(dVar, "request");
            return v0.b.c(i.b(m0.a(a1.a()), (r8.g) null, (n0) null, new f(this, dVar, (r8.d<? super f>) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }
    }

    /* compiled from: MeasurementManagerFutures.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final a a(Context context) {
            kotlin.jvm.internal.m.f(context, "context");
            y0.b a10 = y0.b.f12937a.a(context);
            if (a10 != null) {
                return new C0207a(a10);
            }
            return null;
        }
    }

    public static final a a(Context context) {
        return f12577a.a(context);
    }

    public abstract e<Integer> b();

    public abstract e<q> c(Uri uri, InputEvent inputEvent);

    public abstract e<q> d(Uri uri);
}
