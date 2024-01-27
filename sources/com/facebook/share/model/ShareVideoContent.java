package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareVideo;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: ShareVideoContent.kt */
public final class ShareVideoContent extends ShareContent<ShareVideoContent, Builder> {
    public static final Parcelable.Creator<ShareVideoContent> CREATOR = new ShareVideoContent$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    private final String contentDescription;
    private final String contentTitle;
    private final SharePhoto previewPhoto;
    private final ShareVideo video;

    /* compiled from: ShareVideoContent.kt */
    public static final class Builder extends ShareContent.Builder<ShareVideoContent, Builder> {
        private String contentDescription;
        private String contentTitle;
        private SharePhoto previewPhoto;
        private ShareVideo video;

        public final String getContentDescription$facebook_common_release() {
            return this.contentDescription;
        }

        public final String getContentTitle$facebook_common_release() {
            return this.contentTitle;
        }

        public final SharePhoto getPreviewPhoto$facebook_common_release() {
            return this.previewPhoto;
        }

        public final ShareVideo getVideo$facebook_common_release() {
            return this.video;
        }

        public final Builder setContentDescription(String str) {
            this.contentDescription = str;
            return this;
        }

        public final void setContentDescription$facebook_common_release(String str) {
            this.contentDescription = str;
        }

        public final Builder setContentTitle(String str) {
            this.contentTitle = str;
            return this;
        }

        public final void setContentTitle$facebook_common_release(String str) {
            this.contentTitle = str;
        }

        public final Builder setPreviewPhoto(SharePhoto sharePhoto) {
            this.previewPhoto = sharePhoto == null ? null : new SharePhoto.Builder().readFrom(sharePhoto).build();
            return this;
        }

        public final void setPreviewPhoto$facebook_common_release(SharePhoto sharePhoto) {
            this.previewPhoto = sharePhoto;
        }

        public final Builder setVideo(ShareVideo shareVideo) {
            if (shareVideo == null) {
                return this;
            }
            this.video = new ShareVideo.Builder().readFrom(shareVideo).build();
            return this;
        }

        public final void setVideo$facebook_common_release(ShareVideo shareVideo) {
            this.video = shareVideo;
        }

        public ShareVideoContent build() {
            return new ShareVideoContent(this, (g) null);
        }

        public Builder readFrom(ShareVideoContent shareVideoContent) {
            if (shareVideoContent == null) {
                return this;
            }
            return ((Builder) super.readFrom(shareVideoContent)).setContentDescription(shareVideoContent.getContentDescription()).setContentTitle(shareVideoContent.getContentTitle()).setPreviewPhoto(shareVideoContent.getPreviewPhoto()).setVideo(shareVideoContent.getVideo());
        }
    }

    /* compiled from: ShareVideoContent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private ShareVideoContent(Builder builder) {
        super(builder);
        this.contentDescription = builder.getContentDescription$facebook_common_release();
        this.contentTitle = builder.getContentTitle$facebook_common_release();
        this.previewPhoto = builder.getPreviewPhoto$facebook_common_release();
        this.video = builder.getVideo$facebook_common_release();
    }

    public /* synthetic */ ShareVideoContent(Builder builder, g gVar) {
        this(builder);
    }

    public int describeContents() {
        return 0;
    }

    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final String getContentTitle() {
        return this.contentTitle;
    }

    public final SharePhoto getPreviewPhoto() {
        return this.previewPhoto;
    }

    public final ShareVideo getVideo() {
        return this.video;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.contentDescription);
        parcel.writeString(this.contentTitle);
        parcel.writeParcelable(this.previewPhoto, 0);
        parcel.writeParcelable(this.video, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareVideoContent(Parcel parcel) {
        super(parcel);
        SharePhoto sharePhoto;
        m.f(parcel, "parcel");
        this.contentDescription = parcel.readString();
        this.contentTitle = parcel.readString();
        SharePhoto.Builder readFrom$facebook_common_release = new SharePhoto.Builder().readFrom$facebook_common_release(parcel);
        if (readFrom$facebook_common_release.getImageUrl$facebook_common_release() == null && readFrom$facebook_common_release.getBitmap$facebook_common_release() == null) {
            sharePhoto = null;
        } else {
            sharePhoto = readFrom$facebook_common_release.build();
        }
        this.previewPhoto = sharePhoto;
        this.video = new ShareVideo.Builder().readFrom$facebook_common_release(parcel).build();
    }
}
