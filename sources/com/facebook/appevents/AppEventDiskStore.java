package com.facebook.appevents;

import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: AppEventDiskStore.kt */
public final class AppEventDiskStore {
    public static final AppEventDiskStore INSTANCE = new AppEventDiskStore();
    private static final String PERSISTED_EVENTS_FILENAME = "AppEventsLogger.persistedevents";
    private static final String TAG = AppEventDiskStore.class.getName();

    /* compiled from: AppEventDiskStore.kt */
    private static final class MovedClassObjectInputStream extends ObjectInputStream {
        private static final String ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1";
        private static final String APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2";
        public static final Companion Companion = new Companion((g) null);

        /* compiled from: AppEventDiskStore.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        public MovedClassObjectInputStream(InputStream inputStream) {
            super(inputStream);
        }

        /* access modifiers changed from: protected */
        public ObjectStreamClass readClassDescriptor() {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (m.a(readClassDescriptor.getName(), ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME)) {
                readClassDescriptor = ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
            } else if (m.a(readClassDescriptor.getName(), APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME)) {
                readClassDescriptor = ObjectStreamClass.lookup(AppEvent.SerializationProxyV2.class);
            }
            m.e(readClassDescriptor, "resultClassDescriptor");
            return readClassDescriptor;
        }
    }

    private AppEventDiskStore() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:21|24|25|26|27|28|29|30) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0057 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x006b */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0079 A[SYNTHETIC, Splitter:B:48:0x0079] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x0057=Splitter:B:29:0x0057, B:24:0x0049=Splitter:B:24:0x0049, B:42:0x006b=Splitter:B:42:0x006b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized com.facebook.appevents.PersistedEvents readAndClearStore() {
        /*
            java.lang.Class<com.facebook.appevents.AppEventDiskStore> r0 = com.facebook.appevents.AppEventDiskStore.class
            monitor-enter(r0)
            com.facebook.appevents.internal.AppEventUtility r1 = com.facebook.appevents.internal.AppEventUtility.INSTANCE     // Catch:{ all -> 0x0080 }
            com.facebook.appevents.internal.AppEventUtility.assertIsNotMainThread()     // Catch:{ all -> 0x0080 }
            com.facebook.FacebookSdk r1 = com.facebook.FacebookSdk.INSTANCE     // Catch:{ all -> 0x0080 }
            android.content.Context r1 = com.facebook.FacebookSdk.getApplicationContext()     // Catch:{ all -> 0x0080 }
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch:{ FileNotFoundException -> 0x006a, Exception -> 0x0058, all -> 0x0046 }
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            kotlin.jvm.internal.m.e(r3, r4)     // Catch:{ FileNotFoundException -> 0x006a, Exception -> 0x0058, all -> 0x0046 }
            com.facebook.appevents.AppEventDiskStore$MovedClassObjectInputStream r4 = new com.facebook.appevents.AppEventDiskStore$MovedClassObjectInputStream     // Catch:{ FileNotFoundException -> 0x006a, Exception -> 0x0058, all -> 0x0046 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x006a, Exception -> 0x0058, all -> 0x0046 }
            r5.<init>(r3)     // Catch:{ FileNotFoundException -> 0x006a, Exception -> 0x0058, all -> 0x0046 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x006a, Exception -> 0x0058, all -> 0x0046 }
            java.lang.Object r3 = r4.readObject()     // Catch:{ FileNotFoundException -> 0x006b, Exception -> 0x0059, all -> 0x0044 }
            if (r3 == 0) goto L_0x003c
            com.facebook.appevents.PersistedEvents r3 = (com.facebook.appevents.PersistedEvents) r3     // Catch:{ FileNotFoundException -> 0x006b, Exception -> 0x0059, all -> 0x0044 }
            com.facebook.internal.Utility r2 = com.facebook.internal.Utility.INSTANCE     // Catch:{ all -> 0x0080 }
            com.facebook.internal.Utility.closeQuietly(r4)     // Catch:{ all -> 0x0080 }
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch:{ Exception -> 0x003a }
            r1.delete()     // Catch:{ Exception -> 0x003a }
        L_0x003a:
            r2 = r3
            goto L_0x0077
        L_0x003c:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch:{ FileNotFoundException -> 0x006b, Exception -> 0x0059, all -> 0x0044 }
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            r3.<init>(r5)     // Catch:{ FileNotFoundException -> 0x006b, Exception -> 0x0059, all -> 0x0044 }
            throw r3     // Catch:{ FileNotFoundException -> 0x006b, Exception -> 0x0059, all -> 0x0044 }
        L_0x0044:
            r2 = move-exception
            goto L_0x0049
        L_0x0046:
            r3 = move-exception
            r4 = r2
            r2 = r3
        L_0x0049:
            com.facebook.internal.Utility r3 = com.facebook.internal.Utility.INSTANCE     // Catch:{ all -> 0x0080 }
            com.facebook.internal.Utility.closeQuietly(r4)     // Catch:{ all -> 0x0080 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0057 }
            r1.delete()     // Catch:{ Exception -> 0x0057 }
        L_0x0057:
            throw r2     // Catch:{ all -> 0x0080 }
        L_0x0058:
            r4 = r2
        L_0x0059:
            com.facebook.internal.Utility r3 = com.facebook.internal.Utility.INSTANCE     // Catch:{ all -> 0x0080 }
            com.facebook.internal.Utility.closeQuietly(r4)     // Catch:{ all -> 0x0080 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0068 }
        L_0x0064:
            r1.delete()     // Catch:{ Exception -> 0x0068 }
            goto L_0x0077
        L_0x0068:
            goto L_0x0077
        L_0x006a:
            r4 = r2
        L_0x006b:
            com.facebook.internal.Utility r3 = com.facebook.internal.Utility.INSTANCE     // Catch:{ all -> 0x0080 }
            com.facebook.internal.Utility.closeQuietly(r4)     // Catch:{ all -> 0x0080 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0068 }
            goto L_0x0064
        L_0x0077:
            if (r2 != 0) goto L_0x007e
            com.facebook.appevents.PersistedEvents r2 = new com.facebook.appevents.PersistedEvents     // Catch:{ all -> 0x0080 }
            r2.<init>()     // Catch:{ all -> 0x0080 }
        L_0x007e:
            monitor-exit(r0)
            return r2
        L_0x0080:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.AppEventDiskStore.readAndClearStore():com.facebook.appevents.PersistedEvents");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0022 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void saveEventsToDisk$facebook_core_release(com.facebook.appevents.PersistedEvents r6) {
        /*
            java.lang.String r0 = "AppEventsLogger.persistedevents"
            com.facebook.FacebookSdk r1 = com.facebook.FacebookSdk.INSTANCE
            android.content.Context r1 = com.facebook.FacebookSdk.getApplicationContext()
            r2 = 0
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0022 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0022 }
            r5 = 0
            java.io.FileOutputStream r5 = r1.openFileOutput(r0, r5)     // Catch:{ all -> 0x0022 }
            r4.<init>(r5)     // Catch:{ all -> 0x0022 }
            r3.<init>(r4)     // Catch:{ all -> 0x0022 }
            r3.writeObject(r6)     // Catch:{ all -> 0x0021 }
            com.facebook.internal.Utility r6 = com.facebook.internal.Utility.INSTANCE
            com.facebook.internal.Utility.closeQuietly(r3)
            goto L_0x0036
        L_0x0021:
            r2 = r3
        L_0x0022:
            java.io.File r6 = r1.getFileStreamPath(r0)     // Catch:{ Exception -> 0x0031, all -> 0x002a }
            r6.delete()     // Catch:{ Exception -> 0x0031, all -> 0x002a }
            goto L_0x0031
        L_0x002a:
            r6 = move-exception
            com.facebook.internal.Utility r0 = com.facebook.internal.Utility.INSTANCE
            com.facebook.internal.Utility.closeQuietly(r2)
            throw r6
        L_0x0031:
            com.facebook.internal.Utility r6 = com.facebook.internal.Utility.INSTANCE
            com.facebook.internal.Utility.closeQuietly(r2)
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.AppEventDiskStore.saveEventsToDisk$facebook_core_release(com.facebook.appevents.PersistedEvents):void");
    }
}
