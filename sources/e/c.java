package e;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: ActivityResultContracts.kt */
public final class c extends a<Intent, androidx.activity.result.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7969a = new a((g) null);

    /* compiled from: ActivityResultContracts.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public androidx.activity.result.a parseResult(int i10, Intent intent) {
        return new androidx.activity.result.a(i10, intent);
    }

    public Intent createIntent(Context context, Intent intent) {
        m.f(context, "context");
        m.f(intent, "input");
        return intent;
    }
}
