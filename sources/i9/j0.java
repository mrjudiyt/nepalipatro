package i9;

import androidx.privacysandbox.ads.adservices.topics.d;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import r8.g;

@IgnoreJRERequirement
/* compiled from: CoroutineContext.kt */
public final class j0 extends r8.a implements n2<String> {

    /* renamed from: j  reason: collision with root package name */
    public static final a f14950j = new a((g) null);

    /* renamed from: i  reason: collision with root package name */
    private final long f14951i;

    /* compiled from: CoroutineContext.kt */
    public static final class a implements g.c<j0> {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public j0(long j10) {
        super(f14950j);
        this.f14951i = j10;
    }

    public final long K0() {
        return this.f14951i;
    }

    /* renamed from: L0 */
    public void r0(r8.g gVar, String str) {
        Thread.currentThread().setName(str);
    }

    /* renamed from: M0 */
    public String I0(r8.g gVar) {
        String str;
        k0 k0Var = (k0) gVar.h(k0.f14953j);
        if (k0Var == null || (str = k0Var.K0()) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int M = q.M(name, " @", 0, false, 6, (Object) null);
        if (M < 0) {
            M = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + M + 10);
        String substring = name.substring(0, M);
        m.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.f14951i);
        String sb2 = sb.toString();
        m.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && this.f14951i == ((j0) obj).f14951i;
    }

    public int hashCode() {
        return d.a(this.f14951i);
    }

    public String toString() {
        return "CoroutineId(" + this.f14951i + ')';
    }
}
