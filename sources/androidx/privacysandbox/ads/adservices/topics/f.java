package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import r8.d;

/* compiled from: TopicsManager.kt */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f3907a = new a((g) null);

    /* compiled from: TopicsManager.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final f a(Context context) {
            m.f(context, "context");
            u0.a aVar = u0.a.f11725a;
            if (aVar.a() >= 5) {
                return new h(context);
            }
            if (aVar.a() == 4) {
                return new g(context);
            }
            return null;
        }
    }

    public abstract Object a(b bVar, d<? super c> dVar);
}
