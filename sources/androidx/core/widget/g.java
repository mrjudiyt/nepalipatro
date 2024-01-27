package androidx.core.widget;

import android.os.Build;
import android.view.View;
import android.widget.ListView;

/* compiled from: ListViewCompat */
public final class g {

    /* compiled from: ListViewCompat */
    static class a {
        static boolean a(ListView listView, int i10) {
            return listView.canScrollList(i10);
        }

        static void b(ListView listView, int i10) {
            listView.scrollListBy(i10);
        }
    }

    public static void a(ListView listView, int i10) {
        View childAt;
        if (Build.VERSION.SDK_INT >= 19) {
            a.b(listView, i10);
            return;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition != -1 && (childAt = listView.getChildAt(0)) != null) {
            listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i10);
        }
    }
}
