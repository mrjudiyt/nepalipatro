package dev.fluttercommunity.plus.share;

import android.content.Context;
import android.content.Intent;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: ShareSuccessManager.kt */
public final class a implements PluginRegistry.ActivityResultListener {

    /* renamed from: k  reason: collision with root package name */
    public static final C0248a f14224k = new C0248a((g) null);

    /* renamed from: h  reason: collision with root package name */
    private final Context f14225h;

    /* renamed from: i  reason: collision with root package name */
    private MethodChannel.Result f14226i;

    /* renamed from: j  reason: collision with root package name */
    private AtomicBoolean f14227j = new AtomicBoolean(true);

    /* renamed from: dev.fluttercommunity.plus.share.a$a  reason: collision with other inner class name */
    /* compiled from: ShareSuccessManager.kt */
    public static final class C0248a {
        private C0248a() {
        }

        public /* synthetic */ C0248a(g gVar) {
            this();
        }
    }

    public a(Context context) {
        m.f(context, "context");
        this.f14225h = context;
    }

    private final void a(String str) {
        MethodChannel.Result result;
        if (this.f14227j.compareAndSet(false, true) && (result = this.f14226i) != null) {
            m.c(result);
            result.success(str);
            this.f14226i = null;
        }
    }

    public final boolean b(MethodChannel.Result result) {
        m.f(result, "callback");
        if (this.f14227j.compareAndSet(true, false)) {
            SharePlusPendingIntent.f14222a.b("");
            this.f14227j.set(false);
            this.f14226i = result;
            return true;
        }
        result.error("Share callback error", "prior share-sheet did not call back, did you await it? Maybe use non-result variant", (Object) null);
        return false;
    }

    public final void c() {
        a("dev.fluttercommunity.plus/share/unavailable");
    }

    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 22643) {
            return false;
        }
        a(SharePlusPendingIntent.f14222a.a());
        return true;
    }
}
