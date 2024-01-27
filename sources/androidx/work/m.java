package androidx.work;

/* compiled from: Logger */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    private static m f4913a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final int f4914b = 20;

    /* compiled from: Logger */
    public static class a extends m {

        /* renamed from: c  reason: collision with root package name */
        private int f4915c;

        public a(int i10) {
            super(i10);
            this.f4915c = i10;
        }

        public void a(String str, String str2, Throwable... thArr) {
            if (this.f4915c <= 3 && thArr != null && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        public void b(String str, String str2, Throwable... thArr) {
            if (this.f4915c <= 6 && thArr != null && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        public void d(String str, String str2, Throwable... thArr) {
            if (this.f4915c <= 4 && thArr != null && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        public void g(String str, String str2, Throwable... thArr) {
            if (this.f4915c <= 2 && thArr != null && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        public void h(String str, String str2, Throwable... thArr) {
            if (this.f4915c <= 5 && thArr != null && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }
    }

    public m(int i10) {
    }

    public static synchronized m c() {
        m mVar;
        synchronized (m.class) {
            if (f4913a == null) {
                f4913a = new a(3);
            }
            mVar = f4913a;
        }
        return mVar;
    }

    public static synchronized void e(m mVar) {
        synchronized (m.class) {
            f4913a = mVar;
        }
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i10 = f4914b;
        if (length >= i10) {
            sb.append(str.substring(0, i10));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}
