package io.flutter.plugins.firebase.core;

import android.util.Log;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedAndroidFirebaseCore {

    public interface FirebaseAppHostApi {

        /* renamed from: io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore$FirebaseAppHostApi$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static MessageCodec<Object> d() {
                return new StandardMessageCodec();
            }

            public static /* synthetic */ void e(FirebaseAppHostApi firebaseAppHostApi, Object obj, BasicMessageChannel.Reply reply) {
                ArrayList arrayList = (ArrayList) obj;
                firebaseAppHostApi.setAutomaticDataCollectionEnabled((String) arrayList.get(0), (Boolean) arrayList.get(1), new Result<Void>(new ArrayList(), reply) {
                    final /* synthetic */ BasicMessageChannel.Reply val$reply;
                    final /* synthetic */ ArrayList val$wrapped;

                    {
                        this.val$wrapped = r1;
                        this.val$reply = r2;
                    }

                    public void error(Throwable th) {
                        this.val$reply.reply(GeneratedAndroidFirebaseCore.wrapError(th));
                    }

                    public void success(Void voidR) {
                        this.val$wrapped.add(0, (Object) null);
                        this.val$reply.reply(this.val$wrapped);
                    }
                });
            }

            public static /* synthetic */ void f(FirebaseAppHostApi firebaseAppHostApi, Object obj, BasicMessageChannel.Reply reply) {
                ArrayList arrayList = (ArrayList) obj;
                firebaseAppHostApi.setAutomaticResourceManagementEnabled((String) arrayList.get(0), (Boolean) arrayList.get(1), new Result<Void>(new ArrayList(), reply) {
                    final /* synthetic */ BasicMessageChannel.Reply val$reply;
                    final /* synthetic */ ArrayList val$wrapped;

                    {
                        this.val$wrapped = r1;
                        this.val$reply = r2;
                    }

                    public void error(Throwable th) {
                        this.val$reply.reply(GeneratedAndroidFirebaseCore.wrapError(th));
                    }

                    public void success(Void voidR) {
                        this.val$wrapped.add(0, (Object) null);
                        this.val$reply.reply(this.val$wrapped);
                    }
                });
            }

            public static void h(BinaryMessenger binaryMessenger, FirebaseAppHostApi firebaseAppHostApi) {
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", d());
                if (firebaseAppHostApi != null) {
                    basicMessageChannel.setMessageHandler(new k(firebaseAppHostApi));
                } else {
                    basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", d());
                if (firebaseAppHostApi != null) {
                    basicMessageChannel2.setMessageHandler(new l(firebaseAppHostApi));
                } else {
                    basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FirebaseAppHostApi.delete", d());
                if (firebaseAppHostApi != null) {
                    basicMessageChannel3.setMessageHandler(new m(firebaseAppHostApi));
                } else {
                    basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
            }
        }

        void delete(String str, Result<Void> result);

        void setAutomaticDataCollectionEnabled(String str, Boolean bool, Result<Void> result);

        void setAutomaticResourceManagementEnabled(String str, Boolean bool, Result<Void> result);
    }

    public interface FirebaseCoreHostApi {

        /* renamed from: io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore$FirebaseCoreHostApi$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static MessageCodec<Object> d() {
                return FirebaseCoreHostApiCodec.INSTANCE;
            }

            public static /* synthetic */ void e(FirebaseCoreHostApi firebaseCoreHostApi, Object obj, BasicMessageChannel.Reply reply) {
                ArrayList arrayList = (ArrayList) obj;
                firebaseCoreHostApi.initializeApp((String) arrayList.get(0), (PigeonFirebaseOptions) arrayList.get(1), new Result<PigeonInitializeResponse>(new ArrayList(), reply) {
                    final /* synthetic */ BasicMessageChannel.Reply val$reply;
                    final /* synthetic */ ArrayList val$wrapped;

                    {
                        this.val$wrapped = r1;
                        this.val$reply = r2;
                    }

                    public void error(Throwable th) {
                        this.val$reply.reply(GeneratedAndroidFirebaseCore.wrapError(th));
                    }

                    public void success(PigeonInitializeResponse pigeonInitializeResponse) {
                        this.val$wrapped.add(0, pigeonInitializeResponse);
                        this.val$reply.reply(this.val$wrapped);
                    }
                });
            }

            public static void h(BinaryMessenger binaryMessenger, FirebaseCoreHostApi firebaseCoreHostApi) {
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeApp", d());
                if (firebaseCoreHostApi != null) {
                    basicMessageChannel.setMessageHandler(new p(firebaseCoreHostApi));
                } else {
                    basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeCore", d());
                if (firebaseCoreHostApi != null) {
                    basicMessageChannel2.setMessageHandler(new n(firebaseCoreHostApi));
                } else {
                    basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FirebaseCoreHostApi.optionsFromResource", d());
                if (firebaseCoreHostApi != null) {
                    basicMessageChannel3.setMessageHandler(new o(firebaseCoreHostApi));
                } else {
                    basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
            }
        }

        void initializeApp(String str, PigeonFirebaseOptions pigeonFirebaseOptions, Result<PigeonInitializeResponse> result);

        void initializeCore(Result<List<PigeonInitializeResponse>> result);

        void optionsFromResource(Result<PigeonFirebaseOptions> result);
    }

    private static class FirebaseCoreHostApiCodec extends StandardMessageCodec {
        public static final FirebaseCoreHostApiCodec INSTANCE = new FirebaseCoreHostApiCodec();

        private FirebaseCoreHostApiCodec() {
        }

        /* access modifiers changed from: protected */
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            if (b10 == Byte.MIN_VALUE) {
                return PigeonFirebaseOptions.fromList((ArrayList) readValue(byteBuffer));
            }
            if (b10 != -127) {
                return super.readValueOfType(b10, byteBuffer);
            }
            return PigeonInitializeResponse.fromList((ArrayList) readValue(byteBuffer));
        }

        /* access modifiers changed from: protected */
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof PigeonFirebaseOptions) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((PigeonFirebaseOptions) obj).toList());
            } else if (obj instanceof PigeonInitializeResponse) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((PigeonInitializeResponse) obj).toList());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(String str, String str2, Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    public static final class PigeonFirebaseOptions {
        private String androidClientId;
        private String apiKey;
        private String appGroupId;
        private String appId;
        private String authDomain;
        private String databaseURL;
        private String deepLinkURLScheme;
        private String iosBundleId;
        private String iosClientId;
        private String measurementId;
        private String messagingSenderId;
        private String projectId;
        private String storageBucket;
        private String trackingId;

        public static final class Builder {
            private String androidClientId;
            private String apiKey;
            private String appGroupId;
            private String appId;
            private String authDomain;
            private String databaseURL;
            private String deepLinkURLScheme;
            private String iosBundleId;
            private String iosClientId;
            private String measurementId;
            private String messagingSenderId;
            private String projectId;
            private String storageBucket;
            private String trackingId;

            public PigeonFirebaseOptions build() {
                PigeonFirebaseOptions pigeonFirebaseOptions = new PigeonFirebaseOptions();
                pigeonFirebaseOptions.setApiKey(this.apiKey);
                pigeonFirebaseOptions.setAppId(this.appId);
                pigeonFirebaseOptions.setMessagingSenderId(this.messagingSenderId);
                pigeonFirebaseOptions.setProjectId(this.projectId);
                pigeonFirebaseOptions.setAuthDomain(this.authDomain);
                pigeonFirebaseOptions.setDatabaseURL(this.databaseURL);
                pigeonFirebaseOptions.setStorageBucket(this.storageBucket);
                pigeonFirebaseOptions.setMeasurementId(this.measurementId);
                pigeonFirebaseOptions.setTrackingId(this.trackingId);
                pigeonFirebaseOptions.setDeepLinkURLScheme(this.deepLinkURLScheme);
                pigeonFirebaseOptions.setAndroidClientId(this.androidClientId);
                pigeonFirebaseOptions.setIosClientId(this.iosClientId);
                pigeonFirebaseOptions.setIosBundleId(this.iosBundleId);
                pigeonFirebaseOptions.setAppGroupId(this.appGroupId);
                return pigeonFirebaseOptions;
            }

            public Builder setAndroidClientId(String str) {
                this.androidClientId = str;
                return this;
            }

            public Builder setApiKey(String str) {
                this.apiKey = str;
                return this;
            }

            public Builder setAppGroupId(String str) {
                this.appGroupId = str;
                return this;
            }

            public Builder setAppId(String str) {
                this.appId = str;
                return this;
            }

            public Builder setAuthDomain(String str) {
                this.authDomain = str;
                return this;
            }

            public Builder setDatabaseURL(String str) {
                this.databaseURL = str;
                return this;
            }

            public Builder setDeepLinkURLScheme(String str) {
                this.deepLinkURLScheme = str;
                return this;
            }

            public Builder setIosBundleId(String str) {
                this.iosBundleId = str;
                return this;
            }

            public Builder setIosClientId(String str) {
                this.iosClientId = str;
                return this;
            }

            public Builder setMeasurementId(String str) {
                this.measurementId = str;
                return this;
            }

            public Builder setMessagingSenderId(String str) {
                this.messagingSenderId = str;
                return this;
            }

            public Builder setProjectId(String str) {
                this.projectId = str;
                return this;
            }

            public Builder setStorageBucket(String str) {
                this.storageBucket = str;
                return this;
            }

            public Builder setTrackingId(String str) {
                this.trackingId = str;
                return this;
            }
        }

        PigeonFirebaseOptions() {
        }

        static PigeonFirebaseOptions fromList(ArrayList<Object> arrayList) {
            PigeonFirebaseOptions pigeonFirebaseOptions = new PigeonFirebaseOptions();
            pigeonFirebaseOptions.setApiKey((String) arrayList.get(0));
            pigeonFirebaseOptions.setAppId((String) arrayList.get(1));
            pigeonFirebaseOptions.setMessagingSenderId((String) arrayList.get(2));
            pigeonFirebaseOptions.setProjectId((String) arrayList.get(3));
            pigeonFirebaseOptions.setAuthDomain((String) arrayList.get(4));
            pigeonFirebaseOptions.setDatabaseURL((String) arrayList.get(5));
            pigeonFirebaseOptions.setStorageBucket((String) arrayList.get(6));
            pigeonFirebaseOptions.setMeasurementId((String) arrayList.get(7));
            pigeonFirebaseOptions.setTrackingId((String) arrayList.get(8));
            pigeonFirebaseOptions.setDeepLinkURLScheme((String) arrayList.get(9));
            pigeonFirebaseOptions.setAndroidClientId((String) arrayList.get(10));
            pigeonFirebaseOptions.setIosClientId((String) arrayList.get(11));
            pigeonFirebaseOptions.setIosBundleId((String) arrayList.get(12));
            pigeonFirebaseOptions.setAppGroupId((String) arrayList.get(13));
            return pigeonFirebaseOptions;
        }

        public String getAndroidClientId() {
            return this.androidClientId;
        }

        public String getApiKey() {
            return this.apiKey;
        }

        public String getAppGroupId() {
            return this.appGroupId;
        }

        public String getAppId() {
            return this.appId;
        }

        public String getAuthDomain() {
            return this.authDomain;
        }

        public String getDatabaseURL() {
            return this.databaseURL;
        }

        public String getDeepLinkURLScheme() {
            return this.deepLinkURLScheme;
        }

        public String getIosBundleId() {
            return this.iosBundleId;
        }

        public String getIosClientId() {
            return this.iosClientId;
        }

        public String getMeasurementId() {
            return this.measurementId;
        }

        public String getMessagingSenderId() {
            return this.messagingSenderId;
        }

        public String getProjectId() {
            return this.projectId;
        }

        public String getStorageBucket() {
            return this.storageBucket;
        }

        public String getTrackingId() {
            return this.trackingId;
        }

        public void setAndroidClientId(String str) {
            this.androidClientId = str;
        }

        public void setApiKey(String str) {
            if (str != null) {
                this.apiKey = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        }

        public void setAppGroupId(String str) {
            this.appGroupId = str;
        }

        public void setAppId(String str) {
            if (str != null) {
                this.appId = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }

        public void setAuthDomain(String str) {
            this.authDomain = str;
        }

        public void setDatabaseURL(String str) {
            this.databaseURL = str;
        }

        public void setDeepLinkURLScheme(String str) {
            this.deepLinkURLScheme = str;
        }

        public void setIosBundleId(String str) {
            this.iosBundleId = str;
        }

        public void setIosClientId(String str) {
            this.iosClientId = str;
        }

        public void setMeasurementId(String str) {
            this.measurementId = str;
        }

        public void setMessagingSenderId(String str) {
            if (str != null) {
                this.messagingSenderId = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
        }

        public void setProjectId(String str) {
            if (str != null) {
                this.projectId = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"projectId\" is null.");
        }

        public void setStorageBucket(String str) {
            this.storageBucket = str;
        }

        public void setTrackingId(String str) {
            this.trackingId = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(14);
            arrayList.add(this.apiKey);
            arrayList.add(this.appId);
            arrayList.add(this.messagingSenderId);
            arrayList.add(this.projectId);
            arrayList.add(this.authDomain);
            arrayList.add(this.databaseURL);
            arrayList.add(this.storageBucket);
            arrayList.add(this.measurementId);
            arrayList.add(this.trackingId);
            arrayList.add(this.deepLinkURLScheme);
            arrayList.add(this.androidClientId);
            arrayList.add(this.iosClientId);
            arrayList.add(this.iosBundleId);
            arrayList.add(this.appGroupId);
            return arrayList;
        }
    }

    public static final class PigeonInitializeResponse {
        private Boolean isAutomaticDataCollectionEnabled;
        private String name;
        private PigeonFirebaseOptions options;
        private Map<String, Object> pluginConstants;

        public static final class Builder {
            private Boolean isAutomaticDataCollectionEnabled;
            private String name;
            private PigeonFirebaseOptions options;
            private Map<String, Object> pluginConstants;

            public PigeonInitializeResponse build() {
                PigeonInitializeResponse pigeonInitializeResponse = new PigeonInitializeResponse();
                pigeonInitializeResponse.setName(this.name);
                pigeonInitializeResponse.setOptions(this.options);
                pigeonInitializeResponse.setIsAutomaticDataCollectionEnabled(this.isAutomaticDataCollectionEnabled);
                pigeonInitializeResponse.setPluginConstants(this.pluginConstants);
                return pigeonInitializeResponse;
            }

            public Builder setIsAutomaticDataCollectionEnabled(Boolean bool) {
                this.isAutomaticDataCollectionEnabled = bool;
                return this;
            }

            public Builder setName(String str) {
                this.name = str;
                return this;
            }

            public Builder setOptions(PigeonFirebaseOptions pigeonFirebaseOptions) {
                this.options = pigeonFirebaseOptions;
                return this;
            }

            public Builder setPluginConstants(Map<String, Object> map) {
                this.pluginConstants = map;
                return this;
            }
        }

        PigeonInitializeResponse() {
        }

        static PigeonInitializeResponse fromList(ArrayList<Object> arrayList) {
            PigeonFirebaseOptions pigeonFirebaseOptions;
            PigeonInitializeResponse pigeonInitializeResponse = new PigeonInitializeResponse();
            pigeonInitializeResponse.setName((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            if (obj == null) {
                pigeonFirebaseOptions = null;
            } else {
                pigeonFirebaseOptions = PigeonFirebaseOptions.fromList((ArrayList) obj);
            }
            pigeonInitializeResponse.setOptions(pigeonFirebaseOptions);
            pigeonInitializeResponse.setIsAutomaticDataCollectionEnabled((Boolean) arrayList.get(2));
            pigeonInitializeResponse.setPluginConstants((Map) arrayList.get(3));
            return pigeonInitializeResponse;
        }

        public Boolean getIsAutomaticDataCollectionEnabled() {
            return this.isAutomaticDataCollectionEnabled;
        }

        public String getName() {
            return this.name;
        }

        public PigeonFirebaseOptions getOptions() {
            return this.options;
        }

        public Map<String, Object> getPluginConstants() {
            return this.pluginConstants;
        }

        public void setIsAutomaticDataCollectionEnabled(Boolean bool) {
            this.isAutomaticDataCollectionEnabled = bool;
        }

        public void setName(String str) {
            if (str != null) {
                this.name = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        }

        public void setOptions(PigeonFirebaseOptions pigeonFirebaseOptions) {
            if (pigeonFirebaseOptions != null) {
                this.options = pigeonFirebaseOptions;
                return;
            }
            throw new IllegalStateException("Nonnull field \"options\" is null.");
        }

        public void setPluginConstants(Map<String, Object> map) {
            if (map != null) {
                this.pluginConstants = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.name);
            PigeonFirebaseOptions pigeonFirebaseOptions = this.options;
            arrayList.add(pigeonFirebaseOptions == null ? null : pigeonFirebaseOptions.toList());
            arrayList.add(this.isAutomaticDataCollectionEnabled);
            arrayList.add(this.pluginConstants);
            return arrayList;
        }
    }

    public interface Result<T> {
        void error(Throwable th);

        void success(T t10);
    }

    protected static ArrayList<Object> wrapError(Throwable th) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
