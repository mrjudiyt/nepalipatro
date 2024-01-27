package com.google.firebase.sessions;

import kotlin.jvm.internal.m;

/* compiled from: SessionEvent.kt */
public final class ProcessDetails {
    private final int importance;
    private final boolean isDefaultProcess;
    private final int pid;
    private final String processName;

    public ProcessDetails(String str, int i10, int i11, boolean z10) {
        m.f(str, "processName");
        this.processName = str;
        this.pid = i10;
        this.importance = i11;
        this.isDefaultProcess = z10;
    }

    public static /* synthetic */ ProcessDetails copy$default(ProcessDetails processDetails, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = processDetails.processName;
        }
        if ((i12 & 2) != 0) {
            i10 = processDetails.pid;
        }
        if ((i12 & 4) != 0) {
            i11 = processDetails.importance;
        }
        if ((i12 & 8) != 0) {
            z10 = processDetails.isDefaultProcess;
        }
        return processDetails.copy(str, i10, i11, z10);
    }

    public final String component1() {
        return this.processName;
    }

    public final int component2() {
        return this.pid;
    }

    public final int component3() {
        return this.importance;
    }

    public final boolean component4() {
        return this.isDefaultProcess;
    }

    public final ProcessDetails copy(String str, int i10, int i11, boolean z10) {
        m.f(str, "processName");
        return new ProcessDetails(str, i10, i11, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessDetails)) {
            return false;
        }
        ProcessDetails processDetails = (ProcessDetails) obj;
        return m.a(this.processName, processDetails.processName) && this.pid == processDetails.pid && this.importance == processDetails.importance && this.isDefaultProcess == processDetails.isDefaultProcess;
    }

    public final int getImportance() {
        return this.importance;
    }

    public final int getPid() {
        return this.pid;
    }

    public final String getProcessName() {
        return this.processName;
    }

    public int hashCode() {
        int hashCode = ((((this.processName.hashCode() * 31) + this.pid) * 31) + this.importance) * 31;
        boolean z10 = this.isDefaultProcess;
        if (z10) {
            z10 = true;
        }
        return hashCode + (z10 ? 1 : 0);
    }

    public final boolean isDefaultProcess() {
        return this.isDefaultProcess;
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.processName + ", pid=" + this.pid + ", importance=" + this.importance + ", isDefaultProcess=" + this.isDefaultProcess + ')';
    }
}
