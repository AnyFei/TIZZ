package emil.tizzzeik;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PrzeciwwskazaniaFragment extends Fragment {

    public PrzeciwwskazaniaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_przeciwwskazania, container, false);
        String przeciwwskazania = getArguments().getString("przeciwwskazania");
        TextView przeciwwskazaniaTV = rootView.findViewById(R.id.przeciwwskazaniaTV);
        przeciwwskazaniaTV.setText(przeciwwskazania);
        return rootView;
    }
}