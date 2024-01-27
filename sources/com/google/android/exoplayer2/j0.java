package com.google.android.exoplayer2;

import a6.m0;
import android.net.Uri;
import b6.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: MediaItem */
public final class j0 {

    /* renamed from: f  reason: collision with root package name */
    public static final j0 f6741f = new c().a();

    /* renamed from: g  reason: collision with root package name */
    public static final e4.b<j0> f6742g = y.f5134a;

    /* renamed from: a  reason: collision with root package name */
    public final String f6743a;

    /* renamed from: b  reason: collision with root package name */
    public final g f6744b;

    /* renamed from: c  reason: collision with root package name */
    public final f f6745c;

    /* renamed from: d  reason: collision with root package name */
    public final k0 f6746d;

    /* renamed from: e  reason: collision with root package name */
    public final d f6747e;

    /* compiled from: MediaItem */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f6748a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f6749b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f6748a.equals(bVar.f6748a) || !m0.c(this.f6749b, bVar.f6749b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f6748a.hashCode() * 31;
            Object obj = this.f6749b;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }

        private b(Uri uri, Object obj) {
            this.f6748a = uri;
            this.f6749b = obj;
        }
    }

    /* compiled from: MediaItem */
    public static final class c {
        private float A;
        private float B;

        /* renamed from: a  reason: collision with root package name */
        private String f6750a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f6751b;

        /* renamed from: c  reason: collision with root package name */
        private String f6752c;

        /* renamed from: d  reason: collision with root package name */
        private long f6753d;

        /* renamed from: e  reason: collision with root package name */
        private long f6754e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f6755f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f6756g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f6757h;

        /* renamed from: i  reason: collision with root package name */
        private Uri f6758i;

        /* renamed from: j  reason: collision with root package name */
        private Map<String, String> f6759j;

        /* renamed from: k  reason: collision with root package name */
        private UUID f6760k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f6761l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f6762m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f6763n;

        /* renamed from: o  reason: collision with root package name */
        private List<Integer> f6764o;

        /* renamed from: p  reason: collision with root package name */
        private byte[] f6765p;

        /* renamed from: q  reason: collision with root package name */
        private List<f5.c> f6766q;

        /* renamed from: r  reason: collision with root package name */
        private String f6767r;

        /* renamed from: s  reason: collision with root package name */
        private List<Object> f6768s;

        /* renamed from: t  reason: collision with root package name */
        private Uri f6769t;

        /* renamed from: u  reason: collision with root package name */
        private Object f6770u;

        /* renamed from: v  reason: collision with root package name */
        private Object f6771v;

        /* renamed from: w  reason: collision with root package name */
        private k0 f6772w;

        /* renamed from: x  reason: collision with root package name */
        private long f6773x;

        /* renamed from: y  reason: collision with root package name */
        private long f6774y;

        /* renamed from: z  reason: collision with root package name */
        private long f6775z;

        public j0 a() {
            g gVar;
            a6.a.f(this.f6758i == null || this.f6760k != null);
            Uri uri = this.f6751b;
            if (uri != null) {
                String str = this.f6752c;
                UUID uuid = this.f6760k;
                e eVar = uuid != null ? new e(uuid, this.f6758i, this.f6759j, this.f6761l, this.f6763n, this.f6762m, this.f6764o, this.f6765p) : null;
                Uri uri2 = this.f6769t;
                gVar = new g(uri, str, eVar, uri2 != null ? new b(uri2, this.f6770u) : null, this.f6766q, this.f6767r, this.f6768s, this.f6771v);
            } else {
                gVar = null;
            }
            String str2 = this.f6750a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            d dVar = new d(this.f6753d, this.f6754e, this.f6755f, this.f6756g, this.f6757h);
            f fVar = new f(this.f6773x, this.f6774y, this.f6775z, this.A, this.B);
            k0 k0Var = this.f6772w;
            if (k0Var == null) {
                k0Var = k0.G;
            }
            return new j0(str3, dVar, gVar, fVar, k0Var);
        }

        public c b(String str) {
            this.f6767r = str;
            return this;
        }

        public c c(long j10) {
            this.f6773x = j10;
            return this;
        }

        public c d(String str) {
            this.f6750a = (String) a6.a.e(str);
            return this;
        }

        public c e(String str) {
            this.f6752c = str;
            return this;
        }

        public c f(List<f5.c> list) {
            List<f5.c> list2;
            if (list == null || list.isEmpty()) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(new ArrayList(list));
            }
            this.f6766q = list2;
            return this;
        }

        public c g(Object obj) {
            this.f6771v = obj;
            return this;
        }

        public c h(Uri uri) {
            this.f6751b = uri;
            return this;
        }

        public c() {
            this.f6754e = Long.MIN_VALUE;
            this.f6764o = Collections.emptyList();
            this.f6759j = Collections.emptyMap();
            this.f6766q = Collections.emptyList();
            this.f6768s = Collections.emptyList();
            this.f6773x = -9223372036854775807L;
            this.f6774y = -9223372036854775807L;
            this.f6775z = -9223372036854775807L;
            this.A = -3.4028235E38f;
            this.B = -3.4028235E38f;
        }

        private c(j0 j0Var) {
            this();
            d dVar = j0Var.f6747e;
            this.f6754e = dVar.f6778b;
            this.f6755f = dVar.f6779c;
            this.f6756g = dVar.f6780d;
            this.f6753d = dVar.f6777a;
            this.f6757h = dVar.f6781e;
            this.f6750a = j0Var.f6743a;
            this.f6772w = j0Var.f6746d;
            f fVar = j0Var.f6745c;
            this.f6773x = fVar.f6792a;
            this.f6774y = fVar.f6793b;
            this.f6775z = fVar.f6794c;
            this.A = fVar.f6795d;
            this.B = fVar.f6796e;
            g gVar = j0Var.f6744b;
            if (gVar != null) {
                this.f6767r = gVar.f6802f;
                this.f6752c = gVar.f6798b;
                this.f6751b = gVar.f6797a;
                this.f6766q = gVar.f6801e;
                this.f6768s = gVar.f6803g;
                this.f6771v = gVar.f6804h;
                e eVar = gVar.f6799c;
                if (eVar != null) {
                    this.f6758i = eVar.f6783b;
                    this.f6759j = eVar.f6784c;
                    this.f6761l = eVar.f6785d;
                    this.f6763n = eVar.f6787f;
                    this.f6762m = eVar.f6786e;
                    this.f6764o = eVar.f6788g;
                    this.f6760k = eVar.f6782a;
                    this.f6765p = eVar.a();
                }
                b bVar = gVar.f6800d;
                if (bVar != null) {
                    this.f6769t = bVar.f6748a;
                    this.f6770u = bVar.f6749b;
                }
            }
        }
    }

    /* compiled from: MediaItem */
    public static final class d {

        /* renamed from: f  reason: collision with root package name */
        public static final e4.b<d> f6776f = y.f5134a;

        /* renamed from: a  reason: collision with root package name */
        public final long f6777a;

        /* renamed from: b  reason: collision with root package name */
        public final long f6778b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f6779c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f6780d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f6781e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f6777a == dVar.f6777a && this.f6778b == dVar.f6778b && this.f6779c == dVar.f6779c && this.f6780d == dVar.f6780d && this.f6781e == dVar.f6781e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f6777a;
            long j11 = this.f6778b;
            return (((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f6779c ? 1 : 0)) * 31) + (this.f6780d ? 1 : 0)) * 31) + (this.f6781e ? 1 : 0);
        }

        private d(long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f6777a = j10;
            this.f6778b = j11;
            this.f6779c = z10;
            this.f6780d = z11;
            this.f6781e = z12;
        }
    }

    /* compiled from: MediaItem */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f6782a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f6783b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<String, String> f6784c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f6785d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f6786e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f6787f;

        /* renamed from: g  reason: collision with root package name */
        public final List<Integer> f6788g;

        /* renamed from: h  reason: collision with root package name */
        private final byte[] f6789h;

        public byte[] a() {
            byte[] bArr = this.f6789h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (!this.f6782a.equals(eVar.f6782a) || !m0.c(this.f6783b, eVar.f6783b) || !m0.c(this.f6784c, eVar.f6784c) || this.f6785d != eVar.f6785d || this.f6787f != eVar.f6787f || this.f6786e != eVar.f6786e || !this.f6788g.equals(eVar.f6788g) || !Arrays.equals(this.f6789h, eVar.f6789h)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f6782a.hashCode() * 31;
            Uri uri = this.f6783b;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f6784c.hashCode()) * 31) + (this.f6785d ? 1 : 0)) * 31) + (this.f6787f ? 1 : 0)) * 31) + (this.f6786e ? 1 : 0)) * 31) + this.f6788g.hashCode()) * 31) + Arrays.hashCode(this.f6789h);
        }

        private e(UUID uuid, Uri uri, Map<String, String> map, boolean z10, boolean z11, boolean z12, List<Integer> list, byte[] bArr) {
            a6.a.a(!z11 || uri != null);
            this.f6782a = uuid;
            this.f6783b = uri;
            this.f6784c = map;
            this.f6785d = z10;
            this.f6787f = z11;
            this.f6786e = z12;
            this.f6788g = list;
            this.f6789h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }
    }

    /* compiled from: MediaItem */
    public static final class f {

        /* renamed from: f  reason: collision with root package name */
        public static final f f6790f = new f(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

        /* renamed from: g  reason: collision with root package name */
        public static final e4.b<f> f6791g = y.f5134a;

        /* renamed from: a  reason: collision with root package name */
        public final long f6792a;

        /* renamed from: b  reason: collision with root package name */
        public final long f6793b;

        /* renamed from: c  reason: collision with root package name */
        public final long f6794c;

        /* renamed from: d  reason: collision with root package name */
        public final float f6795d;

        /* renamed from: e  reason: collision with root package name */
        public final float f6796e;

        public f(long j10, long j11, long j12, float f10, float f11) {
            this.f6792a = j10;
            this.f6793b = j11;
            this.f6794c = j12;
            this.f6795d = f10;
            this.f6796e = f11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (this.f6792a == fVar.f6792a && this.f6793b == fVar.f6793b && this.f6794c == fVar.f6794c && this.f6795d == fVar.f6795d && this.f6796e == fVar.f6796e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f6792a;
            long j11 = this.f6793b;
            long j12 = this.f6794c;
            int i10 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            float f10 = this.f6795d;
            int i11 = 0;
            int floatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f6796e;
            if (f11 != 0.0f) {
                i11 = Float.floatToIntBits(f11);
            }
            return floatToIntBits + i11;
        }
    }

    /* compiled from: MediaItem */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f6797a;

        /* renamed from: b  reason: collision with root package name */
        public final String f6798b;

        /* renamed from: c  reason: collision with root package name */
        public final e f6799c;

        /* renamed from: d  reason: collision with root package name */
        public final b f6800d;

        /* renamed from: e  reason: collision with root package name */
        public final List<f5.c> f6801e;

        /* renamed from: f  reason: collision with root package name */
        public final String f6802f;

        /* renamed from: g  reason: collision with root package name */
        public final List<Object> f6803g;

        /* renamed from: h  reason: collision with root package name */
        public final Object f6804h;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (!this.f6797a.equals(gVar.f6797a) || !m0.c(this.f6798b, gVar.f6798b) || !m0.c(this.f6799c, gVar.f6799c) || !m0.c(this.f6800d, gVar.f6800d) || !this.f6801e.equals(gVar.f6801e) || !m0.c(this.f6802f, gVar.f6802f) || !this.f6803g.equals(gVar.f6803g) || !m0.c(this.f6804h, gVar.f6804h)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f6797a.hashCode() * 31;
            String str = this.f6798b;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            e eVar = this.f6799c;
            int hashCode3 = (hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            b bVar = this.f6800d;
            int hashCode4 = (((hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f6801e.hashCode()) * 31;
            String str2 = this.f6802f;
            int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f6803g.hashCode()) * 31;
            Object obj = this.f6804h;
            if (obj != null) {
                i10 = obj.hashCode();
            }
            return hashCode5 + i10;
        }

        private g(Uri uri, String str, e eVar, b bVar, List<f5.c> list, String str2, List<Object> list2, Object obj) {
            this.f6797a = uri;
            this.f6798b = str;
            this.f6799c = eVar;
            this.f6800d = bVar;
            this.f6801e = list;
            this.f6802f = str2;
            this.f6803g = list2;
            this.f6804h = obj;
        }
    }

    public c a() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (!m0.c(this.f6743a, j0Var.f6743a) || !this.f6747e.equals(j0Var.f6747e) || !m0.c(this.f6744b, j0Var.f6744b) || !m0.c(this.f6745c, j0Var.f6745c) || !m0.c(this.f6746d, j0Var.f6746d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.f6743a.hashCode() * 31;
        g gVar = this.f6744b;
        return ((((((hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.f6745c.hashCode()) * 31) + this.f6747e.hashCode()) * 31) + this.f6746d.hashCode();
    }

    private j0(String str, d dVar, g gVar, f fVar, k0 k0Var) {
        this.f6743a = str;
        this.f6744b = gVar;
        this.f6745c = fVar;
        this.f6746d = k0Var;
        this.f6747e = dVar;
    }
}
