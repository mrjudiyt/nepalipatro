package com.google.firebase.crashlytics.internal.metadata;

import java.util.Objects;

final class AutoValue_RolloutAssignment extends RolloutAssignment {
    private final String parameterKey;
    private final String parameterValue;
    private final String rolloutId;
    private final long templateVersion;
    private final String variantId;

    AutoValue_RolloutAssignment(String str, String str2, String str3, String str4, long j10) {
        Objects.requireNonNull(str, "Null rolloutId");
        this.rolloutId = str;
        Objects.requireNonNull(str2, "Null parameterKey");
        this.parameterKey = str2;
        Objects.requireNonNull(str3, "Null parameterValue");
        this.parameterValue = str3;
        Objects.requireNonNull(str4, "Null variantId");
        this.variantId = str4;
        this.templateVersion = j10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RolloutAssignment)) {
            return false;
        }
        RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
        if (!this.rolloutId.equals(rolloutAssignment.getRolloutId()) || !this.parameterKey.equals(rolloutAssignment.getParameterKey()) || !this.parameterValue.equals(rolloutAssignment.getParameterValue()) || !this.variantId.equals(rolloutAssignment.getVariantId()) || this.templateVersion != rolloutAssignment.getTemplateVersion()) {
            return false;
        }
        return true;
    }

    public String getParameterKey() {
        return this.parameterKey;
    }

    public String getParameterValue() {
        return this.parameterValue;
    }

    public String getRolloutId() {
        return this.rolloutId;
    }

    public long getTemplateVersion() {
        return this.templateVersion;
    }

    public String getVariantId() {
        return this.variantId;
    }

    public int hashCode() {
        long j10 = this.templateVersion;
        return ((((((((this.rolloutId.hashCode() ^ 1000003) * 1000003) ^ this.parameterKey.hashCode()) * 1000003) ^ this.parameterValue.hashCode()) * 1000003) ^ this.variantId.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.rolloutId + ", parameterKey=" + this.parameterKey + ", parameterValue=" + this.parameterValue + ", variantId=" + this.variantId + ", templateVersion=" + this.templateVersion + "}";
    }
}
