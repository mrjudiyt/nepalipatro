package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.o;
import e4.j;
import java.nio.ByteBuffer;

/* compiled from: MediaCodecAdapter */
public interface h {

    /* compiled from: MediaCodecAdapter */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final i f6981a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaFormat f6982b;

        /* renamed from: c  reason: collision with root package name */
        public final j f6983c;

        /* renamed from: d  reason: collision with root package name */
        public final Surface f6984d;

        /* renamed from: e  reason: collision with root package name */
        public final MediaCrypto f6985e;

        /* renamed from: f  reason: collision with root package name */
        public final int f6986f;

        public a(i iVar, MediaFormat mediaFormat, j jVar, Surface surface, MediaCrypto mediaCrypto, int i10) {
            this.f6981a = iVar;
            this.f6982b = mediaFormat;
            this.f6983c = jVar;
            this.f6984d = surface;
            this.f6985e = mediaCrypto;
            this.f6986f = i10;
        }
    }

    /* compiled from: MediaCodecAdapter */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f6987a = new o.b();

        h a(a aVar);
    }

    /* compiled from: MediaCodecAdapter */
    public interface c {
        void a(h hVar, long j10, long j11);
    }

    boolean a();

    MediaFormat b();

    void c(Bundle bundle);

    void d(int i10, long j10);

    int e();

    int f(MediaCodec.BufferInfo bufferInfo);

    void flush();

    void g(c cVar, Handler handler);

    void h(int i10, boolean z10);

    void i(int i10);

    ByteBuffer j(int i10);

    void k(Surface surface);

    void l(int i10, int i11, int i12, long j10, int i13);

    ByteBuffer m(int i10);

    void n(int i10, int i11, h4.b bVar, long j10, int i12);

    void release();
}
