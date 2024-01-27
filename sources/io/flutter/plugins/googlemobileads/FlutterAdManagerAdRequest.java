package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import io.flutter.plugins.googlemobileads.FlutterAdRequest;
import java.util.List;
import java.util.Map;
import java.util.Objects;

class FlutterAdManagerAdRequest extends FlutterAdRequest {
    private final Map<String, String> customTargeting;
    private final Map<String, List<String>> customTargetingLists;
    private final String publisherProvidedId;

    static class Builder extends FlutterAdRequest.Builder {
        private Map<String, String> customTargeting;
        private Map<String, List<String>> customTargetingLists;
        private String publisherProvidedId;

        Builder() {
        }

        public Builder setCustomTargeting(Map<String, String> map) {
            this.customTargeting = map;
            return this;
        }

        public Builder setCustomTargetingLists(Map<String, List<String>> map) {
            this.customTargetingLists = map;
            return this;
        }

        public Builder setPublisherProvidedId(String str) {
            this.publisherProvidedId = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public FlutterAdManagerAdRequest build() {
            return new FlutterAdManagerAdRequest(getKeywords(), getContentUrl(), this.customTargeting, this.customTargetingLists, getNonPersonalizedAds(), getNeighboringContentUrls(), getHttpTimeoutMillis(), this.publisherProvidedId, getMediationExtrasIdentifier(), getMediationNetworkExtrasProvider(), getAdMobExtras(), getRequestAgent());
        }
    }

    /* access modifiers changed from: package-private */
    public AdManagerAdRequest asAdManagerAdRequest(String str) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        updateAdRequestBuilder(builder, str);
        Map<String, String> map = this.customTargeting;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                builder.addCustomTargeting((String) next.getKey(), (String) next.getValue());
            }
        }
        Map<String, List<String>> map2 = this.customTargetingLists;
        if (map2 != null) {
            for (Map.Entry next2 : map2.entrySet()) {
                builder.addCustomTargeting((String) next2.getKey(), (List<String>) (List) next2.getValue());
            }
        }
        String str2 = this.publisherProvidedId;
        if (str2 != null) {
            builder.setPublisherProvidedId(str2);
        }
        return builder.build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterAdManagerAdRequest)) {
            return false;
        }
        FlutterAdManagerAdRequest flutterAdManagerAdRequest = (FlutterAdManagerAdRequest) obj;
        if (!super.equals(obj) || !Objects.equals(this.customTargeting, flutterAdManagerAdRequest.customTargeting) || !Objects.equals(this.customTargetingLists, flutterAdManagerAdRequest.customTargetingLists)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public Map<String, String> getCustomTargeting() {
        return this.customTargeting;
    }

    /* access modifiers changed from: protected */
    public Map<String, List<String>> getCustomTargetingLists() {
        return this.customTargetingLists;
    }

    /* access modifiers changed from: protected */
    public String getPublisherProvidedId() {
        return this.publisherProvidedId;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.customTargeting, this.customTargetingLists});
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FlutterAdManagerAdRequest(List<String> list, String str, Map<String, String> map, Map<String, List<String>> map2, Boolean bool, List<String> list2, Integer num, String str2, String str3, MediationNetworkExtrasProvider mediationNetworkExtrasProvider, Map<String, String> map3, String str4) {
        super(list, str, bool, list2, num, str3, mediationNetworkExtrasProvider, map3, str4);
        this.customTargeting = map;
        this.customTargetingLists = map2;
        this.publisherProvidedId = str2;
    }
}
