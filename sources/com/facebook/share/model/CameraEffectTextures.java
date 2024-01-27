package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Set;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: CameraEffectTextures.kt */
public final class CameraEffectTextures implements ShareModel {
    public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new CameraEffectTextures$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    /* access modifiers changed from: private */
    public final Bundle textures;

    /* compiled from: CameraEffectTextures.kt */
    public static final class Builder implements ShareModelBuilder<CameraEffectTextures, Builder> {
        private final Bundle textures = new Bundle();

        private final Builder putParcelableTexture(String str, Parcelable parcelable) {
            if ((str.length() > 0) && parcelable != null) {
                this.textures.putParcelable(str, parcelable);
            }
            return this;
        }

        public final Bundle getTextures$facebook_common_release() {
            return this.textures;
        }

        public final Builder putTexture(String str, Bitmap bitmap) {
            m.f(str, Constants.KEY);
            return putParcelableTexture(str, bitmap);
        }

        public CameraEffectTextures build() {
            return new CameraEffectTextures(this, (g) null);
        }

        public final Builder putTexture(String str, Uri uri) {
            m.f(str, Constants.KEY);
            return putParcelableTexture(str, uri);
        }

        public Builder readFrom(CameraEffectTextures cameraEffectTextures) {
            if (cameraEffectTextures != null) {
                this.textures.putAll(cameraEffectTextures.textures);
            }
            return this;
        }

        public final Builder readFrom(Parcel parcel) {
            m.f(parcel, "parcel");
            return readFrom((CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader()));
        }
    }

    /* compiled from: CameraEffectTextures.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private CameraEffectTextures(Builder builder) {
        this.textures = builder.getTextures$facebook_common_release();
    }

    public /* synthetic */ CameraEffectTextures(Builder builder, g gVar) {
        this(builder);
    }

    public int describeContents() {
        return 0;
    }

    public final Object get(String str) {
        Bundle bundle = this.textures;
        if (bundle == null) {
            return null;
        }
        return bundle.get(str);
    }

    public final Bitmap getTextureBitmap(String str) {
        Bundle bundle = this.textures;
        Object obj = bundle == null ? null : bundle.get(str);
        if (obj instanceof Bitmap) {
            return (Bitmap) obj;
        }
        return null;
    }

    public final Uri getTextureUri(String str) {
        Bundle bundle = this.textures;
        Object obj = bundle == null ? null : bundle.get(str);
        if (obj instanceof Uri) {
            return (Uri) obj;
        }
        return null;
    }

    public final Set<String> keySet() {
        Bundle bundle = this.textures;
        Set<String> keySet = bundle == null ? null : bundle.keySet();
        return keySet == null ? m0.b() : keySet;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "out");
        parcel.writeBundle(this.textures);
    }

    public CameraEffectTextures(Parcel parcel) {
        m.f(parcel, "parcel");
        this.textures = parcel.readBundle(CameraEffectTextures.class.getClassLoader());
    }
}
