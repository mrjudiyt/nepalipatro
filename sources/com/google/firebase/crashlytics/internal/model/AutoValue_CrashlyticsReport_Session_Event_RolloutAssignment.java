package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment extends CrashlyticsReport.Session.Event.RolloutAssignment {
    private final String parameterKey;
    private final String parameterValue;
    private final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant;
    private final long templateVersion;

    static final class Builder extends CrashlyticsReport.Session.Event.RolloutAssignment.Builder {
        private String parameterKey;
        private String parameterValue;
        private CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant;
        private Long templateVersion;

        Builder() {
        }

        public CrashlyticsReport.Session.Event.RolloutAssignment build() {
            String str = "";
            if (this.rolloutVariant == null) {
                str = str + " rolloutVariant";
            }
            if (this.parameterKey == null) {
                str = str + " parameterKey";
            }
            if (this.parameterValue == null) {
                str = str + " parameterValue";
            }
            if (this.templateVersion == null) {
                str = str + " templateVersion";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(this.rolloutVariant, this.parameterKey, this.parameterValue, this.templateVersion.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterKey(String str) {
            Objects.requireNonNull(str, "Null parameterKey");
            this.parameterKey = str;
            return this;
        }

        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterValue(String str) {
            Objects.requireNonNull(str, "Null parameterValue");
            this.parameterValue = str;
            return this;
        }

        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder setRolloutVariant(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant2) {
            Objects.requireNonNull(rolloutVariant2, "Null rolloutVariant");
            this.rolloutVariant = rolloutVariant2;
            return this;
        }

        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder setTemplateVersion(long j10) {
            this.templateVersion = Long.valueOf(j10);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment)) {
            return false;
        }
        CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment = (CrashlyticsReport.Session.Event.RolloutAssignment) obj;
        if (!this.rolloutVariant.equals(rolloutAssignment.getRolloutVariant()) || !this.parameterKey.equals(rolloutAssignment.getParameterKey()) || !this.parameterValue.equals(rolloutAssignment.getParameterValue()) || this.templateVersion != rolloutAssignment.getTemplateVersion()) {
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

    public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant getRolloutVariant() {
        return this.rolloutVariant;
    }

    public long getTemplateVersion() {
        return this.templateVersion;
    }

    public int hashCode() {
        long j10 = this.templateVersion;
        return ((((((this.rolloutVariant.hashCode() ^ 1000003) * 1000003) ^ this.parameterKey.hashCode()) * 1000003) ^ this.parameterValue.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.rolloutVariant + ", parameterKey=" + this.parameterKey + ", parameterValue=" + this.parameterValue + ", templateVersion=" + this.templateVersion + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant2, String str, String str2, long j10) {
        this.rolloutVariant = rolloutVariant2;
        this.parameterKey = str;
        this.parameterValue = str2;
        this.templateVersion = j10;
    }
}
