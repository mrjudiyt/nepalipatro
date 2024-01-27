package k8;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.sessions.settings.RemoteSettings;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import o8.g;

/* compiled from: Share.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f15468a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f15469b;

    /* renamed from: c  reason: collision with root package name */
    private final dev.fluttercommunity.plus.share.a f15470c;

    /* renamed from: d  reason: collision with root package name */
    private final g f15471d = i.a(new C0258b(this));

    /* renamed from: e  reason: collision with root package name */
    private final g f15472e = i.a(a.f15473h);

    /* compiled from: Share.kt */
    static final class a extends n implements y8.a<Integer> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f15473h = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT >= 23 ? 33554432 : 0);
        }
    }

    /* renamed from: k8.b$b  reason: collision with other inner class name */
    /* compiled from: Share.kt */
    static final class C0258b extends n implements y8.a<String> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f15474h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0258b(b bVar) {
            super(0);
            this.f15474h = bVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return this.f15474h.e().getPackageName() + ".flutter.share_provider";
        }
    }

    public b(Context context, Activity activity, dev.fluttercommunity.plus.share.a aVar) {
        m.f(context, "context");
        m.f(aVar, "manager");
        this.f15468a = context;
        this.f15469b = activity;
        this.f15470c = aVar;
    }

    private final void b() {
        File i10 = i();
        File[] listFiles = i10.listFiles();
        if (i10.exists()) {
            boolean z10 = true;
            if (listFiles != null) {
                if (!(listFiles.length == 0)) {
                    z10 = false;
                }
            }
            if (!z10) {
                m.e(listFiles, "files");
                for (File delete : listFiles) {
                    delete.delete();
                }
                i10.delete();
            }
        }
    }

    private final File c(File file) {
        File i10 = i();
        if (!i10.exists()) {
            i10.mkdirs();
        }
        File file2 = new File(i10, file.getName());
        File unused = j.f(file, file2, true, 0, 4, (Object) null);
        return file2;
    }

    private final boolean d(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            m.e(canonicalPath, "filePath");
            String canonicalPath2 = i().getCanonicalPath();
            m.e(canonicalPath2, "shareCacheFolder.canonicalPath");
            return p.v(canonicalPath, canonicalPath2, false, 2, (Object) null);
        } catch (IOException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public final Context e() {
        Activity activity = this.f15469b;
        if (activity == null) {
            return this.f15468a;
        }
        m.c(activity);
        return activity;
    }

    private final int f() {
        return ((Number) this.f15472e.getValue()).intValue();
    }

    private final String g(String str) {
        if (str == null || !q.y(str, RemoteSettings.FORWARD_SLASH_STRING, false, 2, (Object) null)) {
            return "*";
        }
        String substring = str.substring(0, q.H(str, RemoteSettings.FORWARD_SLASH_STRING, 0, false, 6, (Object) null));
        m.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    private final String h() {
        return (String) this.f15471d.getValue();
    }

    private final File i() {
        return new File(e().getCacheDir(), "share_plus");
    }

    private final ArrayList<Uri> j(List<String> list) {
        ArrayList<Uri> arrayList = new ArrayList<>(list.size());
        for (String file : list) {
            File file2 = new File(file);
            if (!d(file2)) {
                arrayList.add(androidx.core.content.b.g(e(), h(), c(file2)));
            } else {
                throw new IOException("Shared file can not be located in '" + i().getCanonicalPath() + '\'');
            }
        }
        return arrayList;
    }

    private final String k(List<String> list) {
        int i10 = 1;
        if (list != null ? list.isEmpty() : true) {
            return "*/*";
        }
        m.c(list);
        if (list.size() == 1) {
            return (String) x.x(list);
        }
        String str = (String) x.x(list);
        int f10 = p.f(list);
        if (1 <= f10) {
            while (true) {
                if (!m.a(str, list.get(i10))) {
                    if (!m.a(g(str), g(list.get(i10)))) {
                        return "*/*";
                    }
                    str = g(list.get(i10)) + "/*";
                }
                if (i10 == f10) {
                    break;
                }
                i10++;
            }
        }
        return str;
    }

    private final void o(Intent intent, boolean z10) {
        Activity activity = this.f15469b;
        if (activity == null) {
            intent.addFlags(268435456);
            if (z10) {
                this.f15470c.c();
            }
            this.f15468a.startActivity(intent);
        } else if (z10) {
            m.c(activity);
            activity.startActivityForResult(intent, 22643);
        } else {
            m.c(activity);
            activity.startActivity(intent);
        }
    }

    public final void l(Activity activity) {
        this.f15469b = activity;
    }

    public final void m(String str, String str2, boolean z10) {
        Intent intent;
        m.f(str, ViewHierarchyConstants.TEXT_KEY);
        Intent intent2 = new Intent();
        intent2.setAction("android.intent.action.SEND");
        intent2.setType("text/plain");
        intent2.putExtra("android.intent.extra.TEXT", str);
        intent2.putExtra("android.intent.extra.SUBJECT", str2);
        if (z10) {
            intent = Intent.createChooser(intent2, (CharSequence) null, PendingIntent.getBroadcast(this.f15468a, 0, new Intent(this.f15468a, SharePlusPendingIntent.class), 134217728 | f()).getIntentSender());
        } else {
            intent = Intent.createChooser(intent2, (CharSequence) null);
        }
        m.e(intent, "chooserIntent");
        o(intent, z10);
    }

    public final void n(List<String> list, List<String> list2, String str, String str2, boolean z10) {
        Intent intent;
        m.f(list, "paths");
        b();
        ArrayList<Uri> j10 = j(list);
        Intent intent2 = new Intent();
        if (j10.isEmpty()) {
            if (!(str == null || p.o(str))) {
                m(str, str2, z10);
                return;
            }
        }
        if (j10.size() == 1) {
            String str3 = !(list2 == null || list2.isEmpty()) ? (String) x.x(list2) : "*/*";
            intent2.setAction("android.intent.action.SEND");
            intent2.setType(str3);
            intent2.putExtra("android.intent.extra.STREAM", (Parcelable) x.x(j10));
        } else {
            intent2.setAction("android.intent.action.SEND_MULTIPLE");
            intent2.setType(k(list2));
            intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", j10);
        }
        if (str != null) {
            intent2.putExtra("android.intent.extra.TEXT", str);
        }
        if (str2 != null) {
            intent2.putExtra("android.intent.extra.SUBJECT", str2);
        }
        intent2.addFlags(1);
        if (z10) {
            intent = Intent.createChooser(intent2, (CharSequence) null, PendingIntent.getBroadcast(this.f15468a, 0, new Intent(this.f15468a, SharePlusPendingIntent.class), 134217728 | f()).getIntentSender());
        } else {
            intent = Intent.createChooser(intent2, (CharSequence) null);
        }
        List<ResolveInfo> queryIntentActivities = e().getPackageManager().queryIntentActivities(intent, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        m.e(queryIntentActivities, "getContext().packageMana…CH_DEFAULT_ONLY\n        )");
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            String str4 = resolveInfo.activityInfo.packageName;
            for (Uri grantUriPermission : j10) {
                e().grantUriPermission(str4, grantUriPermission, 3);
            }
        }
        m.e(intent, "chooserIntent");
        o(intent, z10);
    }
}
