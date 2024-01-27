package np.com.nepalipatro.models;

import kotlin.jvm.internal.m;

/* compiled from: EventModel.kt */
public final class EventModel {
    private String calendar_id;
    private String description;
    private String id;
    private Integer im;
    private String rRule;
    private String recurringEndDate;
    private String reminderid;
    private String startDate;
    private String title;
    private EventType type;

    /* compiled from: EventModel.kt */
    public enum EventType {
        Event,
        Reminder
    }

    public EventModel(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, EventType eventType, String str8) {
        m.f(eventType, "eventType");
        m.f(str8, "reminderId");
        this.id = str;
        this.title = str2;
        this.startDate = str3;
        this.description = str4;
        this.calendar_id = str5;
        this.im = num;
        this.rRule = str6;
        this.recurringEndDate = str7;
        this.type = eventType;
        this.reminderid = str8;
    }

    public final String getCalendar_id() {
        return this.calendar_id;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getIm() {
        return this.im;
    }

    public final String getRRule() {
        return this.rRule;
    }

    public final String getRecurringEndDate() {
        return this.recurringEndDate;
    }

    public final String getReminderid() {
        return this.reminderid;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final String getTitle() {
        return this.title;
    }

    public final EventType getType() {
        return this.type;
    }

    public final void setCalendar_id(String str) {
        this.calendar_id = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setIm(Integer num) {
        this.im = num;
    }

    public final void setRRule(String str) {
        this.rRule = str;
    }

    public final void setRecurringEndDate(String str) {
        this.recurringEndDate = str;
    }

    public final void setReminderid(String str) {
        this.reminderid = str;
    }

    public final void setStartDate(String str) {
        this.startDate = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(EventType eventType) {
        this.type = eventType;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EventModel(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Integer r19, java.lang.String r20, java.lang.String r21, np.com.nepalipatro.models.EventModel.EventType r22, java.lang.String r23, int r24, kotlin.jvm.internal.g r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x000a
            np.com.nepalipatro.models.EventModel$EventType r1 = np.com.nepalipatro.models.EventModel.EventType.Event
            r11 = r1
            goto L_0x000c
        L_0x000a:
            r11 = r22
        L_0x000c:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = ""
            r12 = r0
            goto L_0x0016
        L_0x0014:
            r12 = r23
        L_0x0016:
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: np.com.nepalipatro.models.EventModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, np.com.nepalipatro.models.EventModel$EventType, java.lang.String, int, kotlin.jvm.internal.g):void");
    }
}
