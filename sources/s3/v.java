package s3;

import a4.d;
import android.content.Context;
import java.io.Closeable;

/* compiled from: TransportRuntimeComponent */
abstract class v implements Closeable {

    /* compiled from: TransportRuntimeComponent */
    interface a {
        a a(Context context);

        v build();
    }

    v() {
    }

    /* access modifiers changed from: package-private */
    public abstract d a();

    public void close() {
        a().close();
    }

    /* access modifiers changed from: package-private */
    public abstract u h();
}
