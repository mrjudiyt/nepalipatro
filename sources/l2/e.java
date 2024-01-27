package l2;

import android.util.Base64;
import com.bumptech.glide.f;
import e2.g;
import f2.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import l2.n;

/* compiled from: DataUrlLoader */
public final class e<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Data> f9879a;

    /* compiled from: DataUrlLoader */
    public interface a<Data> {
        Class<Data> a();

        void b(Data data);

        Data decode(String str);
    }

    /* compiled from: DataUrlLoader */
    private static final class b<Data> implements d<Data> {

        /* renamed from: h  reason: collision with root package name */
        private final String f9880h;

        /* renamed from: i  reason: collision with root package name */
        private final a<Data> f9881i;

        /* renamed from: j  reason: collision with root package name */
        private Data f9882j;

        b(String str, a<Data> aVar) {
            this.f9880h = str;
            this.f9881i = aVar;
        }

        public Class<Data> a() {
            return this.f9881i.a();
        }

        public void b() {
            try {
                this.f9881i.b(this.f9882j);
            } catch (IOException unused) {
            }
        }

        public void cancel() {
        }

        public void d(f fVar, d.a<? super Data> aVar) {
            try {
                Data decode = this.f9881i.decode(this.f9880h);
                this.f9882j = decode;
                aVar.f(decode);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }

        public e2.a e() {
            return e2.a.LOCAL;
        }
    }

    /* compiled from: DataUrlLoader */
    public static final class c<Model> implements o<Model, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final a<InputStream> f9883a = new a();

        /* compiled from: DataUrlLoader */
        class a implements a<InputStream> {
            a() {
            }

            public Class<InputStream> a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            /* renamed from: d */
            public InputStream decode(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        public n<Model, InputStream> a(r rVar) {
            return new e(this.f9883a);
        }
    }

    public e(a<Data> aVar) {
        this.f9879a = aVar;
    }

    public boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    public n.a<Data> b(Model model, int i10, int i11, g gVar) {
        return new n.a<>(new z2.b(model), new b(model.toString(), this.f9879a));
    }
}
