package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.l0;
import androidx.lifecycle.m;
import androidx.loader.content.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManager */
public abstract class a {

    /* renamed from: androidx.loader.app.a$a  reason: collision with other inner class name */
    /* compiled from: LoaderManager */
    public interface C0056a<D> {
        b<D> onCreateLoader(int i10, Bundle bundle);

        void onLoadFinished(b<D> bVar, D d10);

        void onLoaderReset(b<D> bVar);
    }

    public static <T extends m & l0> a b(T t10) {
        return new b(t10, ((l0) t10).getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> b<D> c(int i10, Bundle bundle, C0056a<D> aVar);

    public abstract void d();
}
