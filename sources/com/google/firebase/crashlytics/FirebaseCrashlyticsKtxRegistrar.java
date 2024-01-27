package com.google.firebase.crashlytics;

import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.jvm.internal.g;

@Keep
/* compiled from: FirebaseCrashlytics.kt */
public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar {
    public static final Companion Companion = new Companion((g) null);

    /* compiled from: FirebaseCrashlytics.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public List<Component<?>> getComponents() {
        return p.e();
    }
}
