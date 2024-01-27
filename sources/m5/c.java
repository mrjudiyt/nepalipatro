package m5;

import com.google.android.exoplayer2.source.hls.playlist.d;
import com.google.android.exoplayer2.upstream.h;
import f5.b;
import java.util.List;

/* compiled from: FilteringHlsPlaylistParserFactory */
public final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    private final e f10235a;

    /* renamed from: b  reason: collision with root package name */
    private final List<f5.c> f10236b;

    public c(e eVar, List<f5.c> list) {
        this.f10235a = eVar;
        this.f10236b = list;
    }

    public h.a<d> a(com.google.android.exoplayer2.source.hls.playlist.c cVar, d dVar) {
        return new b(this.f10235a.a(cVar, dVar), this.f10236b);
    }

    public h.a<d> b() {
        return new b(this.f10235a.b(), this.f10236b);
    }
}
