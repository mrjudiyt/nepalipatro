package j2;

import j2.a;
import java.io.File;

/* compiled from: DiskLruCacheFactory */
public class d implements a.C0154a {

    /* renamed from: a  reason: collision with root package name */
    private final long f9406a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9407b;

    /* compiled from: DiskLruCacheFactory */
    public interface a {
        File a();
    }

    public d(a aVar, long j10) {
        this.f9406a = j10;
        this.f9407b = aVar;
    }

    public a build() {
        File a10 = this.f9407b.a();
        if (a10 == null) {
            return null;
        }
        if (a10.mkdirs() || (a10.exists() && a10.isDirectory())) {
            return e.c(a10, this.f9406a);
        }
        return null;
    }
}
