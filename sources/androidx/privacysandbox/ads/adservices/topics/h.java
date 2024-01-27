package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.annotation.SuppressLint;
import kotlin.jvm.internal.m;

@SuppressLint({"NewApi", "ClassVerificationFailure"})
/* compiled from: TopicsManagerApi33Ext5Impl.kt */
public final class h extends j {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.m.f(r2, r0)
            java.lang.Class<android.adservices.topics.TopicsManager> r0 = android.adservices.topics.TopicsManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "context.getSystemService…opicsManager::class.java)"
            kotlin.jvm.internal.m.e(r2, r0)
            android.adservices.topics.TopicsManager r2 = (android.adservices.topics.TopicsManager) r2
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.h.<init>(android.content.Context):void");
    }

    public GetTopicsRequest c(b bVar) {
        m.f(bVar, "request");
        GetTopicsRequest build = new GetTopicsRequest.Builder().setAdsSdkName(bVar.a()).setShouldRecordObservation(bVar.b()).build();
        m.e(build, "Builder()\n            .s…ion)\n            .build()");
        return build;
    }
}
