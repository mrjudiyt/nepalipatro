package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.SharePhoto;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: SharePhotoContent.kt */
public final class SharePhotoContent extends ShareContent<SharePhotoContent, Builder> {
    public static final Parcelable.Creator<SharePhotoContent> CREATOR = new SharePhotoContent$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    private final List<SharePhoto> photos;

    /* compiled from: SharePhotoContent.kt */
    public static final class Builder extends ShareContent.Builder<SharePhotoContent, Builder> {
        private final List<SharePhoto> photos = new ArrayList();

        public final Builder addPhoto(SharePhoto sharePhoto) {
            if (sharePhoto != null) {
                this.photos.add(new SharePhoto.Builder().readFrom(sharePhoto).build());
            }
            return this;
        }

        public final Builder addPhotos(List<SharePhoto> list) {
            if (list != null) {
                for (SharePhoto addPhoto : list) {
                    addPhoto(addPhoto);
                }
            }
            return this;
        }

        public final List<SharePhoto> getPhotos$facebook_common_release() {
            return this.photos;
        }

        public final Builder setPhotos(List<SharePhoto> list) {
            this.photos.clear();
            addPhotos(list);
            return this;
        }

        public SharePhotoContent build() {
            return new SharePhotoContent(this, (g) null);
        }

        public Builder readFrom(SharePhotoContent sharePhotoContent) {
            return sharePhotoContent == null ? this : ((Builder) super.readFrom(sharePhotoContent)).addPhotos(sharePhotoContent.getPhotos());
        }
    }

    /* compiled from: SharePhotoContent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private SharePhotoContent(Builder builder) {
        super(builder);
        this.photos = x.R(builder.getPhotos$facebook_common_release());
    }

    public /* synthetic */ SharePhotoContent(Builder builder, g gVar) {
        this(builder);
    }

    public int describeContents() {
        return 0;
    }

    public final List<SharePhoto> getPhotos() {
        return this.photos;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "out");
        super.writeToParcel(parcel, i10);
        SharePhoto.Builder.Companion.writePhotoListTo$facebook_common_release(parcel, i10, this.photos);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharePhotoContent(Parcel parcel) {
        super(parcel);
        m.f(parcel, "parcel");
        this.photos = x.R(SharePhoto.Builder.Companion.readPhotoListFrom$facebook_common_release(parcel));
    }
}
