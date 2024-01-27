package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.upstream.g;
import java.io.IOException;
import l5.g;
import m5.e;

public interface HlsPlaylistTracker {

    public static final class PlaylistResetException extends IOException {

        /* renamed from: h  reason: collision with root package name */
        public final Uri f7357h;

        public PlaylistResetException(Uri uri) {
            this.f7357h = uri;
        }
    }

    public static final class PlaylistStuckException extends IOException {

        /* renamed from: h  reason: collision with root package name */
        public final Uri f7358h;

        public PlaylistStuckException(Uri uri) {
            this.f7358h = uri;
        }
    }

    public interface a {
        HlsPlaylistTracker a(g gVar, com.google.android.exoplayer2.upstream.g gVar2, e eVar);
    }

    public interface b {
        void a();

        boolean e(Uri uri, g.c cVar, boolean z10);
    }

    public interface c {
        void b(d dVar);
    }

    boolean a(Uri uri);

    void b(b bVar);

    void c(Uri uri);

    long d();

    boolean e();

    boolean f(Uri uri, long j10);

    c g();

    void h(Uri uri, l.a aVar, c cVar);

    void i();

    void j(Uri uri);

    void m(b bVar);

    d n(Uri uri, boolean z10);

    void stop();
}
