package com.google.firebase.sessions.settings;

import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import o8.q;
import org.json.JSONObject;
import r8.d;
import y8.p;

@f(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {125, 128, 131, 133, 134, 136}, m = "invokeSuspend")
/* compiled from: RemoteSettings.kt */
final class RemoteSettings$updateSettings$2$1 extends k implements p<JSONObject, d<? super q>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ RemoteSettings this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RemoteSettings$updateSettings$2$1(RemoteSettings remoteSettings, d<? super RemoteSettings$updateSettings$2$1> dVar) {
        super(2, dVar);
        this.this$0 = remoteSettings;
    }

    public final d<q> create(Object obj, d<?> dVar) {
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this.this$0, dVar);
        remoteSettings$updateSettings$2$1.L$0 = obj;
        return remoteSettings$updateSettings$2$1;
    }

    public final Object invoke(JSONObject jSONObject, d<? super q> dVar) {
        return ((RemoteSettings$updateSettings$2$1) create(jSONObject, dVar)).invokeSuspend(q.f16189a);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e5, code lost:
        r12 = (java.lang.Integer) r7.f15575h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e9, code lost:
        if (r12 == null) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00eb, code lost:
        r2 = r11.this$0;
        r12.intValue();
        r11.L$0 = r1;
        r11.L$1 = r0;
        r11.L$2 = null;
        r11.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0105, code lost:
        if (r2.settingsCache.updateSessionRestartTimeout((java.lang.Integer) r7.f15575h, r11) != r4) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0107, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0108, code lost:
        r12 = (java.lang.Double) r1.f15575h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010c, code lost:
        if (r12 == null) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010e, code lost:
        r2 = r11.this$0;
        r12.doubleValue();
        r11.L$0 = r0;
        r11.L$1 = null;
        r11.L$2 = null;
        r11.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0128, code lost:
        if (r2.settingsCache.updateSamplingRate((java.lang.Double) r1.f15575h, r11) != r4) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012a, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012b, code lost:
        r12 = (java.lang.Integer) r0.f15575h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012f, code lost:
        if (r12 == null) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0131, code lost:
        r1 = r11.this$0;
        r12.intValue();
        r11.L$0 = null;
        r11.L$1 = null;
        r11.L$2 = null;
        r11.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014b, code lost:
        if (r1.settingsCache.updateSessionCacheDuration((java.lang.Integer) r0.f15575h, r11) != r4) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014d, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014e, code lost:
        r12 = o8.q.f16189a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0151, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0152, code lost:
        if (r12 != null) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0154, code lost:
        r12 = r11.this$0.settingsCache;
        r0 = kotlin.coroutines.jvm.internal.b.b(86400);
        r11.L$0 = null;
        r11.L$1 = null;
        r11.L$2 = null;
        r11.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x016e, code lost:
        if (r12.updateSessionCacheDuration(r0, r11) != r4) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0170, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0171, code lost:
        r12 = r11.this$0.settingsCache;
        r0 = kotlin.coroutines.jvm.internal.b.c(java.lang.System.currentTimeMillis());
        r11.L$0 = null;
        r11.L$1 = null;
        r11.L$2 = null;
        r11.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x018c, code lost:
        if (r12.updateSessionCacheUpdatedTime(r0, r11) != r4) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x018e, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0191, code lost:
        return o8.q.f16189a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r0 = "cache_duration"
            java.lang.String r1 = "session_timeout_seconds"
            java.lang.String r2 = "sampling_rate"
            java.lang.String r3 = "sessions_enabled"
            java.lang.Object r4 = s8.d.c()
            int r5 = r11.label
            r6 = 0
            switch(r5) {
                case 0: goto L_0x0050;
                case 1: goto L_0x003f;
                case 2: goto L_0x0032;
                case 3: goto L_0x0029;
                case 4: goto L_0x0024;
                case 5: goto L_0x001f;
                case 6: goto L_0x001a;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001a:
            o8.m.b(r12)
            goto L_0x018f
        L_0x001f:
            o8.m.b(r12)
            goto L_0x0171
        L_0x0024:
            o8.m.b(r12)
            goto L_0x014e
        L_0x0029:
            java.lang.Object r0 = r11.L$0
            kotlin.jvm.internal.y r0 = (kotlin.jvm.internal.y) r0
            o8.m.b(r12)
            goto L_0x012b
        L_0x0032:
            java.lang.Object r0 = r11.L$1
            kotlin.jvm.internal.y r0 = (kotlin.jvm.internal.y) r0
            java.lang.Object r1 = r11.L$0
            kotlin.jvm.internal.y r1 = (kotlin.jvm.internal.y) r1
            o8.m.b(r12)
            goto L_0x0108
        L_0x003f:
            java.lang.Object r0 = r11.L$2
            kotlin.jvm.internal.y r0 = (kotlin.jvm.internal.y) r0
            java.lang.Object r1 = r11.L$1
            kotlin.jvm.internal.y r1 = (kotlin.jvm.internal.y) r1
            java.lang.Object r2 = r11.L$0
            kotlin.jvm.internal.y r2 = (kotlin.jvm.internal.y) r2
            o8.m.b(r12)
            goto L_0x00e0
        L_0x0050:
            o8.m.b(r12)
            java.lang.Object r12 = r11.L$0
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Fetched settings: "
            r5.append(r7)
            r5.append(r12)
            kotlin.jvm.internal.y r5 = new kotlin.jvm.internal.y
            r5.<init>()
            kotlin.jvm.internal.y r7 = new kotlin.jvm.internal.y
            r7.<init>()
            kotlin.jvm.internal.y r8 = new kotlin.jvm.internal.y
            r8.<init>()
            java.lang.String r9 = "app_quality"
            boolean r10 = r12.has(r9)
            if (r10 == 0) goto L_0x00c1
            java.lang.Object r12 = r12.get(r9)
            java.lang.String r9 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.m.d(r12, r9)
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            boolean r9 = r12.has(r3)     // Catch:{ JSONException -> 0x00c1 }
            if (r9 == 0) goto L_0x0093
            java.lang.Object r3 = r12.get(r3)     // Catch:{ JSONException -> 0x00c1 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ JSONException -> 0x00c1 }
            goto L_0x0094
        L_0x0093:
            r3 = r6
        L_0x0094:
            boolean r9 = r12.has(r2)     // Catch:{ JSONException -> 0x00bf }
            if (r9 == 0) goto L_0x00a2
            java.lang.Object r2 = r12.get(r2)     // Catch:{ JSONException -> 0x00bf }
            java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ JSONException -> 0x00bf }
            r5.f15575h = r2     // Catch:{ JSONException -> 0x00bf }
        L_0x00a2:
            boolean r2 = r12.has(r1)     // Catch:{ JSONException -> 0x00bf }
            if (r2 == 0) goto L_0x00b0
            java.lang.Object r1 = r12.get(r1)     // Catch:{ JSONException -> 0x00bf }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ JSONException -> 0x00bf }
            r7.f15575h = r1     // Catch:{ JSONException -> 0x00bf }
        L_0x00b0:
            boolean r1 = r12.has(r0)     // Catch:{ JSONException -> 0x00bf }
            if (r1 == 0) goto L_0x00c2
            java.lang.Object r12 = r12.get(r0)     // Catch:{ JSONException -> 0x00bf }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ JSONException -> 0x00bf }
            r8.f15575h = r12     // Catch:{ JSONException -> 0x00bf }
            goto L_0x00c2
        L_0x00bf:
            goto L_0x00c2
        L_0x00c1:
            r3 = r6
        L_0x00c2:
            if (r3 == 0) goto L_0x00e3
            com.google.firebase.sessions.settings.RemoteSettings r12 = r11.this$0
            r3.booleanValue()
            com.google.firebase.sessions.settings.SettingsCache r12 = r12.settingsCache
            r11.L$0 = r5
            r11.L$1 = r7
            r11.L$2 = r8
            r0 = 1
            r11.label = r0
            java.lang.Object r12 = r12.updateSettingsEnabled(r3, r11)
            if (r12 != r4) goto L_0x00dd
            return r4
        L_0x00dd:
            r2 = r5
            r1 = r7
            r0 = r8
        L_0x00e0:
            r7 = r1
            r1 = r2
            goto L_0x00e5
        L_0x00e3:
            r1 = r5
            r0 = r8
        L_0x00e5:
            T r12 = r7.f15575h
            java.lang.Integer r12 = (java.lang.Integer) r12
            if (r12 == 0) goto L_0x0108
            com.google.firebase.sessions.settings.RemoteSettings r2 = r11.this$0
            r12.intValue()
            com.google.firebase.sessions.settings.SettingsCache r12 = r2.settingsCache
            T r2 = r7.f15575h
            java.lang.Integer r2 = (java.lang.Integer) r2
            r11.L$0 = r1
            r11.L$1 = r0
            r11.L$2 = r6
            r3 = 2
            r11.label = r3
            java.lang.Object r12 = r12.updateSessionRestartTimeout(r2, r11)
            if (r12 != r4) goto L_0x0108
            return r4
        L_0x0108:
            T r12 = r1.f15575h
            java.lang.Double r12 = (java.lang.Double) r12
            if (r12 == 0) goto L_0x012b
            com.google.firebase.sessions.settings.RemoteSettings r2 = r11.this$0
            r12.doubleValue()
            com.google.firebase.sessions.settings.SettingsCache r12 = r2.settingsCache
            T r1 = r1.f15575h
            java.lang.Double r1 = (java.lang.Double) r1
            r11.L$0 = r0
            r11.L$1 = r6
            r11.L$2 = r6
            r2 = 3
            r11.label = r2
            java.lang.Object r12 = r12.updateSamplingRate(r1, r11)
            if (r12 != r4) goto L_0x012b
            return r4
        L_0x012b:
            T r12 = r0.f15575h
            java.lang.Integer r12 = (java.lang.Integer) r12
            if (r12 == 0) goto L_0x0151
            com.google.firebase.sessions.settings.RemoteSettings r1 = r11.this$0
            r12.intValue()
            com.google.firebase.sessions.settings.SettingsCache r12 = r1.settingsCache
            T r0 = r0.f15575h
            java.lang.Integer r0 = (java.lang.Integer) r0
            r11.L$0 = r6
            r11.L$1 = r6
            r11.L$2 = r6
            r1 = 4
            r11.label = r1
            java.lang.Object r12 = r12.updateSessionCacheDuration(r0, r11)
            if (r12 != r4) goto L_0x014e
            return r4
        L_0x014e:
            o8.q r12 = o8.q.f16189a
            goto L_0x0152
        L_0x0151:
            r12 = r6
        L_0x0152:
            if (r12 != 0) goto L_0x0171
            com.google.firebase.sessions.settings.RemoteSettings r12 = r11.this$0
            com.google.firebase.sessions.settings.SettingsCache r12 = r12.settingsCache
            r0 = 86400(0x15180, float:1.21072E-40)
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.b.b(r0)
            r11.L$0 = r6
            r11.L$1 = r6
            r11.L$2 = r6
            r1 = 5
            r11.label = r1
            java.lang.Object r12 = r12.updateSessionCacheDuration(r0, r11)
            if (r12 != r4) goto L_0x0171
            return r4
        L_0x0171:
            com.google.firebase.sessions.settings.RemoteSettings r12 = r11.this$0
            com.google.firebase.sessions.settings.SettingsCache r12 = r12.settingsCache
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.b.c(r0)
            r11.L$0 = r6
            r11.L$1 = r6
            r11.L$2 = r6
            r1 = 6
            r11.label = r1
            java.lang.Object r12 = r12.updateSessionCacheUpdatedTime(r0, r11)
            if (r12 != r4) goto L_0x018f
            return r4
        L_0x018f:
            o8.q r12 = o8.q.f16189a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
