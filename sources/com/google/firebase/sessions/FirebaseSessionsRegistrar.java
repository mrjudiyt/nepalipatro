package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.sessions.settings.SessionsSettings;
import i9.g0;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import y8.a;

@Keep
/* compiled from: FirebaseSessionsRegistrar.kt */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final Companion Companion = new Companion((g) null);
    @Deprecated
    private static final String LIBRARY_NAME = "fire-sessions";
    @Deprecated
    private static final Qualified<g0> backgroundDispatcher;
    @Deprecated
    private static final Qualified<g0> blockingDispatcher;
    @Deprecated
    private static final Qualified<FirebaseApp> firebaseApp = Qualified.unqualified(FirebaseApp.class);
    @Deprecated
    private static final Qualified<FirebaseInstallationsApi> firebaseInstallationsApi = Qualified.unqualified(FirebaseInstallationsApi.class);
    @Deprecated
    private static final Qualified<SessionFirelogPublisher> sessionFirelogPublisher = Qualified.unqualified(SessionFirelogPublisher.class);
    @Deprecated
    private static final Qualified<SessionGenerator> sessionGenerator = Qualified.unqualified(SessionGenerator.class);
    @Deprecated
    private static final Qualified<SessionsSettings> sessionsSettings = Qualified.unqualified(SessionsSettings.class);
    @Deprecated
    private static final Qualified<q3.g> transportFactory = Qualified.unqualified(q3.g.class);

    /* compiled from: FirebaseSessionsRegistrar.kt */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    static {
        Class<g0> cls = g0.class;
        backgroundDispatcher = Qualified.qualified(Background.class, cls);
        blockingDispatcher = Qualified.qualified(Blocking.class, cls);
    }

    /* access modifiers changed from: private */
    /* renamed from: getComponents$lambda-0  reason: not valid java name */
    public static final FirebaseSessions m160getComponents$lambda0(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        m.e(obj, "container[firebaseApp]");
        Object obj2 = componentContainer.get(sessionsSettings);
        m.e(obj2, "container[sessionsSettings]");
        Object obj3 = componentContainer.get(backgroundDispatcher);
        m.e(obj3, "container[backgroundDispatcher]");
        return new FirebaseSessions((FirebaseApp) obj, (SessionsSettings) obj2, (r8.g) obj3);
    }

    /* access modifiers changed from: private */
    /* renamed from: getComponents$lambda-1  reason: not valid java name */
    public static final SessionGenerator m161getComponents$lambda1(ComponentContainer componentContainer) {
        return new SessionGenerator(WallClock.INSTANCE, (a) null, 2, (g) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: getComponents$lambda-2  reason: not valid java name */
    public static final SessionFirelogPublisher m162getComponents$lambda2(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        m.e(obj, "container[firebaseApp]");
        Object obj2 = componentContainer.get(firebaseInstallationsApi);
        m.e(obj2, "container[firebaseInstallationsApi]");
        Object obj3 = componentContainer.get(sessionsSettings);
        m.e(obj3, "container[sessionsSettings]");
        Provider<q3.g> provider = componentContainer.getProvider(transportFactory);
        m.e(provider, "container.getProvider(transportFactory)");
        EventGDTLogger eventGDTLogger = new EventGDTLogger(provider);
        Object obj4 = componentContainer.get(backgroundDispatcher);
        m.e(obj4, "container[backgroundDispatcher]");
        return new SessionFirelogPublisherImpl((FirebaseApp) obj, (FirebaseInstallationsApi) obj2, (SessionsSettings) obj3, eventGDTLogger, (r8.g) obj4);
    }

    /* access modifiers changed from: private */
    /* renamed from: getComponents$lambda-3  reason: not valid java name */
    public static final SessionsSettings m163getComponents$lambda3(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        m.e(obj, "container[firebaseApp]");
        Object obj2 = componentContainer.get(blockingDispatcher);
        m.e(obj2, "container[blockingDispatcher]");
        Object obj3 = componentContainer.get(backgroundDispatcher);
        m.e(obj3, "container[backgroundDispatcher]");
        Object obj4 = componentContainer.get(firebaseInstallationsApi);
        m.e(obj4, "container[firebaseInstallationsApi]");
        return new SessionsSettings((FirebaseApp) obj, (r8.g) obj2, (r8.g) obj3, (FirebaseInstallationsApi) obj4);
    }

    /* access modifiers changed from: private */
    /* renamed from: getComponents$lambda-4  reason: not valid java name */
    public static final SessionDatastore m164getComponents$lambda4(ComponentContainer componentContainer) {
        Context applicationContext = ((FirebaseApp) componentContainer.get(firebaseApp)).getApplicationContext();
        m.e(applicationContext, "container[firebaseApp].applicationContext");
        Object obj = componentContainer.get(backgroundDispatcher);
        m.e(obj, "container[backgroundDispatcher]");
        return new SessionDatastoreImpl(applicationContext, (r8.g) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: getComponents$lambda-5  reason: not valid java name */
    public static final SessionLifecycleServiceBinder m165getComponents$lambda5(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        m.e(obj, "container[firebaseApp]");
        return new SessionLifecycleServiceBinderImpl((FirebaseApp) obj);
    }

    public List<Component<? extends Object>> getComponents() {
        Component.Builder<FirebaseSessions> name = Component.builder(FirebaseSessions.class).name(LIBRARY_NAME);
        Qualified<FirebaseApp> qualified = firebaseApp;
        Component.Builder<FirebaseSessions> add = name.add(Dependency.required((Qualified<?>) qualified));
        Qualified<SessionsSettings> qualified2 = sessionsSettings;
        Component.Builder<FirebaseSessions> add2 = add.add(Dependency.required((Qualified<?>) qualified2));
        Qualified<g0> qualified3 = backgroundDispatcher;
        Component.Builder<SessionFirelogPublisher> add3 = Component.builder(SessionFirelogPublisher.class).name("session-publisher").add(Dependency.required((Qualified<?>) qualified));
        Qualified<FirebaseInstallationsApi> qualified4 = firebaseInstallationsApi;
        return p.g(add2.add(Dependency.required((Qualified<?>) qualified3)).factory(h.f14059a).eagerInDefaultApp().build(), Component.builder(SessionGenerator.class).name("session-generator").factory(e.f14056a).build(), add3.add(Dependency.required((Qualified<?>) qualified4)).add(Dependency.required((Qualified<?>) qualified2)).add(Dependency.requiredProvider((Qualified<?>) transportFactory)).add(Dependency.required((Qualified<?>) qualified3)).factory(g.f14058a).build(), Component.builder(SessionsSettings.class).name("sessions-settings").add(Dependency.required((Qualified<?>) qualified)).add(Dependency.required((Qualified<?>) blockingDispatcher)).add(Dependency.required((Qualified<?>) qualified3)).add(Dependency.required((Qualified<?>) qualified4)).factory(i.f14060a).build(), Component.builder(SessionDatastore.class).name("sessions-datastore").add(Dependency.required((Qualified<?>) qualified)).add(Dependency.required((Qualified<?>) qualified3)).factory(f.f14057a).build(), Component.builder(SessionLifecycleServiceBinder.class).name("sessions-service-binder").add(Dependency.required((Qualified<?>) qualified)).factory(d.f14055a).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
