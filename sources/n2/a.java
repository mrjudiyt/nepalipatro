package n2;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.resource.bitmap.j;
import com.bumptech.glide.load.resource.bitmap.k;
import com.bumptech.glide.load.resource.bitmap.o;
import e2.b;
import e2.f;
import e2.g;
import e2.h;
import e2.i;
import h2.c;

/* compiled from: ImageDecoderResourceDecoder */
public abstract class a<T> implements i<ImageDecoder.Source, T> {

    /* renamed from: a  reason: collision with root package name */
    final o f10257a = o.a();

    /* renamed from: n2.a$a  reason: collision with other inner class name */
    /* compiled from: ImageDecoderResourceDecoder */
    class C0172a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f10258a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f10259b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f10260c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f10261d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f10262e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h f10263f;

        /* renamed from: n2.a$a$a  reason: collision with other inner class name */
        /* compiled from: ImageDecoderResourceDecoder */
        class C0173a implements ImageDecoder.OnPartialImageListener {
            C0173a() {
            }

            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        C0172a(int i10, int i11, boolean z10, b bVar, j jVar, h hVar) {
            this.f10258a = i10;
            this.f10259b = i11;
            this.f10260c = z10;
            this.f10261d = bVar;
            this.f10262e = jVar;
            this.f10263f = hVar;
        }

        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            boolean z10 = false;
            if (a.this.f10257a.c(this.f10258a, this.f10259b, this.f10260c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f10261d == b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0173a());
            Size size = imageInfo.getSize();
            int i10 = this.f10258a;
            if (i10 == Integer.MIN_VALUE) {
                i10 = size.getWidth();
            }
            int i11 = this.f10259b;
            if (i11 == Integer.MIN_VALUE) {
                i11 = size.getHeight();
            }
            float b10 = this.f10262e.b(size.getWidth(), size.getHeight(), i10, i11);
            int round = Math.round(((float) size.getWidth()) * b10);
            int round2 = Math.round(((float) size.getHeight()) * b10);
            if (Log.isLoggable("ImageDecoder", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Resizing from [");
                sb.append(size.getWidth());
                sb.append("x");
                sb.append(size.getHeight());
                sb.append("] to [");
                sb.append(round);
                sb.append("x");
                sb.append(round2);
                sb.append("] scaleFactor: ");
                sb.append(b10);
            }
            imageDecoder.setTargetSize(round, round2);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                if (this.f10263f == h.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z10 = true;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(z10 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i12 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract c<T> c(ImageDecoder.Source source, int i10, int i11, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener);

    /* renamed from: d */
    public final c<T> a(ImageDecoder.Source source, int i10, int i11, g gVar) {
        b bVar = (b) gVar.c(k.f5882f);
        j jVar = (j) gVar.c(j.f5877h);
        f fVar = k.f5886j;
        return c(source, i10, i11, new C0172a(i10, i11, gVar.c(fVar) != null && ((Boolean) gVar.c(fVar)).booleanValue(), bVar, jVar, (h) gVar.c(k.f5883g)));
    }

    /* renamed from: e */
    public final boolean b(ImageDecoder.Source source, g gVar) {
        return true;
    }
}
