package j2;

import android.content.Context;
import j2.d;
import java.io.File;

/* compiled from: InternalCacheDiskCacheFactory */
public final class f extends d {

    /* compiled from: InternalCacheDiskCacheFactory */
    class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f9413a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9414b;

        a(Context context, String str) {
            this.f9413a = context;
            this.f9414b = str;
        }

        public File a() {
            File cacheDir = this.f9413a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f9414b != null ? new File(cacheDir, this.f9414b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
