package com.google.android.exoplayer2.upstream;

import g5.h;
import g5.i;
import java.io.IOException;

/* compiled from: LoadErrorHandlingPolicy */
public interface g {

    /* compiled from: LoadErrorHandlingPolicy */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f7758a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7759b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7760c;

        /* renamed from: d  reason: collision with root package name */
        public final int f7761d;

        public a(int i10, int i11, int i12, int i13) {
            this.f7758a = i10;
            this.f7759b = i11;
            this.f7760c = i12;
            this.f7761d = i13;
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(int r4) {
            /*
                r3 = this;
                r0 = 0
                r1 = 1
                if (r4 != r1) goto L_0x000c
                int r4 = r3.f7758a
                int r2 = r3.f7759b
                int r4 = r4 - r2
                if (r4 <= r1) goto L_0x0014
                goto L_0x0013
            L_0x000c:
                int r4 = r3.f7760c
                int r2 = r3.f7761d
                int r4 = r4 - r2
                if (r4 <= r1) goto L_0x0014
            L_0x0013:
                r0 = 1
            L_0x0014:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.g.a.a(int):boolean");
        }
    }

    /* compiled from: LoadErrorHandlingPolicy */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f7762a;

        /* renamed from: b  reason: collision with root package name */
        public final long f7763b;

        public b(int i10, long j10) {
            a6.a.a(j10 >= 0);
            this.f7762a = i10;
            this.f7763b = j10;
        }
    }

    /* compiled from: LoadErrorHandlingPolicy */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final h f7764a;

        /* renamed from: b  reason: collision with root package name */
        public final i f7765b;

        /* renamed from: c  reason: collision with root package name */
        public final IOException f7766c;

        /* renamed from: d  reason: collision with root package name */
        public final int f7767d;

        public c(h hVar, i iVar, IOException iOException, int i10) {
            this.f7764a = hVar;
            this.f7765b = iVar;
            this.f7766c = iOException;
            this.f7767d = i10;
        }
    }

    long a(c cVar);

    b b(a aVar, c cVar);

    void c(long j10);

    int d(int i10);
}
