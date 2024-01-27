package com.google.firebase.sessions.settings;

import i9.l0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import o8.m;
import o8.q;
import r8.d;
import y8.p;

@f(c = "com.google.firebase.sessions.settings.RemoteSettings$clearCachedSettings$1", f = "RemoteSettings.kt", l = {151}, m = "invokeSuspend")
/* compiled from: RemoteSettings.kt */
final class RemoteSettings$clearCachedSettings$1 extends k implements p<l0, d<? super q>, Object> {
    int label;
    final /* synthetic */ RemoteSettings this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RemoteSettings$clearCachedSettings$1(RemoteSettings remoteSettings, d<? super RemoteSettings$clearCachedSettings$1> dVar) {
        super(2, dVar);
        this.this$0 = remoteSettings;
    }

    public final d<q> create(Object obj, d<?> dVar) {
        return new RemoteSettings$clearCachedSettings$1(this.this$0, dVar);
    }

    public final Object invoke(l0 l0Var, d<? super q> dVar) {
        return ((RemoteSettings$clearCachedSettings$1) create(l0Var, dVar)).invokeSuspend(q.f16189a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            SettingsCache access$getSettingsCache$p = this.this$0.settingsCache;
            this.label = 1;
            if (access$getSettingsCache$p.removeConfigs$com_google_firebase_firebase_sessions(this) == c10) {
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
