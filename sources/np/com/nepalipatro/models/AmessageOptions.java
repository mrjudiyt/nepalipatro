package np.com.nepalipatro.models;

import kotlin.jvm.internal.m;

/* compiled from: AmessageOptions.kt */
public final class AmessageOptions {
    private LocaleText footer_action_text;
    private String image;
    private LocaleText subtitle;
    private String thumbnail;
    private LocaleText title;

    /* compiled from: AmessageOptions.kt */
    public static final class LocaleText {
        private String en;

        /* renamed from: np  reason: collision with root package name */
        private String f16130np;

        public LocaleText(String str, String str2) {
            m.f(str, "en");
            m.f(str2, "np");
            this.en = str;
            this.f16130np = str2;
        }

        public final String getEn() {
            return this.en;
        }

        public final String getNp() {
            return this.f16130np;
        }

        public final void setEn(String str) {
            m.f(str, "<set-?>");
            this.en = str;
        }

        public final void setNp(String str) {
            m.f(str, "<set-?>");
            this.f16130np = str;
        }
    }

    public AmessageOptions(LocaleText localeText, LocaleText localeText2, LocaleText localeText3, String str, String str2) {
        this.title = localeText;
        this.subtitle = localeText2;
        this.footer_action_text = localeText3;
        this.image = str;
        this.thumbnail = str2;
    }

    public final LocaleText getFooter_action_text() {
        return this.footer_action_text;
    }

    public final String getImage() {
        return this.image;
    }

    public final LocaleText getSubtitle() {
        return this.subtitle;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final LocaleText getTitle() {
        return this.title;
    }

    public final void setFooter_action_text(LocaleText localeText) {
        this.footer_action_text = localeText;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final void setSubtitle(LocaleText localeText) {
        this.subtitle = localeText;
    }

    public final void setThumbnail(String str) {
        this.thumbnail = str;
    }

    public final void setTitle(LocaleText localeText) {
        this.title = localeText;
    }
}
