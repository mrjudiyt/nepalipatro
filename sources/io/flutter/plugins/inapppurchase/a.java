package io.flutter.plugins.inapppurchase;

import com.android.billingclient.api.f;
import io.flutter.plugin.common.MethodChannel;
import z1.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f15211a;

    public /* synthetic */ a(MethodChannel.Result result) {
        this.f15211a = result;
    }

    public final void a(f fVar) {
        this.f15211a.success(Translator.fromBillingResult(fVar));
    }
}
