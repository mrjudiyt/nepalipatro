package androidx.work;

import android.os.Build;
import androidx.work.x;

/* compiled from: OneTimeWorkRequest */
public final class o extends x {

    /* compiled from: OneTimeWorkRequest */
    public static final class a extends x.a<a, o> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f4948c.f12258d = OverwritingInputMerger.class.getName();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public o c() {
            if (!this.f4946a || Build.VERSION.SDK_INT < 23 || !this.f4948c.f12264j.h()) {
                return new o(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public a d() {
            return this;
        }
    }

    o(a aVar) {
        super(aVar.f4947b, aVar.f4948c, aVar.f4949d);
    }

    public static o d(Class<? extends ListenableWorker> cls) {
        return (o) new a(cls).b();
    }
}
