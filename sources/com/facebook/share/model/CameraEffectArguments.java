package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Set;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: CameraEffectArguments.kt */
public final class CameraEffectArguments implements ShareModel {
    public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new CameraEffectArguments$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    /* access modifiers changed from: private */
    public final Bundle params;

    /* compiled from: CameraEffectArguments.kt */
    public static final class Builder implements ShareModelBuilder<CameraEffectArguments, Builder> {
        private final Bundle params = new Bundle();

        public final Bundle getParams$facebook_common_release() {
            return this.params;
        }

        public final Builder putArgument(String str, String str2) {
            m.f(str, Constants.KEY);
            m.f(str2, "value");
            this.params.putString(str, str2);
            return this;
        }

        public CameraEffectArguments build() {
            return new CameraEffectArguments(this, (g) null);
        }

        public final Builder putArgument(String str, String[] strArr) {
            m.f(str, Constants.KEY);
            m.f(strArr, "arrayValue");
            this.params.putStringArray(str, strArr);
            return this;
        }

        public Builder readFrom(CameraEffectArguments cameraEffectArguments) {
            if (cameraEffectArguments != null) {
                this.params.putAll(cameraEffectArguments.params);
            }
            return this;
        }

        public final Builder readFrom(Parcel parcel) {
            m.f(parcel, "parcel");
            return readFrom((CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader()));
        }
    }

    /* compiled from: CameraEffectArguments.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private CameraEffectArguments(Builder builder) {
        this.params = builder.getParams$facebook_common_release();
    }

    public /* synthetic */ CameraEffectArguments(Builder builder, g gVar) {
        this(builder);
    }

    public int describeContents() {
        return 0;
    }

    public final Object get(String str) {
        Bundle bundle = this.params;
        if (bundle == null) {
            return null;
        }
        return bundle.get(str);
    }

    public final String getString(String str) {
        Bundle bundle = this.params;
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str);
    }

    public final String[] getStringArray(String str) {
        Bundle bundle = this.params;
        if (bundle == null) {
            return null;
        }
        return bundle.getStringArray(str);
    }

    public final Set<String> keySet() {
        Bundle bundle = this.params;
        Set<String> keySet = bundle == null ? null : bundle.keySet();
        return keySet == null ? m0.b() : keySet;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "out");
        parcel.writeBundle(this.params);
    }

    public CameraEffectArguments(Parcel parcel) {
        m.f(parcel, "parcel");
        this.params = parcel.readBundle(CameraEffectArguments.class.getClassLoader());
    }
}
