package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DataSpec */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f7699a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7700b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7701c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f7702d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, String> f7703e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public final long f7704f;

    /* renamed from: g  reason: collision with root package name */
    public final long f7705g;

    /* renamed from: h  reason: collision with root package name */
    public final long f7706h;

    /* renamed from: i  reason: collision with root package name */
    public final String f7707i;

    /* renamed from: j  reason: collision with root package name */
    public final int f7708j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f7709k;

    /* renamed from: com.google.android.exoplayer2.upstream.b$b  reason: collision with other inner class name */
    /* compiled from: DataSpec */
    public static final class C0120b {

        /* renamed from: a  reason: collision with root package name */
        private Uri f7710a;

        /* renamed from: b  reason: collision with root package name */
        private long f7711b;

        /* renamed from: c  reason: collision with root package name */
        private int f7712c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f7713d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, String> f7714e;

        /* renamed from: f  reason: collision with root package name */
        private long f7715f;

        /* renamed from: g  reason: collision with root package name */
        private long f7716g;

        /* renamed from: h  reason: collision with root package name */
        private String f7717h;

        /* renamed from: i  reason: collision with root package name */
        private int f7718i;

        /* renamed from: j  reason: collision with root package name */
        private Object f7719j;

        public b a() {
            a6.a.i(this.f7710a, "The uri must be set.");
            return new b(this.f7710a, this.f7711b, this.f7712c, this.f7713d, this.f7714e, this.f7715f, this.f7716g, this.f7717h, this.f7718i, this.f7719j);
        }

        public C0120b b(int i10) {
            this.f7718i = i10;
            return this;
        }

        public C0120b c(byte[] bArr) {
            this.f7713d = bArr;
            return this;
        }

        public C0120b d(int i10) {
            this.f7712c = i10;
            return this;
        }

        public C0120b e(Map<String, String> map) {
            this.f7714e = map;
            return this;
        }

        public C0120b f(String str) {
            this.f7717h = str;
            return this;
        }

        public C0120b g(long j10) {
            this.f7716g = j10;
            return this;
        }

        public C0120b h(long j10) {
            this.f7715f = j10;
            return this;
        }

        public C0120b i(Uri uri) {
            this.f7710a = uri;
            return this;
        }

        public C0120b j(String str) {
            this.f7710a = Uri.parse(str);
            return this;
        }

        public C0120b() {
            this.f7712c = 1;
            this.f7714e = Collections.emptyMap();
            this.f7716g = -1;
        }

        private C0120b(b bVar) {
            this.f7710a = bVar.f7699a;
            this.f7711b = bVar.f7700b;
            this.f7712c = bVar.f7701c;
            this.f7713d = bVar.f7702d;
            this.f7714e = bVar.f7703e;
            this.f7715f = bVar.f7705g;
            this.f7716g = bVar.f7706h;
            this.f7717h = bVar.f7707i;
            this.f7718i = bVar.f7708j;
            this.f7719j = bVar.f7709k;
        }
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public C0120b a() {
        return new C0120b();
    }

    public final String b() {
        return c(this.f7701c);
    }

    public boolean d(int i10) {
        return (this.f7708j & i10) == i10;
    }

    public b e(long j10) {
        long j11 = this.f7706h;
        long j12 = -1;
        if (j11 != -1) {
            j12 = j11 - j10;
        }
        return f(j10, j12);
    }

    public b f(long j10, long j11) {
        if (j10 == 0 && this.f7706h == j11) {
            return this;
        }
        return new b(this.f7699a, this.f7700b, this.f7701c, this.f7702d, this.f7703e, this.f7705g + j10, j11, this.f7707i, this.f7708j, this.f7709k);
    }

    public String toString() {
        String b10 = b();
        String valueOf = String.valueOf(this.f7699a);
        long j10 = this.f7705g;
        long j11 = this.f7706h;
        String str = this.f7707i;
        int i10 = this.f7708j;
        StringBuilder sb = new StringBuilder(String.valueOf(b10).length() + 70 + valueOf.length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(b10);
        sb.append(" ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(j10);
        sb.append(", ");
        sb.append(j11);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i10);
        sb.append("]");
        return sb.toString();
    }

    public b(Uri uri, long j10, long j11) {
        this(uri, 0, 1, (byte[]) null, Collections.emptyMap(), j10, j11, (String) null, 0, (Object) null);
    }

    private b(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        long j13 = j10;
        byte[] bArr2 = bArr;
        long j14 = j11;
        long j15 = j12;
        long j16 = j13 + j14;
        boolean z10 = true;
        a6.a.a(j16 >= 0);
        a6.a.a(j14 >= 0);
        if (j15 <= 0 && j15 != -1) {
            z10 = false;
        }
        a6.a.a(z10);
        this.f7699a = uri;
        this.f7700b = j13;
        this.f7701c = i10;
        this.f7702d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f7703e = Collections.unmodifiableMap(new HashMap(map));
        this.f7705g = j14;
        this.f7704f = j16;
        this.f7706h = j15;
        this.f7707i = str;
        this.f7708j = i11;
        this.f7709k = obj;
    }
}
