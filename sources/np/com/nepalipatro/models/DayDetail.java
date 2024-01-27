package np.com.nepalipatro.models;

import s6.a;
import s6.c;

/* compiled from: DayDetailModel.kt */
public final class DayDetail {
    @c("blog_id")
    @a
    private String blogId;
    @c("en")
    @a
    private String en;
    @c("id")
    @a
    private String id;
    @c("img_res")
    @a
    private String imgRes;
    @c("ne")
    @a
    private String ne;
    @c("thumbnail_res")
    @a
    private String thumbnailRes;

    public final String getBlogId() {
        return this.blogId;
    }

    public final String getEn() {
        return this.en;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImgRes() {
        return this.imgRes;
    }

    public final String getNe() {
        return this.ne;
    }

    public final String getThumbnailRes() {
        return this.thumbnailRes;
    }

    public final void setBlogId(String str) {
        this.blogId = str;
    }

    public final void setEn(String str) {
        this.en = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setImgRes(String str) {
        this.imgRes = str;
    }

    public final void setNe(String str) {
        this.ne = str;
    }

    public final void setThumbnailRes(String str) {
        this.thumbnailRes = str;
    }
}
