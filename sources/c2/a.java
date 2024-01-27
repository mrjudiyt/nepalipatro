package c2;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import com.facebook.appevents.AppEventsConstants;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: DiskLruCache */
public final class a implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final File f5180h;

    /* renamed from: i  reason: collision with root package name */
    private final File f5181i;

    /* renamed from: j  reason: collision with root package name */
    private final File f5182j;

    /* renamed from: k  reason: collision with root package name */
    private final File f5183k;

    /* renamed from: l  reason: collision with root package name */
    private final int f5184l;

    /* renamed from: m  reason: collision with root package name */
    private long f5185m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final int f5186n;

    /* renamed from: o  reason: collision with root package name */
    private long f5187o = 0;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public Writer f5188p;

    /* renamed from: q  reason: collision with root package name */
    private final LinkedHashMap<String, d> f5189q = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public int f5190r;

    /* renamed from: s  reason: collision with root package name */
    private long f5191s = 0;

    /* renamed from: t  reason: collision with root package name */
    final ThreadPoolExecutor f5192t = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b((C0101a) null));

    /* renamed from: u  reason: collision with root package name */
    private final Callable<Void> f5193u = new C0101a();

    /* renamed from: c2.a$a  reason: collision with other inner class name */
    /* compiled from: DiskLruCache */
    class C0101a implements Callable<Void> {
        C0101a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
                r4 = this;
                c2.a r0 = c2.a.this
                monitor-enter(r0)
                c2.a r1 = c2.a.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f5188p     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                c2.a r1 = c2.a.this     // Catch:{ all -> 0x0028 }
                r1.M0()     // Catch:{ all -> 0x0028 }
                c2.a r1 = c2.a.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.r0()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                c2.a r1 = c2.a.this     // Catch:{ all -> 0x0028 }
                r1.I0()     // Catch:{ all -> 0x0028 }
                c2.a r1 = c2.a.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                int unused = r1.f5190r = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: c2.a.C0101a.call():java.lang.Void");
        }
    }

    /* compiled from: DiskLruCache */
    private static final class b implements ThreadFactory {
        private b() {
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ b(C0101a aVar) {
            this();
        }
    }

    /* compiled from: DiskLruCache */
    public final class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final d f5195a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f5196b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f5197c;

        /* synthetic */ c(a aVar, d dVar, C0101a aVar2) {
            this(dVar);
        }

        public void a() {
            a.this.Y(this, false);
        }

        public void b() {
            if (!this.f5197c) {
                try {
                    a();
                } catch (IOException unused) {
                }
            }
        }

        public void e() {
            a.this.Y(this, true);
            this.f5197c = true;
        }

        public File f(int i10) {
            File k10;
            synchronized (a.this) {
                if (this.f5195a.f5204f == this) {
                    if (!this.f5195a.f5203e) {
                        this.f5196b[i10] = true;
                    }
                    k10 = this.f5195a.k(i10);
                    if (!a.this.f5180h.exists()) {
                        a.this.f5180h.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return k10;
        }

        private c(d dVar) {
            this.f5195a = dVar;
            this.f5196b = dVar.f5203e ? null : new boolean[a.this.f5186n];
        }
    }

    /* compiled from: DiskLruCache */
    private final class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f5199a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long[] f5200b;

        /* renamed from: c  reason: collision with root package name */
        File[] f5201c;

        /* renamed from: d  reason: collision with root package name */
        File[] f5202d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f5203e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public c f5204f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public long f5205g;

        /* synthetic */ d(a aVar, String str, C0101a aVar2) {
            this(str);
        }

        private IOException m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: private */
        public void n(String[] strArr) {
            if (strArr.length == a.this.f5186n) {
                int i10 = 0;
                while (i10 < strArr.length) {
                    try {
                        this.f5200b[i10] = Long.parseLong(strArr[i10]);
                        i10++;
                    } catch (NumberFormatException unused) {
                        throw m(strArr);
                    }
                }
                return;
            }
            throw m(strArr);
        }

        public File j(int i10) {
            return this.f5201c[i10];
        }

        public File k(int i10) {
            return this.f5202d[i10];
        }

        public String l() {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f5200b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        private d(String str) {
            this.f5199a = str;
            this.f5200b = new long[a.this.f5186n];
            this.f5201c = new File[a.this.f5186n];
            this.f5202d = new File[a.this.f5186n];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i10 = 0; i10 < a.this.f5186n; i10++) {
                sb.append(i10);
                this.f5201c[i10] = new File(a.this.f5180h, sb.toString());
                sb.append(".tmp");
                this.f5202d[i10] = new File(a.this.f5180h, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* compiled from: DiskLruCache */
    public final class e {

        /* renamed from: a  reason: collision with root package name */
        private final String f5207a;

        /* renamed from: b  reason: collision with root package name */
        private final long f5208b;

        /* renamed from: c  reason: collision with root package name */
        private final long[] f5209c;

        /* renamed from: d  reason: collision with root package name */
        private final File[] f5210d;

        /* synthetic */ e(a aVar, String str, long j10, File[] fileArr, long[] jArr, C0101a aVar2) {
            this(str, j10, fileArr, jArr);
        }

        public File a(int i10) {
            return this.f5210d[i10];
        }

        private e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f5207a = str;
            this.f5208b = j10;
            this.f5210d = fileArr;
            this.f5209c = jArr;
        }
    }

    private a(File file, int i10, int i11, long j10) {
        File file2 = file;
        this.f5180h = file2;
        this.f5184l = i10;
        this.f5181i = new File(file2, "journal");
        this.f5182j = new File(file2, "journal.tmp");
        this.f5183k = new File(file2, "journal.bkp");
        this.f5186n = i11;
        this.f5185m = j10;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public synchronized void I0() {
        Writer writer = this.f5188p;
        if (writer != null) {
            W(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5182j), c.f5218a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write(AppEventsConstants.EVENT_PARAM_VALUE_YES);
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f5184l));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f5186n));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d next : this.f5189q.values()) {
                if (next.f5204f != null) {
                    bufferedWriter.write("DIRTY " + next.f5199a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f5199a + next.l() + 10);
                }
            }
            W(bufferedWriter);
            if (this.f5181i.exists()) {
                L0(this.f5181i, this.f5183k, true);
            }
            L0(this.f5182j, this.f5181i, false);
            this.f5183k.delete();
            this.f5188p = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5181i, true), c.f5218a));
        } catch (Throwable th) {
            W(bufferedWriter);
            throw th;
        }
    }

    private void L() {
        if (this.f5188p == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void L0(File file, File file2, boolean z10) {
        if (z10) {
            g0(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* access modifiers changed from: private */
    public void M0() {
        while (this.f5187o > this.f5185m) {
            K0((String) this.f5189q.entrySet().iterator().next().getKey());
        }
    }

    @TargetApi(26)
    private static void W(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void Y(c2.a.c r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            c2.a$d r0 = r10.f5195a     // Catch:{ all -> 0x010e }
            c2.a$c r1 = r0.f5204f     // Catch:{ all -> 0x010e }
            if (r1 != r10) goto L_0x0108
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f5203e     // Catch:{ all -> 0x010e }
            if (r2 != 0) goto L_0x004d
            r2 = 0
        L_0x0015:
            int r3 = r9.f5186n     // Catch:{ all -> 0x010e }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f5196b     // Catch:{ all -> 0x010e }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.k(r2)     // Catch:{ all -> 0x010e }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010e }
            if (r3 != 0) goto L_0x0030
            r10.a()     // Catch:{ all -> 0x010e }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.a()     // Catch:{ all -> 0x010e }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r11.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010e }
            r11.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010e }
            r10.<init>(r11)     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x004d:
            int r10 = r9.f5186n     // Catch:{ all -> 0x010e }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.k(r1)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.j(r1)     // Catch:{ all -> 0x010e }
            r10.renameTo(r2)     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f5200b     // Catch:{ all -> 0x010e }
            r3 = r10[r1]     // Catch:{ all -> 0x010e }
            long r5 = r2.length()     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f5200b     // Catch:{ all -> 0x010e }
            r10[r1] = r5     // Catch:{ all -> 0x010e }
            long r7 = r9.f5187o     // Catch:{ all -> 0x010e }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f5187o = r7     // Catch:{ all -> 0x010e }
            goto L_0x007e
        L_0x007b:
            g0(r10)     // Catch:{ all -> 0x010e }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.f5190r     // Catch:{ all -> 0x010e }
            r1 = 1
            int r10 = r10 + r1
            r9.f5190r = r10     // Catch:{ all -> 0x010e }
            r10 = 0
            c2.a.c unused = r0.f5204f = r10     // Catch:{ all -> 0x010e }
            boolean r10 = r0.f5203e     // Catch:{ all -> 0x010e }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00c9
            boolean unused = r0.f5203e = r1     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f5188p     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f5188p     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f5188p     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.f5199a     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f5188p     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.l()     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f5188p     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x00ec
            long r10 = r9.f5191s     // Catch:{ all -> 0x010e }
            r1 = 1
            long r1 = r1 + r10
            r9.f5191s = r1     // Catch:{ all -> 0x010e }
            long unused = r0.f5205g = r10     // Catch:{ all -> 0x010e }
            goto L_0x00ec
        L_0x00c9:
            java.util.LinkedHashMap<java.lang.String, c2.a$d> r10 = r9.f5189q     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f5199a     // Catch:{ all -> 0x010e }
            r10.remove(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f5188p     // Catch:{ all -> 0x010e }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f5188p     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f5188p     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f5199a     // Catch:{ all -> 0x010e }
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f5188p     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
        L_0x00ec:
            java.io.Writer r10 = r9.f5188p     // Catch:{ all -> 0x010e }
            l0(r10)     // Catch:{ all -> 0x010e }
            long r10 = r9.f5187o     // Catch:{ all -> 0x010e }
            long r0 = r9.f5185m     // Catch:{ all -> 0x010e }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ff
            boolean r10 = r9.r0()     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x0106
        L_0x00ff:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f5192t     // Catch:{ all -> 0x010e }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f5193u     // Catch:{ all -> 0x010e }
            r10.submit(r11)     // Catch:{ all -> 0x010e }
        L_0x0106:
            monitor-exit(r9)
            return
        L_0x0108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            r10.<init>()     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x010e:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.a.Y(c2.a$c, boolean):void");
    }

    private static void g0(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized c2.a.c k0(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.L()     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, c2.a$d> r0 = r5.f5189q     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005d }
            c2.a$d r0 = (c2.a.d) r0     // Catch:{ all -> 0x005d }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            long r1 = r0.f5205g     // Catch:{ all -> 0x005d }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
        L_0x001d:
            monitor-exit(r5)
            return r3
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            c2.a$d r0 = new c2.a$d     // Catch:{ all -> 0x005d }
            r0.<init>(r5, r6, r3)     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, c2.a$d> r7 = r5.f5189q     // Catch:{ all -> 0x005d }
            r7.put(r6, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0034
        L_0x002c:
            c2.a$c r7 = r0.f5204f     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0034
            monitor-exit(r5)
            return r3
        L_0x0034:
            c2.a$c r7 = new c2.a$c     // Catch:{ all -> 0x005d }
            r7.<init>(r5, r0, r3)     // Catch:{ all -> 0x005d }
            c2.a.c unused = r0.f5204f = r7     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f5188p     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f5188p     // Catch:{ all -> 0x005d }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f5188p     // Catch:{ all -> 0x005d }
            r8.append(r6)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f5188p     // Catch:{ all -> 0x005d }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f5188p     // Catch:{ all -> 0x005d }
            l0(r6)     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r7
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.a.k0(java.lang.String, long):c2.a$c");
    }

    @TargetApi(26)
    private static void l0(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    public boolean r0() {
        int i10 = this.f5190r;
        return i10 >= 2000 && i10 >= this.f5189q.size();
    }

    public static a s0(File file, int i10, int i11, long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i11 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    L0(file2, file3, false);
                }
            }
            a aVar = new a(file, i10, i11, j10);
            if (aVar.f5181i.exists()) {
                try {
                    aVar.w0();
                    aVar.v0();
                    return aVar;
                } catch (IOException e10) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    aVar.c0();
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, i10, i11, j10);
            aVar2.I0();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    private void v0() {
        g0(this.f5182j);
        Iterator<d> it = this.f5189q.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f5204f == null) {
                while (i10 < this.f5186n) {
                    this.f5187o += next.f5200b[i10];
                    i10++;
                }
            } else {
                c unused = next.f5204f = null;
                while (i10 < this.f5186n) {
                    g0(next.j(i10));
                    g0(next.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f5190r = r0 - r9.f5189q.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.j() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        I0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f5188p = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f5181i, true), c2.c.f5218a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void w0() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            c2.b r1 = new c2.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f5181i
            r2.<init>(r3)
            java.nio.charset.Charset r3 = c2.c.f5218a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.q()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.q()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.q()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.q()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.q()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f5184l     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f5186n     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.q()     // Catch:{ EOFException -> 0x005f }
            r9.y0(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, c2.a$d> r2 = r9.f5189q     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f5190r = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.j()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.I0()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f5181i     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = c2.c.f5218a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f5188p = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            c2.c.a(r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            c2.c.a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.a.w0():void");
    }

    private void y0(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                str2 = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f5189q.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i10, indexOf2);
            }
            d dVar = this.f5189q.get(str2);
            if (dVar == null) {
                dVar = new d(this, str2, (C0101a) null);
                this.f5189q.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = dVar.f5203e = true;
                c unused2 = dVar.f5204f = null;
                dVar.n(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c unused3 = dVar.f5204f = new c(this, dVar, (C0101a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean K0(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.L()     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, c2.a$d> r0 = r7.f5189q     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008f }
            c2.a$d r0 = (c2.a.d) r0     // Catch:{ all -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            c2.a$c r2 = r0.f5204f     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0017
            goto L_0x008d
        L_0x0017:
            int r2 = r7.f5186n     // Catch:{ all -> 0x008f }
            if (r1 >= r2) goto L_0x0059
            java.io.File r2 = r0.j(r1)     // Catch:{ all -> 0x008f }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r8.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x008f }
        L_0x0043:
            long r2 = r7.f5187o     // Catch:{ all -> 0x008f }
            long[] r4 = r0.f5200b     // Catch:{ all -> 0x008f }
            r5 = r4[r1]     // Catch:{ all -> 0x008f }
            long r2 = r2 - r5
            r7.f5187o = r2     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f5200b     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008f }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0059:
            int r0 = r7.f5190r     // Catch:{ all -> 0x008f }
            r1 = 1
            int r0 = r0 + r1
            r7.f5190r = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f5188p     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f5188p     // Catch:{ all -> 0x008f }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f5188p     // Catch:{ all -> 0x008f }
            r0.append(r8)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f5188p     // Catch:{ all -> 0x008f }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, c2.a$d> r0 = r7.f5189q     // Catch:{ all -> 0x008f }
            r0.remove(r8)     // Catch:{ all -> 0x008f }
            boolean r8 = r7.r0()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f5192t     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f5193u     // Catch:{ all -> 0x008f }
            r8.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r7)
            return r1
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.a.K0(java.lang.String):boolean");
    }

    public void c0() {
        close();
        c.b(this.f5180h);
    }

    public synchronized void close() {
        if (this.f5188p != null) {
            Iterator it = new ArrayList(this.f5189q.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f5204f != null) {
                    dVar.f5204f.a();
                }
            }
            M0();
            W(this.f5188p);
            this.f5188p = null;
        }
    }

    public c h0(String str) {
        return k0(str, -1);
    }

    public synchronized e o0(String str) {
        L();
        d dVar = this.f5189q.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f5203e) {
            return null;
        }
        for (File exists : dVar.f5201c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f5190r++;
        this.f5188p.append("READ");
        this.f5188p.append(' ');
        this.f5188p.append(str);
        this.f5188p.append(10);
        if (r0()) {
            this.f5192t.submit(this.f5193u);
        }
        return new e(this, str, dVar.f5205g, dVar.f5201c, dVar.f5200b, (C0101a) null);
    }
}
