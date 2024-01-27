package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant {
    private final String rolloutId;
    private final String variantId;

    static final class Builder extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder {
        private String rolloutId;
        private String variantId;

        Builder() {
        }

        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant build() {
            String str = "";
            if (this.rolloutId == null) {
                str = str + " rolloutId";
            }
            if (this.variantId == null) {
                str = str + " variantId";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant(this.rolloutId, this.variantId);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setRolloutId(String str) {
            Objects.requireNonNull(str, "Null rolloutId");
            this.rolloutId = str;
            return this;
        }

        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setVariantId(String str) {
            Objects.requireNonNull(str, "Null variantId");
            this.variantId = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant)) {
            return false;
        }
        CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant = (CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant) obj;
        if (!this.rolloutId.equals(rolloutVariant.getRolloutId()) || !this.variantId.equals(rolloutVariant.getVariantId())) {
            return false;
        }
        return true;
    }

    public String getRolloutId() {
        return this.rolloutId;
    }

    public String getVariantId() {
        return this.variantId;
    }

    public int hashCode() {
        return ((this.rolloutId.hashCode() ^ 1000003) * 1000003) ^ this.variantId.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.rolloutId + ", variantId=" + this.variantId + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant(String str, String str2) {
        this.rolloutId = str;
        this.variantId = str2;
    }
}
