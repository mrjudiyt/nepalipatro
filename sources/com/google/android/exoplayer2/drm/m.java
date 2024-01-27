package com.google.android.exoplayer2.drm;

import a6.a;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.i;
import e4.c;
import j4.p;
import java.util.Map;
import java.util.UUID;

/* compiled from: ErrorStateDrmSession */
public final class m implements DrmSession {

    /* renamed from: a  reason: collision with root package name */
    private final DrmSession.DrmSessionException f6582a;

    public m(DrmSession.DrmSessionException drmSessionException) {
        this.f6582a = (DrmSession.DrmSessionException) a.e(drmSessionException);
    }

    public void a(i.a aVar) {
    }

    public void b(i.a aVar) {
    }

    public final UUID c() {
        return c.f8045a;
    }

    public int d() {
        return 1;
    }

    public boolean e() {
        return false;
    }

    public Map<String, String> f() {
        return null;
    }

    public p g() {
        return null;
    }

    public DrmSession.DrmSessionException h() {
        return this.f6582a;
    }
}
