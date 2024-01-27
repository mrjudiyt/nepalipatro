package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* compiled from: ViewParentCompat */
public final class d0 {

    /* compiled from: ViewParentCompat */
    static class a {
        static boolean a(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
            return viewParent.onNestedFling(view, f10, f11, z10);
        }

        static boolean b(ViewParent viewParent, View view, float f10, float f11) {
            return viewParent.onNestedPreFling(view, f10, f11);
        }

        static void c(ViewParent viewParent, View view, int i10, int i11, int[] iArr) {
            viewParent.onNestedPreScroll(view, i10, i11, iArr);
        }

        static void d(ViewParent viewParent, View view, int i10, int i11, int i12, int i13) {
            viewParent.onNestedScroll(view, i10, i11, i12, i13);
        }

        static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.onNestedScrollAccepted(view, view2, i10);
        }

        static boolean f(ViewParent viewParent, View view, View view2, int i10) {
            return viewParent.onStartNestedScroll(view, view2, i10);
        }

        static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return a.a(viewParent, view, f10, f11, z10);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedFling");
                return false;
            }
        } else if (viewParent instanceof r) {
            return ((r) viewParent).onNestedFling(view, f10, f11, z10);
        } else {
            return false;
        }
    }

    public static boolean b(ViewParent viewParent, View view, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return a.b(viewParent, view, f10, f11);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedPreFling");
                return false;
            }
        } else if (viewParent instanceof r) {
            return ((r) viewParent).onNestedPreFling(view, f10, f11);
        } else {
            return false;
        }
    }

    public static void c(ViewParent viewParent, View view, int i10, int i11, int[] iArr, int i12) {
        if (viewParent instanceof p) {
            ((p) viewParent).o(view, i10, i11, iArr, i12);
        } else if (i12 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    a.c(viewParent, view, i10, i11, iArr);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onNestedPreScroll");
                }
            } else if (viewParent instanceof r) {
                ((r) viewParent).onNestedPreScroll(view, i10, i11, iArr);
            }
        }
    }

    public static void d(ViewParent viewParent, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof q) {
            ((q) viewParent2).j(view, i10, i11, i12, i13, i14, iArr);
            return;
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (viewParent2 instanceof p) {
            ((p) viewParent2).k(view, i10, i11, i12, i13, i14);
        } else if (i14 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    a.d(viewParent, view, i10, i11, i12, i13);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onNestedScroll");
                }
            } else if (viewParent2 instanceof r) {
                ((r) viewParent2).onNestedScroll(view, i10, i11, i12, i13);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (viewParent instanceof p) {
            ((p) viewParent).m(view, view2, i10, i11);
        } else if (i11 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    a.e(viewParent, view, view2, i10);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onNestedScrollAccepted");
                }
            } else if (viewParent instanceof r) {
                ((r) viewParent).onNestedScrollAccepted(view, view2, i10);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (viewParent instanceof p) {
            return ((p) viewParent).l(view, view2, i10, i11);
        }
        if (i11 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return a.f(viewParent, view, view2, i10);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onStartNestedScroll");
                return false;
            }
        } else if (viewParent instanceof r) {
            return ((r) viewParent).onStartNestedScroll(view, view2, i10);
        } else {
            return false;
        }
    }

    public static void g(ViewParent viewParent, View view, int i10) {
        if (viewParent instanceof p) {
            ((p) viewParent).n(view, i10);
        } else if (i10 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    a.g(viewParent, view);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onStopNestedScroll");
                }
            } else if (viewParent instanceof r) {
                ((r) viewParent).onStopNestedScroll(view);
            }
        }
    }
}
