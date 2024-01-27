package e1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;

/* compiled from: SupportSQLiteOpenHelper */
public interface c extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f7974a;

        public a(int i10) {
            this.f7974a = i10;
        }

        private void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("deleting the database file: ");
                sb.append(str);
                try {
                    if (Build.VERSION.SDK_INT >= 16) {
                        SQLiteDatabase.deleteDatabase(new File(str));
                    } else if (!new File(str).delete()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Could not delete the database file ");
                        sb2.append(str);
                    }
                } catch (Exception unused) {
                }
            }
        }

        public void b(b bVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
            if (r0 != null) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
            r3 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
            if (r3.hasNext() != false) goto L_0x0037;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
            a((java.lang.String) r3.next().second);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
            a(r3.m0());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0027 */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0025 A[ExcHandler: all (r1v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
          PHI: (r0v9 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v2 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:5:0x0020, B:8:0x0027, B:9:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0020] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(e1.b r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Corruption reported by sqlite on database: "
                r0.append(r1)
                java.lang.String r1 = r3.m0()
                r0.append(r1)
                boolean r0 = r3.isOpen()
                if (r0 != 0) goto L_0x001f
                java.lang.String r3 = r3.m0()
                r2.a(r3)
                return
            L_0x001f:
                r0 = 0
                java.util.List r0 = r3.r()     // Catch:{ SQLiteException -> 0x0027, all -> 0x0025 }
                goto L_0x0027
            L_0x0025:
                r1 = move-exception
                goto L_0x002b
            L_0x0027:
                r3.close()     // Catch:{ IOException -> 0x004d, all -> 0x0025 }
                goto L_0x004e
            L_0x002b:
                if (r0 == 0) goto L_0x0045
                java.util.Iterator r3 = r0.iterator()
            L_0x0031:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x004c
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.a(r0)
                goto L_0x0031
            L_0x0045:
                java.lang.String r3 = r3.m0()
                r2.a(r3)
            L_0x004c:
                throw r1
            L_0x004d:
            L_0x004e:
                if (r0 == 0) goto L_0x0068
                java.util.Iterator r3 = r0.iterator()
            L_0x0054:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x006f
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.a(r0)
                goto L_0x0054
            L_0x0068:
                java.lang.String r3 = r3.m0()
                r2.a(r3)
            L_0x006f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.c.a.c(e1.b):void");
        }

        public abstract void d(b bVar);

        public abstract void e(b bVar, int i10, int i11);

        public void f(b bVar) {
        }

        public abstract void g(b bVar, int i10, int i11);
    }

    /* compiled from: SupportSQLiteOpenHelper */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f7975a;

        /* renamed from: b  reason: collision with root package name */
        public final String f7976b;

        /* renamed from: c  reason: collision with root package name */
        public final a f7977c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f7978d;

        /* compiled from: SupportSQLiteOpenHelper */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            Context f7979a;

            /* renamed from: b  reason: collision with root package name */
            String f7980b;

            /* renamed from: c  reason: collision with root package name */
            a f7981c;

            /* renamed from: d  reason: collision with root package name */
            boolean f7982d;

            a(Context context) {
                this.f7979a = context;
            }

            public b a() {
                if (this.f7981c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                } else if (this.f7979a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                } else if (!this.f7982d || !TextUtils.isEmpty(this.f7980b)) {
                    return new b(this.f7979a, this.f7980b, this.f7981c, this.f7982d);
                } else {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
            }

            public a b(a aVar) {
                this.f7981c = aVar;
                return this;
            }

            public a c(String str) {
                this.f7980b = str;
                return this;
            }

            public a d(boolean z10) {
                this.f7982d = z10;
                return this;
            }
        }

        b(Context context, String str, a aVar, boolean z10) {
            this.f7975a = context;
            this.f7976b = str;
            this.f7977c = aVar;
            this.f7978d = z10;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* renamed from: e1.c$c  reason: collision with other inner class name */
    /* compiled from: SupportSQLiteOpenHelper */
    public interface C0129c {
        c a(b bVar);
    }

    b V();

    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
