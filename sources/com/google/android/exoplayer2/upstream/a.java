package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import z5.g;
import z5.r;

/* compiled from: DataSource */
public interface a extends g {

    /* renamed from: com.google.android.exoplayer2.upstream.a$a  reason: collision with other inner class name */
    /* compiled from: DataSource */
    public interface C0119a {
        a a();
    }

    void c(r rVar);

    void close();

    long h(b bVar);

    Map<String, List<String>> j();

    Uri n();
}
