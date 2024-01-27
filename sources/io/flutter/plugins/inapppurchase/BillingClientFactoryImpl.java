package io.flutter.plugins.inapppurchase;

import android.content.Context;
import com.android.billingclient.api.c;
import io.flutter.plugin.common.MethodChannel;

final class BillingClientFactoryImpl implements BillingClientFactory {
    BillingClientFactoryImpl() {
    }

    public c createBillingClient(Context context, MethodChannel methodChannel) {
        return c.h(context).b().c(new PluginPurchaseListener(methodChannel)).a();
    }
}
