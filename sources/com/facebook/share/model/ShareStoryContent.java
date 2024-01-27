package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: ShareStoryContent.kt */
public final class ShareStoryContent extends ShareContent<ShareStoryContent, Builder> {
    public static final Parcelable.Creator<ShareStoryContent> CREATOR = new ShareStoryContent$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    private final String attributionLink;
    private final ShareMedia<?, ?> backgroundAsset;
    private final List<String> backgroundColorList;
    private final SharePhoto stickerAsset;

    /* compiled from: ShareStoryContent.kt */
    public static final class Builder extends ShareContent.Builder<ShareStoryContent, Builder> {
        private String attributionLink;
        private ShareMedia<?, ?> backgroundAsset;
        private List<String> backgroundColorList;
        private SharePhoto stickerAsset;

        public final String getAttributionLink$facebook_common_release() {
            return this.attributionLink;
        }

        public final ShareMedia<?, ?> getBackgroundAsset$facebook_common_release() {
            return this.backgroundAsset;
        }

        public final List<String> getBackgroundColorList$facebook_common_release() {
            return this.backgroundColorList;
        }

        public final SharePhoto getStickerAsset$facebook_common_release() {
            return this.stickerAsset;
        }

        public final Builder setAttributionLink(String str) {
            this.attributionLink = str;
            return this;
        }

        public final void setAttributionLink$facebook_common_release(String str) {
            this.attributionLink = str;
        }

        public final Builder setBackgroundAsset(ShareMedia<?, ?> shareMedia) {
            this.backgroundAsset = shareMedia;
            return this;
        }

        public final void setBackgroundAsset$facebook_common_release(ShareMedia<?, ?> shareMedia) {
            this.backgroundAsset = shareMedia;
        }

        public final Builder setBackgroundColorList(List<String> list) {
            this.backgroundColorList = list == null ? null : x.R(list);
            return this;
        }

        public final void setBackgroundColorList$facebook_common_release(List<String> list) {
            this.backgroundColorList = list;
        }

        public final Builder setStickerAsset(SharePhoto sharePhoto) {
            this.stickerAsset = sharePhoto;
            return this;
        }

        public final void setStickerAsset$facebook_common_release(SharePhoto sharePhoto) {
            this.stickerAsset = sharePhoto;
        }

        public ShareStoryContent build() {
            return new ShareStoryContent(this, (g) null);
        }

        public Builder readFrom(ShareStoryContent shareStoryContent) {
            if (shareStoryContent == null) {
                return this;
            }
            return ((Builder) super.readFrom(shareStoryContent)).setBackgroundAsset(shareStoryContent.getBackgroundAsset()).setStickerAsset(shareStoryContent.getStickerAsset()).setBackgroundColorList(shareStoryContent.getBackgroundColorList()).setAttributionLink(shareStoryContent.getAttributionLink());
        }
    }

    /* compiled from: ShareStoryContent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private ShareStoryContent(Builder builder) {
        super(builder);
        this.backgroundAsset = builder.getBackgroundAsset$facebook_common_release();
        this.stickerAsset = builder.getStickerAsset$facebook_common_release();
        this.backgroundColorList = builder.getBackgroundColorList$facebook_common_release();
        this.attributionLink = builder.getAttributionLink$facebook_common_release();
    }

    public /* synthetic */ ShareStoryContent(Builder builder, g gVar) {
        this(builder);
    }

    private final List<String> readUnmodifiableStringList(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return x.R(arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public final String getAttributionLink() {
        return this.attributionLink;
    }

    public final ShareMedia<?, ?> getBackgroundAsset() {
        return this.backgroundAsset;
    }

    public final List<String> getBackgroundColorList() {
        List<String> list = this.backgroundColorList;
        if (list == null) {
            return null;
        }
        return x.R(list);
    }

    public final SharePhoto getStickerAsset() {
        return this.stickerAsset;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.backgroundAsset, 0);
        parcel.writeParcelable(this.stickerAsset, 0);
        parcel.writeStringList(getBackgroundColorList());
        parcel.writeString(this.attributionLink);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareStoryContent(Parcel parcel) {
        super(parcel);
        m.f(parcel, "parcel");
        this.backgroundAsset = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.stickerAsset = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        this.backgroundColorList = readUnmodifiableStringList(parcel);
        this.attributionLink = parcel.readString();
    }
}
