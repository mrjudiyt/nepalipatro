package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareContent;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: ShareCameraEffectContent.kt */
public final class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, Builder> {
    public static final Parcelable.Creator<ShareCameraEffectContent> CREATOR = new ShareCameraEffectContent$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    private CameraEffectArguments arguments;
    private String effectId;
    private CameraEffectTextures textures;

    /* compiled from: ShareCameraEffectContent.kt */
    public static final class Builder extends ShareContent.Builder<ShareCameraEffectContent, Builder> {
        private CameraEffectArguments arguments;
        private String effectId;
        private CameraEffectTextures textures;

        public final CameraEffectArguments getArguments$facebook_common_release() {
            return this.arguments;
        }

        public final String getEffectId$facebook_common_release() {
            return this.effectId;
        }

        public final CameraEffectTextures getTextures$facebook_common_release() {
            return this.textures;
        }

        public final Builder setArguments(CameraEffectArguments cameraEffectArguments) {
            this.arguments = cameraEffectArguments;
            return this;
        }

        public final void setArguments$facebook_common_release(CameraEffectArguments cameraEffectArguments) {
            this.arguments = cameraEffectArguments;
        }

        public final Builder setEffectId(String str) {
            this.effectId = str;
            return this;
        }

        public final void setEffectId$facebook_common_release(String str) {
            this.effectId = str;
        }

        public final Builder setTextures(CameraEffectTextures cameraEffectTextures) {
            this.textures = cameraEffectTextures;
            return this;
        }

        public final void setTextures$facebook_common_release(CameraEffectTextures cameraEffectTextures) {
            this.textures = cameraEffectTextures;
        }

        public ShareCameraEffectContent build() {
            return new ShareCameraEffectContent(this, (g) null);
        }

        public Builder readFrom(ShareCameraEffectContent shareCameraEffectContent) {
            if (shareCameraEffectContent == null) {
                return this;
            }
            return ((Builder) super.readFrom(shareCameraEffectContent)).setEffectId(shareCameraEffectContent.getEffectId()).setArguments(shareCameraEffectContent.getArguments()).setTextures(shareCameraEffectContent.getTextures());
        }
    }

    /* compiled from: ShareCameraEffectContent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private ShareCameraEffectContent(Builder builder) {
        super(builder);
        this.effectId = builder.getEffectId$facebook_common_release();
        this.arguments = builder.getArguments$facebook_common_release();
        this.textures = builder.getTextures$facebook_common_release();
    }

    public /* synthetic */ ShareCameraEffectContent(Builder builder, g gVar) {
        this(builder);
    }

    public final CameraEffectArguments getArguments() {
        return this.arguments;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final CameraEffectTextures getTextures() {
        return this.textures;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.effectId);
        parcel.writeParcelable(this.arguments, 0);
        parcel.writeParcelable(this.textures, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareCameraEffectContent(Parcel parcel) {
        super(parcel);
        m.f(parcel, "parcel");
        this.effectId = parcel.readString();
        this.arguments = new CameraEffectArguments.Builder().readFrom(parcel).build();
        this.textures = new CameraEffectTextures.Builder().readFrom(parcel).build();
    }
}
