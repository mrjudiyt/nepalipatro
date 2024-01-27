package np.com.nepalipatro.models;

import java.util.List;
import s6.a;
import s6.c;

/* compiled from: SearchResponseModel.kt */
public final class SearchResponseModel {
    @c("hits")
    @a
    private Hits hits;
    @c("_shards")
    @a
    private Shards shards;
    @c("timed_out")
    @a
    private Boolean timedOut;
    @c("took")
    @a
    private Integer took;

    /* compiled from: SearchResponseModel.kt */
    public static final class Highlight {
        @c("title")
        @a
        private List<String> title;

        public final List<String> getTitle() {
            return this.title;
        }

        public final void setTitle(List<String> list) {
            this.title = list;
        }
    }

    /* compiled from: SearchResponseModel.kt */
    public static final class Hit {
        @c("highlight")
        @a
        private Highlight highlight;
        @c("_id")
        @a
        private String id;
        @c("_index")
        @a
        private String index;
        @c("_score")
        @a
        private double score;
        @c("_source")
        @a
        private Source source;
        @c("_type")
        @a
        private String type;

        public final Highlight getHighlight() {
            return this.highlight;
        }

        public final String getId() {
            return this.id;
        }

        public final String getIndex() {
            return this.index;
        }

        public final double getScore() {
            return this.score;
        }

        public final Source getSource() {
            return this.source;
        }

        public final String getType() {
            return this.type;
        }

        public final void setHighlight(Highlight highlight2) {
            this.highlight = highlight2;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final void setIndex(String str) {
            this.index = str;
        }

        public final void setScore(double d10) {
            this.score = d10;
        }

        public final void setSource(Source source2) {
            this.source = source2;
        }

        public final void setType(String str) {
            this.type = str;
        }
    }

    /* compiled from: SearchResponseModel.kt */
    public static final class Hits {
        @c("hits")
        @a
        private List<Hit> hits;
        @c("max_score")
        @a
        private Integer maxScore;
        @c("total")
        @a
        private Integer total;

        public final List<Hit> getHits() {
            return this.hits;
        }

        public final Integer getMaxScore() {
            return this.maxScore;
        }

        public final Integer getTotal() {
            return this.total;
        }

        public final void setHits(List<Hit> list) {
            this.hits = list;
        }

        public final void setMaxScore(Integer num) {
            this.maxScore = num;
        }

        public final void setTotal(Integer num) {
            this.total = num;
        }
    }

    /* compiled from: SearchResponseModel.kt */
    public static final class Shards {
        @c("failed")
        @a
        private Integer failed;
        @c("skipped")
        @a
        private Integer skipped;
        @c("successful")
        @a
        private Integer successful;
        @c("total")
        @a
        private Integer total;

        public final Integer getFailed() {
            return this.failed;
        }

        public final Integer getSkipped() {
            return this.skipped;
        }

        public final Integer getSuccessful() {
            return this.successful;
        }

        public final Integer getTotal() {
            return this.total;
        }

        public final void setFailed(Integer num) {
            this.failed = num;
        }

        public final void setSkipped(Integer num) {
            this.skipped = num;
        }

        public final void setSuccessful(Integer num) {
            this.successful = num;
        }

        public final void setTotal(Integer num) {
            this.total = num;
        }
    }

    /* compiled from: SearchResponseModel.kt */
    public static final class Source {
        @c("author")
        @a
        private String author;
        @c("category")
        @a
        private String category;
        @c("description")
        @a
        private String description;
        @c("encloser_type")
        @a
        private String encloserType;
        @c("encloser_url")
        @a
        private String encloserUrl;
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

        public final String getDescription() {
            return this.description;
        }

        public final String getEncloserType() {
            return this.encloserType;
        }

        public final String getEncloserUrl() {
            return this.encloserUrl;
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

        public final void setDescription(String str) {
            this.description = str;
        }

        public final void setEncloserType(String str) {
            this.encloserType = str;
        }

        public final void setEncloserUrl(String str) {
            this.encloserUrl = str;
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

    public final Hits getHits() {
        return this.hits;
    }

    public final Shards getShards() {
        return this.shards;
    }

    public final Boolean getTimedOut() {
        return this.timedOut;
    }

    public final Integer getTook() {
        return this.took;
    }

    public final void setHits(Hits hits2) {
        this.hits = hits2;
    }

    public final void setShards(Shards shards2) {
        this.shards = shards2;
    }

    public final void setTimedOut(Boolean bool) {
        this.timedOut = bool;
    }

    public final void setTook(Integer num) {
        this.took = num;
    }
}
