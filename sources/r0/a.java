package r0;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import java.util.List;

/* compiled from: MediaButtonReceiver */
public class a extends BroadcastReceiver {

    /* renamed from: r0.a$a  reason: collision with other inner class name */
    /* compiled from: MediaButtonReceiver */
    private static class C0187a extends MediaBrowserCompat.c {

        /* renamed from: c  reason: collision with root package name */
        private final Context f10802c;

        /* renamed from: d  reason: collision with root package name */
        private final Intent f10803d;

        /* renamed from: e  reason: collision with root package name */
        private final BroadcastReceiver.PendingResult f10804e;

        /* renamed from: f  reason: collision with root package name */
        private MediaBrowserCompat f10805f;

        C0187a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f10802c = context;
            this.f10803d = intent;
            this.f10804e = pendingResult;
        }

        private void e() {
            this.f10805f.b();
            this.f10804e.finish();
        }

        public void a() {
            new MediaControllerCompat(this.f10802c, this.f10805f.c()).a((KeyEvent) this.f10803d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            e();
        }

        public void b() {
            e();
        }

        public void c() {
            e();
        }

        /* access modifiers changed from: package-private */
        public void f(MediaBrowserCompat mediaBrowserCompat) {
            this.f10805f = mediaBrowserCompat;
        }
    }

    public static ComponentName a(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        queryBroadcastReceivers.size();
        return null;
    }

    private static ComponentName b(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }

    public static KeyEvent c(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        mediaSessionCompat.b().a(keyEvent);
        return keyEvent;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignore unsupported intent: ");
            sb.append(intent);
            return;
        }
        ComponentName b10 = b(context, "android.intent.action.MEDIA_BUTTON");
        if (b10 != null) {
            intent.setComponent(b10);
            androidx.core.content.a.p(context, intent);
            return;
        }
        ComponentName b11 = b(context, "android.media.browse.MediaBrowserService");
        if (b11 != null) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            C0187a aVar = new C0187a(applicationContext, intent, goAsync);
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, b11, aVar, (Bundle) null);
            aVar.f(mediaBrowserCompat);
            mediaBrowserCompat.a();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }
}
