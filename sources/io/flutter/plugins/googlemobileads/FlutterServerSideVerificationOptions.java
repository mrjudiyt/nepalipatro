package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import java.util.Objects;

class FlutterServerSideVerificationOptions {
    private final String customData;
    private final String userId;

    public FlutterServerSideVerificationOptions(String str, String str2) {
        this.userId = str;
        this.customData = str2;
    }

    public ServerSideVerificationOptions asServerSideVerificationOptions() {
        ServerSideVerificationOptions.Builder builder = new ServerSideVerificationOptions.Builder();
        String str = this.userId;
        if (str != null) {
            builder.setUserId(str);
        }
        String str2 = this.customData;
        if (str2 != null) {
            builder.setCustomData(str2);
        }
        return builder.build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterServerSideVerificationOptions)) {
            return false;
        }
        FlutterServerSideVerificationOptions flutterServerSideVerificationOptions = (FlutterServerSideVerificationOptions) obj;
        if (!Objects.equals(flutterServerSideVerificationOptions.userId, this.userId) || !Objects.equals(flutterServerSideVerificationOptions.customData, this.customData)) {
            return false;
        }
        return true;
    }

    public String getCustomData() {
        return this.customData;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.userId, this.customData});
    }
}
