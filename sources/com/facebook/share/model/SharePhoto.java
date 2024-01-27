package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: SharePhoto.kt */
public final class SharePhoto extends ShareMedia<SharePhoto, Builder> {
    public static final Parcelable.Creator<SharePhoto> CREATOR = new SharePhoto$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    private final Bitmap bitmap;
    private final String caption;
    private final Uri imageUrl;
    private final ShareMedia.Type mediaType;
    private final boolean userGenerated;

    /* compiled from: SharePhoto.kt */
    public static final class Builder extends ShareMedia.Builder<SharePhoto, Builder> {
        public static final Companion Companion = new Companion((g) null);
        private Bitmap bitmap;
        private String caption;
        private Uri imageUrl;
        private boolean userGenerated;

        /* compiled from: SharePhoto.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final List<SharePhoto> readPhotoListFrom$facebook_common_release(Parcel parcel) {
                m.f(parcel, "parcel");
                List<ShareMedia<?, ?>> readListFrom$facebook_common_release = ShareMedia.Builder.Companion.readListFrom$facebook_common_release(parcel);
                ArrayList arrayList = new ArrayList();
                for (T next : readListFrom$facebook_common_release) {
                    if (next instanceof SharePhoto) {
                        arrayList.add(next);
                    }
                }
                return arrayList;
            }

            public final void writePhotoListTo$facebook_common_release(Parcel parcel, int i10, List<SharePhoto> list) {
                m.f(parcel, "out");
                m.f(list, "photos");
                Object[] array = list.toArray(new SharePhoto[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                parcel.writeParcelableArray((SharePhoto[]) array, i10);
            }
        }

        public final Bitmap getBitmap$facebook_common_release() {
            return this.bitmap;
        }

        public final String getCaption$facebook_common_release() {
            return this.caption;
        }

        public final Uri getImageUrl$facebook_common_release() {
            return this.imageUrl;
        }

        public final boolean getUserGenerated$facebook_common_release() {
            return this.userGenerated;
        }

        public final Builder readFrom$facebook_common_release(Parcel parcel) {
            m.f(parcel, "parcel");
            return readFrom((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        }

        public final Builder setBitmap(Bitmap bitmap2) {
            this.bitmap = bitmap2;
            return this;
        }

        public final Builder setCaption(String str) {
            this.caption = str;
            return this;
        }

        public final Builder setImageUrl(Uri uri) {
            this.imageUrl = uri;
            return this;
        }

        public final Builder setUserGenerated(boolean z10) {
            this.userGenerated = z10;
            return this;
        }

        public SharePhoto build() {
            return new SharePhoto(this, (g) null);
        }

        public Builder readFrom(SharePhoto sharePhoto) {
            if (sharePhoto == null) {
                return this;
            }
            return ((Builder) super.readFrom(sharePhoto)).setBitmap(sharePhoto.getBitmap()).setImageUrl(sharePhoto.getImageUrl()).setUserGenerated(sharePhoto.getUserGenerated()).setCaption(sharePhoto.getCaption());
        }
    }

    /* compiled from: SharePhoto.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private SharePhoto(Builder builder) {
        super(builder);
        this.mediaType = ShareMedia.Type.PHOTO;
        this.bitmap = builder.getBitmap$facebook_common_release();
        this.imageUrl = builder.getImageUrl$facebook_common_release();
        this.userGenerated = builder.getUserGenerated$facebook_common_release();
        this.caption = builder.getCaption$facebook_common_release();
    }

    public /* synthetic */ SharePhoto(Builder builder, g gVar) {
        this(builder);
    }

    public int describeContents() {
        return 0;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final Uri getImageUrl() {
        return this.imageUrl;
    }

    public ShareMedia.Type getMediaType() {
        return this.mediaType;
    }

    public final boolean getUserGenerated() {
        return this.userGenerated;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.bitmap, 0);
        parcel.writeParcelable(this.imageUrl, 0);
        parcel.writeByte(this.userGenerated ? (byte) 1 : 0);
        parcel.writeString(this.caption);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharePhoto(Parcel parcel) {
        super(parcel);
        m.f(parcel, "parcel");
        this.mediaType = ShareMedia.Type.PHOTO;
        this.bitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.imageUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.userGenerated = parcel.readByte() != 0;
        this.caption = parcel.readString();
    }
}
