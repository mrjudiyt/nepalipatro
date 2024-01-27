package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.b;
import androidx.core.content.a;
import androidx.core.util.h;

/* compiled from: FragmentHostCallback */
public abstract class k<E> extends g {

    /* renamed from: h  reason: collision with root package name */
    private final Activity f3206h;

    /* renamed from: i  reason: collision with root package name */
    private final Context f3207i;

    /* renamed from: j  reason: collision with root package name */
    private final Handler f3208j;

    /* renamed from: k  reason: collision with root package name */
    private final int f3209k;

    /* renamed from: l  reason: collision with root package name */
    final n f3210l;

    k(e eVar) {
        this(eVar, eVar, new Handler(), 0);
    }

    public View c(int i10) {
        return null;
    }

    public boolean d() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public Activity e() {
        return this.f3206h;
    }

    /* access modifiers changed from: package-private */
    public Context f() {
        return this.f3207i;
    }

    /* access modifiers changed from: package-private */
    public Handler g() {
        return this.f3208j;
    }

    public abstract E h();

    public LayoutInflater i() {
        return LayoutInflater.from(this.f3207i);
    }

    @Deprecated
    public void j(Fragment fragment, String[] strArr, int i10) {
    }

    public boolean k(Fragment fragment) {
        return true;
    }

    public boolean l(String str) {
        return false;
    }

    public void m(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            a.o(this.f3207i, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    public void n(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (i10 == -1) {
            b.B(this.f3206h, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }

    public void o() {
    }

    k(Activity activity, Context context, Handler handler, int i10) {
        this.f3210l = new o();
        this.f3206h = activity;
        this.f3207i = (Context) h.c(context, "context == null");
        this.f3208j = (Handler) h.c(handler, "handler == null");
        this.f3209k = i10;
    }
}
