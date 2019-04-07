package emil.tizzzeik;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ZaleceniaFragment extends Fragment {

    public ZaleceniaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_zalecenia, container, false);
        String zalecenia = getArguments().getString("zalecenia");
        TextView zaleceniaTV = rootView.findViewById(R.id.zaleceniaTV);
        zaleceniaTV.setText(zalecenia);
        return rootView;
    }
}