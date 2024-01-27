package np.com.nepalipatro.models;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: EventDescriptionModel.kt */
public final class EventDescriptionModel {
    public static final Companion Companion = new Companion((g) null);
    private String blogId;
    private String descriptionEn;
    private String descriptionNe;
    private String gh = "";
    private String im = "";
    private String image;
    private String imageSmall;

    /* compiled from: EventDescriptionModel.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(20:45|44|46|48|49|(0)(0)|53|(0)(0)|57|(0)(0)|61|(0)(0)|65|(0)(0)|69|(0)(0)|73|(0)|76|77) */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0167, code lost:
            return null;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00d6 */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00dc A[Catch:{ Exception -> 0x0167 }] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00e1 A[Catch:{ Exception -> 0x0167 }] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00eb A[Catch:{ Exception -> 0x0167 }] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00f0 A[Catch:{ Exception -> 0x0167 }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00fa A[Catch:{ Exception -> 0x0167 }] */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x00ff A[Catch:{ Exception -> 0x0167 }] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0109 A[Catch:{ Exception -> 0x0167 }] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x010e A[Catch:{ Exception -> 0x0167 }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0118 A[Catch:{ Exception -> 0x0167 }] */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x011d A[Catch:{ Exception -> 0x0167 }] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0127 A[Catch:{ Exception -> 0x0167 }] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x012c A[Catch:{ Exception -> 0x0167 }] */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0136 A[Catch:{ Exception -> 0x0167 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final np.com.nepalipatro.models.EventDescriptionModel eventModelFromJson(org.json.JSONObject r33) {
            /*
                r32 = this;
                r0 = r33
                java.lang.String r1 = "imp"
                java.lang.String r2 = "gov_holiday"
                java.lang.String r3 = "imageSmall"
                java.lang.String r4 = "descNe"
                java.lang.String r5 = "descEn"
                java.lang.String r6 = "jie"
                java.lang.String r7 = "important_event"
                java.lang.String r8 = "jbi"
                java.lang.String r9 = "jis"
                java.lang.String r10 = "image_small"
                java.lang.String r11 = "jiu"
                java.lang.String r12 = "gh"
                java.lang.String r13 = "blog_id"
                java.lang.String r14 = "image"
                java.lang.String r15 = "ne"
                r16 = r6
                java.lang.String r6 = "en"
                java.lang.String r17 = ""
                r18 = r8
                java.lang.String r8 = "json"
                kotlin.jvm.internal.m.f(r0, r8)
                boolean r8 = r0.has(r6)     // Catch:{ Exception -> 0x00ce }
                if (r8 == 0) goto L_0x0038
                java.lang.String r8 = r0.getString(r6)     // Catch:{ Exception -> 0x00ce }
                goto L_0x003a
            L_0x0038:
                r8 = r17
            L_0x003a:
                boolean r19 = r0.has(r15)     // Catch:{ Exception -> 0x00ce }
                if (r19 == 0) goto L_0x0049
                java.lang.String r19 = r0.getString(r15)     // Catch:{ Exception -> 0x00ce }
                r27 = r9
                r9 = r19
                goto L_0x004d
            L_0x0049:
                r27 = r9
                r9 = r17
            L_0x004d:
                boolean r19 = r0.has(r14)     // Catch:{ Exception -> 0x00d0 }
                if (r19 == 0) goto L_0x005c
                java.lang.String r19 = r0.getString(r14)     // Catch:{ Exception -> 0x00d0 }
                r28 = r11
                r11 = r19
                goto L_0x0060
            L_0x005c:
                r28 = r11
                r11 = r17
            L_0x0060:
                boolean r19 = r0.has(r10)     // Catch:{ Exception -> 0x00d2 }
                if (r19 == 0) goto L_0x006b
                java.lang.String r10 = r0.getString(r10)     // Catch:{ Exception -> 0x00d2 }
                goto L_0x006d
            L_0x006b:
                r10 = r17
            L_0x006d:
                boolean r19 = r0.has(r13)     // Catch:{ Exception -> 0x00d2 }
                if (r19 == 0) goto L_0x007c
                java.lang.String r19 = r0.getString(r13)     // Catch:{ Exception -> 0x00d2 }
                r29 = r15
                r15 = r19
                goto L_0x0080
            L_0x007c:
                r29 = r15
                r15 = r17
            L_0x0080:
                boolean r19 = r0.has(r12)     // Catch:{ Exception -> 0x00cb }
                if (r19 == 0) goto L_0x008f
                java.lang.String r19 = r0.getString(r12)     // Catch:{ Exception -> 0x00cb }
                r30 = r12
                r12 = r19
                goto L_0x0093
            L_0x008f:
                r30 = r12
                r12 = r17
            L_0x0093:
                boolean r19 = r0.has(r7)     // Catch:{ Exception -> 0x00d6 }
                if (r19 == 0) goto L_0x009e
                java.lang.String r7 = r0.getString(r7)     // Catch:{ Exception -> 0x00d6 }
                goto L_0x00a0
            L_0x009e:
                r7 = r17
            L_0x00a0:
                np.com.nepalipatro.models.EventDescriptionModel r31 = new np.com.nepalipatro.models.EventDescriptionModel     // Catch:{ Exception -> 0x00d6 }
                kotlin.jvm.internal.m.e(r8, r5)     // Catch:{ Exception -> 0x00d6 }
                kotlin.jvm.internal.m.e(r9, r4)     // Catch:{ Exception -> 0x00d6 }
                kotlin.jvm.internal.m.e(r11, r14)     // Catch:{ Exception -> 0x00d6 }
                kotlin.jvm.internal.m.e(r10, r3)     // Catch:{ Exception -> 0x00d6 }
                kotlin.jvm.internal.m.e(r15, r13)     // Catch:{ Exception -> 0x00d6 }
                kotlin.jvm.internal.m.e(r12, r2)     // Catch:{ Exception -> 0x00d6 }
                kotlin.jvm.internal.m.e(r7, r1)     // Catch:{ Exception -> 0x00d6 }
                r19 = r31
                r20 = r8
                r21 = r9
                r22 = r11
                r23 = r10
                r24 = r15
                r25 = r12
                r26 = r7
                r19.<init>(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x00d6 }
                return r31
            L_0x00cb:
                r30 = r12
                goto L_0x00d6
            L_0x00ce:
                r27 = r9
            L_0x00d0:
                r28 = r11
            L_0x00d2:
                r30 = r12
                r29 = r15
            L_0x00d6:
                boolean r7 = r0.has(r6)     // Catch:{ Exception -> 0x0167 }
                if (r7 == 0) goto L_0x00e1
                java.lang.String r6 = r0.getString(r6)     // Catch:{ Exception -> 0x0167 }
                goto L_0x00e3
            L_0x00e1:
                r6 = r17
            L_0x00e3:
                r7 = r29
                boolean r8 = r0.has(r7)     // Catch:{ Exception -> 0x0167 }
                if (r8 == 0) goto L_0x00f0
                java.lang.String r7 = r0.getString(r7)     // Catch:{ Exception -> 0x0167 }
                goto L_0x00f2
            L_0x00f0:
                r7 = r17
            L_0x00f2:
                r8 = r28
                boolean r9 = r0.has(r8)     // Catch:{ Exception -> 0x0167 }
                if (r9 == 0) goto L_0x00ff
                java.lang.String r8 = r0.getString(r8)     // Catch:{ Exception -> 0x0167 }
                goto L_0x0101
            L_0x00ff:
                r8 = r17
            L_0x0101:
                r9 = r27
                boolean r10 = r0.has(r9)     // Catch:{ Exception -> 0x0167 }
                if (r10 == 0) goto L_0x010e
                java.lang.String r9 = r0.getString(r9)     // Catch:{ Exception -> 0x0167 }
                goto L_0x0110
            L_0x010e:
                r9 = r17
            L_0x0110:
                r10 = r18
                boolean r11 = r0.has(r10)     // Catch:{ Exception -> 0x0167 }
                if (r11 == 0) goto L_0x011d
                java.lang.String r10 = r0.getString(r10)     // Catch:{ Exception -> 0x0167 }
                goto L_0x011f
            L_0x011d:
                r10 = r17
            L_0x011f:
                r11 = r30
                boolean r12 = r0.has(r11)     // Catch:{ Exception -> 0x0167 }
                if (r12 == 0) goto L_0x012c
                java.lang.String r11 = r0.getString(r11)     // Catch:{ Exception -> 0x0167 }
                goto L_0x012e
            L_0x012c:
                r11 = r17
            L_0x012e:
                r12 = r16
                boolean r15 = r0.has(r12)     // Catch:{ Exception -> 0x0167 }
                if (r15 == 0) goto L_0x013a
                java.lang.String r17 = r0.getString(r12)     // Catch:{ Exception -> 0x0167 }
            L_0x013a:
                r0 = r17
                np.com.nepalipatro.models.EventDescriptionModel r12 = new np.com.nepalipatro.models.EventDescriptionModel     // Catch:{ Exception -> 0x0167 }
                kotlin.jvm.internal.m.e(r6, r5)     // Catch:{ Exception -> 0x0167 }
                kotlin.jvm.internal.m.e(r7, r4)     // Catch:{ Exception -> 0x0167 }
                kotlin.jvm.internal.m.e(r8, r14)     // Catch:{ Exception -> 0x0167 }
                kotlin.jvm.internal.m.e(r9, r3)     // Catch:{ Exception -> 0x0167 }
                kotlin.jvm.internal.m.e(r10, r13)     // Catch:{ Exception -> 0x0167 }
                kotlin.jvm.internal.m.e(r11, r2)     // Catch:{ Exception -> 0x0167 }
                kotlin.jvm.internal.m.e(r0, r1)     // Catch:{ Exception -> 0x0167 }
                r19 = r12
                r20 = r6
                r21 = r7
                r22 = r8
                r23 = r9
                r24 = r10
                r25 = r11
                r26 = r0
                r19.<init>(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x0167 }
                return r12
            L_0x0167:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: np.com.nepalipatro.models.EventDescriptionModel.Companion.eventModelFromJson(org.json.JSONObject):np.com.nepalipatro.models.EventDescriptionModel");
        }
    }

    public EventDescriptionModel() {
    }

    public final String getBlogId() {
        return this.blogId;
    }

    public final String getDescriptionEn() {
        return this.descriptionEn;
    }

    public final String getDescriptionNe() {
        return this.descriptionNe;
    }

    public final String getGh() {
        return this.gh;
    }

    public final String getIm() {
        return this.im;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getImageSmall() {
        return this.imageSmall;
    }

    public final void setBlogId(String str) {
        this.blogId = str;
    }

    public final void setDescriptionEn(String str) {
        this.descriptionEn = str;
    }

    public final void setDescriptionNe(String str) {
        this.descriptionNe = str;
    }

    public final void setGh(String str) {
        this.gh = str;
    }

    public final void setIm(String str) {
        this.im = str;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final void setImageSmall(String str) {
        this.imageSmall = str;
    }

    public EventDescriptionModel(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        m.f(str, "descEn");
        m.f(str2, "descNe");
        m.f(str3, "image");
        m.f(str4, "imageSmall");
        m.f(str5, "blogId");
        m.f(str6, "gh");
        m.f(str7, "importantEvent");
        this.descriptionEn = str;
        this.descriptionNe = str2;
        this.image = str3;
        this.imageSmall = str4;
        this.blogId = str5;
        this.gh = str6;
        this.im = str7;
    }
}
