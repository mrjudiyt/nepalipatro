package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
@Keep
/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public final class Registrar implements ComponentRegistrar {

    /* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    private static class FIIDInternalAdapter implements FirebaseInstanceIdInternal {
        final FirebaseInstanceId fiid;

        public FIIDInternalAdapter(FirebaseInstanceId firebaseInstanceId) {
            this.fiid = firebaseInstanceId;
        }

        public void addNewTokenListener(FirebaseInstanceIdInternal.NewTokenListener newTokenListener) {
            this.fiid.addNewTokenListener(newTokenListener);
        }

        public void deleteToken(String str, String str2) {
            this.fiid.deleteToken(str, str2);
        }

        public String getId() {
            return this.fiid.getId();
        }

        public String getToken() {
            return this.fiid.getToken();
        }

        public Task<String> getTokenTask() {
            String token = this.fiid.getToken();
            if (token != null) {
                return Tasks.forResult(token);
            }
            return this.fiid.getInstanceId().continueWith(Registrar$FIIDInternalAdapter$$Lambda$0.$instance);
        }
    }

    static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(ComponentContainer componentContainer) {
        return new FirebaseInstanceId((FirebaseApp) componentContainer.get(FirebaseApp.class), componentContainer.getProvider(UserAgentPublisher.class), componentContainer.getProvider(HeartBeatInfo.class), (FirebaseInstallationsApi) componentContainer.get(FirebaseInstallationsApi.class));
    }

    static final /* synthetic */ FirebaseInstanceIdInternal lambda$getComponents$1$Registrar(ComponentContainer componentContainer) {
        return new FIIDInternalAdapter((FirebaseInstanceId) componentContainer.get(FirebaseInstanceId.class));
    }

    @Keep
    public List<Component<?>> getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        return Arrays.asList(new Component[]{Component.builder(cls).add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.optionalProvider((Class<?>) UserAgentPublisher.class)).add(Dependency.optionalProvider((Class<?>) HeartBeatInfo.class)).add(Dependency.required((Class<?>) FirebaseInstallationsApi.class)).factory(Registrar$$Lambda$0.$instance).alwaysEager().build(), Component.builder(FirebaseInstanceIdInternal.class).add(Dependency.required((Class<?>) cls)).factory(Registrar$$Lambda$1.$instance).build(), LibraryVersionComponent.create("fire-iid", BuildConfig.VERSION_NAME)});
    }
}
