package io.flutter.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.window.layout.v;
import androidx.window.layout.w;
import l8.a;
import l8.b;

public final class ViewUtils {

    public interface DisplayUpdater {
        void updateDisplayMetrics(float f10, float f11, float f12);
    }

    public interface ViewVisitor {
        boolean run(View view);
    }

    public static void calculateMaximumDisplayMetrics(Context context, DisplayUpdater displayUpdater) {
        Activity activity = getActivity(context);
        if (activity != null) {
            v a10 = w.a().a(activity);
            displayUpdater.updateDisplayMetrics((float) a10.a().width(), (float) a10.a().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static boolean childHasFocus(View view) {
        return traverseHierarchy(view, b.f15645a);
    }

    public static int generateViewId(int i10) {
        return Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : i10;
    }

    public static Activity getActivity(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return getActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean hasChildViewOfType(View view, Class<? extends View>[] clsArr) {
        return traverseHierarchy(view, new a(clsArr));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$hasChildViewOfType$1(Class[] clsArr, View view) {
        for (Class isInstance : clsArr) {
            if (isInstance.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    public static boolean traverseHierarchy(View view, ViewVisitor viewVisitor) {
        if (view == null) {
            return false;
        }
        if (viewVisitor.run(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (traverseHierarchy(viewGroup.getChildAt(i10), viewVisitor)) {
                    return true;
                }
            }
        }
        return false;
    }
}
