package androidx.work;

import android.os.Build;
import com.google.android.gms.common.api.Api;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Configuration */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    final Executor f4706a;

    /* renamed from: b  reason: collision with root package name */
    final Executor f4707b;

    /* renamed from: c  reason: collision with root package name */
    final y f4708c;

    /* renamed from: d  reason: collision with root package name */
    final k f4709d;

    /* renamed from: e  reason: collision with root package name */
    final t f4710e;

    /* renamed from: f  reason: collision with root package name */
    final i f4711f;

    /* renamed from: g  reason: collision with root package name */
    final String f4712g;

    /* renamed from: h  reason: collision with root package name */
    final int f4713h;

    /* renamed from: i  reason: collision with root package name */
    final int f4714i;

    /* renamed from: j  reason: collision with root package name */
    final int f4715j;

    /* renamed from: k  reason: collision with root package name */
    final int f4716k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f4717l;

    /* compiled from: Configuration */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f4718a = new AtomicInteger(0);

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f4719b;

        a(boolean z10) {
            this.f4719b = z10;
        }

        public Thread newThread(Runnable runnable) {
            String str = this.f4719b ? "WM.task-" : "androidx.work-";
            return new Thread(runnable, str + this.f4718a.incrementAndGet());
        }
    }

    /* renamed from: androidx.work.b$b  reason: collision with other inner class name */
    /* compiled from: Configuration */
    public static final class C0083b {

        /* renamed from: a  reason: collision with root package name */
        Executor f4721a;

        /* renamed from: b  reason: collision with root package name */
        y f4722b;

        /* renamed from: c  reason: collision with root package name */
        k f4723c;

        /* renamed from: d  reason: collision with root package name */
        Executor f4724d;

        /* renamed from: e  reason: collision with root package name */
        t f4725e;

        /* renamed from: f  reason: collision with root package name */
        i f4726f;

        /* renamed from: g  reason: collision with root package name */
        String f4727g;

        /* renamed from: h  reason: collision with root package name */
        int f4728h = 4;

        /* renamed from: i  reason: collision with root package name */
        int f4729i = 0;

        /* renamed from: j  reason: collision with root package name */
        int f4730j = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* renamed from: k  reason: collision with root package name */
        int f4731k = 20;

        public b a() {
            return new b(this);
        }
    }

    /* compiled from: Configuration */
    public interface c {
        b a();
    }

    b(C0083b bVar) {
        Executor executor = bVar.f4721a;
        if (executor == null) {
            this.f4706a = a(false);
        } else {
            this.f4706a = executor;
        }
        Executor executor2 = bVar.f4724d;
        if (executor2 == null) {
            this.f4717l = true;
            this.f4707b = a(true);
        } else {
            this.f4717l = false;
            this.f4707b = executor2;
        }
        y yVar = bVar.f4722b;
        if (yVar == null) {
            this.f4708c = y.c();
        } else {
            this.f4708c = yVar;
        }
        k kVar = bVar.f4723c;
        if (kVar == null) {
            this.f4709d = k.c();
        } else {
            this.f4709d = kVar;
        }
        t tVar = bVar.f4725e;
        if (tVar == null) {
            this.f4710e = new o1.a();
        } else {
            this.f4710e = tVar;
        }
        this.f4713h = bVar.f4728h;
        this.f4714i = bVar.f4729i;
        this.f4715j = bVar.f4730j;
        this.f4716k = bVar.f4731k;
        this.f4711f = bVar.f4726f;
        this.f4712g = bVar.f4727g;
    }

    private Executor a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z10));
    }

    private ThreadFactory b(boolean z10) {
        return new a(z10);
    }

    public String c() {
        return this.f4712g;
    }

    public i d() {
        return this.f4711f;
    }

    public Executor e() {
        return this.f4706a;
    }

    public k f() {
        return this.f4709d;
    }

    public int g() {
        return this.f4715j;
    }

    public int h() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.f4716k / 2;
        }
        return this.f4716k;
    }

    public int i() {
        return this.f4714i;
    }

    public int j() {
        return this.f4713h;
    }

    public t k() {
        return this.f4710e;
    }

    public Executor l() {
        return this.f4707b;
    }

    public y m() {
        return this.f4708c;
    }
}
