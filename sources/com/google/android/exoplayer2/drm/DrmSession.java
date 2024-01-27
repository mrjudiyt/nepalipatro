package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.i;
import j4.p;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

public interface DrmSession {

    public static class DrmSessionException extends IOException {

        /* renamed from: h  reason: collision with root package name */
        public final int f6548h;

        public DrmSessionException(Throwable th, int i10) {
            super(th);
            this.f6548h = i10;
        }
    }

    void a(i.a aVar);

    void b(i.a aVar);

    UUID c();

    int d();

    boolean e();

    Map<String, String> f();

    p g();

    DrmSessionException h();
}
