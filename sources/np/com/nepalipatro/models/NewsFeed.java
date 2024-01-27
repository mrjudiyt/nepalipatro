package np.com.nepalipatro.models;

import java.util.List;
import s6.a;
import s6.c;

/* compiled from: NewsFeed.kt */
public final class NewsFeed {
    @c("feeds")
    @a
    private List<Feed> feeds;
    @c("version")
    @a
    private Integer version;

    /* compiled from: NewsFeed.kt */
    public static final class Feed {
        @c("author")
        @a
        private String author;
        @c("category")
        @a
        private String category;
        @c("content")
        @a
        private String content;
        @c("description")
        @a
        private String description;
        @c("encloser_type")
        @a
        private String encloserType;
        @c("encloser_url")
        @a
        private String encloserUrl;
        @c("fetch_date")
        @a
        private String fetchDate;
        @c("id")
        @a
        private String id;
        @c("image")
        @a
        private String image;
        @c("link")
        @a
        private String link;
        @c("pub_date")
        @a
        private String pubDate;
        @c("related")
        @a
        private List<Related> related;
        @c("source")
        @a
        private String source;
        @c("title")
        @a
        private String title;
        @c("update_date")
        @a
        private String updateDate;
        @c("uuid")
        @a
        private String uuid;

        public final String getAuthor() {
            return this.author;
        }

        public final String getCategory() {
            return this.category;
        }

        public final String getContent() {
            return this.content;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getEncloserType() {
            return this.encloserType;
        }

        public final String getEncloserUrl() {
            return this.encloserUrl;
        }

        public final String getFetchDate() {
            return this.fetchDate;
        }

        public final String getId() {
            return this.id;
        }

        public final String getImage() {
            return this.image;
        }

        public final String getLink() {
            return this.link;
        }

        public final String getPubDate() {
            return this.pubDate;
        }

        public final List<Related> getRelated() {
            return this.related;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getUpdateDate() {
            return this.updateDate;
        }

        public final String getUuid() {
            return this.uuid;
        }

        public final void setAuthor(String str) {
            this.author = str;
        }

        public final void setCategory(String str) {
            this.category = str;
        }

        public final void setContent(String str) {
            this.content = str;
        }

        public final void setDescription(String str) {
            this.description = str;
        }

        public final void setEncloserType(String str) {
            this.encloserType = str;
        }

        public final void setEncloserUrl(String str) {
            this.encloserUrl = str;
        }

        public final void setFetchDate(String str) {
            this.fetchDate = str;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final void setImage(String str) {
            this.image = str;
        }

        public final void setLink(String str) {
            this.link = str;
        }

        public final void setPubDate(String str) {
            this.pubDate = str;
        }

        public final void setRelated(List<Related> list) {
            this.related = list;
        }

        public final void setSource(String str) {
            this.source = str;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public final void setUpdateDate(String str) {
            this.updateDate = str;
        }

        public final void setUuid(String str) {
            this.uuid = str;
        }
    }

    /* compiled from: NewsFeed.kt */
    public static final class Related {
        @c("author")
        @a
        private String author;
        @c("category")
        @a
        private String category;
        @c("content")
        @a
        private String content;
        @c("description")
        @a
        private String description;
        @c("encloser_type")
        @a
        private String encloserType;
        @c("encloser_url")
        @a
        private String encloserUrl;
        @c("fetch_date")
        @a
        private String fetchDate;
        @c("id")
        @a
        private String id;
        @c("image")
        @a
        private String image;
        @c("link")
        @a
        private String link;
        @c("pub_date")
        @a
        private String pubDate;
        @c("source")
        @a
        private String source;
        @c("title")
        @a
        private String title;
        @c("update_date")
        @a
        private String updateDate;
        @c("uuid")
        @a
        private String uuid;

        public final String getAuthor() {
            return this.author;
        }

        public final String getCategory() {
            return this.category;
        }

        public final String getContent() {
            return this.content;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getEncloserType() {
            return this.encloserType;
        }

        public final String getEncloserUrl() {
            return this.encloserUrl;
        }

        public final String getFetchDate() {
            return this.fetchDate;
        }

        public final String getId() {
            return this.id;
        }

        public final String getImage() {
            return this.image;
        }

        public final String getLink() {
            return this.link;
        }

        public final String getPubDate() {
            return this.pubDate;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getUpdateDate() {
            return this.updateDate;
        }

        public final String getUuid() {
            return this.uuid;
        }

        public final void setAuthor(String str) {
            this.author = str;
        }

        public final void setCategory(String str) {
            this.category = str;
        }

        public final void setContent(String str) {
            this.content = str;
        }

        public final void setDescription(String str) {
            this.description = str;
        }

        public final void setEncloserType(String str) {
            this.encloserType = str;
        }

        public final void setEncloserUrl(String str) {
            this.encloserUrl = str;
        }

        public final void setFetchDate(String str) {
            this.fetchDate = str;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final void setImage(String str) {
            this.image = str;
        }

        public final void setLink(String str) {
            this.link = str;
        }

        public final void setPubDate(String str) {
            this.pubDate = str;
        }

        public final void setSource(String str) {
            this.source = str;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public final void setUpdateDate(String str) {
            this.updateDate = str;
        }

        public final void setUuid(String str) {
            this.uuid = str;
        }
    }

    public final List<Feed> getFeeds() {
        return this.feeds;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public final void setFeeds(List<Feed> list) {
        this.feeds = list;
    }

    public final void setVersion(Integer num) {
        this.version = num;
    }
}
