package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.core.util.h;
import b0.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: TextViewCompat */
public final class i {

    /* compiled from: TextViewCompat */
    static class a {
        static boolean a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        static int b(TextView textView) {
            return textView.getMaxLines();
        }

        static int c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* compiled from: TextViewCompat */
    static class b {
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        static int b(View view) {
            return view.getLayoutDirection();
        }

        static int c(View view) {
            return view.getTextDirection();
        }

        static Locale d(TextView textView) {
            return textView.getTextLocale();
        }

        static void e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        static void f(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        }

        static void g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static void h(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* compiled from: TextViewCompat */
    static class c {
        static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        static void e(TextView textView, int i10) {
            textView.setBreakStrategy(i10);
        }

        static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        static void h(TextView textView, int i10) {
            textView.setHyphenationFrequency(i10);
        }
    }

    /* compiled from: TextViewCompat */
    static class d {
        static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* compiled from: TextViewCompat */
    static class e {
        static CharSequence a(PrecomputedText precomputedText) {
            return precomputedText;
        }

        static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        static PrecomputedText.Params c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        static void d(TextView textView, int i10) {
            textView.setFirstBaselineToTopHeight(i10);
        }
    }

    /* compiled from: TextViewCompat */
    private static class f implements ActionMode.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final ActionMode.Callback f2673a;

        /* renamed from: b  reason: collision with root package name */
        private final TextView f2674b;

        /* renamed from: c  reason: collision with root package name */
        private Class<?> f2675c;

        /* renamed from: d  reason: collision with root package name */
        private Method f2676d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f2677e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f2678f = false;

        f(ActionMode.Callback callback, TextView textView) {
            this.f2673a = callback;
            this.f2674b = textView;
        }

        private Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !d(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        private List<ResolveInfo> c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo next : packageManager.queryIntentActivities(a(), 0)) {
                if (e(next, context)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        private boolean d(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private boolean e(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            if (str == null || context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        }

        private void f(Menu menu) {
            Method method;
            Context context = this.f2674b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f2678f) {
                this.f2678f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f2675c = cls;
                    this.f2676d = cls.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                    this.f2677e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f2675c = null;
                    this.f2676d = null;
                    this.f2677e = false;
                }
            }
            try {
                if (!this.f2677e || !this.f2675c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                } else {
                    method = this.f2676d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List<ResolveInfo> c10 = c(context, packageManager);
                for (int i10 = 0; i10 < c10.size(); i10++) {
                    ResolveInfo resolveInfo = c10.get(i10);
                    menu.add(0, 0, i10 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f2674b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f2673a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f2673a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f2673a.onDestroyActionMode(actionMode);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            f(menu);
            return this.f2673a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static int a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    private static int c(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }

    private static TextDirectionHeuristic d(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z10 = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (b.b(textView) == 1) {
                z10 = true;
            }
            switch (b.c(textView)) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (z10) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(e.b(d.a(b.d(textView)))[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    public static a.C0092a e(TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new a.C0092a(e.c(textView));
        }
        a.C0092a.C0093a aVar = new a.C0092a.C0093a(new TextPaint(textView.getPaint()));
        if (i10 >= 23) {
            aVar.b(c.a(textView));
            aVar.c(c.d(textView));
        }
        if (i10 >= 18) {
            aVar.d(d(textView));
        }
        return aVar.a();
    }

    public static void f(TextView textView, ColorStateList colorStateList) {
        h.b(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            c.f(textView, colorStateList);
        } else if (textView instanceof k) {
            ((k) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void g(TextView textView, PorterDuff.Mode mode) {
        h.b(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            c.g(textView, mode);
        } else if (textView instanceof k) {
            ((k) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void h(TextView textView, int i10) {
        int i11;
        h.a(i10);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            e.d(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (i12 < 16 || a.a(textView)) {
            i11 = fontMetricsInt.top;
        } else {
            i11 = fontMetricsInt.ascent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void i(TextView textView, int i10) {
        int i11;
        h.a(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (Build.VERSION.SDK_INT < 16 || a.a(textView)) {
            i11 = fontMetricsInt.bottom;
        } else {
            i11 = fontMetricsInt.descent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void j(TextView textView, int i10) {
        h.a(i10);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i10 != fontMetricsInt) {
            textView.setLineSpacing((float) (i10 - fontMetricsInt), 1.0f);
        }
    }

    public static void k(TextView textView, b0.a aVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(e.a(aVar.b()));
        } else if (e(textView).a(aVar.a())) {
            textView.setText(aVar);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    public static void l(TextView textView, a.C0092a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 18) {
            b.h(textView, c(aVar.d()));
        }
        if (i10 < 23) {
            float textScaleX = aVar.e().getTextScaleX();
            textView.getPaint().set(aVar.e());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.e());
        c.e(textView, aVar.b());
        c.h(textView, aVar.c());
    }

    public static ActionMode.Callback m(TextView textView, ActionMode.Callback callback) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof f) || callback == null) ? callback : new f(callback, textView);
    }
}
