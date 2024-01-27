package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.h;

/* compiled from: AppCompatTextClassifierHelper */
final class v {

    /* renamed from: a  reason: collision with root package name */
    private TextView f1259a;

    /* renamed from: b  reason: collision with root package name */
    private TextClassifier f1260b;

    v(TextView textView) {
        this.f1259a = (TextView) h.b(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f1260b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1259a.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }

    public void b(TextClassifier textClassifier) {
        this.f1260b = textClassifier;
    }
}
