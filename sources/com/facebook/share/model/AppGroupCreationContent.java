package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: AppGroupCreationContent.kt */
public final class AppGroupCreationContent implements ShareModel {
    public static final Parcelable.Creator<AppGroupCreationContent> CREATOR = new AppGroupCreationContent$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    private final AppGroupPrivacy appGroupPrivacy;
    private final String description;
    private final String name;

    /* compiled from: AppGroupCreationContent.kt */
    public enum AppGroupPrivacy {
        Open,
        Closed
    }

    /* compiled from: AppGroupCreationContent.kt */
    public static final class Builder implements ShareModelBuilder<AppGroupCreationContent, Builder> {
        private AppGroupPrivacy appGroupPrivacy;
        private String description;
        private String name;

        public final AppGroupPrivacy getAppGroupPrivacy$facebook_common_release() {
            return this.appGroupPrivacy;
        }

        public final String getDescription$facebook_common_release() {
            return this.description;
        }

        public final String getName$facebook_common_release() {
            return this.name;
        }

        public final Builder setAppGroupPrivacy(AppGroupPrivacy appGroupPrivacy2) {
            this.appGroupPrivacy = appGroupPrivacy2;
            return this;
        }

        public final void setAppGroupPrivacy$facebook_common_release(AppGroupPrivacy appGroupPrivacy2) {
            this.appGroupPrivacy = appGroupPrivacy2;
        }

        public final Builder setDescription(String str) {
            this.description = str;
            return this;
        }

        public final void setDescription$facebook_common_release(String str) {
            this.description = str;
        }

        public final Builder setName(String str) {
            this.name = str;
            return this;
        }

        public final void setName$facebook_common_release(String str) {
            this.name = str;
        }

        public AppGroupCreationContent build() {
            return new AppGroupCreationContent(this, (g) null);
        }

        public Builder readFrom(AppGroupCreationContent appGroupCreationContent) {
            if (appGroupCreationContent == null) {
                return this;
            }
            return setName(appGroupCreationContent.getName()).setDescription(appGroupCreationContent.getDescription()).setAppGroupPrivacy(appGroupCreationContent.getAppGroupPrivacy());
        }
    }

    /* compiled from: AppGroupCreationContent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private AppGroupCreationContent(Builder builder) {
        this.name = builder.getName$facebook_common_release();
        this.description = builder.getDescription$facebook_common_release();
        this.appGroupPrivacy = builder.getAppGroupPrivacy$facebook_common_release();
    }

    public /* synthetic */ AppGroupCreationContent(Builder builder, g gVar) {
        this(builder);
    }

    public int describeContents() {
        return 0;
    }

    public final AppGroupPrivacy getAppGroupPrivacy() {
        return this.appGroupPrivacy;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeSerializable(this.appGroupPrivacy);
    }

    public AppGroupCreationContent(Parcel parcel) {
        m.f(parcel, "parcel");
        this.name = parcel.readString();
        this.description = parcel.readString();
        this.appGroupPrivacy = (AppGroupPrivacy) parcel.readSerializable();
    }
}
