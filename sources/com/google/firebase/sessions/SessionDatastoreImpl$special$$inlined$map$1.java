package com.google.firebase.sessions;

import l9.d;
import l9.e;
import o8.q;

/* compiled from: SafeCollector.common.kt */
public final class SessionDatastoreImpl$special$$inlined$map$1 implements d<FirebaseSessionsData> {
    final /* synthetic */ d $this_unsafeTransform$inlined;
    final /* synthetic */ SessionDatastoreImpl this$0;

    public SessionDatastoreImpl$special$$inlined$map$1(d dVar, SessionDatastoreImpl sessionDatastoreImpl) {
        this.$this_unsafeTransform$inlined = dVar;
        this.this$0 = sessionDatastoreImpl;
    }

    public Object collect(final e eVar, r8.d dVar) {
        d dVar2 = this.$this_unsafeTransform$inlined;
        final SessionDatastoreImpl sessionDatastoreImpl = this.this$0;
        Object collect = dVar2.collect(new e() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, r8.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2$1 r0 = (com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2$1 r0 = new com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = s8.d.c()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    o8.m.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    o8.m.b(r6)
                    l9.e r6 = r4
                    j0.d r5 = (j0.d) r5
                    com.google.firebase.sessions.SessionDatastoreImpl r2 = r2
                    com.google.firebase.sessions.FirebaseSessionsData r5 = r2.mapSessionsData(r5)
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    o8.q r5 = o8.q.f16189a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, r8.d):java.lang.Object");
            }
        }, dVar);
        if (collect == d.c()) {
            return collect;
        }
        return q.f16189a;
    }
}
