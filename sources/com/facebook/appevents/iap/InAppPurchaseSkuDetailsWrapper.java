package com.facebook.appevents.iap;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: InAppPurchaseSkuDetailsWrapper.kt */
public final class InAppPurchaseSkuDetailsWrapper {
    private static final String CLASSNAME_SKU_DETAILS_PARAMS = "com.android.billingclient.api.SkuDetailsParams";
    private static final String CLASSNAME_SKU_DETAILS_PARAMS_BUILDER = "com.android.billingclient.api.SkuDetailsParams$Builder";
    public static final Companion Companion = new Companion((g) null);
    private static final String METHOD_BUILD = "build";
    private static final String METHOD_NEW_BUILDER = "newBuilder";
    private static final String METHOD_SET_SKU_LIST = "setSkusList";
    private static final String METHOD_SET_TYPE = "setType";
    private static final AtomicBoolean initialized = new AtomicBoolean(false);
    private static InAppPurchaseSkuDetailsWrapper instance;
    private final Method buildMethod;
    private final Class<?> builderClazz;
    private final Method newBuilderMethod;
    private final Method setSkusListMethod;
    private final Method setTypeMethod;
    private final Class<?> skuDetailsParamsClazz;

    /* compiled from: InAppPurchaseSkuDetailsWrapper.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final void createInstance() {
            InAppPurchaseUtils inAppPurchaseUtils = InAppPurchaseUtils.INSTANCE;
            Class<?> cls = InAppPurchaseUtils.getClass(InAppPurchaseSkuDetailsWrapper.CLASSNAME_SKU_DETAILS_PARAMS);
            Class<?> cls2 = InAppPurchaseUtils.getClass(InAppPurchaseSkuDetailsWrapper.CLASSNAME_SKU_DETAILS_PARAMS_BUILDER);
            if (cls != null && cls2 != null) {
                Method method = InAppPurchaseUtils.getMethod(cls, InAppPurchaseSkuDetailsWrapper.METHOD_NEW_BUILDER, new Class[0]);
                Method method2 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseSkuDetailsWrapper.METHOD_SET_TYPE, String.class);
                Method method3 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseSkuDetailsWrapper.METHOD_SET_SKU_LIST, List.class);
                Method method4 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseSkuDetailsWrapper.METHOD_BUILD, new Class[0]);
                if (method != null && method2 != null && method3 != null && method4 != null) {
                    InAppPurchaseSkuDetailsWrapper.access$setInstance$cp(new InAppPurchaseSkuDetailsWrapper(cls, cls2, method, method2, method3, method4));
                }
            }
        }

        public final InAppPurchaseSkuDetailsWrapper getOrCreateInstance() {
            if (InAppPurchaseSkuDetailsWrapper.access$getInitialized$cp().get()) {
                return InAppPurchaseSkuDetailsWrapper.access$getInstance$cp();
            }
            createInstance();
            InAppPurchaseSkuDetailsWrapper.access$getInitialized$cp().set(true);
            return InAppPurchaseSkuDetailsWrapper.access$getInstance$cp();
        }
    }

    public InAppPurchaseSkuDetailsWrapper(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        m.f(cls, "skuDetailsParamsClazz");
        m.f(cls2, "builderClazz");
        m.f(method, "newBuilderMethod");
        m.f(method2, "setTypeMethod");
        m.f(method3, "setSkusListMethod");
        m.f(method4, "buildMethod");
        this.skuDetailsParamsClazz = cls;
        this.builderClazz = cls2;
        this.newBuilderMethod = method;
        this.setTypeMethod = method2;
        this.setSkusListMethod = method3;
        this.buildMethod = method4;
    }

    public static final /* synthetic */ AtomicBoolean access$getInitialized$cp() {
        Class<InAppPurchaseSkuDetailsWrapper> cls = InAppPurchaseSkuDetailsWrapper.class;
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

    public static final /* synthetic */ InAppPurchaseSkuDetailsWrapper access$getInstance$cp() {
        Class<InAppPurchaseSkuDetailsWrapper> cls = InAppPurchaseSkuDetailsWrapper.class;
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

    public static final /* synthetic */ void access$setInstance$cp(InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper) {
        Class<InAppPurchaseSkuDetailsWrapper> cls = InAppPurchaseSkuDetailsWrapper.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                instance = inAppPurchaseSkuDetailsWrapper;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final InAppPurchaseSkuDetailsWrapper getOrCreateInstance() {
        Class<InAppPurchaseSkuDetailsWrapper> cls = InAppPurchaseSkuDetailsWrapper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return Companion.getOrCreateInstance();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public final Object getSkuDetailsParams(String str, List<String> list) {
        Object invokeMethod;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            InAppPurchaseUtils inAppPurchaseUtils = InAppPurchaseUtils.INSTANCE;
            Object invokeMethod2 = InAppPurchaseUtils.invokeMethod(this.skuDetailsParamsClazz, this.newBuilderMethod, (Object) null, new Object[0]);
            if (invokeMethod2 == null || (invokeMethod = InAppPurchaseUtils.invokeMethod(this.builderClazz, this.setTypeMethod, invokeMethod2, str)) == null) {
                return null;
            }
            Object invokeMethod3 = InAppPurchaseUtils.invokeMethod(this.builderClazz, this.setSkusListMethod, invokeMethod, list);
            if (invokeMethod3 == null) {
                return null;
            }
            return InAppPurchaseUtils.invokeMethod(this.builderClazz, this.buildMethod, invokeMethod3, new Object[0]);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final Class<?> getSkuDetailsParamsClazz() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.skuDetailsParamsClazz;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
