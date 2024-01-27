package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

final class AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails extends CrashlyticsReport.Session.Event.Application.ProcessDetails {
    private final boolean defaultProcess;
    private final int importance;
    private final int pid;
    private final String processName;

    static final class Builder extends CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder {
        private Boolean defaultProcess;
        private Integer importance;
        private Integer pid;
        private String processName;

        Builder() {
        }

        public CrashlyticsReport.Session.Event.Application.ProcessDetails build() {
            String str = "";
            if (this.processName == null) {
                str = str + " processName";
            }
            if (this.pid == null) {
                str = str + " pid";
            }
            if (this.importance == null) {
                str = str + " importance";
            }
            if (this.defaultProcess == null) {
                str = str + " defaultProcess";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(this.processName, this.pid.intValue(), this.importance.intValue(), this.defaultProcess.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setDefaultProcess(boolean z10) {
            this.defaultProcess = Boolean.valueOf(z10);
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setImportance(int i10) {
            this.importance = Integer.valueOf(i10);
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setPid(int i10) {
            this.pid = Integer.valueOf(i10);
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setProcessName(String str) {
            Objects.requireNonNull(str, "Null processName");
            this.processName = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.ProcessDetails)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) obj;
        if (this.processName.equals(processDetails.getProcessName()) && this.pid == processDetails.getPid() && this.importance == processDetails.getImportance() && this.defaultProcess == processDetails.isDefaultProcess()) {
            return true;
        }
        return false;
    }

    public int getImportance() {
        return this.importance;
    }

    public int getPid() {
        return this.pid;
    }

    public String getProcessName() {
        return this.processName;
    }

    public int hashCode() {
        return ((((((this.processName.hashCode() ^ 1000003) * 1000003) ^ this.pid) * 1000003) ^ this.importance) * 1000003) ^ (this.defaultProcess ? 1231 : 1237);
    }

    public boolean isDefaultProcess() {
        return this.defaultProcess;
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.processName + ", pid=" + this.pid + ", importance=" + this.importance + ", defaultProcess=" + this.defaultProcess + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(String str, int i10, int i11, boolean z10) {
        this.processName = str;
        this.pid = i10;
        this.importance = i11;
        this.defaultProcess = z10;
    }
}
