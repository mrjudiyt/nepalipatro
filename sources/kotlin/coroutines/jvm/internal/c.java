package kotlin.coroutines.jvm.internal;

import r8.d;
import r8.g;

/* compiled from: ContinuationImpl.kt */
public final class c implements d<Object> {

    /* renamed from: h  reason: collision with root package name */
    public static final c f15547h = new c();

    private c() {
    }

    public g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
