package com.google.android.exoplayer2.drm;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.b;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class MediaDrmCallbackException extends IOException {

    /* renamed from: h  reason: collision with root package name */
    public final b f6549h;

    /* renamed from: i  reason: collision with root package name */
    public final Uri f6550i;

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, List<String>> f6551j;

    /* renamed from: k  reason: collision with root package name */
    public final long f6552k;

    public MediaDrmCallbackException(b bVar, Uri uri, Map<String, List<String>> map, long j10, Throwable th) {
        super(th);
        this.f6549h = bVar;
        this.f6550i = uri;
        this.f6551j = map;
        this.f6552k = j10;
    }
}
