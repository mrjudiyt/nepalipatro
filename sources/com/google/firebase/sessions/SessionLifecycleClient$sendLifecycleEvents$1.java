package com.google.firebase.sessions;

import android.os.Message;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import i9.l0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import o8.m;
import o8.q;
import r8.d;
import y8.p;

@f(c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", f = "SessionLifecycleClient.kt", l = {149}, m = "invokeSuspend")
/* compiled from: SessionLifecycleClient.kt */
final class SessionLifecycleClient$sendLifecycleEvents$1 extends k implements p<l0, d<? super q>, Object> {
    final /* synthetic */ List<Message> $messages;
    int label;
    final /* synthetic */ SessionLifecycleClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SessionLifecycleClient$sendLifecycleEvents$1(SessionLifecycleClient sessionLifecycleClient, List<Message> list, d<? super SessionLifecycleClient$sendLifecycleEvents$1> dVar) {
        super(2, dVar);
        this.this$0 = sessionLifecycleClient;
        this.$messages = list;
    }

    public final d<q> create(Object obj, d<?> dVar) {
        return new SessionLifecycleClient$sendLifecycleEvents$1(this.this$0, this.$messages, dVar);
    }

    public final Object invoke(l0 l0Var, d<? super q> dVar) {
        return ((SessionLifecycleClient$sendLifecycleEvents$1) create(l0Var, dVar)).invokeSuspend(q.f16189a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z10;
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
            this.label = 1;
            obj = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            m.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Map map = (Map) obj;
        if (!map.isEmpty()) {
            Collection values = map.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((SessionSubscriber) it.next()).isDataCollectionEnabled()) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z10 = true;
            if (!z10) {
                List<Message> O = x.O(x.u(p.i(this.this$0.getLatestByCode(this.$messages, 2), this.this$0.getLatestByCode(this.$messages, 1))), new SessionLifecycleClient$sendLifecycleEvents$1$invokeSuspend$$inlined$sortedBy$1());
                SessionLifecycleClient sessionLifecycleClient = this.this$0;
                for (Message access$sendMessageToServer : O) {
                    sessionLifecycleClient.sendMessageToServer(access$sendMessageToServer);
                }
            }
        }
        return q.f16189a;
    }
}
