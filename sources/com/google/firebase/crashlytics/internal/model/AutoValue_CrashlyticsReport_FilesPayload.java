package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;
import java.util.Objects;

final class AutoValue_CrashlyticsReport_FilesPayload extends CrashlyticsReport.FilesPayload {
    private final List<CrashlyticsReport.FilesPayload.File> files;
    private final String orgId;

    static final class Builder extends CrashlyticsReport.FilesPayload.Builder {
        private List<CrashlyticsReport.FilesPayload.File> files;
        private String orgId;

        public CrashlyticsReport.FilesPayload build() {
            String str = "";
            if (this.files == null) {
                str = str + " files";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_FilesPayload(this.files, this.orgId);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public CrashlyticsReport.FilesPayload.Builder setFiles(List<CrashlyticsReport.FilesPayload.File> list) {
            Objects.requireNonNull(list, "Null files");
            this.files = list;
            return this;
        }

        public CrashlyticsReport.FilesPayload.Builder setOrgId(String str) {
            this.orgId = str;
            return this;
        }

        Builder() {
        }

        private Builder(CrashlyticsReport.FilesPayload filesPayload) {
            this.files = filesPayload.getFiles();
            this.orgId = filesPayload.getOrgId();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload)) {
            return false;
        }
        CrashlyticsReport.FilesPayload filesPayload = (CrashlyticsReport.FilesPayload) obj;
        if (this.files.equals(filesPayload.getFiles())) {
            String str = this.orgId;
            if (str == null) {
                if (filesPayload.getOrgId() == null) {
                    return true;
                }
            } else if (str.equals(filesPayload.getOrgId())) {
                return true;
            }
        }
        return false;
    }

    public List<CrashlyticsReport.FilesPayload.File> getFiles() {
        return this.files;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public int hashCode() {
        int hashCode = (this.files.hashCode() ^ 1000003) * 1000003;
        String str = this.orgId;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    /* access modifiers changed from: package-private */
    public CrashlyticsReport.FilesPayload.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "FilesPayload{files=" + this.files + ", orgId=" + this.orgId + "}";
    }

    private AutoValue_CrashlyticsReport_FilesPayload(List<CrashlyticsReport.FilesPayload.File> list, String str) {
        this.files = list;
        this.orgId = str;
    }
}
