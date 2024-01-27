package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.drm.h;
import com.google.common.collect.f0;
import com.google.common.collect.x;
import com.google.common.collect.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: HlsMediaPlaylist */
public final class d extends m5.d {

    /* renamed from: d  reason: collision with root package name */
    public final int f7410d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7411e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7412f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7413g;

    /* renamed from: h  reason: collision with root package name */
    public final long f7414h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f7415i;

    /* renamed from: j  reason: collision with root package name */
    public final int f7416j;

    /* renamed from: k  reason: collision with root package name */
    public final long f7417k;

    /* renamed from: l  reason: collision with root package name */
    public final int f7418l;

    /* renamed from: m  reason: collision with root package name */
    public final long f7419m;

    /* renamed from: n  reason: collision with root package name */
    public final long f7420n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f7421o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f7422p;

    /* renamed from: q  reason: collision with root package name */
    public final h f7423q;

    /* renamed from: r  reason: collision with root package name */
    public final List<C0117d> f7424r;

    /* renamed from: s  reason: collision with root package name */
    public final List<b> f7425s;

    /* renamed from: t  reason: collision with root package name */
    public final Map<Uri, c> f7426t;

    /* renamed from: u  reason: collision with root package name */
    public final long f7427u;

    /* renamed from: v  reason: collision with root package name */
    public final f f7428v;

    /* compiled from: HlsMediaPlaylist */
    public static final class b extends e {

        /* renamed from: s  reason: collision with root package name */
        public final boolean f7429s;

        /* renamed from: t  reason: collision with root package name */
        public final boolean f7430t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, C0117d dVar, long j10, int i10, long j11, h hVar, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, dVar, j10, i10, j11, hVar, str2, str3, j12, j13, z10);
            this.f7429s = z11;
            this.f7430t = z12;
        }

        public b d(long j10, int i10) {
            int i11 = i10;
            return new b(this.f7436h, this.f7437i, this.f7438j, i11, j10, this.f7441m, this.f7442n, this.f7443o, this.f7444p, this.f7445q, this.f7446r, this.f7429s, this.f7430t);
        }
    }

    /* compiled from: HlsMediaPlaylist */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f7431a;

        /* renamed from: b  reason: collision with root package name */
        public final long f7432b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7433c;

        public c(Uri uri, long j10, int i10) {
            this.f7431a = uri;
            this.f7432b = j10;
            this.f7433c = i10;
        }
    }

    /* compiled from: HlsMediaPlaylist */
    public static class e implements Comparable<Long> {

        /* renamed from: h  reason: collision with root package name */
        public final String f7436h;

        /* renamed from: i  reason: collision with root package name */
        public final C0117d f7437i;

        /* renamed from: j  reason: collision with root package name */
        public final long f7438j;

        /* renamed from: k  reason: collision with root package name */
        public final int f7439k;

        /* renamed from: l  reason: collision with root package name */
        public final long f7440l;

        /* renamed from: m  reason: collision with root package name */
        public final h f7441m;

        /* renamed from: n  reason: collision with root package name */
        public final String f7442n;

        /* renamed from: o  reason: collision with root package name */
        public final String f7443o;

        /* renamed from: p  reason: collision with root package name */
        public final long f7444p;

        /* renamed from: q  reason: collision with root package name */
        public final long f7445q;

        /* renamed from: r  reason: collision with root package name */
        public final boolean f7446r;

        /* renamed from: a */
        public int compareTo(Long l10) {
            if (this.f7440l > l10.longValue()) {
                return 1;
            }
            return this.f7440l < l10.longValue() ? -1 : 0;
        }

        private e(String str, C0117d dVar, long j10, int i10, long j11, h hVar, String str2, String str3, long j12, long j13, boolean z10) {
            this.f7436h = str;
            this.f7437i = dVar;
            this.f7438j = j10;
            this.f7439k = i10;
            this.f7440l = j11;
            this.f7441m = hVar;
            this.f7442n = str2;
            this.f7443o = str3;
            this.f7444p = j12;
            this.f7445q = j13;
            this.f7446r = z10;
        }
    }

    /* compiled from: HlsMediaPlaylist */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final long f7447a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f7448b;

        /* renamed from: c  reason: collision with root package name */
        public final long f7449c;

        /* renamed from: d  reason: collision with root package name */
        public final long f7450d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f7451e;

        public f(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f7447a = j10;
            this.f7448b = z10;
            this.f7449c = j11;
            this.f7450d = j12;
            this.f7451e = z11;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(int i10, String str, List<String> list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, h hVar, List<C0117d> list2, List<b> list3, f fVar, Map<Uri, c> map) {
        super(str, list, z12);
        long j15 = j10;
        String str2 = str;
        List<String> list4 = list;
        this.f7410d = i10;
        this.f7414h = j11;
        this.f7413g = z10;
        this.f7415i = z11;
        this.f7416j = i11;
        this.f7417k = j12;
        this.f7418l = i12;
        this.f7419m = j13;
        this.f7420n = j14;
        this.f7421o = z13;
        this.f7422p = z14;
        this.f7423q = hVar;
        this.f7424r = x.n(list2);
        this.f7425s = x.n(list3);
        this.f7426t = z.c(map);
        if (!list3.isEmpty()) {
            b bVar = (b) f0.c(list3);
            this.f7427u = bVar.f7440l + bVar.f7438j;
        } else if (!list2.isEmpty()) {
            C0117d dVar = (C0117d) f0.c(list2);
            this.f7427u = dVar.f7440l + dVar.f7438j;
        } else {
            this.f7427u = 0;
        }
        long j16 = -9223372036854775807L;
        if (j15 != -9223372036854775807L) {
            if (j15 >= 0) {
                j16 = Math.min(this.f7427u, j10);
            } else {
                j16 = Math.max(0, this.f7427u + j15);
            }
        }
        this.f7411e = j16;
        this.f7412f = j15 >= 0;
        this.f7428v = fVar;
    }

    /* renamed from: b */
    public d a(List<f5.c> list) {
        return this;
    }

    public d c(long j10, int i10) {
        int i11 = this.f7410d;
        return new d(i11, this.f10237a, this.f10238b, this.f7411e, this.f7413g, j10, true, i10, this.f7417k, this.f7418l, this.f7419m, this.f7420n, this.f10239c, this.f7421o, this.f7422p, this.f7423q, this.f7424r, this.f7425s, this.f7428v, this.f7426t);
    }

    public d d() {
        if (this.f7421o) {
            return this;
        }
        d dVar = r2;
        d dVar2 = new d(this.f7410d, this.f10237a, this.f10238b, this.f7411e, this.f7413g, this.f7414h, this.f7415i, this.f7416j, this.f7417k, this.f7418l, this.f7419m, this.f7420n, this.f10239c, true, this.f7422p, this.f7423q, this.f7424r, this.f7425s, this.f7428v, this.f7426t);
        return dVar;
    }

    public long e() {
        return this.f7414h + this.f7427u;
    }

    public boolean f(d dVar) {
        if (dVar == null) {
            return true;
        }
        long j10 = this.f7417k;
        long j11 = dVar.f7417k;
        if (j10 > j11) {
            return true;
        }
        if (j10 < j11) {
            return false;
        }
        int size = this.f7424r.size() - dVar.f7424r.size();
        if (size == 0) {
            int size2 = this.f7425s.size();
            int size3 = dVar.f7425s.size();
            if (size2 > size3) {
                return true;
            }
            if (size2 != size3 || !this.f7421o || dVar.f7421o) {
                return false;
            }
            return true;
        } else if (size > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.d$d  reason: collision with other inner class name */
    /* compiled from: HlsMediaPlaylist */
    public static final class C0117d extends e {

        /* renamed from: s  reason: collision with root package name */
        public final String f7434s;

        /* renamed from: t  reason: collision with root package name */
        public final List<b> f7435t;

        public C0117d(String str, long j10, long j11, String str2, String str3) {
            this(str, (C0117d) null, "", 0, -1, -9223372036854775807L, (h) null, str2, str3, j10, j11, false, x.s());
        }

        public C0117d d(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            long j11 = j10;
            for (int i11 = 0; i11 < this.f7435t.size(); i11++) {
                b bVar = this.f7435t.get(i11);
                arrayList.add(bVar.d(j11, i10));
                j11 += bVar.f7438j;
            }
            int i12 = i10;
            return new C0117d(this.f7436h, this.f7437i, this.f7434s, this.f7438j, i10, j10, this.f7441m, this.f7442n, this.f7443o, this.f7444p, this.f7445q, this.f7446r, arrayList);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0117d(String str, C0117d dVar, String str2, long j10, int i10, long j11, h hVar, String str3, String str4, long j12, long j13, boolean z10, List<b> list) {
            super(str, dVar, j10, i10, j11, hVar, str3, str4, j12, j13, z10);
            this.f7434s = str2;
            this.f7435t = x.n(list);
        }
    }
}
