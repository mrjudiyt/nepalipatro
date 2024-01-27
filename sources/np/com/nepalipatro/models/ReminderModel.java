package np.com.nepalipatro.models;

/* compiled from: ReminderModel.kt */
public final class ReminderModel {
    private Integer days = 0;
    private String eventId = "";
    private String id = "";
    private String note = "";
    private String notificationType = "";
    private String time = "";

    public ReminderModel(String str, String str2, Integer num, String str3, String str4, String str5) {
        this.id = str;
        this.eventId = str2;
        this.days = num;
        this.time = str3;
        this.note = str4;
        this.notificationType = str5;
    }

    public final Integer getDays() {
        return this.days;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNote() {
        return this.note;
    }

    public final String getNotificationType() {
        return this.notificationType;
    }

    public final String getTime() {
        return this.time;
    }

    public final void setDays(Integer num) {
        this.days = num;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setNote(String str) {
        this.note = str;
    }

    public final void setNotificationType(String str) {
        this.notificationType = str;
    }

    public final void setTime(String str) {
        this.time = str;
    }
}
