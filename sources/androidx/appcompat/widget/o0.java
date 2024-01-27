package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.appevents.AppEventsConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.sessions.settings.RemoteSettings;
import d0.c;
import f.f;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* compiled from: SuggestionsAdapter */
class o0 extends c implements View.OnClickListener {
    private int A = -1;
    private int B = -1;
    private int C = -1;
    private int D = -1;
    private int E = -1;
    private int F = -1;

    /* renamed from: s  reason: collision with root package name */
    private final SearchView f1186s;

    /* renamed from: t  reason: collision with root package name */
    private final SearchableInfo f1187t;

    /* renamed from: u  reason: collision with root package name */
    private final Context f1188u;

    /* renamed from: v  reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f1189v;

    /* renamed from: w  reason: collision with root package name */
    private final int f1190w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f1191x = false;

    /* renamed from: y  reason: collision with root package name */
    private int f1192y = 1;

    /* renamed from: z  reason: collision with root package name */
    private ColorStateList f1193z;

    /* compiled from: SuggestionsAdapter */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f1194a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f1195b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f1196c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f1197d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f1198e;

        public a(View view) {
            this.f1194a = (TextView) view.findViewById(16908308);
            this.f1195b = (TextView) view.findViewById(16908309);
            this.f1196c = (ImageView) view.findViewById(16908295);
            this.f1197d = (ImageView) view.findViewById(16908296);
            this.f1198e = (ImageView) view.findViewById(f.f8273q);
        }
    }

    public o0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f1186s = searchView;
        this.f1187t = searchableInfo;
        this.f1190w = searchView.getSuggestionCommitIconResId();
        this.f1188u = context;
        this.f1189v = weakHashMap;
    }

    private void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1189v.put(str, drawable.getConstantState());
        }
    }

    private void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable k(String str) {
        Drawable.ConstantState constantState = this.f1189v.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence l(CharSequence charSequence) {
        if (this.f1193z == null) {
            TypedValue typedValue = new TypedValue();
            this.f7879k.getTheme().resolveAttribute(f.a.K, typedValue, true);
            this.f1193z = this.f7879k.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f1193z, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable m(ComponentName componentName) {
        PackageManager packageManager = this.f7879k.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid icon resource ");
            sb.append(iconResource);
            sb.append(" for ");
            sb.append(componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.toString();
            return null;
        }
    }

    private Drawable n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f1189v.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f1189v.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f1188u.getResources());
        }
        Drawable m10 = m(componentName);
        if (m10 != null) {
            constantState = m10.getConstantState();
        }
        this.f1189v.put(flattenToShortString, constantState);
        return m10;
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    private Drawable p() {
        Drawable n10 = n(this.f1187t.getSearchActivity());
        if (n10 != null) {
            return n10;
        }
        return this.f7879k.getPackageManager().getDefaultActivityIcon();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:19|20|21|22|23|24) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|15|16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0050 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0014 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0050=Splitter:B:22:0x0050, B:4:0x000f=Splitter:B:4:0x000f, B:16:0x003f=Splitter:B:16:0x003f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable q(android.net.Uri r5) {
        /*
            r4 = this;
            java.lang.String r0 = "Error closing icon stream for "
            r1 = 0
            java.lang.String r2 = r5.getScheme()     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.String r3 = "android.resource"
            boolean r2 = r3.equals(r2)     // Catch:{ FileNotFoundException -> 0x0073 }
            if (r2 == 0) goto L_0x002b
            android.graphics.drawable.Drawable r5 = r4.r(r5)     // Catch:{ NotFoundException -> 0x0014 }
            return r5
        L_0x0014:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.String r3 = "Resource does not exist: "
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0073 }
            r0.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0073 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0073 }
        L_0x002b:
            android.content.Context r2 = r4.f1188u     // Catch:{ FileNotFoundException -> 0x0073 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0073 }
            java.io.InputStream r2 = r2.openInputStream(r5)     // Catch:{ FileNotFoundException -> 0x0073 }
            if (r2 == 0) goto L_0x005c
            android.graphics.drawable.Drawable r3 = android.graphics.drawable.Drawable.createFromStream(r2, r1)     // Catch:{ all -> 0x004b }
            r2.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x004a
        L_0x003f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r0)     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0073 }
        L_0x004a:
            return r3
        L_0x004b:
            r3 = move-exception
            r2.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x005b
        L_0x0050:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r0)     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0073 }
        L_0x005b:
            throw r3     // Catch:{ FileNotFoundException -> 0x0073 }
        L_0x005c:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.String r3 = "Failed to open "
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0073 }
            r0.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0073 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Icon not found: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = ", "
            r2.append(r5)
            java.lang.String r5 = r0.getMessage()
            r2.append(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0.q(android.net.Uri):android.graphics.drawable.Drawable");
    }

    private Drawable s(String str) {
        if (str == null || str.isEmpty() || AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1188u.getPackageName() + RemoteSettings.FORWARD_SLASH_STRING + parseInt;
            Drawable k10 = k(str2);
            if (k10 != null) {
                return k10;
            }
            Drawable f10 = androidx.core.content.a.f(this.f1188u, parseInt);
            A(str2, f10);
            return f10;
        } catch (NumberFormatException unused) {
            Drawable k11 = k(str);
            if (k11 != null) {
                return k11;
            }
            Drawable q10 = q(Uri.parse(str));
            A(str, q10);
            return q10;
        } catch (Resources.NotFoundException unused2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Icon resource not found: ");
            sb.append(str);
            return null;
        }
    }

    private Drawable t(Cursor cursor) {
        int i10 = this.D;
        if (i10 == -1) {
            return null;
        }
        Drawable s10 = s(cursor.getString(i10));
        if (s10 != null) {
            return s10;
        }
        return p();
    }

    private Drawable u(Cursor cursor) {
        int i10 = this.E;
        if (i10 == -1) {
            return null;
        }
        return s(cursor.getString(i10));
    }

    private static String w(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception unused) {
            return null;
        }
    }

    private void y(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    public void a(Cursor cursor) {
        if (!this.f1191x) {
            try {
                super.a(cursor);
                if (cursor != null) {
                    this.A = cursor.getColumnIndex("suggest_text_1");
                    this.B = cursor.getColumnIndex("suggest_text_2");
                    this.C = cursor.getColumnIndex("suggest_text_2_url");
                    this.D = cursor.getColumnIndex("suggest_icon_1");
                    this.E = cursor.getColumnIndex("suggest_icon_2");
                    this.F = cursor.getColumnIndex("suggest_flags");
                }
            } catch (Exception unused) {
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    public CharSequence c(Cursor cursor) {
        String o10;
        String o11;
        if (cursor == null) {
            return null;
        }
        String o12 = o(cursor, "suggest_intent_query");
        if (o12 != null) {
            return o12;
        }
        if (this.f1187t.shouldRewriteQueryFromData() && (o11 = o(cursor, "suggest_intent_data")) != null) {
            return o11;
        }
        if (!this.f1187t.shouldRewriteQueryFromText() || (o10 = o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return o10;
    }

    public Cursor d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1186s.getVisibility() == 0 && this.f1186s.getWindowVisibility() == 0) {
            try {
                Cursor v10 = v(this.f1187t, charSequence2, 50);
                if (v10 != null) {
                    v10.getCount();
                    return v10;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    public void e(View view, Context context, Cursor cursor) {
        CharSequence charSequence;
        a aVar = (a) view.getTag();
        int i10 = this.F;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f1194a != null) {
            z(aVar.f1194a, w(cursor, this.A));
        }
        if (aVar.f1195b != null) {
            String w10 = w(cursor, this.C);
            if (w10 != null) {
                charSequence = l(w10);
            } else {
                charSequence = w(cursor, this.B);
            }
            if (TextUtils.isEmpty(charSequence)) {
                TextView textView = aVar.f1194a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1194a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1194a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1194a.setMaxLines(1);
                }
            }
            z(aVar.f1195b, charSequence);
        }
        ImageView imageView = aVar.f1196c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.f1197d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i12 = this.f1192y;
        if (i12 == 2 || (i12 == 1 && (i11 & 1) != 0)) {
            aVar.f1198e.setVisibility(0);
            aVar.f1198e.setTag(aVar.f1194a.getText());
            aVar.f1198e.setOnClickListener(this);
            return;
        }
        aVar.f1198e.setVisibility(8);
    }

    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            View g10 = g(this.f7879k, this.f7878j, viewGroup);
            if (g10 != null) {
                ((a) g10.getTag()).f1194a.setText(e10.toString());
            }
            return g10;
        }
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            View h10 = h(this.f7879k, this.f7878j, viewGroup);
            if (h10 != null) {
                ((a) h10.getTag()).f1194a.setText(e10.toString());
            }
            return h10;
        }
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h10 = super.h(context, cursor, viewGroup);
        h10.setTag(new a(h10));
        ((ImageView) h10.findViewById(f.f8273q)).setImageResource(this.f1190w);
        return h10;
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(b());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(b());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1186s.S((CharSequence) tag);
        }
    }

    /* access modifiers changed from: package-private */
    public Drawable r(Uri uri) {
        int i10;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f7879k.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i10 = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i10 = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i10 != 0) {
                        return resourcesForApplication.getDrawable(i10);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* access modifiers changed from: package-private */
    public Cursor v(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f7879k.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    public void x(int i10) {
        this.f1192y = i10;
    }
}
