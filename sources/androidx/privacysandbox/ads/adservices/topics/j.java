package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import androidx.core.os.o;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.m;

@SuppressLint({"NewApi"})
/* compiled from: TopicsManagerImplCommon.kt */
public class j extends f {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final TopicsManager f3909b;

    @f(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", l = {22}, m = "getTopics$suspendImpl")
    /* compiled from: TopicsManagerImplCommon.kt */
    static final class a extends d {

        /* renamed from: h  reason: collision with root package name */
        Object f3910h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f3911i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ j f3912j;

        /* renamed from: k  reason: collision with root package name */
        int f3913k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar, r8.d<? super a> dVar) {
            super(dVar);
            this.f3912j = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f3911i = obj;
            this.f3913k |= Integer.MIN_VALUE;
            return j.e(this.f3912j, (b) null, this);
        }
    }

    public j(TopicsManager topicsManager) {
        m.f(topicsManager, "mTopicsManager");
        this.f3909b = topicsManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object e(androidx.privacysandbox.ads.adservices.topics.j r4, androidx.privacysandbox.ads.adservices.topics.b r5, r8.d<? super androidx.privacysandbox.ads.adservices.topics.c> r6) {
        /*
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.topics.j.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.privacysandbox.ads.adservices.topics.j$a r0 = (androidx.privacysandbox.ads.adservices.topics.j.a) r0
            int r1 = r0.f3913k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3913k = r1
            goto L_0x0018
        L_0x0013:
            androidx.privacysandbox.ads.adservices.topics.j$a r0 = new androidx.privacysandbox.ads.adservices.topics.j$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f3911i
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.f3913k
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.f3910h
            androidx.privacysandbox.ads.adservices.topics.j r4 = (androidx.privacysandbox.ads.adservices.topics.j) r4
            o8.m.b(r6)
            goto L_0x0047
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            o8.m.b(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.c(r5)
            r0.f3910h = r4
            r0.f3913k = r3
            java.lang.Object r6 = r4.f(r5, r0)
            if (r6 != r1) goto L_0x0047
            return r1
        L_0x0047:
            android.adservices.topics.GetTopicsResponse r6 = (android.adservices.topics.GetTopicsResponse) r6
            androidx.privacysandbox.ads.adservices.topics.c r4 = r4.d(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.j.e(androidx.privacysandbox.ads.adservices.topics.j, androidx.privacysandbox.ads.adservices.topics.b, r8.d):java.lang.Object");
    }

    private final Object f(GetTopicsRequest getTopicsRequest, r8.d<? super GetTopicsResponse> dVar) {
        i9.m mVar = new i9.m(c.b(dVar), 1);
        mVar.z();
        this.f3909b.getTopics(getTopicsRequest, i.f3908h, o.a(mVar));
        Object w10 = mVar.w();
        if (w10 == d.c()) {
            h.c(dVar);
        }
        return w10;
    }

    public Object a(b bVar, r8.d<? super c> dVar) {
        return e(this, bVar, dVar);
    }

    public GetTopicsRequest c(b bVar) {
        m.f(bVar, "request");
        GetTopicsRequest build = new GetTopicsRequest.Builder().setAdsSdkName(bVar.a()).build();
        m.e(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }

    public final c d(GetTopicsResponse getTopicsResponse) {
        m.f(getTopicsResponse, "response");
        ArrayList arrayList = new ArrayList();
        for (Topic topic : getTopicsResponse.getTopics()) {
            arrayList.add(new e(topic.getTaxonomyVersion(), topic.getModelVersion(), topic.getTopicId()));
        }
        return new c(arrayList);
    }
}
