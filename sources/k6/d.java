package k6;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f15442a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15443b;

    /* renamed from: c  reason: collision with root package name */
    private final a f15444c;

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    public static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f15445a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f15446b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public a f15447c;

        @RecentlyNonNull
        public d a() {
            return new d(this, (h) null);
        }

        @RecentlyNonNull
        public a b(a aVar) {
            this.f15447c = aVar;
            return this;
        }

        @RecentlyNonNull
        public a c(boolean z10) {
            this.f15445a = z10;
            return this;
        }
    }

    /* synthetic */ d(a aVar, h hVar) {
        this.f15442a = aVar.f15445a;
        this.f15443b = aVar.f15446b;
        this.f15444c = aVar.f15447c;
    }

    @RecentlyNullable
    public a a() {
        return this.f15444c;
    }

    public boolean b() {
        return this.f15442a;
    }

    @RecentlyNullable
    public final String c() {
        return this.f15443b;
    }
}
