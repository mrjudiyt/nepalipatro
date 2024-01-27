package com.google.firebase.remoteconfig;

import k9.n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import o8.m;
import o8.q;
import r8.d;
import y8.a;
import y8.p;

@f(c = "com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1", f = "RemoteConfig.kt", l = {71}, m = "invokeSuspend")
/* compiled from: RemoteConfig.kt */
final class RemoteConfigKt$configUpdates$1 extends k implements p<k9.p<? super ConfigUpdate>, d<? super q>, Object> {
    final /* synthetic */ FirebaseRemoteConfig $this_configUpdates;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RemoteConfigKt$configUpdates$1(FirebaseRemoteConfig firebaseRemoteConfig, d<? super RemoteConfigKt$configUpdates$1> dVar) {
        super(2, dVar);
        this.$this_configUpdates = firebaseRemoteConfig;
    }

    public final d<q> create(Object obj, d<?> dVar) {
        RemoteConfigKt$configUpdates$1 remoteConfigKt$configUpdates$1 = new RemoteConfigKt$configUpdates$1(this.$this_configUpdates, dVar);
        remoteConfigKt$configUpdates$1.L$0 = obj;
        return remoteConfigKt$configUpdates$1;
    }

    public final Object invoke(k9.p<? super ConfigUpdate> pVar, d<? super q> dVar) {
        return ((RemoteConfigKt$configUpdates$1) create(pVar, dVar)).invokeSuspend(q.f16189a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            k9.p pVar = (k9.p) this.L$0;
            FirebaseRemoteConfig firebaseRemoteConfig = this.$this_configUpdates;
            final ConfigUpdateListenerRegistration addOnConfigUpdateListener = firebaseRemoteConfig.addOnConfigUpdateListener(new RemoteConfigKt$configUpdates$1$registration$1(firebaseRemoteConfig, pVar));
            kotlin.jvm.internal.m.e(addOnConfigUpdateListener, "FirebaseRemoteConfig.con…      }\n        }\n      )");
            AnonymousClass1 r32 = new a<q>() {
                public final void invoke() {
                    addOnConfigUpdateListener.remove();
                }
            };
            this.label = 1;
            if (n.a(pVar, r32, this) == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            m.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f16189a;
    }
}
