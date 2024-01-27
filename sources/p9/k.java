package p9;

import i9.q0;

/* compiled from: Tasks.kt */
public final class k extends h {

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f16258j;

    public k(Runnable runnable, long j10, i iVar) {
        super(j10, iVar);
        this.f16258j = runnable;
    }

    public void run() {
        try {
            this.f16258j.run();
        } finally {
            this.f16256i.a();
        }
    }

    public String toString() {
        return "Task[" + q0.a(this.f16258j) + '@' + q0.b(this.f16258j) + ", " + this.f16255h + ", " + this.f16256i + ']';
    }
}
