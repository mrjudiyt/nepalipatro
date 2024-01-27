package w9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.m;

/* compiled from: IntentActions.kt */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17059a = new a((kotlin.jvm.internal.g) null);

    /* compiled from: IntentActions.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a(String str, Context context) {
            m.f(str, "link");
            m.f(context, "mContext");
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                intent.addFlags(268435456);
                context.startActivity(intent);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
