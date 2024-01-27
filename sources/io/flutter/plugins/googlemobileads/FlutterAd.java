package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdapterResponseInfo;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import io.flutter.plugin.platform.PlatformView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

abstract class FlutterAd {
    protected final int adId;

    static abstract class FlutterOverlayAd extends FlutterAd {
        FlutterOverlayAd(int i10) {
            super(i10);
        }

        /* access modifiers changed from: package-private */
        public abstract void setImmersiveMode(boolean z10);

        /* access modifiers changed from: package-private */
        public abstract void show();
    }

    FlutterAd(int i10) {
        this.adId = i10;
    }

    /* access modifiers changed from: package-private */
    public abstract void dispose();

    /* access modifiers changed from: package-private */
    public PlatformView getPlatformView() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public abstract void load();

    static class FlutterAdError {
        final int code;
        final String domain;
        final String message;

        FlutterAdError(AdError adError) {
            this.code = adError.getCode();
            this.domain = adError.getDomain();
            this.message = adError.getMessage();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlutterAdError)) {
                return false;
            }
            FlutterAdError flutterAdError = (FlutterAdError) obj;
            if (this.code == flutterAdError.code && this.domain.equals(flutterAdError.domain)) {
                return this.message.equals(flutterAdError.message);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.code), this.domain, this.message});
        }

        FlutterAdError(int i10, String str, String str2) {
            this.code = i10;
            this.domain = str;
            this.message = str2;
        }
    }

    static class FlutterLoadAdError {
        final int code;
        final String domain;
        final String message;
        FlutterResponseInfo responseInfo;

        FlutterLoadAdError(LoadAdError loadAdError) {
            this.code = loadAdError.getCode();
            this.domain = loadAdError.getDomain();
            this.message = loadAdError.getMessage();
            if (loadAdError.getResponseInfo() != null) {
                this.responseInfo = new FlutterResponseInfo(loadAdError.getResponseInfo());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlutterLoadAdError)) {
                return false;
            }
            FlutterLoadAdError flutterLoadAdError = (FlutterLoadAdError) obj;
            if (this.code == flutterLoadAdError.code && this.domain.equals(flutterLoadAdError.domain) && Objects.equals(this.responseInfo, flutterLoadAdError.responseInfo)) {
                return this.message.equals(flutterLoadAdError.message);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.code), this.domain, this.message, this.responseInfo});
        }

        FlutterLoadAdError(int i10, String str, String str2, FlutterResponseInfo flutterResponseInfo) {
            this.code = i10;
            this.domain = str;
            this.message = str2;
            this.responseInfo = flutterResponseInfo;
        }
    }

    static class FlutterAdapterResponseInfo {
        private final String adSourceId;
        private final String adSourceInstanceId;
        private final String adSourceInstanceName;
        private final String adSourceName;
        private final Map<String, String> adUnitMapping;
        private final String adapterClassName;
        private final String description;
        private FlutterAdError error;
        private final long latencyMillis;

        FlutterAdapterResponseInfo(AdapterResponseInfo adapterResponseInfo) {
            this.adapterClassName = adapterResponseInfo.getAdapterClassName();
            this.latencyMillis = adapterResponseInfo.getLatencyMillis();
            this.description = adapterResponseInfo.toString();
            if (adapterResponseInfo.getCredentials() != null) {
                this.adUnitMapping = new HashMap();
                for (String str : adapterResponseInfo.getCredentials().keySet()) {
                    this.adUnitMapping.put(str, adapterResponseInfo.getCredentials().get(str).toString());
                }
            } else {
                this.adUnitMapping = new HashMap();
            }
            if (adapterResponseInfo.getAdError() != null) {
                this.error = new FlutterAdError(adapterResponseInfo.getAdError());
            }
            this.adSourceName = adapterResponseInfo.getAdSourceName();
            this.adSourceId = adapterResponseInfo.getAdSourceId();
            this.adSourceInstanceName = adapterResponseInfo.getAdSourceInstanceName();
            this.adSourceInstanceId = adapterResponseInfo.getAdSourceInstanceId();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FlutterAdapterResponseInfo)) {
                return false;
            }
            FlutterAdapterResponseInfo flutterAdapterResponseInfo = (FlutterAdapterResponseInfo) obj;
            if (!Objects.equals(this.adapterClassName, flutterAdapterResponseInfo.adapterClassName) || this.latencyMillis != flutterAdapterResponseInfo.latencyMillis || !Objects.equals(this.description, flutterAdapterResponseInfo.description) || !Objects.equals(this.error, flutterAdapterResponseInfo.error) || !Objects.equals(this.adUnitMapping, flutterAdapterResponseInfo.adUnitMapping) || !Objects.equals(this.adSourceName, flutterAdapterResponseInfo.adSourceName) || !Objects.equals(this.adSourceId, flutterAdapterResponseInfo.adSourceId) || !Objects.equals(this.adSourceInstanceName, flutterAdapterResponseInfo.adSourceInstanceName) || !Objects.equals(this.adSourceInstanceId, flutterAdapterResponseInfo.adSourceInstanceId)) {
                return false;
            }
            return true;
        }

        public String getAdSourceId() {
            return this.adSourceId;
        }

        public String getAdSourceInstanceId() {
            return this.adSourceInstanceId;
        }

        public String getAdSourceInstanceName() {
            return this.adSourceInstanceName;
        }

        public String getAdSourceName() {
            return this.adSourceName;
        }

        public Map<String, String> getAdUnitMapping() {
            return this.adUnitMapping;
        }

        public String getAdapterClassName() {
            return this.adapterClassName;
        }

        public String getDescription() {
            return this.description;
        }

        public FlutterAdError getError() {
            return this.error;
        }

        public long getLatencyMillis() {
            return this.latencyMillis;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.adapterClassName, Long.valueOf(this.latencyMillis), this.description, this.error, this.adSourceName, this.adSourceId, this.adSourceInstanceName, this.adSourceInstanceId});
        }

        FlutterAdapterResponseInfo(String str, long j10, String str2, Map<String, String> map, FlutterAdError flutterAdError, String str3, String str4, String str5, String str6) {
            this.adapterClassName = str;
            this.latencyMillis = j10;
            this.description = str2;
            this.adUnitMapping = map;
            this.error = flutterAdError;
            this.adSourceName = str3;
            this.adSourceId = str4;
            this.adSourceInstanceName = str5;
            this.adSourceInstanceId = str6;
        }
    }

    static class FlutterResponseInfo {
        private final List<FlutterAdapterResponseInfo> adapterResponses;
        private final FlutterAdapterResponseInfo loadedAdapterResponseInfo;
        private final String mediationAdapterClassName;
        private final Map<String, String> responseExtras;
        private final String responseId;

        FlutterResponseInfo(ResponseInfo responseInfo) {
            this.responseId = responseInfo.getResponseId();
            this.mediationAdapterClassName = responseInfo.getMediationAdapterClassName();
            ArrayList arrayList = new ArrayList();
            for (AdapterResponseInfo flutterAdapterResponseInfo : responseInfo.getAdapterResponses()) {
                arrayList.add(new FlutterAdapterResponseInfo(flutterAdapterResponseInfo));
            }
            this.adapterResponses = arrayList;
            if (responseInfo.getLoadedAdapterResponseInfo() != null) {
                this.loadedAdapterResponseInfo = new FlutterAdapterResponseInfo(responseInfo.getLoadedAdapterResponseInfo());
            } else {
                this.loadedAdapterResponseInfo = null;
            }
            HashMap hashMap = new HashMap();
            if (responseInfo.getResponseExtras() != null) {
                for (String str : responseInfo.getResponseExtras().keySet()) {
                    hashMap.put(str, responseInfo.getResponseExtras().get(str).toString());
                }
            }
            this.responseExtras = hashMap;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FlutterResponseInfo)) {
                return false;
            }
            FlutterResponseInfo flutterResponseInfo = (FlutterResponseInfo) obj;
            if (!Objects.equals(this.responseId, flutterResponseInfo.responseId) || !Objects.equals(this.mediationAdapterClassName, flutterResponseInfo.mediationAdapterClassName) || !Objects.equals(this.adapterResponses, flutterResponseInfo.adapterResponses) || !Objects.equals(this.loadedAdapterResponseInfo, flutterResponseInfo.loadedAdapterResponseInfo)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public List<FlutterAdapterResponseInfo> getAdapterResponses() {
            return this.adapterResponses;
        }

        /* access modifiers changed from: package-private */
        public FlutterAdapterResponseInfo getLoadedAdapterResponseInfo() {
            return this.loadedAdapterResponseInfo;
        }

        /* access modifiers changed from: package-private */
        public String getMediationAdapterClassName() {
            return this.mediationAdapterClassName;
        }

        /* access modifiers changed from: package-private */
        public Map<String, String> getResponseExtras() {
            return this.responseExtras;
        }

        /* access modifiers changed from: package-private */
        public String getResponseId() {
            return this.responseId;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.responseId, this.mediationAdapterClassName, this.adapterResponses, this.loadedAdapterResponseInfo});
        }

        FlutterResponseInfo(String str, String str2, List<FlutterAdapterResponseInfo> list, FlutterAdapterResponseInfo flutterAdapterResponseInfo, Map<String, String> map) {
            this.responseId = str;
            this.mediationAdapterClassName = str2;
            this.adapterResponses = list;
            this.loadedAdapterResponseInfo = flutterAdapterResponseInfo;
            this.responseExtras = map;
        }
    }
}
