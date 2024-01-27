package com.facebook.appevents.codeless;

import java.util.TimerTask;

/* compiled from: ViewIndexer.kt */
public final class ViewIndexer$schedule$indexingTask$1 extends TimerTask {
    final /* synthetic */ ViewIndexer this$0;

    ViewIndexer$schedule$indexingTask$1(ViewIndexer viewIndexer) {
        this.this$0 = viewIndexer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        com.facebook.appevents.codeless.ViewIndexer.access$getTAG$cp();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0058 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x007e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r7 = this;
            com.facebook.appevents.codeless.ViewIndexer r0 = r7.this$0     // Catch:{ Exception -> 0x0091 }
            java.lang.ref.WeakReference r0 = com.facebook.appevents.codeless.ViewIndexer.access$getActivityReference$p(r0)     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0091 }
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ Exception -> 0x0091 }
            com.facebook.appevents.internal.AppEventUtility r1 = com.facebook.appevents.internal.AppEventUtility.INSTANCE     // Catch:{ Exception -> 0x0091 }
            android.view.View r1 = com.facebook.appevents.internal.AppEventUtility.getRootView(r0)     // Catch:{ Exception -> 0x0091 }
            if (r0 == 0) goto L_0x0090
            if (r1 != 0) goto L_0x0018
            goto L_0x0090
        L_0x0018:
            java.lang.Class r0 = r0.getClass()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r0 = r0.getSimpleName()     // Catch:{ Exception -> 0x0091 }
            com.facebook.appevents.codeless.CodelessManager r2 = com.facebook.appevents.codeless.CodelessManager.INSTANCE     // Catch:{ Exception -> 0x0091 }
            boolean r2 = com.facebook.appevents.codeless.CodelessManager.getIsAppIndexingEnabled$facebook_core_release()     // Catch:{ Exception -> 0x0091 }
            if (r2 != 0) goto L_0x0029
            return
        L_0x0029:
            com.facebook.internal.InternalSettings r2 = com.facebook.internal.InternalSettings.INSTANCE     // Catch:{ Exception -> 0x0091 }
            boolean r2 = com.facebook.internal.InternalSettings.isUnityApp()     // Catch:{ Exception -> 0x0091 }
            if (r2 == 0) goto L_0x0037
            com.facebook.appevents.codeless.internal.UnityReflection r0 = com.facebook.appevents.codeless.internal.UnityReflection.INSTANCE     // Catch:{ Exception -> 0x0091 }
            com.facebook.appevents.codeless.internal.UnityReflection.captureViewHierarchy()     // Catch:{ Exception -> 0x0091 }
            return
        L_0x0037:
            java.util.concurrent.FutureTask r2 = new java.util.concurrent.FutureTask     // Catch:{ Exception -> 0x0091 }
            com.facebook.appevents.codeless.ViewIndexer$ScreenshotTaker r3 = new com.facebook.appevents.codeless.ViewIndexer$ScreenshotTaker     // Catch:{ Exception -> 0x0091 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0091 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0091 }
            com.facebook.appevents.codeless.ViewIndexer r3 = r7.this$0     // Catch:{ Exception -> 0x0091 }
            android.os.Handler r3 = com.facebook.appevents.codeless.ViewIndexer.access$getUiThreadHandler$p(r3)     // Catch:{ Exception -> 0x0091 }
            r3.post(r2)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r3 = ""
            r4 = 1
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x0058 }
            java.lang.Object r2 = r2.get(r4, r6)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0058 }
            r3 = r2
            goto L_0x005b
        L_0x0058:
            com.facebook.appevents.codeless.ViewIndexer.access$getTAG$cp()     // Catch:{ Exception -> 0x0091 }
        L_0x005b:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0091 }
            r2.<init>()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r4 = "screenname"
            r2.put(r4, r0)     // Catch:{ JSONException -> 0x007e }
            java.lang.String r0 = "screenshot"
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x007e }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x007e }
            r0.<init>()     // Catch:{ JSONException -> 0x007e }
            com.facebook.appevents.codeless.internal.ViewHierarchy r3 = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE     // Catch:{ JSONException -> 0x007e }
            org.json.JSONObject r1 = com.facebook.appevents.codeless.internal.ViewHierarchy.getDictionaryOfView(r1)     // Catch:{ JSONException -> 0x007e }
            r0.put(r1)     // Catch:{ JSONException -> 0x007e }
            java.lang.String r1 = "view"
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x007e }
            goto L_0x0081
        L_0x007e:
            com.facebook.appevents.codeless.ViewIndexer.access$getTAG$cp()     // Catch:{ Exception -> 0x0091 }
        L_0x0081:
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r1 = "viewTree.toString()"
            kotlin.jvm.internal.m.e(r0, r1)     // Catch:{ Exception -> 0x0091 }
            com.facebook.appevents.codeless.ViewIndexer r1 = r7.this$0     // Catch:{ Exception -> 0x0091 }
            com.facebook.appevents.codeless.ViewIndexer.access$sendToServer(r1, r0)     // Catch:{ Exception -> 0x0091 }
            goto L_0x0094
        L_0x0090:
            return
        L_0x0091:
            com.facebook.appevents.codeless.ViewIndexer.access$getTAG$cp()
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.ViewIndexer$schedule$indexingTask$1.run():void");
    }
}
