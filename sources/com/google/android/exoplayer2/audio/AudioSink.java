package com.google.android.exoplayer2.audio;

import e4.j;
import e4.m;
import g4.d;
import g4.r;
import java.nio.ByteBuffer;

public interface AudioSink {

    public static final class InitializationException extends Exception {

        /* renamed from: h  reason: collision with root package name */
        public final int f6269h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f6270i;

        /* renamed from: j  reason: collision with root package name */
        public final j f6271j;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public InitializationException(int r4, int r5, int r6, int r7, e4.j r8, boolean r9, java.lang.Exception r10) {
            /*
                r3 = this;
                if (r9 == 0) goto L_0x0005
                java.lang.String r0 = " (recoverable)"
                goto L_0x0007
            L_0x0005:
                java.lang.String r0 = ""
            L_0x0007:
                int r1 = r0.length()
                int r1 = r1 + 80
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "AudioTrack init failed "
                r2.append(r1)
                r2.append(r4)
                java.lang.String r1 = " "
                r2.append(r1)
                java.lang.String r1 = "Config("
                r2.append(r1)
                r2.append(r5)
                java.lang.String r5 = ", "
                r2.append(r5)
                r2.append(r6)
                r2.append(r5)
                r2.append(r7)
                java.lang.String r5 = ")"
                r2.append(r5)
                r2.append(r0)
                java.lang.String r5 = r2.toString()
                r3.<init>(r5, r10)
                r3.f6269h = r4
                r3.f6270i = r9
                r3.f6271j = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioSink.InitializationException.<init>(int, int, int, int, e4.j, boolean, java.lang.Exception):void");
        }
    }

    public static final class UnexpectedDiscontinuityException extends Exception {

        /* renamed from: h  reason: collision with root package name */
        public final long f6272h;

        /* renamed from: i  reason: collision with root package name */
        public final long f6273i;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public UnexpectedDiscontinuityException(long r3, long r5) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 103(0x67, float:1.44E-43)
                r0.<init>(r1)
                java.lang.String r1 = "Unexpected audio track timestamp discontinuity: expected "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r1 = ", got "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.f6272h = r3
                r2.f6273i = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioSink.UnexpectedDiscontinuityException.<init>(long, long):void");
        }
    }

    public static final class WriteException extends Exception {

        /* renamed from: h  reason: collision with root package name */
        public final int f6274h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f6275i;

        /* renamed from: j  reason: collision with root package name */
        public final j f6276j;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public WriteException(int r3, e4.j r4, boolean r5) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 36
                r0.<init>(r1)
                java.lang.String r1 = "AudioTrack write failed: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.f6275i = r5
                r2.f6274h = r3
                r2.f6276j = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioSink.WriteException.<init>(int, e4.j, boolean):void");
        }
    }

    public interface a {
        void a(boolean z10);

        void b(long j10);

        void c(Exception exc);

        void d(int i10, long j10, long j11);

        void e(long j10);

        void f();

        void g();
    }

    boolean a(j jVar);

    void b();

    boolean c();

    boolean d();

    void e();

    void f(int i10);

    void flush();

    void g(m mVar);

    long h(boolean z10);

    m i();

    void j();

    void k(d dVar);

    void l();

    void m();

    int n(j jVar);

    void o(r rVar);

    void p(j jVar, int i10, int[] iArr);

    void pause();

    boolean q(ByteBuffer byteBuffer, long j10, int i10);

    void r(a aVar);

    void reset();

    void s();

    void setVolume(float f10);

    void t(boolean z10);

    public static final class ConfigurationException extends Exception {

        /* renamed from: h  reason: collision with root package name */
        public final j f6268h;

        public ConfigurationException(Throwable th, j jVar) {
            super(th);
            this.f6268h = jVar;
        }

        public ConfigurationException(String str, j jVar) {
            super(str);
            this.f6268h = jVar;
        }
    }
}
