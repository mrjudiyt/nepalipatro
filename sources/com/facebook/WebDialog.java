package com.facebook;

/* compiled from: WebDialog.kt */
public final class WebDialog {
    public static final WebDialog INSTANCE = new WebDialog();

    private WebDialog() {
    }

    public static final int getWebDialogTheme() {
        return com.facebook.internal.WebDialog.Companion.getWebDialogTheme();
    }

    public static final void setWebDialogTheme(int i10) {
        com.facebook.internal.WebDialog.Companion.setWebDialogTheme(i10);
    }
}
