package com.facebook.internal;

import android.util.Pair;
import androidx.activity.result.b;
import com.facebook.CallbackManager;
import kotlin.jvm.internal.y;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CallbackManager f6059a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6060b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ y f6061c;

    public /* synthetic */ a(CallbackManager callbackManager, int i10, y yVar) {
        this.f6059a = callbackManager;
        this.f6060b = i10;
        this.f6061c = yVar;
    }

    public final void a(Object obj) {
        DialogPresenter.m89startActivityForResultWithAndroidX$lambda2(this.f6059a, this.f6060b, this.f6061c, (Pair) obj);
    }
}
