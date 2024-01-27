package k6;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.zzcn;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f15432a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15433b;

    /* renamed from: k6.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    public static class C0256a {

        /* renamed from: a  reason: collision with root package name */
        private final List f15434a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final Context f15435b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f15436c = 0;

        /* renamed from: d  reason: collision with root package name */
        private boolean f15437d;

        public C0256a(@RecentlyNonNull Context context) {
            this.f15435b = context.getApplicationContext();
        }

        @RecentlyNonNull
        public C0256a a(@RecentlyNonNull String str) {
            this.f15434a.add(str);
            return this;
        }

        @RecentlyNonNull
        public a b() {
            Context context = this.f15435b;
            List list = this.f15434a;
            boolean z10 = true;
            if (!zzcn.zzb() && !list.contains(zzcn.zza(context)) && !this.f15437d) {
                z10 = false;
            }
            return new a(z10, this, (g) null);
        }

        @RecentlyNonNull
        public C0256a c(int i10) {
            this.f15436c = i10;
            return this;
        }
    }

    /* synthetic */ a(boolean z10, C0256a aVar, g gVar) {
        this.f15432a = z10;
        this.f15433b = aVar.f15436c;
    }

    public int a() {
        return this.f15433b;
    }

    public boolean b() {
        return this.f15432a;
    }
}
