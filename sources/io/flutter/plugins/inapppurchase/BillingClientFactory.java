package io.flutter.plugins.inapppurchase;

import android.content.Context;
import com.android.billingclient.api.c;
import io.flutter.plugin.common.MethodChannel;

interface BillingClientFactory {
    c createBillingClient(Context context, MethodChannel methodChannel);
}
