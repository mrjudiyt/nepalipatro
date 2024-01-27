package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import java.util.Objects;

final class AutoValue_StaticSessionData_OsData extends StaticSessionData.OsData {
    private final boolean isRooted;
    private final String osCodeName;
    private final String osRelease;

    AutoValue_StaticSessionData_OsData(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "Null osRelease");
        this.osRelease = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.osCodeName = str2;
        this.isRooted = z10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.OsData)) {
            return false;
        }
        StaticSessionData.OsData osData = (StaticSessionData.OsData) obj;
        if (!this.osRelease.equals(osData.osRelease()) || !this.osCodeName.equals(osData.osCodeName()) || this.isRooted != osData.isRooted()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.osRelease.hashCode() ^ 1000003) * 1000003) ^ this.osCodeName.hashCode()) * 1000003) ^ (this.isRooted ? 1231 : 1237);
    }

    public boolean isRooted() {
        return this.isRooted;
    }

    public String osCodeName() {
        return this.osCodeName;
    }

    public String osRelease() {
        return this.osRelease;
    }

    public String toString() {
        return "OsData{osRelease=" + this.osRelease + ", osCodeName=" + this.osCodeName + ", isRooted=" + this.isRooted + "}";
    }
}
