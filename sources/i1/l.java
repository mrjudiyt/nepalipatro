package i1;

import android.view.ViewGroup;

/* compiled from: Scene */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f9166a;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f9167b;

    public static l b(ViewGroup viewGroup) {
        return (l) viewGroup.getTag(j.transition_current_scene);
    }

    static void c(ViewGroup viewGroup, l lVar) {
        viewGroup.setTag(j.transition_current_scene, lVar);
    }

    public void a() {
        Runnable runnable;
        if (b(this.f9166a) == this && (runnable = this.f9167b) != null) {
            runnable.run();
        }
    }
}
