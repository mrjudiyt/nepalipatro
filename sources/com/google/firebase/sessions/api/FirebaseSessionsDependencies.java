package com.google.firebase.sessions.api;

import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import r9.a;
import r9.c;

/* compiled from: FirebaseSessionsDependencies.kt */
public final class FirebaseSessionsDependencies {
    public static final FirebaseSessionsDependencies INSTANCE = new FirebaseSessionsDependencies();
    private static final String TAG = "SessionsDependencies";
    private static final Map<SessionSubscriber.Name, Dependency> dependencies = Collections.synchronizedMap(new LinkedHashMap());

    /* compiled from: FirebaseSessionsDependencies.kt */
    private static final class Dependency {
        private final a mutex;
        private SessionSubscriber subscriber;

        public Dependency(a aVar, SessionSubscriber sessionSubscriber) {
            m.f(aVar, "mutex");
            this.mutex = aVar;
            this.subscriber = sessionSubscriber;
        }

        public static /* synthetic */ Dependency copy$default(Dependency dependency, a aVar, SessionSubscriber sessionSubscriber, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar = dependency.mutex;
            }
            if ((i10 & 2) != 0) {
                sessionSubscriber = dependency.subscriber;
            }
            return dependency.copy(aVar, sessionSubscriber);
        }

        public final a component1() {
            return this.mutex;
        }

        public final SessionSubscriber component2() {
            return this.subscriber;
        }

        public final Dependency copy(a aVar, SessionSubscriber sessionSubscriber) {
            m.f(aVar, "mutex");
            return new Dependency(aVar, sessionSubscriber);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dependency)) {
                return false;
            }
            Dependency dependency = (Dependency) obj;
            return m.a(this.mutex, dependency.mutex) && m.a(this.subscriber, dependency.subscriber);
        }

        public final a getMutex() {
            return this.mutex;
        }

        public final SessionSubscriber getSubscriber() {
            return this.subscriber;
        }

        public int hashCode() {
            int hashCode = this.mutex.hashCode() * 31;
            SessionSubscriber sessionSubscriber = this.subscriber;
            return hashCode + (sessionSubscriber == null ? 0 : sessionSubscriber.hashCode());
        }

        public final void setSubscriber(SessionSubscriber sessionSubscriber) {
            this.subscriber = sessionSubscriber;
        }

        public String toString() {
            return "Dependency(mutex=" + this.mutex + ", subscriber=" + this.subscriber + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Dependency(a aVar, SessionSubscriber sessionSubscriber, int i10, g gVar) {
            this(aVar, (i10 & 2) != 0 ? null : sessionSubscriber);
        }
    }

    private FirebaseSessionsDependencies() {
    }

    private final Dependency getDependency(SessionSubscriber.Name name) {
        Map<SessionSubscriber.Name, Dependency> map = dependencies;
        m.e(map, "dependencies");
        Dependency dependency = map.get(name);
        if (dependency != null) {
            m.e(dependency, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return dependency;
        }
        throw new IllegalStateException("Cannot get dependency " + name + ". Dependencies should be added at class load time.");
    }

    public static final void register(SessionSubscriber sessionSubscriber) {
        m.f(sessionSubscriber, "subscriber");
        SessionSubscriber.Name sessionSubscriberName = sessionSubscriber.getSessionSubscriberName();
        Dependency dependency = INSTANCE.getDependency(sessionSubscriberName);
        if (dependency.getSubscriber() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Subscriber ");
            sb.append(sessionSubscriberName);
            sb.append(" already registered.");
            return;
        }
        dependency.setSubscriber(sessionSubscriber);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Subscriber ");
        sb2.append(sessionSubscriberName);
        sb2.append(" registered.");
        a.C0277a.a(dependency.getMutex(), (Object) null, 1, (Object) null);
    }

    public final void addDependency(SessionSubscriber.Name name) {
        m.f(name, "subscriberName");
        if (name != SessionSubscriber.Name.PERFORMANCE) {
            Map<SessionSubscriber.Name, Dependency> map = dependencies;
            if (map.containsKey(name)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Dependency ");
                sb.append(name);
                sb.append(" already added.");
                return;
            }
            m.e(map, "dependencies");
            map.put(name, new Dependency(c.a(true), (SessionSubscriber) null, 2, (g) null));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Dependency to ");
            sb2.append(name);
            sb2.append(" added.");
            return;
        }
        throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.google.firebase.sessions.api.SessionSubscriber$Name} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getRegisteredSubscribers$com_google_firebase_firebase_sessions(r8.d<? super java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, ? extends com.google.firebase.sessions.api.SessionSubscriber>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 != r4) goto L_0x0040
            java.lang.Object r2 = r0.L$5
            java.lang.Object r5 = r0.L$4
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$3
            r9.a r6 = (r9.a) r6
            java.lang.Object r7 = r0.L$2
            com.google.firebase.sessions.api.SessionSubscriber$Name r7 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r7
            java.lang.Object r8 = r0.L$1
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.L$0
            java.util.Map r9 = (java.util.Map) r9
            o8.m.b(r11)
            goto L_0x00a0
        L_0x0040:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0048:
            o8.m.b(r11)
            java.util.Map<com.google.firebase.sessions.api.SessionSubscriber$Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency> r11 = dependencies
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.m.e(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = p8.g0.a(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L_0x0069:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x00b3
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            com.google.firebase.sessions.api.SessionSubscriber$Name r7 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r7
            java.lang.Object r11 = r11.getValue()
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r11 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) r11
            r9.a r6 = r11.getMutex()
            r0.L$0 = r5
            r0.L$1 = r8
            r0.L$2 = r7
            r0.L$3 = r6
            r0.L$4 = r5
            r0.L$5 = r2
            r0.label = r4
            java.lang.Object r11 = r6.b(r3, r0)
            if (r11 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r9 = r5
        L_0x00a0:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r11 = INSTANCE     // Catch:{ all -> 0x00ae }
            com.google.firebase.sessions.api.SessionSubscriber r11 = r11.getSubscriber$com_google_firebase_firebase_sessions(r7)     // Catch:{ all -> 0x00ae }
            r6.c(r3)
            r5.put(r2, r11)
            r5 = r9
            goto L_0x0069
        L_0x00ae:
            r11 = move-exception
            r6.c(r3)
            throw r11
        L_0x00b3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.FirebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r8.d):java.lang.Object");
    }

    public final SessionSubscriber getSubscriber$com_google_firebase_firebase_sessions(SessionSubscriber.Name name) {
        m.f(name, "subscriberName");
        SessionSubscriber subscriber = getDependency(name).getSubscriber();
        if (subscriber != null) {
            return subscriber;
        }
        throw new IllegalStateException("Subscriber " + name + " has not been registered.");
    }

    public final void reset$com_google_firebase_firebase_sessions() {
        dependencies.clear();
    }
}
