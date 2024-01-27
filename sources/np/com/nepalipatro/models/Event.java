package np.com.nepalipatro.models;

import s6.a;
import s6.c;

/* compiled from: DayDetailModel.kt */
public final class Event {
    @c("event_id")
    @a
    private String eventId;
    @c("reminder_id")
    @a
    private String reminderId;
    @c("start_date")
    @a
    private String startDate;

    public final String getEventId() {
        return this.eventId;
    }

    public final String getReminderId() {
        return this.reminderId;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final void setReminderId(String str) {
        this.reminderId = str;
    }

    public final void setStartDate(String str) {
        this.startDate = str;
    }
}
