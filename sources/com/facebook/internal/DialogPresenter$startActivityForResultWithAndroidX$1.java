package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import e.a;
import kotlin.jvm.internal.m;

/* compiled from: DialogPresenter.kt */
public final class DialogPresenter$startActivityForResultWithAndroidX$1 extends a<Intent, Pair<Integer, Intent>> {
    DialogPresenter$startActivityForResultWithAndroidX$1() {
    }

    public Intent createIntent(Context context, Intent intent) {
        m.f(context, "context");
        m.f(intent, "input");
        return intent;
    }

    public Pair<Integer, Intent> parseResult(int i10, Intent intent) {
        Pair<Integer, Intent> create = Pair.create(Integer.valueOf(i10), intent);
        m.e(create, "create(resultCode, intent)");
        return create;
    }
}
