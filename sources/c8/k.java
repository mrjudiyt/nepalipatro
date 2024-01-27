package c8;

/* compiled from: DatabaseTask */
final class k {

    /* renamed from: a  reason: collision with root package name */
    private final j f13404a;

    /* renamed from: b  reason: collision with root package name */
    final Runnable f13405b;

    k(j jVar, Runnable runnable) {
        this.f13404a = jVar;
        this.f13405b = runnable;
    }

    public Integer a() {
        j jVar = this.f13404a;
        if (jVar != null) {
            return Integer.valueOf(jVar.a());
        }
        return null;
    }

    public boolean b() {
        j jVar = this.f13404a;
        return jVar != null && jVar.b();
    }
}
