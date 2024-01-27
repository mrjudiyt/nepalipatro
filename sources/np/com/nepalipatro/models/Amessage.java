package np.com.nepalipatro.models;

/* compiled from: Amessage.kt */
public final class Amessage {
    private String aflag;
    private Boolean cancelled;
    private String createdt;
    private String dorder;
    private String enable;
    private String expiry;
    private String id;
    private String link;
    private String linktype;
    private String message_en;
    private String message_np;
    private String options;
    private String pin;
    private String stdate;

    public Amessage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool) {
        this.id = str;
        this.message_np = str2;
        this.message_en = str3;
        this.linktype = str4;
        this.link = str5;
        this.stdate = str6;
        this.expiry = str7;
        this.aflag = str8;
        this.pin = str9;
        this.enable = str10;
        this.createdt = str11;
        this.options = str12;
        this.dorder = str13;
        this.cancelled = bool;
    }

    public final String getAflag() {
        return this.aflag;
    }

    public final Boolean getCancelled() {
        return this.cancelled;
    }

    public final String getCreatedt() {
        return this.createdt;
    }

    public final String getDorder() {
        return this.dorder;
    }

    public final String getEnable() {
        return this.enable;
    }

    public final String getExpiry() {
        return this.expiry;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getLinktype() {
        return this.linktype;
    }

    public final String getMessage_en() {
        return this.message_en;
    }

    public final String getMessage_np() {
        return this.message_np;
    }

    public final String getOptions() {
        return this.options;
    }

    public final String getPin() {
        return this.pin;
    }

    public final String getStdate() {
        return this.stdate;
    }

    public final void setAflag(String str) {
        this.aflag = str;
    }

    public final void setCancelled(Boolean bool) {
        this.cancelled = bool;
    }

    public final void setCreatedt(String str) {
        this.createdt = str;
    }

    public final void setDorder(String str) {
        this.dorder = str;
    }

    public final void setEnable(String str) {
        this.enable = str;
    }

    public final void setExpiry(String str) {
        this.expiry = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setLink(String str) {
        this.link = str;
    }

    public final void setLinktype(String str) {
        this.linktype = str;
    }

    public final void setMessage_en(String str) {
        this.message_en = str;
    }

    public final void setMessage_np(String str) {
        this.message_np = str;
    }

    public final void setOptions(String str) {
        this.options = str;
    }

    public final void setPin(String str) {
        this.pin = str;
    }

    public final void setStdate(String str) {
        this.stdate = str;
    }
}
