package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: ShareVideo.kt */
public final class ShareVideo extends ShareMedia<ShareVideo, Builder> {
    public static final Parcelable.Creator<ShareVideo> CREATOR = new ShareVideo$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    private final Uri localUrl;
    private final ShareMedia.Type mediaType;

    /* compiled from: ShareVideo.kt */
    public static final class Builder extends ShareMedia.Builder<ShareVideo, Builder> {
        private Uri localUrl;

        public final Uri getLocalUrl$facebook_common_release() {
            return this.localUrl;
        }

        public final Builder readFrom$facebook_common_release(Parcel parcel) {
            m.f(parcel, "parcel");
            return readFrom((ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader()));
        }

        public final Builder setLocalUrl(Uri uri) {
            this.localUrl = uri;
            return this;
        }

        public final void setLocalUrl$facebook_common_release(Uri uri) {
            this.localUrl = uri;
        }

        public ShareVideo build() {
            return new ShareVideo(this, (g) null);
        }

        public Builder readFrom(ShareVideo shareVideo) {
            return shareVideo == null ? this : setLocalUrl(shareVideo.getLocalUrl());
        }
    }

    /* compiled from: ShareVideo.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private ShareVideo(Builder builder) {
        super(builder);
        this.mediaType = ShareMedia.Type.VIDEO;
        this.localUrl = builder.getLocalUrl$facebook_common_release();
    }

    public /* synthetic */ ShareVideo(Builder builder, g gVar) {
        this(builder);
    }

    public int describeContents() {
        return 0;
    }

    public final Uri getLocalUrl() {
        return this.localUrl;
    }

    public ShareMedia.Type getMediaType() {
        return this.mediaType;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.localUrl, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareVideo(Parcel parcel) {
        super(parcel);
        m.f(parcel, "parcel");
        this.mediaType = ShareMedia.Type.VIDEO;
        this.localUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
