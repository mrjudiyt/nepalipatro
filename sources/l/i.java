package l;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* compiled from: WindowCallbackWrapper */
public class i implements Window.Callback {

    /* renamed from: h  reason: collision with root package name */
    final Window.Callback f9798h;

    public i(Window.Callback callback) {
        if (callback != null) {
            this.f9798h = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final Window.Callback a() {
        return this.f9798h;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f9798h.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f9798h.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f9798h.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f9798h.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f9798h.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f9798h.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f9798h.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f9798h.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f9798h.onAttachedToWindow();
    }

    public boolean onCreatePanelMenu(int i10, Menu menu) {
        return this.f9798h.onCreatePanelMenu(i10, menu);
    }

    public View onCreatePanelView(int i10) {
        return this.f9798h.onCreatePanelView(i10);
    }

    public void onDetachedFromWindow() {
        this.f9798h.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f9798h.onMenuItemSelected(i10, menuItem);
    }

    public boolean onMenuOpened(int i10, Menu menu) {
        return this.f9798h.onMenuOpened(i10, menu);
    }

    public void onPanelClosed(int i10, Menu menu) {
        this.f9798h.onPanelClosed(i10, menu);
    }

    public void onPointerCaptureChanged(boolean z10) {
        this.f9798h.onPointerCaptureChanged(z10);
    }

    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return this.f9798h.onPreparePanel(i10, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
        this.f9798h.onProvideKeyboardShortcuts(list, menu, i10);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f9798h.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f9798h.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z10) {
        this.f9798h.onWindowFocusChanged(z10);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f9798h.onWindowStartingActionMode(callback);
    }

    public boolean onSearchRequested() {
        return this.f9798h.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return this.f9798h.onWindowStartingActionMode(callback, i10);
    }
}
