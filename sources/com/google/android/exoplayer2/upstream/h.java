package com.google.android.exoplayer2.upstream;

import a6.m0;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.b;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import z5.j;
import z5.q;

/* compiled from: ParsingLoadable */
public final class h<T> implements Loader.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f7768a;

    /* renamed from: b  reason: collision with root package name */
    public final b f7769b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7770c;

    /* renamed from: d  reason: collision with root package name */
    private final q f7771d;

    /* renamed from: e  reason: collision with root package name */
    private final a<? extends T> f7772e;

    /* renamed from: f  reason: collision with root package name */
    private volatile T f7773f;

    /* compiled from: ParsingLoadable */
    public interface a<T> {
        T a(Uri uri, InputStream inputStream);
    }

    public h(a aVar, Uri uri, int i10, a<? extends T> aVar2) {
        this(aVar, new b.C0120b().i(uri).b(1).a(), i10, aVar2);
    }

    public long a() {
        return this.f7771d.p();
    }

    public final void b() {
        this.f7771d.s();
        j jVar = new j(this.f7771d, this.f7769b);
        try {
            jVar.h();
            this.f7773f = this.f7772e.a((Uri) a6.a.e(this.f7771d.n()), jVar);
        } finally {
            m0.o(jVar);
        }
    }

    public final void c() {
    }

    public Map<String, List<String>> d() {
        return this.f7771d.r();
    }

    public final T e() {
        return this.f7773f;
    }

    public Uri f() {
        return this.f7771d.q();
    }

    public h(a aVar, b bVar, int i10, a<? extends T> aVar2) {
        this.f7771d = new q(aVar);
        this.f7769b = bVar;
        this.f7770c = i10;
        this.f7772e = aVar2;
        this.f7768a = g5.h.a();
    }
}
