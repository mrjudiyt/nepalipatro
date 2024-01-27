package io.flutter.plugins.firebase.firebaseremoteconfig;

import android.os.Handler;
import android.os.Looper;
import com.facebook.login.LoginLogger;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import io.flutter.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.dynamiclinks.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FirebaseRemoteConfigPlugin implements FlutterFirebasePlugin, MethodChannel.MethodCallHandler, FlutterPlugin, EventChannel.StreamHandler {
    static final String EVENT_CHANNEL = "plugins.flutter.io/firebase_remote_config_updated";
    static final String METHOD_CHANNEL = "plugins.flutter.io/firebase_remote_config";
    static final String TAG = "FRCPlugin";
    private MethodChannel channel;
    private EventChannel eventChannel;
    private final Map<String, ConfigUpdateListenerRegistration> listenersMap = new HashMap();
    /* access modifiers changed from: private */
    public final Handler mainThreadHandler = new Handler(Looper.getMainLooper());

    private Map<String, Object> createRemoteConfigValueMap(FirebaseRemoteConfigValue firebaseRemoteConfigValue) {
        HashMap hashMap = new HashMap();
        hashMap.put("value", firebaseRemoteConfigValue.asByteArray());
        hashMap.put("source", mapValueSource(firebaseRemoteConfigValue.getSource()));
        return hashMap;
    }

    private Map<String, Object> getConfigProperties(FirebaseRemoteConfig firebaseRemoteConfig) {
        HashMap hashMap = new HashMap();
        hashMap.put("fetchTimeout", Long.valueOf(firebaseRemoteConfig.getInfo().getConfigSettings().getFetchTimeoutInSeconds()));
        hashMap.put("minimumFetchInterval", Long.valueOf(firebaseRemoteConfig.getInfo().getConfigSettings().getMinimumFetchIntervalInSeconds()));
        hashMap.put("lastFetchTime", Long.valueOf(firebaseRemoteConfig.getInfo().getFetchTimeMillis()));
        hashMap.put("lastFetchStatus", mapLastFetchStatus(firebaseRemoteConfig.getInfo().getLastFetchStatus()));
        Log.d(TAG, "Sending fetchTimeout: " + hashMap.get("fetchTimeout"));
        return hashMap;
    }

    private FirebaseRemoteConfig getRemoteConfig(Map<String, Object> map) {
        Object obj = map.get(Constants.APP_NAME);
        Objects.requireNonNull(obj);
        return FirebaseRemoteConfig.getInstance(FirebaseApp.getInstance((String) obj));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$1(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$0(FirebaseApp firebaseApp, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseRemoteConfig instance = FirebaseRemoteConfig.getInstance(firebaseApp);
            HashMap hashMap = new HashMap(getConfigProperties(instance));
            hashMap.put("parameters", parseParameters(instance.getAll()));
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onMethodCall$2(MethodChannel.Result result, Task task) {
        String message;
        if (task.isSuccessful()) {
            result.success(task.getResult());
            return;
        }
        Exception exception = task.getException();
        HashMap hashMap = new HashMap();
        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
            hashMap.put("code", "throttled");
            hashMap.put("message", "frequency of requests exceeds throttled limits");
        } else if (exception instanceof FirebaseRemoteConfigClientException) {
            hashMap.put("code", "internal");
            hashMap.put("message", "internal remote config fetch error");
        } else if (exception instanceof FirebaseRemoteConfigServerException) {
            hashMap.put("code", "remote-config-server-error");
            hashMap.put("message", exception.getMessage());
            Throwable cause = exception.getCause();
            if (!(cause == null || (message = cause.getMessage()) == null || !message.contains("Forbidden"))) {
                hashMap.put("code", "forbidden");
            }
        } else {
            hashMap.put("code", "unknown");
            hashMap.put("message", "unknown remote config error");
        }
        result.error("firebase_remote_config", exception != null ? exception.getMessage() : null, hashMap);
    }

    private String mapLastFetchStatus(int i10) {
        return i10 != -1 ? i10 != 0 ? i10 != 2 ? LoginLogger.EVENT_EXTRAS_FAILURE : "throttled" : "noFetchYet" : "success";
    }

    private String mapValueSource(int i10) {
        return i10 != 1 ? i10 != 2 ? "static" : "remote" : "default";
    }

    private Map<String, Object> parseParameters(Map<String, FirebaseRemoteConfigValue> map) {
        HashMap hashMap = new HashMap();
        for (String next : map.keySet()) {
            FirebaseRemoteConfigValue firebaseRemoteConfigValue = map.get(next);
            Objects.requireNonNull(firebaseRemoteConfigValue);
            hashMap.put(next, createRemoteConfigValueMap(firebaseRemoteConfigValue));
        }
        return hashMap;
    }

    private void setupChannel(BinaryMessenger binaryMessenger) {
        FlutterFirebasePluginRegistry.registerPlugin(METHOD_CHANNEL, this);
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, METHOD_CHANNEL);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        EventChannel eventChannel2 = new EventChannel(binaryMessenger, EVENT_CHANNEL);
        this.eventChannel = eventChannel2;
        eventChannel2.setStreamHandler(this);
    }

    private void tearDownChannel() {
        this.channel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.channel = null;
        this.eventChannel.setStreamHandler((EventChannel.StreamHandler) null);
        this.eventChannel = null;
        for (ConfigUpdateListenerRegistration next : this.listenersMap.values()) {
            next.remove();
            this.listenersMap.remove(next);
        }
    }

    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(FirebaseApp firebaseApp) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(this, firebaseApp, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        setupChannel(flutterPluginBinding.getBinaryMessenger());
    }

    public void onCancel(Object obj) {
        Map map = (Map) obj;
        if (map != null) {
            Object obj2 = map.get(Constants.APP_NAME);
            Objects.requireNonNull(obj2);
            String str = (String) obj2;
            ConfigUpdateListenerRegistration configUpdateListenerRegistration = this.listenersMap.get(str);
            if (configUpdateListenerRegistration != null) {
                configUpdateListenerRegistration.remove();
                this.listenersMap.remove(str);
            }
        }
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        tearDownChannel();
    }

    public void onListen(Object obj, final EventChannel.EventSink eventSink) {
        Map map = (Map) obj;
        FirebaseRemoteConfig remoteConfig = getRemoteConfig(map);
        Object obj2 = map.get(Constants.APP_NAME);
        Objects.requireNonNull(obj2);
        this.listenersMap.put((String) obj2, remoteConfig.addOnConfigUpdateListener(new ConfigUpdateListener() {
            public void onError(FirebaseRemoteConfigException firebaseRemoteConfigException) {
                eventSink.error("firebase_remote_config", firebaseRemoteConfigException.getMessage(), (Object) null);
            }

            public void onUpdate(ConfigUpdate configUpdate) {
                FirebaseRemoteConfigPlugin.this.mainThreadHandler.post(new d(eventSink, new ArrayList(configUpdate.getUpdatedKeys())));
            }
        }));
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Task task;
        FirebaseRemoteConfig remoteConfig = getRemoteConfig((Map) methodCall.arguments());
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1145383109:
                if (str.equals("RemoteConfig#ensureInitialized")) {
                    c10 = 0;
                    break;
                }
                break;
            case -967766516:
                if (str.equals("RemoteConfig#setConfigSettings")) {
                    c10 = 1;
                    break;
                }
                break;
            case -824350930:
                if (str.equals("RemoteConfig#getProperties")) {
                    c10 = 2;
                    break;
                }
                break;
            case 2948543:
                if (str.equals("RemoteConfig#fetch")) {
                    c10 = 3;
                    break;
                }
                break;
            case 47629262:
                if (str.equals("RemoteConfig#activate")) {
                    c10 = 4;
                    break;
                }
                break;
            case 120001542:
                if (str.equals("RemoteConfig#getAll")) {
                    c10 = 5;
                    break;
                }
                break;
            case 198105259:
                if (str.equals("RemoteConfig#fetchAndActivate")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1069772825:
                if (str.equals("RemoteConfig#setDefaults")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                task = Tasks.whenAll((Task<?>[]) new Task[]{remoteConfig.ensureInitialized()});
                break;
            case 1:
                Integer num = (Integer) methodCall.argument("fetchTimeout");
                Objects.requireNonNull(num);
                int intValue = num.intValue();
                Integer num2 = (Integer) methodCall.argument("minimumFetchInterval");
                Objects.requireNonNull(num2);
                task = remoteConfig.setConfigSettingsAsync(new FirebaseRemoteConfigSettings.Builder().setFetchTimeoutInSeconds((long) intValue).setMinimumFetchIntervalInSeconds((long) num2.intValue()).build());
                break;
            case 2:
                task = Tasks.forResult(getConfigProperties(remoteConfig));
                break;
            case 3:
                task = remoteConfig.fetch();
                break;
            case 4:
                task = remoteConfig.activate();
                break;
            case 5:
                task = Tasks.forResult(parseParameters(remoteConfig.getAll()));
                break;
            case 6:
                task = remoteConfig.fetchAndActivate();
                break;
            case 7:
                Map map = (Map) methodCall.argument(RemoteConfigComponent.DEFAULTS_FILE_NAME);
                Objects.requireNonNull(map);
                task = remoteConfig.setDefaultsAsync((Map<String, Object>) map);
                break;
            default:
                result.notImplemented();
                return;
        }
        task.addOnCompleteListener(new a(result));
    }
}
