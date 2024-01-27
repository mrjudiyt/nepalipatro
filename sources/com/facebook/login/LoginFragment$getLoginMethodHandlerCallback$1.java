package com.facebook.login;

import androidx.activity.result.a;
import androidx.fragment.app.e;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import o8.q;
import y8.l;

/* compiled from: LoginFragment.kt */
final class LoginFragment$getLoginMethodHandlerCallback$1 extends n implements l<a, q> {
    final /* synthetic */ e $activity;
    final /* synthetic */ LoginFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LoginFragment$getLoginMethodHandlerCallback$1(LoginFragment loginFragment, e eVar) {
        super(1);
        this.this$0 = loginFragment;
        this.$activity = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((a) obj);
        return q.f16189a;
    }

    public final void invoke(a aVar) {
        m.f(aVar, "result");
        if (aVar.c() == -1) {
            this.this$0.getLoginClient().onActivityResult(LoginClient.Companion.getLoginRequestCode(), aVar.c(), aVar.b());
        } else {
            this.$activity.finish();
        }
    }
}
