package x0;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.c;
import androidx.privacysandbox.ads.adservices.topics.f;
import com.google.common.util.concurrent.e;
import i9.a1;
import i9.l0;
import i9.m0;
import i9.n0;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.g;
import o8.m;
import o8.q;
import r8.d;
import y8.p;

/* compiled from: TopicsManagerFutures.kt */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f12757a = new b((g) null);

    /* renamed from: x0.a$a  reason: collision with other inner class name */
    /* compiled from: TopicsManagerFutures.kt */
    private static final class C0211a extends a {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final f f12758b;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1", f = "TopicsManagerFutures.kt", l = {56}, m = "invokeSuspend")
        /* renamed from: x0.a$a$a  reason: collision with other inner class name */
        /* compiled from: TopicsManagerFutures.kt */
        static final class C0212a extends k implements p<l0, d<? super c>, Object> {

            /* renamed from: h  reason: collision with root package name */
            int f12759h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ C0211a f12760i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ androidx.privacysandbox.ads.adservices.topics.b f12761j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0212a(C0211a aVar, androidx.privacysandbox.ads.adservices.topics.b bVar, d<? super C0212a> dVar) {
                super(2, dVar);
                this.f12760i = aVar;
                this.f12761j = bVar;
            }

            public final d<q> create(Object obj, d<?> dVar) {
                return new C0212a(this.f12760i, this.f12761j, dVar);
            }

            public final Object invoke(l0 l0Var, d<? super c> dVar) {
                return ((C0212a) create(l0Var, dVar)).invokeSuspend(q.f16189a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.f12759h;
                if (i10 == 0) {
                    m.b(obj);
                    f c11 = this.f12760i.f12758b;
                    androidx.privacysandbox.ads.adservices.topics.b bVar = this.f12761j;
                    this.f12759h = 1;
                    obj = c11.a(bVar, this);
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

        public C0211a(f fVar) {
            kotlin.jvm.internal.m.f(fVar, "mTopicsManager");
            this.f12758b = fVar;
        }

        public e<c> b(androidx.privacysandbox.ads.adservices.topics.b bVar) {
            kotlin.jvm.internal.m.f(bVar, "request");
            return v0.b.c(i.b(m0.a(a1.c()), (r8.g) null, (n0) null, new C0212a(this, bVar, (d<? super C0212a>) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }
    }

    /* compiled from: TopicsManagerFutures.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final a a(Context context) {
            kotlin.jvm.internal.m.f(context, "context");
            f a10 = f.f3907a.a(context);
            if (a10 != null) {
                return new C0211a(a10);
            }
            return null;
        }
    }

    public static final a a(Context context) {
        return f12757a.a(context);
    }

    public abstract e<c> b(androidx.privacysandbox.ads.adservices.topics.b bVar);
}
