package np.com.nepalipatro.models;

import java.util.List;
import s6.a;
import s6.c;

/* compiled from: DayDetailModel.kt */
public final class DayDetailModel {
    @c("date")
    @a
    private String date;
    @c("day_detail")
    @a
    private List<DayDetail> dayDetail;
    @c("events")
    @a
    private List<Event> events;
    @c("tithi")
    @a
    private Tithi tithi;

    public final String getDate() {
        return this.date;
    }

    public final List<DayDetail> getDayDetail() {
        return this.dayDetail;
    }

    public final List<Event> getEvents() {
        return this.events;
    }

    public final Tithi getTithi() {
        return this.tithi;
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final void setDayDetail(List<DayDetail> list) {
        this.dayDetail = list;
    }

    public final void setEvents(List<Event> list) {
        this.events = list;
    }

    public final void setTithi(Tithi tithi2) {
        this.tithi = tithi2;
    }
}
