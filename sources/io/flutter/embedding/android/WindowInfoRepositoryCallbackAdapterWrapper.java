package io.flutter.embedding.android;

import android.app.Activity;
import androidx.window.layout.u;
import java.util.concurrent.Executor;
import n1.a;

public class WindowInfoRepositoryCallbackAdapterWrapper {
    final a adapter;

    public WindowInfoRepositoryCallbackAdapterWrapper(a aVar) {
        this.adapter = aVar;
    }

    public void addWindowLayoutInfoListener(Activity activity, Executor executor, androidx.core.util.a<u> aVar) {
        this.adapter.c(activity, executor, aVar);
    }

    public void removeWindowLayoutInfoListener(androidx.core.util.a<u> aVar) {
        this.adapter.e(aVar);
    }
}
