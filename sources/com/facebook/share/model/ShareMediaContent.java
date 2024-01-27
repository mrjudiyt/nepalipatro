package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareVideo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: ShareMediaContent.kt */
public final class ShareMediaContent extends ShareContent<ShareMediaContent, Builder> {
    public static final Parcelable.Creator<ShareMediaContent> CREATOR = new ShareMediaContent$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    private final List<ShareMedia<?, ?>> media;

    /* compiled from: ShareMediaContent.kt */
    public static final class Builder extends ShareContent.Builder<ShareMediaContent, Builder> {
        private final List<ShareMedia<?, ?>> media = new ArrayList();

        public final Builder addMedia(List<? extends ShareMedia<?, ?>> list) {
            if (list != null) {
                for (ShareMedia addMedium : list) {
                    addMedium(addMedium);
                }
            }
            return this;
        }

        public final Builder addMedium(ShareMedia<?, ?> shareMedia) {
            Object obj;
            if (shareMedia != null) {
                if (shareMedia instanceof SharePhoto) {
                    obj = new SharePhoto.Builder().readFrom((SharePhoto) shareMedia).build();
                } else if (shareMedia instanceof ShareVideo) {
                    obj = new ShareVideo.Builder().readFrom((ShareVideo) shareMedia).build();
                } else {
                    throw new IllegalArgumentException("medium must be either a SharePhoto or ShareVideo");
                }
                this.media.add(obj);
            }
            return this;
        }

        public final List<ShareMedia<?, ?>> getMedia$facebook_common_release() {
            return this.media;
        }

        public final Builder setMedia(List<? extends ShareMedia<?, ?>> list) {
            this.media.clear();
            addMedia(list);
            return this;
        }

        public ShareMediaContent build() {
            return new ShareMediaContent(this, (g) null);
        }

        public Builder readFrom(ShareMediaContent shareMediaContent) {
            return shareMediaContent == null ? this : ((Builder) super.readFrom(shareMediaContent)).addMedia(shareMediaContent.getMedia());
        }
    }

    /* compiled from: ShareMediaContent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private ShareMediaContent(Builder builder) {
        super(builder);
        this.media = x.R(builder.getMedia$facebook_common_release());
    }

    public /* synthetic */ ShareMediaContent(Builder builder, g gVar) {
        this(builder);
    }

    public int describeContents() {
        return 0;
    }

    public final List<ShareMedia<?, ?>> getMedia() {
        return this.media;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "out");
        super.writeToParcel(parcel, i10);
        Object[] array = this.media.toArray(new ShareMedia[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        parcel.writeParcelableArray((Parcelable[]) array, i10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareMediaContent(Parcel parcel) {
        super(parcel);
        List<ShareMedia<?, ?>> list;
        m.f(parcel, "source");
        Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
        if (readParcelableArray == null) {
            list = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : readParcelableArray) {
                ShareMedia shareMedia = (ShareMedia) parcelable;
                if (shareMedia != null) {
                    arrayList.add(shareMedia);
                }
            }
            list = arrayList;
        }
        this.media = list == null ? p.e() : list;
    }
}
