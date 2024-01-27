package g5;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.b;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: LoadEventInfo */
public final class h {

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicLong f8885h = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    public final long f8886a;

    /* renamed from: b  reason: collision with root package name */
    public final b f8887b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f8888c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, List<String>> f8889d;

    /* renamed from: e  reason: collision with root package name */
    public final long f8890e;

    /* renamed from: f  reason: collision with root package name */
    public final long f8891f;

    /* renamed from: g  reason: collision with root package name */
    public final long f8892g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(long r13, com.google.android.exoplayer2.upstream.b r15, long r16) {
        /*
            r12 = this;
            r3 = r15
            android.net.Uri r4 = r3.f7699a
            java.util.Map r5 = java.util.Collections.emptyMap()
            r8 = 0
            r10 = 0
            r0 = r12
            r1 = r13
            r6 = r16
            r0.<init>(r1, r3, r4, r5, r6, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.h.<init>(long, com.google.android.exoplayer2.upstream.b, long):void");
    }

    public static long a() {
        return f8885h.getAndIncrement();
    }

    public h(long j10, b bVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f8886a = j10;
        this.f8887b = bVar;
        this.f8888c = uri;
        this.f8889d = map;
        this.f8890e = j11;
        this.f8891f = j12;
        this.f8892g = j13;
    }
}
