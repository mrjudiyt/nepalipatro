package com.facebook.share.model;

import android.os.Parcel;
import kotlin.jvm.internal.m;

/* compiled from: ShareMessengerActionButton.kt */
public abstract class ShareMessengerActionButton implements ShareModel {
    private final String title;

    /* compiled from: ShareMessengerActionButton.kt */
    public static abstract class Builder<M extends ShareMessengerActionButton, B extends Builder<M, B>> implements ShareModelBuilder<M, B> {
        private String title;

        public final String getTitle$facebook_common_release() {
            return this.title;
        }

        public final B setTitle(String str) {
            this.title = str;
            return this;
        }

        public final void setTitle$facebook_common_release(String str) {
            this.title = str;
        }

        public B readFrom(M m10) {
            return m10 == null ? this : setTitle(m10.getTitle());
        }
    }

    protected ShareMessengerActionButton(Builder<?, ?> builder) {
        m.f(builder, "builder");
        this.title = builder.getTitle$facebook_common_release();
    }

    public int describeContents() {
        return 0;
    }

    public final String getTitle() {
        return this.title;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "dest");
        parcel.writeString(this.title);
    }

    public ShareMessengerActionButton(Parcel parcel) {
        m.f(parcel, "parcel");
        this.title = parcel.readString();
    }
}
