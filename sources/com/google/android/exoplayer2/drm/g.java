package com.google.android.exoplayer2.drm;

import a6.a;
import a6.m0;
import android.net.Uri;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.j0;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.e;
import j4.o;
import java.util.Map;
import n6.d;

/* compiled from: DefaultDrmSessionManagerProvider */
public final class g implements o {

    /* renamed from: a  reason: collision with root package name */
    private final Object f6560a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private j0.e f6561b;

    /* renamed from: c  reason: collision with root package name */
    private j f6562c;

    /* renamed from: d  reason: collision with root package name */
    private HttpDataSource.a f6563d;

    /* renamed from: e  reason: collision with root package name */
    private String f6564e;

    private j b(j0.e eVar) {
        HttpDataSource.a aVar = this.f6563d;
        if (aVar == null) {
            aVar = new e.b().d(this.f6564e);
        }
        Uri uri = eVar.f6783b;
        p pVar = new p(uri == null ? null : uri.toString(), eVar.f6787f, aVar);
        for (Map.Entry next : eVar.f6784c.entrySet()) {
            pVar.e((String) next.getKey(), (String) next.getValue());
        }
        DefaultDrmSessionManager a10 = new DefaultDrmSessionManager.b().e(eVar.f6782a, o.f6588d).b(eVar.f6785d).c(eVar.f6786e).d(d.k(eVar.f6788g)).a(pVar);
        a10.D(0, eVar.a());
        return a10;
    }

    public j a(j0 j0Var) {
        j jVar;
        a.e(j0Var.f6744b);
        j0.e eVar = j0Var.f6744b.f6799c;
        if (eVar == null || m0.f205a < 18) {
            return j.f6579a;
        }
        synchronized (this.f6560a) {
            if (!m0.c(eVar, this.f6561b)) {
                this.f6561b = eVar;
                this.f6562c = b(eVar);
            }
            jVar = (j) a.e(this.f6562c);
        }
        return jVar;
    }
}
