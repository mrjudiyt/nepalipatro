package com.facebook.internal.gatekeeper;

import com.facebook.FacebookSdk;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m;

/* compiled from: GateKeeperRuntimeCache.kt */
public final class GateKeeperRuntimeCache {
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, GateKeeper>> gateKeepers = new ConcurrentHashMap<>();

    public static /* synthetic */ List dumpGateKeepers$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            str = FacebookSdk.getApplicationId();
        }
        return gateKeeperRuntimeCache.dumpGateKeepers(str);
    }

    public static /* synthetic */ GateKeeper getGateKeeper$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            str = FacebookSdk.getApplicationId();
        }
        return gateKeeperRuntimeCache.getGateKeeper(str, str2);
    }

    public static /* synthetic */ boolean getGateKeeperValue$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            str = FacebookSdk.getApplicationId();
        }
        return gateKeeperRuntimeCache.getGateKeeperValue(str, str2, z10);
    }

    public static /* synthetic */ void resetCache$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            str = FacebookSdk.getApplicationId();
        }
        gateKeeperRuntimeCache.resetCache(str);
    }

    public static /* synthetic */ void setGateKeeper$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, GateKeeper gateKeeper, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            str = FacebookSdk.getApplicationId();
        }
        gateKeeperRuntimeCache.setGateKeeper(str, gateKeeper);
    }

    public static /* synthetic */ void setGateKeeperValue$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            str = FacebookSdk.getApplicationId();
        }
        gateKeeperRuntimeCache.setGateKeeperValue(str, str2, z10);
    }

    public static /* synthetic */ void setGateKeepers$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            str = FacebookSdk.getApplicationId();
        }
        gateKeeperRuntimeCache.setGateKeepers(str, list);
    }

    public final List<GateKeeper> dumpGateKeepers(String str) {
        m.f(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        ConcurrentHashMap concurrentHashMap = this.gateKeepers.get(str);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        for (Map.Entry value : concurrentHashMap.entrySet()) {
            arrayList.add((GateKeeper) value.getValue());
        }
        return arrayList;
    }

    public final GateKeeper getGateKeeper(String str, String str2) {
        m.f(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        m.f(str2, "name");
        ConcurrentHashMap concurrentHashMap = this.gateKeepers.get(str);
        if (concurrentHashMap == null) {
            return null;
        }
        return (GateKeeper) concurrentHashMap.get(str2);
    }

    public final boolean getGateKeeperValue(String str, String str2, boolean z10) {
        m.f(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        m.f(str2, "name");
        GateKeeper gateKeeper = getGateKeeper(str, str2);
        return gateKeeper == null ? z10 : gateKeeper.getValue();
    }

    public final void resetCache(String str) {
        m.f(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        this.gateKeepers.remove(str);
    }

    public final void setGateKeeper(String str, GateKeeper gateKeeper) {
        m.f(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        m.f(gateKeeper, "gateKeeper");
        if (!this.gateKeepers.containsKey(str)) {
            this.gateKeepers.put(str, new ConcurrentHashMap());
        }
        ConcurrentHashMap concurrentHashMap = this.gateKeepers.get(str);
        if (concurrentHashMap != null) {
            concurrentHashMap.put(gateKeeper.getName(), gateKeeper);
        }
    }

    public final void setGateKeeperValue(String str, String str2, boolean z10) {
        m.f(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        m.f(str2, "name");
        setGateKeeper(str, new GateKeeper(str2, z10));
    }

    public final void setGateKeepers(String str, List<GateKeeper> list) {
        m.f(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        m.f(list, "gateKeeperList");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (GateKeeper gateKeeper : list) {
            concurrentHashMap.put(gateKeeper.getName(), gateKeeper);
        }
        this.gateKeepers.put(str, concurrentHashMap);
    }
}
