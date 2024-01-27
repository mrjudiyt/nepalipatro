package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import t0.c;

public class DropDownPreference extends ListPreference {
    private final Context Z;

    /* renamed from: a0  reason: collision with root package name */
    private final ArrayAdapter f3866a0;

    /* renamed from: b0  reason: collision with root package name */
    private Spinner f3867b0;

    /* renamed from: c0  reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f3868c0;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (i10 >= 0) {
                String charSequence = DropDownPreference.this.N()[i10].toString();
                if (!charSequence.equals(DropDownPreference.this.O()) && DropDownPreference.this.a(charSequence)) {
                    DropDownPreference.this.Q(charSequence);
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.dropdownPreferenceStyle);
    }

    private void S() {
        this.f3866a0.clear();
        if (L() != null) {
            for (CharSequence charSequence : L()) {
                this.f3866a0.add(charSequence.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public ArrayAdapter R() {
        return new ArrayAdapter(this.Z, 17367049);
    }

    /* access modifiers changed from: protected */
    public void w() {
        super.w();
        ArrayAdapter arrayAdapter = this.f3866a0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    public void y() {
        this.f3867b0.performClick();
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f3868c0 = new a();
        this.Z = context;
        this.f3866a0 = R();
        S();
    }
}
