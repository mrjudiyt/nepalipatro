package com.bumptech.glide.load.resource.bitmap;

import a3.j;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import f2.k;
import f2.m;
import java.io.InputStream;
import java.util.List;

/* compiled from: ImageReader */
interface p {

    /* compiled from: ImageReader */
    public static final class a implements p {

        /* renamed from: a  reason: collision with root package name */
        private final k f5906a;

        /* renamed from: b  reason: collision with root package name */
        private final i2.b f5907b;

        /* renamed from: c  reason: collision with root package name */
        private final List<ImageHeaderParser> f5908c;

        a(InputStream inputStream, List<ImageHeaderParser> list, i2.b bVar) {
            this.f5907b = (i2.b) j.d(bVar);
            this.f5908c = (List) j.d(list);
            this.f5906a = new k(inputStream, bVar);
        }

        public int a() {
            return com.bumptech.glide.load.a.b(this.f5908c, this.f5906a.a(), this.f5907b);
        }

        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f5906a.a(), (Rect) null, options);
        }

        public void c() {
            this.f5906a.c();
        }

        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.e(this.f5908c, this.f5906a.a(), this.f5907b);
        }
    }

    /* compiled from: ImageReader */
    public static final class b implements p {

        /* renamed from: a  reason: collision with root package name */
        private final i2.b f5909a;

        /* renamed from: b  reason: collision with root package name */
        private final List<ImageHeaderParser> f5910b;

        /* renamed from: c  reason: collision with root package name */
        private final m f5911c;

        b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, i2.b bVar) {
            this.f5909a = (i2.b) j.d(bVar);
            this.f5910b = (List) j.d(list);
            this.f5911c = new m(parcelFileDescriptor);
        }

        public int a() {
            return com.bumptech.glide.load.a.a(this.f5910b, this.f5911c, this.f5909a);
        }

        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f5911c.a().getFileDescriptor(), (Rect) null, options);
        }

        public void c() {
        }

        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.d(this.f5910b, this.f5911c, this.f5909a);
        }
    }

    int a();

    Bitmap b(BitmapFactory.Options options);

    void c();

    ImageHeaderParser.ImageType d();
}
