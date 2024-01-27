package o5;

import a6.a;
import h4.f;
import java.util.List;

/* compiled from: SubtitleOutputBuffer */
public abstract class i extends f implements e {

    /* renamed from: k  reason: collision with root package name */
    private e f10434k;

    /* renamed from: l  reason: collision with root package name */
    private long f10435l;

    public int a(long j10) {
        return ((e) a.e(this.f10434k)).a(j10 - this.f10435l);
    }

    public long d(int i10) {
        return ((e) a.e(this.f10434k)).d(i10) + this.f10435l;
    }

    public List<a> e(long j10) {
        return ((e) a.e(this.f10434k)).e(j10 - this.f10435l);
    }

    public int f() {
        return ((e) a.e(this.f10434k)).f();
    }

    public void k() {
        super.k();
        this.f10434k = null;
    }

    public void t(long j10, e eVar, long j11) {
        this.f8970i = j10;
        this.f10434k = eVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f10435l = j10;
    }
}
