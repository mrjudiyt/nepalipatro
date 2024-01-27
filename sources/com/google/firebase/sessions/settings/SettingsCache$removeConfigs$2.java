package com.google.firebase.sessions.settings;

import j0.a;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import o8.m;
import o8.q;
import r8.d;
import y8.p;

@f(c = "com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
/* compiled from: SettingsCache.kt */
final class SettingsCache$removeConfigs$2 extends k implements p<a, d<? super q>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SettingsCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SettingsCache$removeConfigs$2(SettingsCache settingsCache, d<? super SettingsCache$removeConfigs$2> dVar) {
        super(2, dVar);
        this.this$0 = settingsCache;
    }

    public final d<q> create(Object obj, d<?> dVar) {
        SettingsCache$removeConfigs$2 settingsCache$removeConfigs$2 = new SettingsCache$removeConfigs$2(this.this$0, dVar);
        settingsCache$removeConfigs$2.L$0 = obj;
        return settingsCache$removeConfigs$2;
    }

    public final Object invoke(a aVar, d<? super q> dVar) {
        return ((SettingsCache$removeConfigs$2) create(aVar, dVar)).invokeSuspend(q.f16189a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            m.b(obj);
            a aVar = (a) this.L$0;
            aVar.f();
            this.this$0.updateSessionConfigs(aVar);
            return q.f16189a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
