package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import e2.f;
import e2.i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: VideoDecoder */
public class y<T> implements i<T, Bitmap> {

    /* renamed from: d  reason: collision with root package name */
    public static final e2.f<Long> f5934d = e2.f.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e  reason: collision with root package name */
    public static final e2.f<Integer> f5935e = e2.f.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f  reason: collision with root package name */
    private static final e f5936f = new e();

    /* renamed from: a  reason: collision with root package name */
    private final f<T> f5937a;

    /* renamed from: b  reason: collision with root package name */
    private final i2.e f5938b;

    /* renamed from: c  reason: collision with root package name */
    private final e f5939c;

    /* compiled from: VideoDecoder */
    class a implements f.b<Long> {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f5940a = ByteBuffer.allocate(8);

        a() {
        }

        /* renamed from: b */
        public void a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f5940a) {
                this.f5940a.position(0);
                messageDigest.update(this.f5940a.putLong(l10.longValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder */
    class b implements f.b<Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f5941a = ByteBuffer.allocate(4);

        b() {
        }

        /* renamed from: b */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f5941a) {
                    this.f5941a.position(0);
                    messageDigest.update(this.f5941a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* compiled from: VideoDecoder */
    private static final class c implements f<AssetFileDescriptor> {
        private c() {
        }

        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* compiled from: VideoDecoder */
    static final class d implements f<ByteBuffer> {

        /* compiled from: VideoDecoder */
        class a extends MediaDataSource {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ ByteBuffer f5942h;

            a(ByteBuffer byteBuffer) {
                this.f5942h = byteBuffer;
            }

            public void close() {
            }

            public long getSize() {
                return (long) this.f5942h.limit();
            }

            public int readAt(long j10, byte[] bArr, int i10, int i11) {
                if (j10 >= ((long) this.f5942h.limit())) {
                    return -1;
                }
                this.f5942h.position((int) j10);
                int min = Math.min(i11, this.f5942h.remaining());
                this.f5942h.get(bArr, i10, min);
                return min;
            }
        }

        d() {
        }

        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new a(byteBuffer));
        }
    }

    /* compiled from: VideoDecoder */
    static class e {
        e() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    /* compiled from: VideoDecoder */
    interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    /* compiled from: VideoDecoder */
    static final class g implements f<ParcelFileDescriptor> {
        g() {
        }

        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    y(i2.e eVar, f<T> fVar) {
        this(eVar, fVar, f5936f);
    }

    public static i<AssetFileDescriptor, Bitmap> c(i2.e eVar) {
        return new y(eVar, new c((a) null));
    }

    public static i<ByteBuffer, Bitmap> d(i2.e eVar) {
        return new y(eVar, new d());
    }

    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, j jVar) {
        Bitmap g10 = (Build.VERSION.SDK_INT < 27 || i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || jVar == j.f5875f) ? null : g(mediaMetadataRetriever, j10, i10, i11, i12, jVar);
        return g10 == null ? f(mediaMetadataRetriever, j10, i10) : g10;
    }

    private static Bitmap f(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10) {
        return mediaMetadataRetriever.getFrameAtTime(j10, i10);
    }

    @TargetApi(27)
    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, j jVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i13 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i13;
            }
            float b10 = jVar.b(parseInt, parseInt2, i11, i12);
            return mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(((float) parseInt) * b10), Math.round(b10 * ((float) parseInt2)));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static i<ParcelFileDescriptor, Bitmap> h(i2.e eVar) {
        return new y(eVar, new g());
    }

    public h2.c<Bitmap> a(T t10, int i10, int i11, e2.g gVar) {
        long longValue = ((Long) gVar.c(f5934d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) gVar.c(f5935e);
            if (num == null) {
                num = 2;
            }
            j jVar = (j) gVar.c(j.f5877h);
            if (jVar == null) {
                jVar = j.f5876g;
            }
            j jVar2 = jVar;
            MediaMetadataRetriever a10 = this.f5939c.a();
            try {
                this.f5937a.a(a10, t10);
                Bitmap e10 = e(a10, longValue, num.intValue(), i10, i11, jVar2);
                a10.release();
                return e.e(e10, this.f5938b);
            } catch (RuntimeException e11) {
                throw new IOException(e11);
            } catch (Throwable th) {
                a10.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    public boolean b(T t10, e2.g gVar) {
        return true;
    }

    y(i2.e eVar, f<T> fVar, e eVar2) {
        this.f5938b = eVar;
        this.f5937a = fVar;
        this.f5939c = eVar2;
    }
}
