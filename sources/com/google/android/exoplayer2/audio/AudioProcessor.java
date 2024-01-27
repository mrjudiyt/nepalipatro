package com.google.android.exoplayer2.audio;

import a6.m0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface AudioProcessor {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f6262a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledAudioFormatException extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public UnhandledAudioFormatException(com.google.android.exoplayer2.audio.AudioProcessor.a r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                int r0 = r0 + 18
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Unhandled format: "
                r1.append(r0)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException.<init>(com.google.android.exoplayer2.audio.AudioProcessor$a):void");
        }
    }

    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f6263e = new a(-1, -1, -1);

        /* renamed from: a  reason: collision with root package name */
        public final int f6264a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6265b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6266c;

        /* renamed from: d  reason: collision with root package name */
        public final int f6267d;

        public a(int i10, int i11, int i12) {
            this.f6264a = i10;
            this.f6265b = i11;
            this.f6266c = i12;
            this.f6267d = m0.j0(i12) ? m0.Y(i12, i11) : -1;
        }

        public String toString() {
            int i10 = this.f6264a;
            int i11 = this.f6265b;
            int i12 = this.f6266c;
            StringBuilder sb = new StringBuilder(83);
            sb.append("AudioFormat[sampleRate=");
            sb.append(i10);
            sb.append(", channelCount=");
            sb.append(i11);
            sb.append(", encoding=");
            sb.append(i12);
            sb.append(']');
            return sb.toString();
        }
    }

    boolean a();

    ByteBuffer b();

    boolean c();

    void d(ByteBuffer byteBuffer);

    a e(a aVar);

    void f();

    void flush();

    void reset();
}
