package com.google.common.util.concurrent;

import com.google.common.collect.b0;
import com.google.common.collect.i0;
import com.google.common.collect.j0;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

public class CycleDetectingLockFactory {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, c>> f13744a = new j0().l().i();

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f13745b = Logger.getLogger(CycleDetectingLockFactory.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private static final ThreadLocal<ArrayList<c>> f13746c = new a();

    public static final class PotentialDeadlockException extends b {

        /* renamed from: j  reason: collision with root package name */
        private final b f13747j;

        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb = new StringBuilder(message);
            for (Throwable th = this.f13747j; th != null; th = th.getCause()) {
                sb.append(", ");
                sb.append(th.getMessage());
            }
            return sb.toString();
        }
    }

    class a extends ThreadLocal<ArrayList<c>> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayList<c> initialValue() {
            return i0.k(3);
        }
    }

    private static class b extends IllegalStateException {

        /* renamed from: h  reason: collision with root package name */
        static final StackTraceElement[] f13748h = new StackTraceElement[0];

        /* renamed from: i  reason: collision with root package name */
        static final b0<String> f13749i = b0.v(CycleDetectingLockFactory.class.getName(), b.class.getName(), c.class.getName());
    }

    private static class c {
    }
}
