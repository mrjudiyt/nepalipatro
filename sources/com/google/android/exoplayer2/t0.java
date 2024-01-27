package com.google.android.exoplayer2;

import a6.i;
import b6.y;
import e4.m;
import g5.w;
import java.util.List;
import o5.j;
import y5.l;

/* compiled from: Player */
public interface t0 {

    /* compiled from: Player */
    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final b f7607b = new a().e();

        /* renamed from: c  reason: collision with root package name */
        public static final e4.b<b> f7608c = y.f5134a;
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final i f7609a;

        /* compiled from: Player */
        public static final class a {

            /* renamed from: b  reason: collision with root package name */
            private static final int[] f7610b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};

            /* renamed from: a  reason: collision with root package name */
            private final i.b f7611a = new i.b();

            public a a(int i10) {
                this.f7611a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f7611a.b(bVar.f7609a);
                return this;
            }

            public a c(int... iArr) {
                this.f7611a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f7611a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f7611a.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return this.f7609a.equals(((b) obj).f7609a);
        }

        public int hashCode() {
            return this.f7609a.hashCode();
        }

        private b(i iVar) {
            this.f7609a = iVar;
        }
    }

    @Deprecated
    /* compiled from: Player */
    public interface c {
        void B(w wVar, l lVar);

        void D(k0 k0Var);

        void H(boolean z10);

        void J(t0 t0Var, d dVar);

        @Deprecated
        void O(boolean z10, int i10);

        void V(j0 j0Var, int i10);

        void b(m mVar);

        void c0(boolean z10, int i10);

        void d(int i10);

        void f(f fVar, f fVar2, int i10);

        void g(int i10);

        @Deprecated
        void h(boolean z10);

        @Deprecated
        void i(int i10);

        void j0(PlaybackException playbackException);

        @Deprecated
        void m(List<x4.a> list);

        void o0(boolean z10);

        void q(boolean z10);

        @Deprecated
        void r();

        void s(PlaybackException playbackException);

        void t(b bVar);

        void v(a1 a1Var, int i10);

        void x(int i10);
    }

    /* compiled from: Player */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final i f7612a;

        public d(i iVar) {
            this.f7612a = iVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return this.f7612a.equals(((d) obj).f7612a);
        }

        public int hashCode() {
            return this.f7612a.hashCode();
        }
    }

    /* compiled from: Player */
    public interface e extends b6.l, g4.f, j, x4.f, i4.b, c {
    }

    /* compiled from: Player */
    public static final class f {

        /* renamed from: i  reason: collision with root package name */
        public static final e4.b<f> f7613i = y.f5134a;

        /* renamed from: a  reason: collision with root package name */
        public final Object f7614a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7615b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f7616c;

        /* renamed from: d  reason: collision with root package name */
        public final int f7617d;

        /* renamed from: e  reason: collision with root package name */
        public final long f7618e;

        /* renamed from: f  reason: collision with root package name */
        public final long f7619f;

        /* renamed from: g  reason: collision with root package name */
        public final int f7620g;

        /* renamed from: h  reason: collision with root package name */
        public final int f7621h;

        public f(Object obj, int i10, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f7614a = obj;
            this.f7615b = i10;
            this.f7616c = obj2;
            this.f7617d = i11;
            this.f7618e = j10;
            this.f7619f = j11;
            this.f7620g = i12;
            this.f7621h = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            if (this.f7615b == fVar.f7615b && this.f7617d == fVar.f7617d && this.f7618e == fVar.f7618e && this.f7619f == fVar.f7619f && this.f7620g == fVar.f7620g && this.f7621h == fVar.f7621h && l6.l.a(this.f7614a, fVar.f7614a) && l6.l.a(this.f7616c, fVar.f7616c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return l6.l.b(this.f7614a, Integer.valueOf(this.f7615b), this.f7616c, Integer.valueOf(this.f7617d), Integer.valueOf(this.f7615b), Long.valueOf(this.f7618e), Long.valueOf(this.f7619f), Integer.valueOf(this.f7620g), Integer.valueOf(this.f7621h));
        }
    }

    boolean a();

    long b();

    void c(int i10, long j10);

    @Deprecated
    void d(boolean z10);

    int e();

    int f();

    int g();

    int h();

    long i();

    int j();

    a1 k();

    boolean l();

    long m();
}
