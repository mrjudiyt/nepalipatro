package j2;

import android.util.Log;
import c2.a;
import j2.a;
import java.io.File;
import java.io.IOException;

/* compiled from: DiskLruCacheWrapper */
public class e implements a {

    /* renamed from: a  reason: collision with root package name */
    private final j f9408a;

    /* renamed from: b  reason: collision with root package name */
    private final File f9409b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9410c;

    /* renamed from: d  reason: collision with root package name */
    private final c f9411d = new c();

    /* renamed from: e  reason: collision with root package name */
    private a f9412e;

    @Deprecated
    protected e(File file, long j10) {
        this.f9409b = file;
        this.f9410c = j10;
        this.f9408a = new j();
    }

    public static a c(File file, long j10) {
        return new e(file, j10);
    }

    private synchronized a d() {
        if (this.f9412e == null) {
            this.f9412e = a.s0(this.f9409b, 1, 1, this.f9410c);
        }
        return this.f9412e;
    }

    public void a(e2.e eVar, a.b bVar) {
        a.c h02;
        String b10 = this.f9408a.b(eVar);
        this.f9411d.a(b10);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Put: Obtained: ");
                sb.append(b10);
                sb.append(" for for Key: ");
                sb.append(eVar);
            }
            try {
                c2.a d10 = d();
                if (d10.o0(b10) == null) {
                    h02 = d10.h0(b10);
                    if (h02 != null) {
                        if (bVar.a(h02.f(0))) {
                            h02.e();
                        }
                        h02.b();
                        this.f9411d.b(b10);
                        return;
                    }
                    throw new IllegalStateException("Had two simultaneous puts for: " + b10);
                }
            } catch (IOException unused) {
                boolean isLoggable = Log.isLoggable("DiskLruCacheWrapper", 5);
            } catch (Throwable th) {
                h02.b();
                throw th;
            }
        } finally {
            this.f9411d.b(b10);
        }
    }

    public File b(e2.e eVar) {
        String b10 = this.f9408a.b(eVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Get: Obtained: ");
            sb.append(b10);
            sb.append(" for for Key: ");
            sb.append(eVar);
        }
        try {
            a.e o02 = d().o0(b10);
            if (o02 != null) {
                return o02.a(0);
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }
}
