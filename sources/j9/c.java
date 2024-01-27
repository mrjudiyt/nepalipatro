package j9;

import android.os.Handler;
import android.os.Looper;
import i9.a1;
import i9.x1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: HandlerDispatcher.kt */
public final class c extends d {
    private volatile c _immediate;

    /* renamed from: j  reason: collision with root package name */
    private final Handler f15424j;

    /* renamed from: k  reason: collision with root package name */
    private final String f15425k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f15426l;

    /* renamed from: m  reason: collision with root package name */
    private final c f15427m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Handler handler, String str, boolean z10) {
        super((g) null);
        c cVar = null;
        this.f15424j = handler;
        this.f15425k = str;
        this.f15426l = z10;
        this._immediate = z10 ? this : cVar;
        c cVar2 = this._immediate;
        if (cVar2 == null) {
            cVar2 = new c(handler, str, true);
            this._immediate = cVar2;
        }
        this.f15427m = cVar2;
    }

    private final void P0(r8.g gVar, Runnable runnable) {
        x1.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        a1.b().K0(gVar, runnable);
    }

    public void K0(r8.g gVar, Runnable runnable) {
        if (!this.f15424j.post(runnable)) {
            P0(gVar, runnable);
        }
    }

    public boolean L0(r8.g gVar) {
        return !this.f15426l || !m.a(Looper.myLooper(), this.f15424j.getLooper());
    }

    /* renamed from: Q0 */
    public c N0() {
        return this.f15427m;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f15424j == this.f15424j;
    }

    public int hashCode() {
        return System.identityHashCode(this.f15424j);
    }

    public String toString() {
        String O0 = O0();
        if (O0 != null) {
            return O0;
        }
        String str = this.f15425k;
        if (str == null) {
            str = this.f15424j.toString();
        }
        if (!this.f15426l) {
            return str;
        }
        return str + ".immediate";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Handler handler, String str, int i10, g gVar) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public c(Handler handler, String str) {
        this(handler, str, false);
    }
}
