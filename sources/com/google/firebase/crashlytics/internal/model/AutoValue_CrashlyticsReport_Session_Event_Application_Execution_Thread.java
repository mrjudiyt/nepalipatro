package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;
import java.util.Objects;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread extends CrashlyticsReport.Session.Event.Application.Execution.Thread {
    private final List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> frames;
    private final int importance;
    private final String name;

    static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder {
        private List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> frames;
        private Integer importance;
        private String name;

        Builder() {
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Thread build() {
            String str = "";
            if (this.name == null) {
                str = str + " name";
            }
            if (this.importance == null) {
                str = str + " importance";
            }
            if (this.frames == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread(this.name, this.importance.intValue(), this.frames);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setFrames(List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> list) {
            Objects.requireNonNull(list, "Null frames");
            this.frames = list;
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setImportance(int i10) {
            this.importance = Integer.valueOf(i10);
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setName(String str) {
            Objects.requireNonNull(str, "Null name");
            this.name = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread thread = (CrashlyticsReport.Session.Event.Application.Execution.Thread) obj;
        if (!this.name.equals(thread.getName()) || this.importance != thread.getImportance() || !this.frames.equals(thread.getFrames())) {
            return false;
        }
        return true;
    }

    public List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> getFrames() {
        return this.frames;
    }

    public int getImportance() {
        return this.importance;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return ((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.importance) * 1000003) ^ this.frames.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.name + ", importance=" + this.importance + ", frames=" + this.frames + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread(String str, int i10, List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> list) {
        this.name = str;
        this.importance = i10;
        this.frames = list;
    }
}
