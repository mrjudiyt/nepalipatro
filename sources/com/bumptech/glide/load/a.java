package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.t;
import f2.m;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: ImageHeaderParserUtils */
public final class a {

    /* renamed from: com.bumptech.glide.load.a$a  reason: collision with other inner class name */
    /* compiled from: ImageHeaderParserUtils */
    class C0104a implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InputStream f5635a;

        C0104a(InputStream inputStream) {
            this.f5635a = inputStream;
        }

        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.c(this.f5635a);
            } finally {
                this.f5635a.reset();
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils */
    class b implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ByteBuffer f5636a;

        b(ByteBuffer byteBuffer) {
            this.f5636a = byteBuffer;
        }

        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            return imageHeaderParser.a(this.f5636a);
        }
    }

    /* compiled from: ImageHeaderParserUtils */
    class c implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f5637a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i2.b f5638b;

        c(m mVar, i2.b bVar) {
            this.f5637a = mVar;
            this.f5638b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[SYNTHETIC, Splitter:B:14:0x002a] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bumptech.glide.load.ImageHeaderParser.ImageType a(com.bumptech.glide.load.ImageHeaderParser r5) {
            /*
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.resource.bitmap.t r1 = new com.bumptech.glide.load.resource.bitmap.t     // Catch:{ all -> 0x0027 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0027 }
                f2.m r3 = r4.f5637a     // Catch:{ all -> 0x0027 }
                android.os.ParcelFileDescriptor r3 = r3.a()     // Catch:{ all -> 0x0027 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0027 }
                r2.<init>(r3)     // Catch:{ all -> 0x0027 }
                i2.b r3 = r4.f5638b     // Catch:{ all -> 0x0027 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.c(r1)     // Catch:{ all -> 0x0024 }
                r1.close()     // Catch:{ IOException -> 0x001e }
            L_0x001e:
                f2.m r0 = r4.f5637a
                r0.a()
                return r5
            L_0x0024:
                r5 = move-exception
                r0 = r1
                goto L_0x0028
            L_0x0027:
                r5 = move-exception
            L_0x0028:
                if (r0 == 0) goto L_0x002d
                r0.close()     // Catch:{ IOException -> 0x002d }
            L_0x002d:
                f2.m r0 = r4.f5637a
                r0.a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.a.c.a(com.bumptech.glide.load.ImageHeaderParser):com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    /* compiled from: ImageHeaderParserUtils */
    class d implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InputStream f5639a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i2.b f5640b;

        d(InputStream inputStream, i2.b bVar) {
            this.f5639a = inputStream;
            this.f5640b = bVar;
        }

        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.b(this.f5639a, this.f5640b);
            } finally {
                this.f5639a.reset();
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils */
    class e implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f5641a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i2.b f5642b;

        e(m mVar, i2.b bVar) {
            this.f5641a = mVar;
            this.f5642b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[SYNTHETIC, Splitter:B:14:0x002c] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int a(com.bumptech.glide.load.ImageHeaderParser r5) {
            /*
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.resource.bitmap.t r1 = new com.bumptech.glide.load.resource.bitmap.t     // Catch:{ all -> 0x0029 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
                f2.m r3 = r4.f5641a     // Catch:{ all -> 0x0029 }
                android.os.ParcelFileDescriptor r3 = r3.a()     // Catch:{ all -> 0x0029 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0029 }
                r2.<init>(r3)     // Catch:{ all -> 0x0029 }
                i2.b r3 = r4.f5642b     // Catch:{ all -> 0x0029 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0029 }
                i2.b r0 = r4.f5642b     // Catch:{ all -> 0x0026 }
                int r5 = r5.b(r1, r0)     // Catch:{ all -> 0x0026 }
                r1.close()     // Catch:{ IOException -> 0x0020 }
            L_0x0020:
                f2.m r0 = r4.f5641a
                r0.a()
                return r5
            L_0x0026:
                r5 = move-exception
                r0 = r1
                goto L_0x002a
            L_0x0029:
                r5 = move-exception
            L_0x002a:
                if (r0 == 0) goto L_0x002f
                r0.close()     // Catch:{ IOException -> 0x002f }
            L_0x002f:
                f2.m r0 = r4.f5641a
                r0.a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.a.e.a(com.bumptech.glide.load.ImageHeaderParser):int");
        }
    }

    /* compiled from: ImageHeaderParserUtils */
    private interface f {
        int a(ImageHeaderParser imageHeaderParser);
    }

    /* compiled from: ImageHeaderParserUtils */
    private interface g {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List<ImageHeaderParser> list, m mVar, i2.b bVar) {
        return c(list, new e(mVar, bVar));
    }

    public static int b(List<ImageHeaderParser> list, InputStream inputStream, i2.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new t(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return c(list, new d(inputStream, bVar));
    }

    private static int c(List<ImageHeaderParser> list, f fVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int a10 = fVar.a(list.get(i10));
            if (a10 != -1) {
                return a10;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType d(List<ImageHeaderParser> list, m mVar, i2.b bVar) {
        return g(list, new c(mVar, bVar));
    }

    public static ImageHeaderParser.ImageType e(List<ImageHeaderParser> list, InputStream inputStream, i2.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new t(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return g(list, new C0104a(inputStream));
    }

    public static ImageHeaderParser.ImageType f(List<ImageHeaderParser> list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return g(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType g(List<ImageHeaderParser> list, g gVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType a10 = gVar.a(list.get(i10));
            if (a10 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a10;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
