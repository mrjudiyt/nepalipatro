package l2;

import android.os.ParcelFileDescriptor;
import e2.g;
import f2.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import l2.n;

/* compiled from: FileLoader */
public class f<Data> implements n<File, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final d<Data> f9885a;

    /* compiled from: FileLoader */
    public static class a<Data> implements o<File, Data> {

        /* renamed from: a  reason: collision with root package name */
        private final d<Data> f9886a;

        public a(d<Data> dVar) {
            this.f9886a = dVar;
        }

        public final n<File, Data> a(r rVar) {
            return new f(this.f9886a);
        }
    }

    /* compiled from: FileLoader */
    public static class b extends a<ParcelFileDescriptor> {

        /* compiled from: FileLoader */
        class a implements d<ParcelFileDescriptor> {
            a() {
            }

            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: d */
            public void b(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }

            /* renamed from: e */
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* compiled from: FileLoader */
    private static final class c<Data> implements f2.d<Data> {

        /* renamed from: h  reason: collision with root package name */
        private final File f9887h;

        /* renamed from: i  reason: collision with root package name */
        private final d<Data> f9888i;

        /* renamed from: j  reason: collision with root package name */
        private Data f9889j;

        c(File file, d<Data> dVar) {
            this.f9887h = file;
            this.f9888i = dVar;
        }

        public Class<Data> a() {
            return this.f9888i.a();
        }

        public void b() {
            Data data = this.f9889j;
            if (data != null) {
                try {
                    this.f9888i.b(data);
                } catch (IOException unused) {
                }
            }
        }

        public void cancel() {
        }

        public void d(com.bumptech.glide.f fVar, d.a<? super Data> aVar) {
            try {
                Data c10 = this.f9888i.c(this.f9887h);
                this.f9889j = c10;
                aVar.f(c10);
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }

        public e2.a e() {
            return e2.a.LOCAL;
        }
    }

    /* compiled from: FileLoader */
    public interface d<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(File file);
    }

    /* compiled from: FileLoader */
    public static class e extends a<InputStream> {

        /* compiled from: FileLoader */
        class a implements d<InputStream> {
            a() {
            }

            public Class<InputStream> a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public f(d<Data> dVar) {
        this.f9885a = dVar;
    }

    /* renamed from: c */
    public n.a<Data> b(File file, int i10, int i11, g gVar) {
        return new n.a<>(new z2.b(file), new c(file, this.f9885a));
    }

    /* renamed from: d */
    public boolean a(File file) {
        return true;
    }
}
