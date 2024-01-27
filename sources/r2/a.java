package r2;

import a3.f;
import a3.k;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import d2.a;
import d2.c;
import d2.d;
import d2.e;
import e2.g;
import e2.i;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* compiled from: ByteBufferGifDecoder */
public class a implements i<ByteBuffer, c> {

    /* renamed from: f  reason: collision with root package name */
    private static final C0188a f10814f = new C0188a();

    /* renamed from: g  reason: collision with root package name */
    private static final b f10815g = new b();

    /* renamed from: a  reason: collision with root package name */
    private final Context f10816a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ImageHeaderParser> f10817b;

    /* renamed from: c  reason: collision with root package name */
    private final b f10818c;

    /* renamed from: d  reason: collision with root package name */
    private final C0188a f10819d;

    /* renamed from: e  reason: collision with root package name */
    private final b f10820e;

    /* renamed from: r2.a$a  reason: collision with other inner class name */
    /* compiled from: ByteBufferGifDecoder */
    static class C0188a {
        C0188a() {
        }

        /* access modifiers changed from: package-private */
        public d2.a a(a.C0122a aVar, c cVar, ByteBuffer byteBuffer, int i10) {
            return new e(aVar, cVar, byteBuffer, i10);
        }
    }

    /* compiled from: ByteBufferGifDecoder */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Queue<d> f10821a = k.f(0);

        b() {
        }

        /* access modifiers changed from: package-private */
        public synchronized d a(ByteBuffer byteBuffer) {
            d poll;
            poll = this.f10821a.poll();
            if (poll == null) {
                poll = new d();
            }
            return poll.p(byteBuffer);
        }

        /* access modifiers changed from: package-private */
        public synchronized void b(d dVar) {
            dVar.a();
            this.f10821a.offer(dVar);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, i2.e eVar, i2.b bVar) {
        this(context, list, eVar, bVar, f10815g, f10814f);
    }

    private e c(ByteBuffer byteBuffer, int i10, int i11, d dVar, g gVar) {
        Bitmap.Config config;
        long b10 = f.b();
        try {
            c c10 = dVar.c();
            if (c10.b() > 0) {
                if (c10.c() == 0) {
                    if (gVar.c(i.f10862a) == e2.b.PREFER_RGB_565) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    d2.a a10 = this.f10819d.a(this.f10820e, c10, byteBuffer, e(c10, i10, i11));
                    a10.e(config);
                    a10.b();
                    Bitmap a11 = a10.a();
                    if (a11 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Decoded GIF from stream in ");
                            sb.append(f.a(b10));
                        }
                        return null;
                    }
                    e eVar = new e(new c(this.f10816a, a10, n2.c.c(), i10, i11, a11));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Decoded GIF from stream in ");
                        sb2.append(f.a(b10));
                    }
                    return eVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Decoded GIF from stream in ");
                sb3.append(f.a(b10));
            }
        }
    }

    private static int e(c cVar, int i10, int i11) {
        int i12;
        int min = Math.min(cVar.a() / i11, cVar.d() / i10);
        if (min == 0) {
            i12 = 0;
        } else {
            i12 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i12);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Downsampling GIF, sampleSize: ");
            sb.append(max);
            sb.append(", target dimens: [");
            sb.append(i10);
            sb.append("x");
            sb.append(i11);
            sb.append("], actual dimens: [");
            sb.append(cVar.d());
            sb.append("x");
            sb.append(cVar.a());
            sb.append("]");
        }
        return max;
    }

    /* renamed from: d */
    public e a(ByteBuffer byteBuffer, int i10, int i11, g gVar) {
        d a10 = this.f10818c.a(byteBuffer);
        try {
            return c(byteBuffer, i10, i11, a10, gVar);
        } finally {
            this.f10818c.b(a10);
        }
    }

    /* renamed from: f */
    public boolean b(ByteBuffer byteBuffer, g gVar) {
        return !((Boolean) gVar.c(i.f10863b)).booleanValue() && com.bumptech.glide.load.a.f(this.f10817b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    a(Context context, List<ImageHeaderParser> list, i2.e eVar, i2.b bVar, b bVar2, C0188a aVar) {
        this.f10816a = context.getApplicationContext();
        this.f10817b = list;
        this.f10819d = aVar;
        this.f10820e = new b(eVar, bVar);
        this.f10818c = bVar2;
    }
}
