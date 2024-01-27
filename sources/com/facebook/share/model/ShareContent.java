package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareContent.Builder;
import com.facebook.share.model.ShareHashtag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: ShareContent.kt */
public abstract class ShareContent<M extends ShareContent<M, B>, B extends Builder<M, B>> implements ShareModel {
    private final Uri contentUrl;
    private final String pageId;
    private final List<String> peopleIds;
    private final String placeId;
    private final String ref;
    private final ShareHashtag shareHashtag;

    /* compiled from: ShareContent.kt */
    public static abstract class Builder<M extends ShareContent<M, B>, B extends Builder<M, B>> implements ShareModelBuilder<M, B> {
        private Uri contentUrl;
        private ShareHashtag hashtag;
        private String pageId;
        private List<String> peopleIds;
        private String placeId;
        private String ref;

        public final Uri getContentUrl$facebook_common_release() {
            return this.contentUrl;
        }

        public final ShareHashtag getHashtag$facebook_common_release() {
            return this.hashtag;
        }

        public final String getPageId$facebook_common_release() {
            return this.pageId;
        }

        public final List<String> getPeopleIds$facebook_common_release() {
            return this.peopleIds;
        }

        public final String getPlaceId$facebook_common_release() {
            return this.placeId;
        }

        public final String getRef$facebook_common_release() {
            return this.ref;
        }

        public final B setContentUrl(Uri uri) {
            this.contentUrl = uri;
            return this;
        }

        public final void setContentUrl$facebook_common_release(Uri uri) {
            this.contentUrl = uri;
        }

        public final void setHashtag$facebook_common_release(ShareHashtag shareHashtag) {
            this.hashtag = shareHashtag;
        }

        public final B setPageId(String str) {
            this.pageId = str;
            return this;
        }

        public final void setPageId$facebook_common_release(String str) {
            this.pageId = str;
        }

        public final B setPeopleIds(List<String> list) {
            this.peopleIds = list == null ? null : Collections.unmodifiableList(list);
            return this;
        }

        public final void setPeopleIds$facebook_common_release(List<String> list) {
            this.peopleIds = list;
        }

        public final B setPlaceId(String str) {
            this.placeId = str;
            return this;
        }

        public final void setPlaceId$facebook_common_release(String str) {
            this.placeId = str;
        }

        public final B setRef(String str) {
            this.ref = str;
            return this;
        }

        public final void setRef$facebook_common_release(String str) {
            this.ref = str;
        }

        public final B setShareHashtag(ShareHashtag shareHashtag) {
            this.hashtag = shareHashtag;
            return this;
        }

        public B readFrom(M m10) {
            if (m10 == null) {
                return this;
            }
            return setContentUrl(m10.getContentUrl()).setPeopleIds(m10.getPeopleIds()).setPlaceId(m10.getPlaceId()).setPageId(m10.getPageId()).setRef(m10.getRef()).setShareHashtag(m10.getShareHashtag());
        }
    }

    protected ShareContent(Builder<M, B> builder) {
        m.f(builder, "builder");
        this.contentUrl = builder.getContentUrl$facebook_common_release();
        this.peopleIds = builder.getPeopleIds$facebook_common_release();
        this.placeId = builder.getPlaceId$facebook_common_release();
        this.pageId = builder.getPageId$facebook_common_release();
        this.ref = builder.getRef$facebook_common_release();
        this.shareHashtag = builder.getHashtag$facebook_common_release();
    }

    private final List<String> readUnmodifiableStringList(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public final Uri getContentUrl() {
        return this.contentUrl;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final List<String> getPeopleIds() {
        return this.peopleIds;
    }

    public final String getPlaceId() {
        return this.placeId;
    }

    public final String getRef() {
        return this.ref;
    }

    public final ShareHashtag getShareHashtag() {
        return this.shareHashtag;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "out");
        parcel.writeParcelable(this.contentUrl, 0);
        parcel.writeStringList(this.peopleIds);
        parcel.writeString(this.placeId);
        parcel.writeString(this.pageId);
        parcel.writeString(this.ref);
        parcel.writeParcelable(this.shareHashtag, 0);
    }

    protected ShareContent(Parcel parcel) {
        m.f(parcel, "parcel");
        this.contentUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.peopleIds = readUnmodifiableStringList(parcel);
        this.placeId = parcel.readString();
        this.pageId = parcel.readString();
        this.ref = parcel.readString();
        this.shareHashtag = new ShareHashtag.Builder().readFrom$facebook_common_release(parcel).build();
    }
}
