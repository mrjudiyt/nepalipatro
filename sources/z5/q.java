package z5;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: StatsDataSource */
public final class q implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f13254a;

    /* renamed from: b  reason: collision with root package name */
    private long f13255b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f13256c = Uri.EMPTY;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, List<String>> f13257d = Collections.emptyMap();

    public q(a aVar) {
        this.f13254a = (a) a6.a.e(aVar);
    }

    public void c(r rVar) {
        a6.a.e(rVar);
        this.f13254a.c(rVar);
    }

    public void close() {
        this.f13254a.close();
    }

    public long h(b bVar) {
        this.f13256c = bVar.f7699a;
        this.f13257d = Collections.emptyMap();
        long h10 = this.f13254a.h(bVar);
        this.f13256c = (Uri) a6.a.e(n());
        this.f13257d = j();
        return h10;
    }

    public Map<String, List<String>> j() {
        return this.f13254a.j();
    }

    public Uri n() {
        return this.f13254a.n();
    }

    public long p() {
        return this.f13255b;
    }

    public Uri q() {
        return this.f13256c;
    }

    public Map<String, List<String>> r() {
        return this.f13257d;
    }

    public int read(byte[] bArr, int i10, int i11) {
        int read = this.f13254a.read(bArr, i10, i11);
        if (read != -1) {
            this.f13255b += (long) read;
        }
        return read;
    }

    public void s() {
        this.f13255b = 0;
    }
}
