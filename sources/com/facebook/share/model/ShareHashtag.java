package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: ShareHashtag.kt */
public final class ShareHashtag implements ShareModel {
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new ShareHashtag$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    private final String hashtag;

    /* compiled from: ShareHashtag.kt */
    public static final class Builder implements ShareModelBuilder<ShareHashtag, Builder> {
        private String hashtag;

        public final String getHashtag() {
            return this.hashtag;
        }

        public final Builder readFrom$facebook_common_release(Parcel parcel) {
            m.f(parcel, "parcel");
            return readFrom((ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader()));
        }

        public final Builder setHashtag(String str) {
            this.hashtag = str;
            return this;
        }

        public ShareHashtag build() {
            return new ShareHashtag(this, (g) null);
        }

        public Builder readFrom(ShareHashtag shareHashtag) {
            return shareHashtag == null ? this : setHashtag(shareHashtag.getHashtag());
        }
    }

    /* compiled from: ShareHashtag.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private ShareHashtag(Builder builder) {
        this.hashtag = builder.getHashtag();
    }

    public /* synthetic */ ShareHashtag(Builder builder, g gVar) {
        this(builder);
    }

    public int describeContents() {
        return 0;
    }

    public final String getHashtag() {
        return this.hashtag;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "dest");
        parcel.writeString(this.hashtag);
    }

    public ShareHashtag(Parcel parcel) {
        m.f(parcel, "parcel");
        this.hashtag = parcel.readString();
    }
}
