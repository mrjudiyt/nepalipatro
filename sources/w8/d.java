package w8;

import com.google.android.gms.common.api.Api;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.AccessDeniedException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import o8.q;
import y8.l;
import y8.p;

/* compiled from: FileTreeWalk.kt */
public final class d implements f9.c<File> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final File f17019a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final e f17020b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final l<File, Boolean> f17021c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final l<File, q> f17022d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final p<File, IOException, q> f17023e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final int f17024f;

    /* compiled from: FileTreeWalk.kt */
    private static abstract class a extends c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(file);
            m.f(file, "rootDir");
        }
    }

    /* compiled from: FileTreeWalk.kt */
    private final class b extends p8.b<File> {

        /* renamed from: j  reason: collision with root package name */
        private final ArrayDeque<c> f17025j;

        /* compiled from: FileTreeWalk.kt */
        private final class a extends a {

            /* renamed from: b  reason: collision with root package name */
            private boolean f17027b;

            /* renamed from: c  reason: collision with root package name */
            private File[] f17028c;

            /* renamed from: d  reason: collision with root package name */
            private int f17029d;

            /* renamed from: e  reason: collision with root package name */
            private boolean f17030e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b f17031f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, File file) {
                super(file);
                m.f(file, "rootDir");
                this.f17031f = bVar;
            }

            public File b() {
                if (!this.f17030e && this.f17028c == null) {
                    l c10 = d.this.f17021c;
                    boolean z10 = false;
                    if (c10 != null && !((Boolean) c10.invoke(a())).booleanValue()) {
                        z10 = true;
                    }
                    if (z10) {
                        return null;
                    }
                    File[] listFiles = a().listFiles();
                    this.f17028c = listFiles;
                    if (listFiles == null) {
                        p d10 = d.this.f17023e;
                        if (d10 != null) {
                            d10.invoke(a(), new AccessDeniedException(a(), (File) null, "Cannot list files in a directory", 2, (g) null));
                        }
                        this.f17030e = true;
                    }
                }
                File[] fileArr = this.f17028c;
                if (fileArr != null) {
                    int i10 = this.f17029d;
                    m.c(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f17028c;
                        m.c(fileArr2);
                        int i11 = this.f17029d;
                        this.f17029d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f17027b) {
                    this.f17027b = true;
                    return a();
                }
                l e10 = d.this.f17022d;
                if (e10 != null) {
                    e10.invoke(a());
                }
                return null;
            }
        }

        /* renamed from: w8.d$b$b  reason: collision with other inner class name */
        /* compiled from: FileTreeWalk.kt */
        private final class C0291b extends c {

            /* renamed from: b  reason: collision with root package name */
            private boolean f17032b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f17033c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0291b(b bVar, File file) {
                super(file);
                m.f(file, "rootFile");
                this.f17033c = bVar;
            }

            public File b() {
                if (this.f17032b) {
                    return null;
                }
                this.f17032b = true;
                return a();
            }
        }

        /* compiled from: FileTreeWalk.kt */
        private final class c extends a {

            /* renamed from: b  reason: collision with root package name */
            private boolean f17034b;

            /* renamed from: c  reason: collision with root package name */
            private File[] f17035c;

            /* renamed from: d  reason: collision with root package name */
            private int f17036d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ b f17037e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(b bVar, File file) {
                super(file);
                m.f(file, "rootDir");
                this.f17037e = bVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
                if (r0.length == 0) goto L_0x0085;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.io.File b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f17034b
                    r1 = 0
                    if (r0 != 0) goto L_0x002c
                    w8.d$b r0 = r10.f17037e
                    w8.d r0 = w8.d.this
                    y8.l r0 = r0.f17021c
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L_0x0022
                    java.io.File r4 = r10.a()
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L_0x0022
                    r2 = 1
                L_0x0022:
                    if (r2 == 0) goto L_0x0025
                    return r1
                L_0x0025:
                    r10.f17034b = r3
                    java.io.File r0 = r10.a()
                    return r0
                L_0x002c:
                    java.io.File[] r0 = r10.f17035c
                    if (r0 == 0) goto L_0x004b
                    int r2 = r10.f17036d
                    kotlin.jvm.internal.m.c(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L_0x0039
                    goto L_0x004b
                L_0x0039:
                    w8.d$b r0 = r10.f17037e
                    w8.d r0 = w8.d.this
                    y8.l r0 = r0.f17022d
                    if (r0 == 0) goto L_0x004a
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L_0x004a:
                    return r1
                L_0x004b:
                    java.io.File[] r0 = r10.f17035c
                    if (r0 != 0) goto L_0x0097
                    java.io.File r0 = r10.a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f17035c = r0
                    if (r0 != 0) goto L_0x007b
                    w8.d$b r0 = r10.f17037e
                    w8.d r0 = w8.d.this
                    y8.p r0 = r0.f17023e
                    if (r0 == 0) goto L_0x007b
                    java.io.File r2 = r10.a()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.a()
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L_0x007b:
                    java.io.File[] r0 = r10.f17035c
                    if (r0 == 0) goto L_0x0085
                    kotlin.jvm.internal.m.c(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L_0x0097
                L_0x0085:
                    w8.d$b r0 = r10.f17037e
                    w8.d r0 = w8.d.this
                    y8.l r0 = r0.f17022d
                    if (r0 == 0) goto L_0x0096
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L_0x0096:
                    return r1
                L_0x0097:
                    java.io.File[] r0 = r10.f17035c
                    kotlin.jvm.internal.m.c(r0)
                    int r1 = r10.f17036d
                    int r2 = r1 + 1
                    r10.f17036d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: w8.d.b.c.b():java.io.File");
            }
        }

        /* renamed from: w8.d$b$d  reason: collision with other inner class name */
        /* compiled from: FileTreeWalk.kt */
        public /* synthetic */ class C0292d {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f17038a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    w8.e[] r0 = w8.e.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    w8.e r1 = w8.e.TOP_DOWN     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    w8.e r1 = w8.e.BOTTOM_UP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f17038a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: w8.d.b.C0292d.<clinit>():void");
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f17025j = arrayDeque;
            if (d.this.f17019a.isDirectory()) {
                arrayDeque.push(f(d.this.f17019a));
            } else if (d.this.f17019a.isFile()) {
                arrayDeque.push(new C0291b(this, d.this.f17019a));
            } else {
                c();
            }
        }

        private final a f(File file) {
            int i10 = C0292d.f17038a[d.this.f17020b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        private final File g() {
            File b10;
            while (true) {
                c peek = this.f17025j.peek();
                if (peek == null) {
                    return null;
                }
                b10 = peek.b();
                if (b10 == null) {
                    this.f17025j.pop();
                } else if (m.a(b10, peek.a()) || !b10.isDirectory() || this.f17025j.size() >= d.this.f17024f) {
                    return b10;
                } else {
                    this.f17025j.push(f(b10));
                }
            }
            return b10;
        }

        /* access modifiers changed from: protected */
        public void b() {
            File g10 = g();
            if (g10 != null) {
                d(g10);
            } else {
                c();
            }
        }
    }

    /* compiled from: FileTreeWalk.kt */
    private static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        private final File f17039a;

        public c(File file) {
            m.f(file, "root");
            this.f17039a = file;
        }

        public final File a() {
            return this.f17039a;
        }

        public abstract File b();
    }

    private d(File file, e eVar, l<? super File, Boolean> lVar, l<? super File, q> lVar2, p<? super File, ? super IOException, q> pVar, int i10) {
        this.f17019a = file;
        this.f17020b = eVar;
        this.f17021c = lVar;
        this.f17022d = lVar2;
        this.f17023e = pVar;
        this.f17024f = i10;
    }

    public Iterator<File> iterator() {
        return new b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ d(File file, e eVar, l lVar, l lVar2, p pVar, int i10, int i11, g gVar) {
        this(file, (i11 & 2) != 0 ? e.TOP_DOWN : eVar, lVar, lVar2, pVar, (i11 & 32) != 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(File file, e eVar) {
        this(file, eVar, (l) null, (l) null, (p) null, 0, 32, (g) null);
        m.f(file, "start");
        m.f(eVar, "direction");
    }
}
