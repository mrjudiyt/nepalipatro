package z3;

import android.app.job.JobInfo;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import q3.d;
import z3.d;

@AutoValue
/* compiled from: SchedulerConfig */
public abstract class g {

    /* compiled from: SchedulerConfig */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private c4.a f13154a;

        /* renamed from: b  reason: collision with root package name */
        private Map<d, b> f13155b = new HashMap();

        public a a(d dVar, b bVar) {
            this.f13155b.put(dVar, bVar);
            return this;
        }

        public g b() {
            Objects.requireNonNull(this.f13154a, "missing required property: clock");
            if (this.f13155b.keySet().size() >= d.values().length) {
                Map<d, b> map = this.f13155b;
                this.f13155b = new HashMap();
                return g.d(this.f13154a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        public a c(c4.a aVar) {
            this.f13154a = aVar;
            return this;
        }
    }

    @AutoValue
    /* compiled from: SchedulerConfig */
    public static abstract class b {

        @AutoValue.Builder
        /* compiled from: SchedulerConfig */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set<c> set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new d.b().c(Collections.emptySet());
        }

        /* access modifiers changed from: package-private */
        public abstract long b();

        /* access modifiers changed from: package-private */
        public abstract Set<c> c();

        /* access modifiers changed from: package-private */
        public abstract long d();
    }

    /* compiled from: SchedulerConfig */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        int i11 = i10 - 1;
        return (long) (Math.pow(3.0d, (double) i11) * ((double) j10) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((j10 > 1 ? j10 : 2) * ((long) i11)))));
    }

    public static a b() {
        return new a();
    }

    static g d(c4.a aVar, Map<q3.d, b> map) {
        return new c(aVar, map);
    }

    public static g f(c4.a aVar) {
        return b().a(q3.d.DEFAULT, b.a().b(30000).d(86400000).a()).a(q3.d.HIGHEST, b.a().b(1000).d(86400000).a()).a(q3.d.VERY_LOW, b.a().b(86400000).d(86400000).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, q3.d dVar, long j10, int i10) {
        builder.setMinimumLatency(g(dVar, j10, i10));
        j(builder, h().get(dVar).c());
        return builder;
    }

    /* access modifiers changed from: package-private */
    public abstract c4.a e();

    public long g(q3.d dVar, long j10, int i10) {
        long a10 = j10 - e().a();
        b bVar = h().get(dVar);
        return Math.min(Math.max(a(i10, bVar.b()), a10), bVar.d());
    }

    /* access modifiers changed from: package-private */
    public abstract Map<q3.d, b> h();
}
