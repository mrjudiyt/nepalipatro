package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMedia.Builder;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: ShareMedia.kt */
public abstract class ShareMedia<M extends ShareMedia<M, B>, B extends Builder<M, B>> implements ShareModel {
    /* access modifiers changed from: private */
    public final Bundle params;

    /* compiled from: ShareMedia.kt */
    public static abstract class Builder<M extends ShareMedia<M, B>, B extends Builder<M, B>> implements ShareModelBuilder<M, B> {
        public static final Companion Companion = new Companion((g) null);
        private Bundle params = new Bundle();

        /* compiled from: ShareMedia.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final List<ShareMedia<?, ?>> readListFrom$facebook_common_release(Parcel parcel) {
                m.f(parcel, "parcel");
                Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
                if (readParcelableArray == null) {
                    return p.e();
                }
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : readParcelableArray) {
                    if (parcelable instanceof ShareMedia) {
                        arrayList.add(parcelable);
                    }
                }
                return arrayList;
            }

            public final void writeListTo$facebook_common_release(Parcel parcel, int i10, List<? extends ShareMedia<?, ?>> list) {
                m.f(parcel, "out");
                m.f(list, ShareConstants.WEB_DIALOG_PARAM_MEDIA);
                Object[] array = list.toArray(new ShareMedia[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                parcel.writeParcelableArray((Parcelable[]) array, i10);
            }
        }

        public static final List<ShareMedia<?, ?>> readListFrom$facebook_common_release(Parcel parcel) {
            return Companion.readListFrom$facebook_common_release(parcel);
        }

        public static final void writeListTo$facebook_common_release(Parcel parcel, int i10, List<? extends ShareMedia<?, ?>> list) {
            Companion.writeListTo$facebook_common_release(parcel, i10, list);
        }

        public final Bundle getParams$facebook_common_release() {
            return this.params;
        }

        public final B setParameter(String str, String str2) {
            m.f(str, Constants.KEY);
            m.f(str2, "value");
            this.params.putString(str, str2);
            return this;
        }

        public final B setParameters(Bundle bundle) {
            m.f(bundle, "parameters");
            this.params.putAll(bundle);
            return this;
        }

        public final void setParams$facebook_common_release(Bundle bundle) {
            m.f(bundle, "<set-?>");
            this.params = bundle;
        }

        public B readFrom(M m10) {
            return m10 == null ? this : setParameters(m10.params);
        }
    }

    /* compiled from: ShareMedia.kt */
    public enum Type {
        PHOTO,
        VIDEO
    }

    protected ShareMedia(Builder<M, B> builder) {
        m.f(builder, "builder");
        this.params = new Bundle(builder.getParams$facebook_common_release());
    }

    public int describeContents() {
        return 0;
    }

    public abstract Type getMediaType();

    public final Bundle getParameters() {
        return new Bundle(this.params);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "dest");
        parcel.writeBundle(this.params);
    }

    public ShareMedia(Parcel parcel) {
        m.f(parcel, "parcel");
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.params = readBundle == null ? new Bundle() : readBundle;
    }
}
