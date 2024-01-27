package i9;

import java.io.Closeable;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import r8.b;
import r8.g;
import y8.l;

/* compiled from: Executors.kt */
public abstract class k1 extends g0 implements Closeable {

    /* renamed from: j  reason: collision with root package name */
    public static final a f14955j = new a((g) null);

    /* compiled from: Executors.kt */
    public static final class a extends b<g0, k1> {

        /* renamed from: i9.k1$a$a  reason: collision with other inner class name */
        /* compiled from: Executors.kt */
        static final class C0254a extends n implements l<g.b, k1> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0254a f14956h = new C0254a();

            C0254a() {
                super(1);
            }

            /* renamed from: a */
            public final k1 invoke(g.b bVar) {
                if (bVar instanceof k1) {
                    return (k1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(g0.f14943i, C0254a.f14956h);
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }
}
