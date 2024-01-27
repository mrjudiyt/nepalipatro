package io.flutter.plugins.inapppurchase;

import com.android.billingclient.api.f;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;
import z1.h;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MethodCallHandlerImpl f15213a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f15214b;

    public /* synthetic */ c(MethodCallHandlerImpl methodCallHandlerImpl, MethodChannel.Result result) {
        this.f15213a = methodCallHandlerImpl;
        this.f15214b = result;
    }

    public final void a(f fVar, List list) {
        this.f15213a.lambda$queryProductDetailsAsync$0(this.f15214b, fVar, list);
    }
}
