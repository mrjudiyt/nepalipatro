package io.flutter.plugins.firebase.messaging;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.o;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FlutterFirebaseMessagingPlugin implements FlutterFirebasePlugin, MethodChannel.MethodCallHandler, PluginRegistry.NewIntentListener, FlutterPlugin, ActivityAware {
    private MethodChannel channel;
    private final HashMap<String, Boolean> consumedInitialMessages = new HashMap<>();
    private RemoteMessage initialMessage;
    private Map<String, Object> initialMessageNotification;
    private final LiveData<RemoteMessage> liveDataRemoteMessage = FlutterFirebaseRemoteMessageLiveData.getInstance();
    private final LiveData<String> liveDataToken = FlutterFirebaseTokenLiveData.getInstance();
    private Activity mainActivity;
    FlutterFirebasePermissionManager permissionManager;
    private t<RemoteMessage> remoteMessageObserver;
    private t<String> tokenObserver;

    private Boolean checkPermissions() {
        return Boolean.valueOf(ContextHolder.getApplicationContext().checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0);
    }

    private Task<Void> deleteToken() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new p(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Map<String, Object> getExceptionDetails(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", "unknown");
        if (exc != null) {
            hashMap.put("message", exc.getMessage());
        } else {
            hashMap.put("message", "An unknown error has occurred.");
        }
        return hashMap;
    }

    private Task<Map<String, Object>> getInitialMessage() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new e(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Integer>> getPermissions() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new u(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Object>> getToken() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/firebase_messaging");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.permissionManager = new FlutterFirebasePermissionManager();
        this.remoteMessageObserver = new d(this);
        this.tokenObserver = new l(this);
        this.liveDataRemoteMessage.observeForever(this.remoteMessageObserver);
        this.liveDataToken.observeForever(this.tokenObserver);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_messaging", this);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$deleteToken$2(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(FirebaseMessaging.getInstance().deleteToken());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getInitialMessage$9(TaskCompletionSource taskCompletionSource) {
        Map map;
        try {
            RemoteMessage remoteMessage = this.initialMessage;
            if (remoteMessage != null) {
                Map<String, Object> remoteMessageToMap = FlutterFirebaseMessagingUtils.remoteMessageToMap(remoteMessage);
                Map<String, Object> map2 = this.initialMessageNotification;
                if (map2 != null) {
                    remoteMessageToMap.put("notification", map2);
                }
                taskCompletionSource.setResult(remoteMessageToMap);
                this.initialMessage = null;
                this.initialMessageNotification = null;
                return;
            }
            Activity activity = this.mainActivity;
            if (activity == null) {
                taskCompletionSource.setResult(null);
                return;
            }
            Intent intent = activity.getIntent();
            if (intent != null) {
                if (intent.getExtras() != null) {
                    String string = intent.getExtras().getString(Constants.MessagePayloadKeys.MSGID);
                    if (string == null) {
                        string = intent.getExtras().getString(Constants.MessagePayloadKeys.MSGID_SERVER);
                    }
                    if (string != null) {
                        if (this.consumedInitialMessages.get(string) == null) {
                            RemoteMessage remoteMessage2 = FlutterFirebaseMessagingReceiver.notifications.get(string);
                            if (remoteMessage2 == null) {
                                Map<String, Object> firebaseMessageMap = FlutterFirebaseMessagingStore.getInstance().getFirebaseMessageMap(string);
                                if (firebaseMessageMap != null) {
                                    remoteMessage2 = FlutterFirebaseMessagingUtils.getRemoteMessageForArguments(firebaseMessageMap);
                                    if (firebaseMessageMap.get("notification") != null) {
                                        map = (Map) firebaseMessageMap.get("notification");
                                        FlutterFirebaseMessagingStore.getInstance().removeFirebaseMessage(string);
                                    }
                                }
                                map = null;
                                FlutterFirebaseMessagingStore.getInstance().removeFirebaseMessage(string);
                            } else {
                                map = null;
                            }
                            if (remoteMessage2 == null) {
                                taskCompletionSource.setResult(null);
                                return;
                            }
                            this.consumedInitialMessages.put(string, Boolean.TRUE);
                            Map<String, Object> remoteMessageToMap2 = FlutterFirebaseMessagingUtils.remoteMessageToMap(remoteMessage2);
                            if (remoteMessage2.getNotification() == null && map != null) {
                                remoteMessageToMap2.put("notification", map);
                            }
                            taskCompletionSource.setResult(remoteMessageToMap2);
                            return;
                        }
                    }
                    taskCompletionSource.setResult(null);
                    return;
                }
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getPermissions$13(TaskCompletionSource taskCompletionSource) {
        boolean z10;
        try {
            HashMap hashMap = new HashMap();
            if (Build.VERSION.SDK_INT >= 33) {
                z10 = checkPermissions().booleanValue();
            } else {
                z10 = o.b(this.mainActivity).a();
            }
            hashMap.put("authorizationStatus", Integer.valueOf(z10 ? 1 : 0));
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$15(FirebaseApp firebaseApp, TaskCompletionSource taskCompletionSource) {
        try {
            HashMap hashMap = new HashMap();
            if (firebaseApp.getName().equals(FirebaseApp.DEFAULT_APP_NAME)) {
                hashMap.put("AUTO_INIT_ENABLED", Boolean.valueOf(FirebaseMessaging.getInstance().isAutoInitEnabled()));
            }
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getToken$3(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(new HashMap<String, Object>((String) Tasks.await(FirebaseMessaging.getInstance().getToken())) {
                final /* synthetic */ String val$token;

                {
                    this.val$token = r2;
                    put("token", r2);
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$initInstance$0(RemoteMessage remoteMessage) {
        this.channel.invokeMethod("Messaging#onMessage", FlutterFirebaseMessagingUtils.remoteMessageToMap(remoteMessage));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$initInstance$1(String str) {
        this.channel.invokeMethod("Messaging#onTokenRefresh", str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onMethodCall$14(MethodChannel.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
            return;
        }
        Exception exception = task.getException();
        result.error("firebase_messaging", exception != null ? exception.getMessage() : null, getExceptionDetails(exception));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$requestPermissions$10(Map map, TaskCompletionSource taskCompletionSource, int i10) {
        map.put("authorizationStatus", Integer.valueOf(i10));
        taskCompletionSource.setResult(map);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$requestPermissions$12(TaskCompletionSource taskCompletionSource) {
        HashMap hashMap = new HashMap();
        try {
            if (!checkPermissions().booleanValue()) {
                this.permissionManager.requestPermissions(this.mainActivity, new o(hashMap, taskCompletionSource), new n(taskCompletionSource));
                return;
            }
            hashMap.put("authorizationStatus", 1);
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendMessage$6(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map).send(FlutterFirebaseMessagingUtils.getRemoteMessageForArguments(map));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setAutoInitEnabled$7(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            firebaseMessagingForArguments.setAutoInitEnabled(((Boolean) obj).booleanValue());
            taskCompletionSource.setResult(new HashMap<String, Object>(firebaseMessagingForArguments) {
                final /* synthetic */ FirebaseMessaging val$firebaseMessaging;

                {
                    this.val$firebaseMessaging = r2;
                    put("isAutoInitEnabled", Boolean.valueOf(r2.isAutoInitEnabled()));
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$setDeliveryMetricsExportToBigQuery$8(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            firebaseMessagingForArguments.setDeliveryMetricsExportToBigQuery(((Boolean) obj).booleanValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$subscribeToTopic$4(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            Tasks.await(firebaseMessagingForArguments.subscribeToTopic((String) obj));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$unsubscribeFromTopic$5(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            Tasks.await(firebaseMessagingForArguments.unsubscribeFromTopic((String) obj));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Map<String, Integer>> requestPermissions() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new t(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> sendMessage(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new i(map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Object>> setAutoInitEnabled(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(this, map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> setDeliveryMetricsExportToBigQuery(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new j(map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> subscribeToTopic(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new h(map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> unsubscribeFromTopic(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new k(map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new q(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(FirebaseApp firebaseApp) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new s(firebaseApp, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        activityPluginBinding.addRequestPermissionsResultListener(this.permissionManager);
        Activity activity = activityPluginBinding.getActivity();
        this.mainActivity = activity;
        if (activity.getIntent() != null && this.mainActivity.getIntent().getExtras() != null && (this.mainActivity.getIntent().getFlags() & 1048576) != 1048576) {
            onNewIntent(this.mainActivity.getIntent());
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger());
    }

    public void onDetachedFromActivity() {
        this.mainActivity = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.mainActivity = null;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.liveDataToken.removeObserver(this.tokenObserver);
        this.liveDataRemoteMessage.removeObserver(this.remoteMessageObserver);
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Task task;
        long j10;
        long j11;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1704007366:
                if (str.equals("Messaging#getInitialMessage")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1661255137:
                if (str.equals("Messaging#setAutoInitEnabled")) {
                    c10 = 1;
                    break;
                }
                break;
            case -657665041:
                if (str.equals("Messaging#deleteToken")) {
                    c10 = 2;
                    break;
                }
                break;
            case 421314579:
                if (str.equals("Messaging#unsubscribeFromTopic")) {
                    c10 = 3;
                    break;
                }
                break;
            case 506322569:
                if (str.equals("Messaging#subscribeToTopic")) {
                    c10 = 4;
                    break;
                }
                break;
            case 607887267:
                if (str.equals("Messaging#setDeliveryMetricsExportToBigQuery")) {
                    c10 = 5;
                    break;
                }
                break;
            case 928431066:
                if (str.equals("Messaging#startBackgroundIsolate")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1165917248:
                if (str.equals("Messaging#sendMessage")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1231338975:
                if (str.equals("Messaging#requestPermission")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1243856389:
                if (str.equals("Messaging#getNotificationSettings")) {
                    c10 = 9;
                    break;
                }
                break;
            case 1459336962:
                if (str.equals("Messaging#getToken")) {
                    c10 = 10;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                task = getInitialMessage();
                break;
            case 1:
                task = setAutoInitEnabled((Map) methodCall.arguments());
                break;
            case 2:
                task = deleteToken();
                break;
            case 3:
                task = unsubscribeFromTopic((Map) methodCall.arguments());
                break;
            case 4:
                task = subscribeToTopic((Map) methodCall.arguments());
                break;
            case 5:
                task = setDeliveryMetricsExportToBigQuery((Map) methodCall.arguments());
                break;
            case 6:
                Map map = (Map) methodCall.arguments;
                Object obj = map.get("pluginCallbackHandle");
                Object obj2 = map.get("userCallbackHandle");
                if (obj instanceof Long) {
                    j10 = ((Long) obj).longValue();
                } else if (obj instanceof Integer) {
                    j10 = Long.valueOf((long) ((Integer) obj).intValue()).longValue();
                } else {
                    throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'pluginCallbackHandle'.");
                }
                if (obj2 instanceof Long) {
                    j11 = ((Long) obj2).longValue();
                } else if (obj2 instanceof Integer) {
                    j11 = Long.valueOf((long) ((Integer) obj2).intValue()).longValue();
                } else {
                    throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'userCallbackHandle'.");
                }
                Activity activity = this.mainActivity;
                FlutterShellArgs fromIntent = activity != null ? FlutterShellArgs.fromIntent(activity.getIntent()) : null;
                FlutterFirebaseMessagingBackgroundService.setCallbackDispatcher(j10);
                FlutterFirebaseMessagingBackgroundService.setUserCallbackHandle(j11);
                FlutterFirebaseMessagingBackgroundService.startBackgroundIsolate(j10, fromIntent);
                task = Tasks.forResult(null);
                break;
            case 7:
                task = sendMessage((Map) methodCall.arguments());
                break;
            case 8:
                if (Build.VERSION.SDK_INT < 33) {
                    task = getPermissions();
                    break;
                } else {
                    task = requestPermissions();
                    break;
                }
            case 9:
                task = getPermissions();
                break;
            case 10:
                task = getToken();
                break;
            default:
                result.notImplemented();
                return;
        }
        task.addOnCompleteListener(new m(this, result));
    }

    public boolean onNewIntent(Intent intent) {
        Map<String, Object> map;
        Map<String, Object> firebaseMessageMap;
        if (intent.getExtras() == null) {
            return false;
        }
        String string = intent.getExtras().getString(Constants.MessagePayloadKeys.MSGID);
        if (string == null) {
            string = intent.getExtras().getString(Constants.MessagePayloadKeys.MSGID_SERVER);
        }
        if (string == null) {
            return false;
        }
        RemoteMessage remoteMessage = FlutterFirebaseMessagingReceiver.notifications.get(string);
        Map<String, Object> map2 = null;
        if (remoteMessage == null && (firebaseMessageMap = FlutterFirebaseMessagingStore.getInstance().getFirebaseMessageMap(string)) != null) {
            remoteMessage = FlutterFirebaseMessagingUtils.getRemoteMessageForArguments(firebaseMessageMap);
            map2 = FlutterFirebaseMessagingUtils.getRemoteMessageNotificationForArguments(firebaseMessageMap);
        }
        if (remoteMessage == null) {
            return false;
        }
        this.initialMessage = remoteMessage;
        this.initialMessageNotification = map2;
        FlutterFirebaseMessagingReceiver.notifications.remove(string);
        Map<String, Object> remoteMessageToMap = FlutterFirebaseMessagingUtils.remoteMessageToMap(remoteMessage);
        if (remoteMessage.getNotification() == null && (map = this.initialMessageNotification) != null) {
            remoteMessageToMap.put("notification", map);
        }
        this.channel.invokeMethod("Messaging#onMessageOpenedApp", remoteMessageToMap);
        this.mainActivity.setIntent(intent);
        return true;
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        this.mainActivity = activityPluginBinding.getActivity();
    }
}
