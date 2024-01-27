package np.com.nepalipatro.models;

import kotlin.jvm.internal.m;
import s6.c;

/* compiled from: EventExceptionModel.kt */
public final class EventExceptionModel {
    @c("created_at")
    private final String created_at;
    @c("event_id")
    private final String event_id;
    @c("ex_date")
    private final String ex_date;
    @c("id")
    private final int id;
    @c("new_date")
    private final String new_date;
    @c("updated_at")
    private final String updated_at;

    public EventExceptionModel(int i10, String str, String str2, String str3, String str4, String str5) {
        m.f(str, "event_id");
        m.f(str2, "ex_date");
        m.f(str3, "new_date");
        m.f(str4, "created_at");
        m.f(str5, "updated_at");
        this.id = i10;
        this.event_id = str;
        this.ex_date = str2;
        this.new_date = str3;
        this.created_at = str4;
        this.updated_at = str5;
    }

    public static /* synthetic */ EventExceptionModel copy$default(EventExceptionModel eventExceptionModel, int i10, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = eventExceptionModel.id;
        }
        if ((i11 & 2) != 0) {
            str = eventExceptionModel.event_id;
        }
        String str6 = str;
        if ((i11 & 4) != 0) {
            str2 = eventExceptionModel.ex_date;
        }
        String str7 = str2;
        if ((i11 & 8) != 0) {
            str3 = eventExceptionModel.new_date;
        }
        String str8 = str3;
        if ((i11 & 16) != 0) {
            str4 = eventExceptionModel.created_at;
        }
        String str9 = str4;
        if ((i11 & 32) != 0) {
            str5 = eventExceptionModel.updated_at;
        }
        return eventExceptionModel.copy(i10, str6, str7, str8, str9, str5);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.event_id;
    }

    public final String component3() {
        return this.ex_date;
    }

    public final String component4() {
        return this.new_date;
    }

    public final String component5() {
        return this.created_at;
    }

    public final String component6() {
        return this.updated_at;
    }

    public final EventExceptionModel copy(int i10, String str, String str2, String str3, String str4, String str5) {
        m.f(str, "event_id");
        m.f(str2, "ex_date");
        m.f(str3, "new_date");
        m.f(str4, "created_at");
        m.f(str5, "updated_at");
        return new EventExceptionModel(i10, str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventExceptionModel)) {
            return false;
        }
        EventExceptionModel eventExceptionModel = (EventExceptionModel) obj;
        return this.id == eventExceptionModel.id && m.a(this.event_id, eventExceptionModel.event_id) && m.a(this.ex_date, eventExceptionModel.ex_date) && m.a(this.new_date, eventExceptionModel.new_date) && m.a(this.created_at, eventExceptionModel.created_at) && m.a(this.updated_at, eventExceptionModel.updated_at);
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final String getEvent_id() {
        return this.event_id;
    }

    public final String getEx_date() {
        return this.ex_date;
    }

    public final int getId() {
        return this.id;
    }

    public final String getNew_date() {
        return this.new_date;
    }

    public final String getUpdated_at() {
        return this.updated_at;
    }

    public int hashCode() {
        return (((((((((this.id * 31) + this.event_id.hashCode()) * 31) + this.ex_date.hashCode()) * 31) + this.new_date.hashCode()) * 31) + this.created_at.hashCode()) * 31) + this.updated_at.hashCode();
    }

    public String toString() {
        return "EventExceptionModel(id=" + this.id + ", event_id=" + this.event_id + ", ex_date=" + this.ex_date + ", new_date=" + this.new_date + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ')';
    }
}
