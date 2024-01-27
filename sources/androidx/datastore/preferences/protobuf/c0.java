package androidx.datastore.preferences.protobuf;

/* compiled from: LazyFieldLite */
public class c0 {

    /* renamed from: e  reason: collision with root package name */
    private static final o f2719e = o.b();

    /* renamed from: a  reason: collision with root package name */
    private h f2720a;

    /* renamed from: b  reason: collision with root package name */
    private o f2721b;

    /* renamed from: c  reason: collision with root package name */
    protected volatile p0 f2722c;

    /* renamed from: d  reason: collision with root package name */
    private volatile h f2723d;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.f2722c = r4;
        r3.f2723d = androidx.datastore.preferences.protobuf.h.f2754i;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.datastore.preferences.protobuf.p0 r4) {
        /*
            r3 = this;
            androidx.datastore.preferences.protobuf.p0 r0 = r3.f2722c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            androidx.datastore.preferences.protobuf.p0 r0 = r3.f2722c     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x000c:
            androidx.datastore.preferences.protobuf.h r0 = r3.f2720a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            if (r0 == 0) goto L_0x0025
            androidx.datastore.preferences.protobuf.x0 r0 = r4.g()     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            androidx.datastore.preferences.protobuf.h r1 = r3.f2720a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            androidx.datastore.preferences.protobuf.o r2 = r3.f2721b     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            java.lang.Object r0 = r0.a(r1, r2)     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            androidx.datastore.preferences.protobuf.p0 r0 = (androidx.datastore.preferences.protobuf.p0) r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f2722c = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            androidx.datastore.preferences.protobuf.h r0 = r3.f2720a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f2723d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            goto L_0x0032
        L_0x0025:
            r3.f2722c = r4     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            androidx.datastore.preferences.protobuf.h r0 = androidx.datastore.preferences.protobuf.h.f2754i     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f2723d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            goto L_0x0032
        L_0x002c:
            r3.f2722c = r4     // Catch:{ all -> 0x0034 }
            androidx.datastore.preferences.protobuf.h r4 = androidx.datastore.preferences.protobuf.h.f2754i     // Catch:{ all -> 0x0034 }
            r3.f2723d = r4     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.c0.a(androidx.datastore.preferences.protobuf.p0):void");
    }

    public int b() {
        if (this.f2723d != null) {
            return this.f2723d.size();
        }
        h hVar = this.f2720a;
        if (hVar != null) {
            return hVar.size();
        }
        if (this.f2722c != null) {
            return this.f2722c.d();
        }
        return 0;
    }

    public p0 c(p0 p0Var) {
        a(p0Var);
        return this.f2722c;
    }

    public p0 d(p0 p0Var) {
        p0 p0Var2 = this.f2722c;
        this.f2720a = null;
        this.f2723d = null;
        this.f2722c = p0Var;
        return p0Var2;
    }

    public h e() {
        if (this.f2723d != null) {
            return this.f2723d;
        }
        h hVar = this.f2720a;
        if (hVar != null) {
            return hVar;
        }
        synchronized (this) {
            if (this.f2723d != null) {
                h hVar2 = this.f2723d;
                return hVar2;
            }
            if (this.f2722c == null) {
                this.f2723d = h.f2754i;
            } else {
                this.f2723d = this.f2722c.c();
            }
            h hVar3 = this.f2723d;
            return hVar3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        p0 p0Var = this.f2722c;
        p0 p0Var2 = c0Var.f2722c;
        if (p0Var == null && p0Var2 == null) {
            return e().equals(c0Var.e());
        }
        if (p0Var != null && p0Var2 != null) {
            return p0Var.equals(p0Var2);
        }
        if (p0Var != null) {
            return p0Var.equals(c0Var.c(p0Var.a()));
        }
        return c(p0Var2.a()).equals(p0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
