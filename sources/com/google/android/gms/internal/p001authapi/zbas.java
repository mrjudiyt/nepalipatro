package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zbas  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
public final /* synthetic */ class zbas implements RemoteCall {
    public final /* synthetic */ zbay zba;
    public final /* synthetic */ GetPhoneNumberHintIntentRequest zbb;

    public /* synthetic */ zbas(zbay zbay, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest) {
        this.zba = zbay;
        this.zbb = getPhoneNumberHintIntentRequest;
    }

    public final void accept(Object obj, Object obj2) {
        this.zba.zba(this.zbb, (zbaz) obj, (TaskCompletionSource) obj2);
    }
}
