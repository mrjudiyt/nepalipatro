package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.share.internal.ShareConstants;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* compiled from: Person */
public class p {

    /* renamed from: a  reason: collision with root package name */
    CharSequence f2225a;

    /* renamed from: b  reason: collision with root package name */
    IconCompat f2226b;

    /* renamed from: c  reason: collision with root package name */
    String f2227c;

    /* renamed from: d  reason: collision with root package name */
    String f2228d;

    /* renamed from: e  reason: collision with root package name */
    boolean f2229e;

    /* renamed from: f  reason: collision with root package name */
    boolean f2230f;

    /* compiled from: Person */
    static class a {
        static p a(Person person) {
            return new b().f(person.getName()).c(person.getIcon() != null ? IconCompat.f(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        static Person b(p pVar) {
            return new Person.Builder().setName(pVar.c()).setIcon(pVar.a() != null ? pVar.a().y() : null).setUri(pVar.d()).setKey(pVar.b()).setBot(pVar.e()).setImportant(pVar.f()).build();
        }
    }

    /* compiled from: Person */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        CharSequence f2231a;

        /* renamed from: b  reason: collision with root package name */
        IconCompat f2232b;

        /* renamed from: c  reason: collision with root package name */
        String f2233c;

        /* renamed from: d  reason: collision with root package name */
        String f2234d;

        /* renamed from: e  reason: collision with root package name */
        boolean f2235e;

        /* renamed from: f  reason: collision with root package name */
        boolean f2236f;

        public p a() {
            return new p(this);
        }

        public b b(boolean z10) {
            this.f2235e = z10;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f2232b = iconCompat;
            return this;
        }

        public b d(boolean z10) {
            this.f2236f = z10;
            return this;
        }

        public b e(String str) {
            this.f2234d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f2231a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f2233c = str;
            return this;
        }
    }

    p(b bVar) {
        this.f2225a = bVar.f2231a;
        this.f2226b = bVar.f2232b;
        this.f2227c = bVar.f2233c;
        this.f2228d = bVar.f2234d;
        this.f2229e = bVar.f2235e;
        this.f2230f = bVar.f2236f;
    }

    public IconCompat a() {
        return this.f2226b;
    }

    public String b() {
        return this.f2228d;
    }

    public CharSequence c() {
        return this.f2225a;
    }

    public String d() {
        return this.f2227c;
    }

    public boolean e() {
        return this.f2229e;
    }

    public boolean f() {
        return this.f2230f;
    }

    public String g() {
        String str = this.f2227c;
        if (str != null) {
            return str;
        }
        if (this.f2225a == null) {
            return "";
        }
        return "name:" + this.f2225a;
    }

    public Person h() {
        return a.b(this);
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f2225a);
        IconCompat iconCompat = this.f2226b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.x() : null);
        bundle.putString(ShareConstants.MEDIA_URI, this.f2227c);
        bundle.putString(Constants.KEY, this.f2228d);
        bundle.putBoolean("isBot", this.f2229e);
        bundle.putBoolean("isImportant", this.f2230f);
        return bundle;
    }
}
