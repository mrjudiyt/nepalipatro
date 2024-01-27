package h3;

import com.facebook.appevents.suggestedevents.ViewOnClickListener;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ JSONObject f14789h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f14790i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ViewOnClickListener f14791j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f14792k;

    public /* synthetic */ c(JSONObject jSONObject, String str, ViewOnClickListener viewOnClickListener, String str2) {
        this.f14789h = jSONObject;
        this.f14790i = str;
        this.f14791j = viewOnClickListener;
        this.f14792k = str2;
    }

    public final void run() {
        ViewOnClickListener.m73predictAndProcess$lambda0(this.f14789h, this.f14790i, this.f14791j, this.f14792k);
    }
}
