package com.google.firebase.sessions.settings;

import j0.a;
import j0.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import o8.m;
import o8.q;
import r8.d;
import y8.p;

@f(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
/* compiled from: SettingsCache.kt */
final class SettingsCache$updateConfigValue$2 extends k implements p<a, d<? super q>, Object> {
    final /* synthetic */ d.a<T> $key;
    final /* synthetic */ T $value;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SettingsCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SettingsCache$updateConfigValue$2(T t10, d.a<T> aVar, SettingsCache settingsCache, r8.d<? super SettingsCache$updateConfigValue$2> dVar) {
        super(2, dVar);
        this.$value = t10;
        this.$key = aVar;
        this.this$0 = settingsCache;
    }

    public final r8.d<q> create(Object obj, r8.d<?> dVar) {
        SettingsCache$updateConfigValue$2 settingsCache$updateConfigValue$2 = new SettingsCache$updateConfigValue$2(this.$value, this.$key, this.this$0, dVar);
        settingsCache$updateConfigValue$2.L$0 = obj;
        return settingsCache$updateConfigValue$2;
    }

    public final Object invoke(a aVar, r8.d<? super q> dVar) {
        return ((SettingsCache$updateConfigValue$2) create(aVar, dVar)).invokeSuspend(q.f16189a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            m.b(obj);
            a aVar = (a) this.L$0;
            T t10 = this.$value;
            if (t10 != null) {
                aVar.j(this.$key, t10);
            } else {
                aVar.i(this.$key);
            }
            this.this$0.updateSessionConfigs(aVar);
            return q.f16189a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
