package h2;

/* compiled from: DiskCacheStrategy */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8936a = new C0143a();

    /* renamed from: b  reason: collision with root package name */
    public static final a f8937b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final a f8938c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final a f8939d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final a f8940e = new e();

    /* renamed from: h2.a$a  reason: collision with other inner class name */
    /* compiled from: DiskCacheStrategy */
    class C0143a extends a {
        C0143a() {
        }

        public boolean a() {
            return true;
        }

        public boolean b() {
            return true;
        }

        public boolean c(e2.a aVar) {
            return aVar == e2.a.REMOTE;
        }

        public boolean d(boolean z10, e2.a aVar, e2.c cVar) {
            return (aVar == e2.a.RESOURCE_DISK_CACHE || aVar == e2.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy */
    class b extends a {
        b() {
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean c(e2.a aVar) {
            return false;
        }

        public boolean d(boolean z10, e2.a aVar, e2.c cVar) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy */
    class c extends a {
        c() {
        }

        public boolean a() {
            return true;
        }

        public boolean b() {
            return false;
        }

        public boolean c(e2.a aVar) {
            return (aVar == e2.a.DATA_DISK_CACHE || aVar == e2.a.MEMORY_CACHE) ? false : true;
        }

        public boolean d(boolean z10, e2.a aVar, e2.c cVar) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy */
    class d extends a {
        d() {
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return true;
        }

        public boolean c(e2.a aVar) {
            return false;
        }

        public boolean d(boolean z10, e2.a aVar, e2.c cVar) {
            return (aVar == e2.a.RESOURCE_DISK_CACHE || aVar == e2.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy */
    class e extends a {
        e() {
        }

        public boolean a() {
            return true;
        }

        public boolean b() {
            return true;
        }

        public boolean c(e2.a aVar) {
            return aVar == e2.a.REMOTE;
        }

        public boolean d(boolean z10, e2.a aVar, e2.c cVar) {
            return ((z10 && aVar == e2.a.DATA_DISK_CACHE) || aVar == e2.a.LOCAL) && cVar == e2.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(e2.a aVar);

    public abstract boolean d(boolean z10, e2.a aVar, e2.c cVar);
}
