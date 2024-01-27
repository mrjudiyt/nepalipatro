package com.facebook.appevents.iap;

import android.content.Context;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InAppPurchaseBillingClientWrapper.kt */
public final class InAppPurchaseBillingClientWrapper {
    private static final String CLASSNAME_BILLING_CLIENT = "com.android.billingclient.api.BillingClient";
    private static final String CLASSNAME_BILLING_CLIENT_BUILDER = "com.android.billingclient.api.BillingClient$Builder";
    private static final String CLASSNAME_BILLING_CLIENT_STATE_LISTENER = "com.android.billingclient.api.BillingClientStateListener";
    private static final String CLASSNAME_PURCHASE = "com.android.billingclient.api.Purchase";
    private static final String CLASSNAME_PURCHASES_RESULT = "com.android.billingclient.api.Purchase$PurchasesResult";
    private static final String CLASSNAME_PURCHASE_HISTORY_RECORD = "com.android.billingclient.api.PurchaseHistoryRecord";
    private static final String CLASSNAME_PURCHASE_HISTORY_RESPONSE_LISTENER = "com.android.billingclient.api.PurchaseHistoryResponseListener";
    private static final String CLASSNAME_PURCHASE_UPDATED_LISTENER = "com.android.billingclient.api.PurchasesUpdatedListener";
    private static final String CLASSNAME_SKU_DETAILS = "com.android.billingclient.api.SkuDetails";
    private static final String CLASSNAME_SKU_DETAILS_RESPONSE_LISTENER = "com.android.billingclient.api.SkuDetailsResponseListener";
    public static final Companion Companion = new Companion((g) null);
    private static final String IN_APP = "inapp";
    private static final String METHOD_BUILD = "build";
    private static final String METHOD_ENABLE_PENDING_PURCHASES = "enablePendingPurchases";
    private static final String METHOD_GET_ORIGINAL_JSON = "getOriginalJson";
    private static final String METHOD_GET_PURCHASE_LIST = "getPurchasesList";
    private static final String METHOD_NEW_BUILDER = "newBuilder";
    private static final String METHOD_ON_BILLING_SERVICE_DISCONNECTED = "onBillingServiceDisconnected";
    private static final String METHOD_ON_BILLING_SETUP_FINISHED = "onBillingSetupFinished";
    private static final String METHOD_ON_PURCHASE_HISTORY_RESPONSE = "onPurchaseHistoryResponse";
    private static final String METHOD_ON_SKU_DETAILS_RESPONSE = "onSkuDetailsResponse";
    private static final String METHOD_QUERY_PURCHASES = "queryPurchases";
    private static final String METHOD_QUERY_PURCHASE_HISTORY_ASYNC = "queryPurchaseHistoryAsync";
    private static final String METHOD_QUERY_SKU_DETAILS_ASYNC = "querySkuDetailsAsync";
    private static final String METHOD_SET_LISTENER = "setListener";
    private static final String METHOD_START_CONNECTION = "startConnection";
    private static final String PACKAGE_NAME = "packageName";
    private static final String PRODUCT_ID = "productId";
    private static final AtomicBoolean initialized = new AtomicBoolean(false);
    private static InAppPurchaseBillingClientWrapper instance;
    private static final AtomicBoolean isServiceConnected = new AtomicBoolean(false);
    private static final Map<String, JSONObject> purchaseDetailsMap = new ConcurrentHashMap();
    private static final Map<String, JSONObject> skuDetailsMap = new ConcurrentHashMap();
    private final Object billingClient;
    private final Class<?> billingClientClazz;
    private final Context context;
    private final Method getOriginalJsonMethod;
    private final Method getOriginalJsonPurchaseHistoryMethod;
    private final Method getOriginalJsonSkuMethod;
    private final Method getPurchaseListMethod;
    private final Set<String> historyPurchaseSet;
    private final InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper;
    private final Class<?> purchaseClazz;
    private final Class<?> purchaseHistoryRecordClazz;
    private final Class<?> purchaseHistoryResponseListenerClazz;
    private final Class<?> purchaseResultClazz;
    private final Method queryPurchaseHistoryAsyncMethod;
    private final Method queryPurchasesMethod;
    private final Method querySkuDetailsAsyncMethod;
    private final Class<?> skuDetailsClazz;
    private final Class<?> skuDetailsResponseListenerClazz;

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    public static final class BillingClientStateListenerWrapper implements InvocationHandler {
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                m.f(obj, "proxy");
                m.f(method, "m");
                if (m.a(method.getName(), InAppPurchaseBillingClientWrapper.METHOD_ON_BILLING_SETUP_FINISHED)) {
                    InAppPurchaseBillingClientWrapper.Companion.isServiceConnected().set(true);
                } else {
                    String name = method.getName();
                    m.e(name, "m.name");
                    if (p.l(name, InAppPurchaseBillingClientWrapper.METHOD_ON_BILLING_SERVICE_DISCONNECTED, false, 2, (Object) null)) {
                        InAppPurchaseBillingClientWrapper.Companion.isServiceConnected().set(false);
                    }
                }
                return null;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final Object createBillingClient(Context context, Class<?> cls) {
            Object invokeMethod;
            Object invokeMethod2;
            Object invokeMethod3;
            InAppPurchaseUtils inAppPurchaseUtils = InAppPurchaseUtils.INSTANCE;
            Class<?> cls2 = InAppPurchaseUtils.getClass(InAppPurchaseBillingClientWrapper.CLASSNAME_BILLING_CLIENT_BUILDER);
            Class<?> cls3 = InAppPurchaseUtils.getClass(InAppPurchaseBillingClientWrapper.CLASSNAME_PURCHASE_UPDATED_LISTENER);
            if (cls2 == null || cls3 == null) {
                return null;
            }
            Method method = InAppPurchaseUtils.getMethod(cls, InAppPurchaseBillingClientWrapper.METHOD_NEW_BUILDER, Context.class);
            Method method2 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseBillingClientWrapper.METHOD_ENABLE_PENDING_PURCHASES, new Class[0]);
            Method method3 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseBillingClientWrapper.METHOD_SET_LISTENER, cls3);
            Method method4 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseBillingClientWrapper.METHOD_BUILD, new Class[0]);
            if (method == null || method2 == null || method3 == null || method4 == null || (invokeMethod = InAppPurchaseUtils.invokeMethod(cls, method, (Object) null, context)) == null || (invokeMethod2 = InAppPurchaseUtils.invokeMethod(cls2, method3, invokeMethod, Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, new PurchasesUpdatedListenerWrapper()))) == null || (invokeMethod3 = InAppPurchaseUtils.invokeMethod(cls2, method2, invokeMethod2, new Object[0])) == null) {
                return null;
            }
            return InAppPurchaseUtils.invokeMethod(cls2, method4, invokeMethod3, new Object[0]);
        }

        private final void createInstance(Context context) {
            Class<String> cls = String.class;
            InAppPurchaseSkuDetailsWrapper orCreateInstance = InAppPurchaseSkuDetailsWrapper.Companion.getOrCreateInstance();
            if (orCreateInstance != null) {
                InAppPurchaseUtils inAppPurchaseUtils = InAppPurchaseUtils.INSTANCE;
                Class<?> cls2 = InAppPurchaseUtils.getClass(InAppPurchaseBillingClientWrapper.CLASSNAME_BILLING_CLIENT);
                Class<?> cls3 = InAppPurchaseUtils.getClass(InAppPurchaseBillingClientWrapper.CLASSNAME_PURCHASE);
                Class<?> cls4 = InAppPurchaseUtils.getClass(InAppPurchaseBillingClientWrapper.CLASSNAME_PURCHASES_RESULT);
                Class<?> cls5 = InAppPurchaseUtils.getClass(InAppPurchaseBillingClientWrapper.CLASSNAME_SKU_DETAILS);
                Class<?> cls6 = InAppPurchaseUtils.getClass(InAppPurchaseBillingClientWrapper.CLASSNAME_PURCHASE_HISTORY_RECORD);
                Class<?> cls7 = InAppPurchaseUtils.getClass(InAppPurchaseBillingClientWrapper.CLASSNAME_SKU_DETAILS_RESPONSE_LISTENER);
                Class<?> cls8 = InAppPurchaseUtils.getClass(InAppPurchaseBillingClientWrapper.CLASSNAME_PURCHASE_HISTORY_RESPONSE_LISTENER);
                if (cls2 == null || cls4 == null || cls3 == null || cls5 == null || cls7 == null || cls6 == null || cls8 == null) {
                    return;
                }
                Method method = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseBillingClientWrapper.METHOD_QUERY_PURCHASES, cls);
                Method method2 = InAppPurchaseUtils.getMethod(cls4, InAppPurchaseBillingClientWrapper.METHOD_GET_PURCHASE_LIST, new Class[0]);
                Method method3 = InAppPurchaseUtils.getMethod(cls3, InAppPurchaseBillingClientWrapper.METHOD_GET_ORIGINAL_JSON, new Class[0]);
                Method method4 = InAppPurchaseUtils.getMethod(cls5, InAppPurchaseBillingClientWrapper.METHOD_GET_ORIGINAL_JSON, new Class[0]);
                Method method5 = InAppPurchaseUtils.getMethod(cls6, InAppPurchaseBillingClientWrapper.METHOD_GET_ORIGINAL_JSON, new Class[0]);
                Method method6 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseBillingClientWrapper.METHOD_QUERY_SKU_DETAILS_ASYNC, orCreateInstance.getSkuDetailsParamsClazz(), cls7);
                Method method7 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseBillingClientWrapper.METHOD_QUERY_PURCHASE_HISTORY_ASYNC, cls, cls8);
                if (method == null || method2 == null || method3 == null || method4 == null || method5 == null || method6 == null || method7 == null) {
                    return;
                }
                Object createBillingClient = createBillingClient(context, cls2);
                if (createBillingClient != null) {
                    InAppPurchaseBillingClientWrapper.access$setInstance$cp(new InAppPurchaseBillingClientWrapper(context, createBillingClient, cls2, cls4, cls3, cls5, cls6, cls7, cls8, method, method2, method3, method4, method5, method6, method7, orCreateInstance, (g) null));
                    InAppPurchaseBillingClientWrapper access$getInstance$cp = InAppPurchaseBillingClientWrapper.access$getInstance$cp();
                    Objects.requireNonNull(access$getInstance$cp, "null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
                    InAppPurchaseBillingClientWrapper.access$startConnection(access$getInstance$cp);
                }
            }
        }

        public final synchronized InAppPurchaseBillingClientWrapper getOrCreateInstance(Context context) {
            m.f(context, "context");
            if (InAppPurchaseBillingClientWrapper.access$getInitialized$cp().get()) {
                return InAppPurchaseBillingClientWrapper.access$getInstance$cp();
            }
            createInstance(context);
            InAppPurchaseBillingClientWrapper.access$getInitialized$cp().set(true);
            return InAppPurchaseBillingClientWrapper.access$getInstance$cp();
        }

        public final Map<String, JSONObject> getPurchaseDetailsMap() {
            return InAppPurchaseBillingClientWrapper.access$getPurchaseDetailsMap$cp();
        }

        public final Map<String, JSONObject> getSkuDetailsMap() {
            return InAppPurchaseBillingClientWrapper.access$getSkuDetailsMap$cp();
        }

        public final AtomicBoolean isServiceConnected() {
            return InAppPurchaseBillingClientWrapper.access$isServiceConnected$cp();
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    public final class PurchaseHistoryResponseListenerWrapper implements InvocationHandler {
        private Runnable runnable;
        final /* synthetic */ InAppPurchaseBillingClientWrapper this$0;

        public PurchaseHistoryResponseListenerWrapper(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper, Runnable runnable2) {
            m.f(inAppPurchaseBillingClientWrapper, "this$0");
            m.f(runnable2, "runnable");
            this.this$0 = inAppPurchaseBillingClientWrapper;
            this.runnable = runnable2;
        }

        private final void getPurchaseHistoryRecord(List<?> list) {
            if (!CrashShieldHandler.isObjectCrashing(this)) {
                try {
                    for (Object next : list) {
                        try {
                            InAppPurchaseUtils inAppPurchaseUtils = InAppPurchaseUtils.INSTANCE;
                            Object invokeMethod = InAppPurchaseUtils.invokeMethod(InAppPurchaseBillingClientWrapper.access$getPurchaseHistoryRecordClazz$p(this.this$0), InAppPurchaseBillingClientWrapper.access$getGetOriginalJsonPurchaseHistoryMethod$p(this.this$0), next, new Object[0]);
                            String str = invokeMethod instanceof String ? (String) invokeMethod : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                jSONObject.put("packageName", InAppPurchaseBillingClientWrapper.access$getContext$p(this.this$0).getPackageName());
                                if (jSONObject.has(InAppPurchaseBillingClientWrapper.PRODUCT_ID)) {
                                    String string = jSONObject.getString(InAppPurchaseBillingClientWrapper.PRODUCT_ID);
                                    InAppPurchaseBillingClientWrapper.access$getHistoryPurchaseSet$p(this.this$0).add(string);
                                    Map<String, JSONObject> purchaseDetailsMap = InAppPurchaseBillingClientWrapper.Companion.getPurchaseDetailsMap();
                                    m.e(string, "skuID");
                                    purchaseDetailsMap.put(string, jSONObject);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    this.runnable.run();
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }

        public final Runnable getRunnable() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                return this.runnable;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            List list;
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                m.f(obj, "proxy");
                m.f(method, "method");
                if (m.a(method.getName(), InAppPurchaseBillingClientWrapper.METHOD_ON_PURCHASE_HISTORY_RESPONSE)) {
                    if (objArr == null) {
                        list = null;
                    } else {
                        list = objArr[1];
                    }
                    if (list != null && (list instanceof List)) {
                        getPurchaseHistoryRecord(list);
                    }
                }
                return null;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        public final void setRunnable(Runnable runnable2) {
            if (!CrashShieldHandler.isObjectCrashing(this)) {
                try {
                    m.f(runnable2, "<set-?>");
                    this.runnable = runnable2;
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    public static final class PurchasesUpdatedListenerWrapper implements InvocationHandler {
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                m.f(obj, "proxy");
                m.f(method, "m");
                return null;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    public final class SkuDetailsResponseListenerWrapper implements InvocationHandler {
        private Runnable runnable;
        final /* synthetic */ InAppPurchaseBillingClientWrapper this$0;

        public SkuDetailsResponseListenerWrapper(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper, Runnable runnable2) {
            m.f(inAppPurchaseBillingClientWrapper, "this$0");
            m.f(runnable2, "runnable");
            this.this$0 = inAppPurchaseBillingClientWrapper;
            this.runnable = runnable2;
        }

        public final Runnable getRunnable() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                return this.runnable;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            List list;
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                m.f(obj, "proxy");
                m.f(method, "m");
                if (m.a(method.getName(), InAppPurchaseBillingClientWrapper.METHOD_ON_SKU_DETAILS_RESPONSE)) {
                    if (objArr == null) {
                        list = null;
                    } else {
                        list = objArr[1];
                    }
                    if (list != null && (list instanceof List)) {
                        parseSkuDetails(list);
                    }
                }
                return null;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        public final void parseSkuDetails(List<?> list) {
            if (!CrashShieldHandler.isObjectCrashing(this)) {
                try {
                    m.f(list, "skuDetailsObjectList");
                    for (Object next : list) {
                        try {
                            InAppPurchaseUtils inAppPurchaseUtils = InAppPurchaseUtils.INSTANCE;
                            Object invokeMethod = InAppPurchaseUtils.invokeMethod(InAppPurchaseBillingClientWrapper.access$getSkuDetailsClazz$p(this.this$0), InAppPurchaseBillingClientWrapper.access$getGetOriginalJsonSkuMethod$p(this.this$0), next, new Object[0]);
                            String str = invokeMethod instanceof String ? (String) invokeMethod : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has(InAppPurchaseBillingClientWrapper.PRODUCT_ID)) {
                                    String string = jSONObject.getString(InAppPurchaseBillingClientWrapper.PRODUCT_ID);
                                    Map<String, JSONObject> skuDetailsMap = InAppPurchaseBillingClientWrapper.Companion.getSkuDetailsMap();
                                    m.e(string, "skuID");
                                    skuDetailsMap.put(string, jSONObject);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    this.runnable.run();
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }

        public final void setRunnable(Runnable runnable2) {
            if (!CrashShieldHandler.isObjectCrashing(this)) {
                try {
                    m.f(runnable2, "<set-?>");
                    this.runnable = runnable2;
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }
    }

    private InAppPurchaseBillingClientWrapper(Context context2, Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper2) {
        this.context = context2;
        this.billingClient = obj;
        this.billingClientClazz = cls;
        this.purchaseResultClazz = cls2;
        this.purchaseClazz = cls3;
        this.skuDetailsClazz = cls4;
        this.purchaseHistoryRecordClazz = cls5;
        this.skuDetailsResponseListenerClazz = cls6;
        this.purchaseHistoryResponseListenerClazz = cls7;
        this.queryPurchasesMethod = method;
        this.getPurchaseListMethod = method2;
        this.getOriginalJsonMethod = method3;
        this.getOriginalJsonSkuMethod = method4;
        this.getOriginalJsonPurchaseHistoryMethod = method5;
        this.querySkuDetailsAsyncMethod = method6;
        this.queryPurchaseHistoryAsyncMethod = method7;
        this.inAppPurchaseSkuDetailsWrapper = inAppPurchaseSkuDetailsWrapper2;
        this.historyPurchaseSet = new CopyOnWriteArraySet();
    }

    public /* synthetic */ InAppPurchaseBillingClientWrapper(Context context2, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper2, g gVar) {
        this(context2, obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, inAppPurchaseSkuDetailsWrapper2);
    }

    public static final /* synthetic */ Context access$getContext$p(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.context;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ Method access$getGetOriginalJsonPurchaseHistoryMethod$p(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.getOriginalJsonPurchaseHistoryMethod;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ Method access$getGetOriginalJsonSkuMethod$p(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.getOriginalJsonSkuMethod;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ Set access$getHistoryPurchaseSet$p(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.historyPurchaseSet;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean access$getInitialized$cp() {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return initialized;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ InAppPurchaseBillingClientWrapper access$getInstance$cp() {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return instance;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ Map access$getPurchaseDetailsMap$cp() {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return purchaseDetailsMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ Class access$getPurchaseHistoryRecordClazz$p(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.purchaseHistoryRecordClazz;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ Class access$getSkuDetailsClazz$p(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.skuDetailsClazz;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ Map access$getSkuDetailsMap$cp() {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return skuDetailsMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean access$isServiceConnected$cp() {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return isServiceConnected;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ void access$setInstance$cp(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                instance = inAppPurchaseBillingClientWrapper;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final /* synthetic */ void access$startConnection(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                inAppPurchaseBillingClientWrapper.startConnection();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final synchronized InAppPurchaseBillingClientWrapper getOrCreateInstance(Context context2) {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        synchronized (cls) {
            if (CrashShieldHandler.isObjectCrashing(cls)) {
                return null;
            }
            try {
                InAppPurchaseBillingClientWrapper orCreateInstance = Companion.getOrCreateInstance(context2);
                return orCreateInstance;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: queryPurchaseHistory$lambda-0  reason: not valid java name */
    public static final void m58queryPurchaseHistory$lambda0(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper, Runnable runnable) {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(inAppPurchaseBillingClientWrapper, "this$0");
                m.f(runnable, "$queryPurchaseHistoryRunnable");
                inAppPurchaseBillingClientWrapper.querySkuDetailsAsync(IN_APP, new ArrayList(inAppPurchaseBillingClientWrapper.historyPurchaseSet), runnable);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final void queryPurchaseHistoryAsync(String str, Runnable runnable) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Object newProxyInstance = Proxy.newProxyInstance(this.purchaseHistoryResponseListenerClazz.getClassLoader(), new Class[]{this.purchaseHistoryResponseListenerClazz}, new PurchaseHistoryResponseListenerWrapper(this, runnable));
                InAppPurchaseUtils inAppPurchaseUtils = InAppPurchaseUtils.INSTANCE;
                InAppPurchaseUtils.invokeMethod(this.billingClientClazz, this.queryPurchaseHistoryAsyncMethod, this.billingClient, str, newProxyInstance);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void querySkuDetailsAsync(String str, List<String> list, Runnable runnable) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Object newProxyInstance = Proxy.newProxyInstance(this.skuDetailsResponseListenerClazz.getClassLoader(), new Class[]{this.skuDetailsResponseListenerClazz}, new SkuDetailsResponseListenerWrapper(this, runnable));
                Object skuDetailsParams = this.inAppPurchaseSkuDetailsWrapper.getSkuDetailsParams(str, list);
                InAppPurchaseUtils inAppPurchaseUtils = InAppPurchaseUtils.INSTANCE;
                InAppPurchaseUtils.invokeMethod(this.billingClientClazz, this.querySkuDetailsAsyncMethod, this.billingClient, skuDetailsParams, newProxyInstance);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void startConnection() {
        Method method;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                InAppPurchaseUtils inAppPurchaseUtils = InAppPurchaseUtils.INSTANCE;
                Class<?> cls = InAppPurchaseUtils.getClass(CLASSNAME_BILLING_CLIENT_STATE_LISTENER);
                if (cls != null && (method = InAppPurchaseUtils.getMethod(this.billingClientClazz, METHOD_START_CONNECTION, cls)) != null) {
                    Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new BillingClientStateListenerWrapper());
                    InAppPurchaseUtils.invokeMethod(this.billingClientClazz, method, this.billingClient, newProxyInstance);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void queryPurchase(String str, Runnable runnable) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(str, "skuType");
                m.f(runnable, "querySkuRunnable");
                InAppPurchaseUtils inAppPurchaseUtils = InAppPurchaseUtils.INSTANCE;
                Object invokeMethod = InAppPurchaseUtils.invokeMethod(this.purchaseResultClazz, this.getPurchaseListMethod, InAppPurchaseUtils.invokeMethod(this.billingClientClazz, this.queryPurchasesMethod, this.billingClient, IN_APP), new Object[0]);
                List list = invokeMethod instanceof List ? (List) invokeMethod : null;
                if (list != null) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Object next : list) {
                            InAppPurchaseUtils inAppPurchaseUtils2 = InAppPurchaseUtils.INSTANCE;
                            Object invokeMethod2 = InAppPurchaseUtils.invokeMethod(this.purchaseClazz, this.getOriginalJsonMethod, next, new Object[0]);
                            String str2 = invokeMethod2 instanceof String ? (String) invokeMethod2 : null;
                            if (str2 != null) {
                                JSONObject jSONObject = new JSONObject(str2);
                                if (jSONObject.has(PRODUCT_ID)) {
                                    String string = jSONObject.getString(PRODUCT_ID);
                                    arrayList.add(string);
                                    Map<String, JSONObject> map = purchaseDetailsMap;
                                    m.e(string, "skuID");
                                    map.put(string, jSONObject);
                                }
                            }
                        }
                        querySkuDetailsAsync(str, arrayList, runnable);
                    } catch (JSONException unused) {
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void queryPurchaseHistory(String str, Runnable runnable) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(str, "skuType");
                m.f(runnable, "queryPurchaseHistoryRunnable");
                queryPurchaseHistoryAsync(str, new e(this, runnable));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
