package com.google.android.exoplayer2.upstream;

import android.content.Context;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.e;
import z5.r;

/* compiled from: DefaultDataSourceFactory */
public final class d implements a.C0119a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7731a;

    /* renamed from: b  reason: collision with root package name */
    private final r f7732b;

    /* renamed from: c  reason: collision with root package name */
    private final a.C0119a f7733c;

    public d(Context context) {
        this(context, (String) null, (r) null);
    }

    /* renamed from: b */
    public c a() {
        c cVar = new c(this.f7731a, this.f7733c.a());
        r rVar = this.f7732b;
        if (rVar != null) {
            cVar.c(rVar);
        }
        return cVar;
    }

    public d(Context context, String str, r rVar) {
        this(context, rVar, (a.C0119a) new e.b().d(str));
    }

    public d(Context context, a.C0119a aVar) {
        this(context, (r) null, aVar);
    }

    public d(Context context, r rVar, a.C0119a aVar) {
        this.f7731a = context.getApplicationContext();
        this.f7732b = rVar;
        this.f7733c = aVar;
    }
}
