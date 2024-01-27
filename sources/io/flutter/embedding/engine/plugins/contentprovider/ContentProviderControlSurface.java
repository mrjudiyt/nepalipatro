package io.flutter.embedding.engine.plugins.contentprovider;

import android.content.ContentProvider;
import androidx.lifecycle.h;

public interface ContentProviderControlSurface {
    void attachToContentProvider(ContentProvider contentProvider, h hVar);

    void detachFromContentProvider();
}
