package m5;

import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.source.hls.playlist.d;
import com.google.android.exoplayer2.upstream.h;

/* compiled from: DefaultHlsPlaylistParserFactory */
public final class a implements e {
    public h.a<d> a(c cVar, d dVar) {
        return new HlsPlaylistParser(cVar, dVar);
    }

    public h.a<d> b() {
        return new HlsPlaylistParser();
    }
}
