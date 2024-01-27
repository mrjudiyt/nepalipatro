package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.BuildConfig;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;

@Keep
/* compiled from: Logging.kt */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    public List<Component<?>> getComponents() {
        return o.b(LibraryVersionComponent.create(LoggingKt.LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
