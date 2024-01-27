package f2;

import com.bumptech.glide.load.resource.bitmap.t;
import f2.e;
import i2.b;
import java.io.InputStream;

/* compiled from: InputStreamRewinder */
public final class k implements e<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final t f8492a;

    /* compiled from: InputStreamRewinder */
    public static final class a implements e.a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final b f8493a;

        public a(b bVar) {
            this.f8493a = bVar;
        }

        public Class<InputStream> a() {
            return InputStream.class;
        }

        /* renamed from: c */
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f8493a);
        }
    }

    public k(InputStream inputStream, b bVar) {
        t tVar = new t(inputStream, bVar);
        this.f8492a = tVar;
        tVar.mark(5242880);
    }

    public void b() {
        this.f8492a.release();
    }

    public void c() {
        this.f8492a.h();
    }

    /* renamed from: d */
    public InputStream a() {
        this.f8492a.reset();
        return this.f8492a;
    }
}
