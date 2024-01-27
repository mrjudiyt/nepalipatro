package y5;

import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.source.k;
import e4.s;
import g5.w;
import z5.e;

/* compiled from: TrackSelector */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    private a f13096a;

    /* renamed from: b  reason: collision with root package name */
    private e f13097b;

    /* compiled from: TrackSelector */
    public interface a {
    }

    /* access modifiers changed from: protected */
    public final e a() {
        return (e) a6.a.e(this.f13097b);
    }

    public final void b(a aVar, e eVar) {
        this.f13096a = aVar;
        this.f13097b = eVar;
    }

    public abstract void c(Object obj);

    public abstract p d(s[] sVarArr, w wVar, k.a aVar, a1 a1Var);
}
