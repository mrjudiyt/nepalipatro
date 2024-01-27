package io.flutter.plugins.inapppurchase;

import io.flutter.plugin.common.MethodChannel;
import z1.f;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f15212a;

    public /* synthetic */ b(MethodChannel.Result result) {
        this.f15212a = result;
    }

    public final void a(com.android.billingclient.api.f fVar, String str) {
        this.f15212a.success(Translator.fromBillingResult(fVar));
    }
}
