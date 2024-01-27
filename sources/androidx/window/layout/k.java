package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.layout.j;
import com.facebook.share.internal.ShareConstants;
import java.util.Objects;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: HardwareFoldingFeature.kt */
public final class k implements j {

    /* renamed from: d  reason: collision with root package name */
    public static final a f4620d = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final m1.b f4621a;

    /* renamed from: b  reason: collision with root package name */
    private final b f4622b;

    /* renamed from: c  reason: collision with root package name */
    private final j.b f4623c;

    /* compiled from: HardwareFoldingFeature.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(m1.b bVar) {
            m.f(bVar, "bounds");
            boolean z10 = false;
            if ((bVar.d() == 0 && bVar.a() == 0) ? false : true) {
                if (bVar.b() == 0 || bVar.c() == 0) {
                    z10 = true;
                }
                if (!z10) {
                    throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
                }
                return;
            }
            throw new IllegalArgumentException("Bounds must be non zero".toString());
        }
    }

    /* compiled from: HardwareFoldingFeature.kt */
    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final a f4624b = new a((g) null);
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final b f4625c = new b("FOLD");
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final b f4626d = new b("HINGE");

        /* renamed from: a  reason: collision with root package name */
        private final String f4627a;

        /* compiled from: HardwareFoldingFeature.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }

            public final b a() {
                return b.f4625c;
            }

            public final b b() {
                return b.f4626d;
            }
        }

        private b(String str) {
            this.f4627a = str;
        }

        public String toString() {
            return this.f4627a;
        }
    }

    public k(m1.b bVar, b bVar2, j.b bVar3) {
        m.f(bVar, "featureBounds");
        m.f(bVar2, ShareConstants.MEDIA_TYPE);
        m.f(bVar3, "state");
        this.f4621a = bVar;
        this.f4622b = bVar2;
        this.f4623c = bVar3;
        f4620d.a(bVar);
    }

    public Rect a() {
        return this.f4621a.f();
    }

    public j.b d() {
        return this.f4623c;
    }

    public j.a e() {
        if (this.f4621a.d() == 0 || this.f4621a.a() == 0) {
            return j.a.f4613c;
        }
        return j.a.f4614d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m.a(k.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        k kVar = (k) obj;
        return m.a(this.f4621a, kVar.f4621a) && m.a(this.f4622b, kVar.f4622b) && m.a(d(), kVar.d());
    }

    public int hashCode() {
        return (((this.f4621a.hashCode() * 31) + this.f4622b.hashCode()) * 31) + d().hashCode();
    }

    public String toString() {
        return k.class.getSimpleName() + " { " + this.f4621a + ", type=" + this.f4622b + ", state=" + d() + " }";
    }
}
