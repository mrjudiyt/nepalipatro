package com.google.firebase.sessions;

import android.os.Message;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
public final class SessionLifecycleClient$sendLifecycleEvents$1$invokeSuspend$$inlined$sortedBy$1<T> implements Comparator {
    public final int compare(T t10, T t11) {
        return b.a(Long.valueOf(((Message) t10).getWhen()), Long.valueOf(((Message) t11).getWhen()));
    }
}
