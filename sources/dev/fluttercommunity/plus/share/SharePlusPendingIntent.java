package dev.fluttercommunity.plus.share;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: SharePlusPendingIntent.kt */
public final class SharePlusPendingIntent extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14222a = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static String f14223b = "";

    /* compiled from: SharePlusPendingIntent.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final String a() {
            return SharePlusPendingIntent.f14223b;
        }

        public final void b(String str) {
            m.f(str, "<set-?>");
            SharePlusPendingIntent.f14223b = str;
        }
    }

    public void onReceive(Context context, Intent intent) {
        ComponentName componentName;
        m.f(context, "context");
        m.f(intent, "intent");
        if (Build.VERSION.SDK_INT >= 33) {
            componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT", ComponentName.class);
        } else {
            componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
        }
        if (componentName != null) {
            String flattenToString = componentName.flattenToString();
            m.e(flattenToString, "chosenComponent.flattenToString()");
            f14223b = flattenToString;
        }
    }
}
