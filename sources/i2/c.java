package i2;

import a3.k;
import android.graphics.Bitmap;

/* compiled from: AttributeStrategy */
class c implements l {

    /* renamed from: a  reason: collision with root package name */
    private final b f9230a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final h<a, Bitmap> f9231b = new h<>();

    /* compiled from: AttributeStrategy */
    static class a implements m {

        /* renamed from: a  reason: collision with root package name */
        private final b f9232a;

        /* renamed from: b  reason: collision with root package name */
        private int f9233b;

        /* renamed from: c  reason: collision with root package name */
        private int f9234c;

        /* renamed from: d  reason: collision with root package name */
        private Bitmap.Config f9235d;

        public a(b bVar) {
            this.f9232a = bVar;
        }

        public void a() {
            this.f9232a.c(this);
        }

        public void b(int i10, int i11, Bitmap.Config config) {
            this.f9233b = i10;
            this.f9234c = i11;
            this.f9235d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f9233b == aVar.f9233b && this.f9234c == aVar.f9234c && this.f9235d == aVar.f9235d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f9233b * 31) + this.f9234c) * 31;
            Bitmap.Config config = this.f9235d;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return c.g(this.f9233b, this.f9234c, this.f9235d);
        }
    }

    /* compiled from: AttributeStrategy */
    static class b extends d<a> {
        b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        /* access modifiers changed from: package-private */
        public a e(int i10, int i11, Bitmap.Config config) {
            a aVar = (a) b();
            aVar.b(i10, i11, config);
            return aVar;
        }
    }

    c() {
    }

    static String g(int i10, int i11, Bitmap.Config config) {
        return "[" + i10 + "x" + i11 + "], " + config;
    }

    private static String h(Bitmap bitmap) {
        return g(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    public Bitmap a() {
        return this.f9231b.f();
    }

    public String b(int i10, int i11, Bitmap.Config config) {
        return g(i10, i11, config);
    }

    public void c(Bitmap bitmap) {
        this.f9231b.d(this.f9230a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        return this.f9231b.a(this.f9230a.e(i10, i11, config));
    }

    public int e(Bitmap bitmap) {
        return k.h(bitmap);
    }

    public String f(Bitmap bitmap) {
        return h(bitmap);
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f9231b;
    }
}
