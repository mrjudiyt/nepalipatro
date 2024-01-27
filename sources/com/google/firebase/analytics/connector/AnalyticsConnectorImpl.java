package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.internal.zza;
import com.google.firebase.analytics.connector.internal.zzb;
import com.google.firebase.analytics.connector.internal.zze;
import com.google.firebase.analytics.connector.internal.zzg;
import com.google.firebase.events.Event;
import com.google.firebase.events.Subscriber;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.0 */
public class AnalyticsConnectorImpl implements AnalyticsConnector {
    private static volatile AnalyticsConnector zzb;
    final Map<String, zza> zza = new ConcurrentHashMap();
    private final AppMeasurementSdk zzc;

    private AnalyticsConnectorImpl(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.zzc = appMeasurementSdk;
    }

    @KeepForSdk
    public static AnalyticsConnector getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    static /* synthetic */ void zza(Event event) {
        boolean z10 = ((DataCollectionDefaultChange) event.getPayload()).enabled;
        synchronized (AnalyticsConnectorImpl.class) {
            ((AnalyticsConnectorImpl) Preconditions.checkNotNull(zzb)).zzc.zza(z10);
        }
    }

    @KeepForSdk
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || zzb.zza(str2, bundle)) {
            this.zzc.clearConditionalUserProperty(str, str2, bundle);
        }
    }

    @KeepForSdk
    public List<AnalyticsConnector.ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle zza2 : this.zzc.getConditionalUserProperties(str, str2)) {
            arrayList.add(zzb.zza(zza2));
        }
        return arrayList;
    }

    @KeepForSdk
    public int getMaxUserProperties(String str) {
        return this.zzc.getMaxUserProperties(str);
    }

    @KeepForSdk
    public Map<String, Object> getUserProperties(boolean z10) {
        return this.zzc.getUserProperties((String) null, (String) null, z10);
    }

    @KeepForSdk
    public void logEvent(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (zzb.zzf(str) && zzb.zza(str2, bundle) && zzb.zzb(str, str2, bundle)) {
            zzb.zza(str, str2, bundle);
            this.zzc.logEvent(str, str2, bundle);
        }
    }

    @KeepForSdk
    public AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener(final String str, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        Object obj;
        Preconditions.checkNotNull(analyticsConnectorListener);
        if (!zzb.zzf(str) || zza(str)) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk = this.zzc;
        if ("fiam".equals(str)) {
            obj = new zze(appMeasurementSdk, analyticsConnectorListener);
        } else {
            obj = "clx".equals(str) ? new zzg(appMeasurementSdk, analyticsConnectorListener) : null;
        }
        if (obj == null) {
            return null;
        }
        this.zza.put(str, obj);
        return new AnalyticsConnector.AnalyticsConnectorHandle() {
            @KeepForSdk
            public void registerEventNames(Set<String> set) {
                if (AnalyticsConnectorImpl.this.zza(str) && str.equals("fiam") && set != null && !set.isEmpty()) {
                    AnalyticsConnectorImpl.this.zza.get(str).zza(set);
                }
            }

            public void unregister() {
                if (AnalyticsConnectorImpl.this.zza(str)) {
                    AnalyticsConnector.AnalyticsConnectorListener zza2 = AnalyticsConnectorImpl.this.zza.get(str).zza();
                    if (zza2 != null) {
                        zza2.onMessageTriggered(0, (Bundle) null);
                    }
                    AnalyticsConnectorImpl.this.zza.remove(str);
                }
            }

            @KeepForSdk
            public void unregisterEventNames() {
                if (AnalyticsConnectorImpl.this.zza(str) && str.equals("fiam")) {
                    AnalyticsConnectorImpl.this.zza.get(str).zzb();
                }
            }
        };
    }

    @KeepForSdk
    public void setConditionalUserProperty(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        if (zzb.zzb(conditionalUserProperty)) {
            this.zzc.setConditionalUserProperty(zzb.zza(conditionalUserProperty));
        }
    }

    @KeepForSdk
    public void setUserProperty(String str, String str2, Object obj) {
        if (zzb.zzf(str) && zzb.zza(str, str2)) {
            this.zzc.setUserProperty(str, str2, obj);
        }
    }

    @KeepForSdk
    public static AnalyticsConnector getInstance(FirebaseApp firebaseApp) {
        return (AnalyticsConnector) firebaseApp.get(AnalyticsConnector.class);
    }

    @KeepForSdk
    public static AnalyticsConnector getInstance(FirebaseApp firebaseApp, Context context, Subscriber subscriber) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(subscriber);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (AnalyticsConnectorImpl.class) {
                if (zzb == null) {
                    Bundle bundle = new Bundle(1);
                    if (firebaseApp.isDefaultApp()) {
                        subscriber.subscribe(DataCollectionDefaultChange.class, zza.zza, zzb.zza);
                        bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                    }
                    zzb = new AnalyticsConnectorImpl(zzdf.zza(context, (String) null, (String) null, (String) null, bundle).zzb());
                }
            }
        }
        return zzb;
    }

    /* access modifiers changed from: private */
    public final boolean zza(String str) {
        return !str.isEmpty() && this.zza.containsKey(str) && this.zza.get(str) != null;
    }
}
