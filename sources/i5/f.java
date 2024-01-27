package i5;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import e4.j;
import g5.h;
import java.util.List;
import java.util.Map;
import z5.q;

/* compiled from: Chunk */
public abstract class f implements Loader.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f9307a = h.a();

    /* renamed from: b  reason: collision with root package name */
    public final b f9308b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9309c;

    /* renamed from: d  reason: collision with root package name */
    public final j f9310d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9311e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f9312f;

    /* renamed from: g  reason: collision with root package name */
    public final long f9313g;

    /* renamed from: h  reason: collision with root package name */
    public final long f9314h;

    /* renamed from: i  reason: collision with root package name */
    protected final q f9315i;

    public f(a aVar, b bVar, int i10, j jVar, int i11, Object obj, long j10, long j11) {
        this.f9315i = new q(aVar);
        this.f9308b = (b) a6.a.e(bVar);
        this.f9309c = i10;
        this.f9310d = jVar;
        this.f9311e = i11;
        this.f9312f = obj;
        this.f9313g = j10;
        this.f9314h = j11;
    }

    public final long a() {
        return this.f9315i.p();
    }

    public final long d() {
        return this.f9314h - this.f9313g;
    }

    public final Map<String, List<String>> e() {
        return this.f9315i.r();
    }

    public final Uri f() {
        return this.f9315i.q();
    }
}
