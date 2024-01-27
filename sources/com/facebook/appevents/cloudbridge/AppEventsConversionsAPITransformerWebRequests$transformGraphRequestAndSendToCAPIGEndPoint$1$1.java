package com.facebook.appevents.cloudbridge;

import com.facebook.internal.Utility;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import o8.q;
import y8.p;

/* compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
final class AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1 extends n implements p<String, Integer, q> {
    final /* synthetic */ List<Map<String, Object>> $processedEvents;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1(List<? extends Map<String, ? extends Object>> list) {
        super(2);
        this.$processedEvents = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m46invoke$lambda0(Integer num, List list) {
        m.f(list, "$processedEvents");
        if (!x.q(AppEventsConversionsAPITransformerWebRequests.ACCEPTABLE_HTTP_RESPONSE, num)) {
            AppEventsConversionsAPITransformerWebRequests.INSTANCE.handleError$facebook_core_release(num, list, 5);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (Integer) obj2);
        return q.f16189a;
    }

    public final void invoke(String str, Integer num) {
        Utility utility = Utility.INSTANCE;
        Utility.runOnNonUiThread(new c(num, this.$processedEvents));
    }
}
