package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;
import java.util.Objects;

final class AutoValue_CrashlyticsReport_ApplicationExitInfo extends CrashlyticsReport.ApplicationExitInfo {
    private final List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> buildIdMappingForArch;
    private final int importance;
    private final int pid;
    private final String processName;
    private final long pss;
    private final int reasonCode;
    private final long rss;
    private final long timestamp;
    private final String traceFile;

    static final class Builder extends CrashlyticsReport.ApplicationExitInfo.Builder {
        private List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> buildIdMappingForArch;
        private Integer importance;
        private Integer pid;
        private String processName;
        private Long pss;
        private Integer reasonCode;
        private Long rss;
        private Long timestamp;
        private String traceFile;

        Builder() {
        }

        public CrashlyticsReport.ApplicationExitInfo build() {
            String str = "";
            if (this.pid == null) {
                str = str + " pid";
            }
            if (this.processName == null) {
                str = str + " processName";
            }
            if (this.reasonCode == null) {
                str = str + " reasonCode";
            }
            if (this.importance == null) {
                str = str + " importance";
            }
            if (this.pss == null) {
                str = str + " pss";
            }
            if (this.rss == null) {
                str = str + " rss";
            }
            if (this.timestamp == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo(this.pid.intValue(), this.processName, this.reasonCode.intValue(), this.importance.intValue(), this.pss.longValue(), this.rss.longValue(), this.timestamp.longValue(), this.traceFile, this.buildIdMappingForArch);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public CrashlyticsReport.ApplicationExitInfo.Builder setBuildIdMappingForArch(List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list) {
            this.buildIdMappingForArch = list;
            return this;
        }

        public CrashlyticsReport.ApplicationExitInfo.Builder setImportance(int i10) {
            this.importance = Integer.valueOf(i10);
            return this;
        }

        public CrashlyticsReport.ApplicationExitInfo.Builder setPid(int i10) {
            this.pid = Integer.valueOf(i10);
            return this;
        }

        public CrashlyticsReport.ApplicationExitInfo.Builder setProcessName(String str) {
            Objects.requireNonNull(str, "Null processName");
            this.processName = str;
            return this;
        }

        public CrashlyticsReport.ApplicationExitInfo.Builder setPss(long j10) {
            this.pss = Long.valueOf(j10);
            return this;
        }

        public CrashlyticsReport.ApplicationExitInfo.Builder setReasonCode(int i10) {
            this.reasonCode = Integer.valueOf(i10);
            return this;
        }

        public CrashlyticsReport.ApplicationExitInfo.Builder setRss(long j10) {
            this.rss = Long.valueOf(j10);
            return this;
        }

        public CrashlyticsReport.ApplicationExitInfo.Builder setTimestamp(long j10) {
            this.timestamp = Long.valueOf(j10);
            return this;
        }

        public CrashlyticsReport.ApplicationExitInfo.Builder setTraceFile(String str) {
            this.traceFile = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.ApplicationExitInfo)) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (CrashlyticsReport.ApplicationExitInfo) obj;
        if (this.pid == applicationExitInfo.getPid() && this.processName.equals(applicationExitInfo.getProcessName()) && this.reasonCode == applicationExitInfo.getReasonCode() && this.importance == applicationExitInfo.getImportance() && this.pss == applicationExitInfo.getPss() && this.rss == applicationExitInfo.getRss() && this.timestamp == applicationExitInfo.getTimestamp() && ((str = this.traceFile) != null ? str.equals(applicationExitInfo.getTraceFile()) : applicationExitInfo.getTraceFile() == null)) {
            List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list = this.buildIdMappingForArch;
            if (list == null) {
                if (applicationExitInfo.getBuildIdMappingForArch() == null) {
                    return true;
                }
            } else if (list.equals(applicationExitInfo.getBuildIdMappingForArch())) {
                return true;
            }
        }
        return false;
    }

    public List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> getBuildIdMappingForArch() {
        return this.buildIdMappingForArch;
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

    public long getPss() {
        return this.pss;
    }

    public int getReasonCode() {
        return this.reasonCode;
    }

    public long getRss() {
        return this.rss;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String getTraceFile() {
        return this.traceFile;
    }

    public int hashCode() {
        long j10 = this.pss;
        long j11 = this.rss;
        long j12 = this.timestamp;
        int hashCode = (((((((((((((this.pid ^ 1000003) * 1000003) ^ this.processName.hashCode()) * 1000003) ^ this.reasonCode) * 1000003) ^ this.importance) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.traceFile;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list = this.buildIdMappingForArch;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 ^ i10;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.pid + ", processName=" + this.processName + ", reasonCode=" + this.reasonCode + ", importance=" + this.importance + ", pss=" + this.pss + ", rss=" + this.rss + ", timestamp=" + this.timestamp + ", traceFile=" + this.traceFile + ", buildIdMappingForArch=" + this.buildIdMappingForArch + "}";
    }

    private AutoValue_CrashlyticsReport_ApplicationExitInfo(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list) {
        this.pid = i10;
        this.processName = str;
        this.reasonCode = i11;
        this.importance = i12;
        this.pss = j10;
        this.rss = j11;
        this.timestamp = j12;
        this.traceFile = str2;
        this.buildIdMappingForArch = list;
    }
}
