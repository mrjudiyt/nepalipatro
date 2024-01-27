package com.google.firebase.sessions.settings;

import j0.d;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", l = {112}, m = "updateConfigValue")
/* compiled from: SettingsCache.kt */
final class SettingsCache$updateConfigValue$1<T> extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SettingsCache$updateConfigValue$1(SettingsCache settingsCache, r8.d<? super SettingsCache$updateConfigValue$1> dVar) {
        super(dVar);
        this.this$0 = settingsCache;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateConfigValue((d.a) null, null, this);
    }
}
