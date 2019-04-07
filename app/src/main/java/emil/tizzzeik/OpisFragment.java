package emil.tizzzeik;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class OpisFragment extends Fragment {

    public OpisFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_opis, container, false);
        String opis = getArguments().getString("opis");
        TextView opisTV = rootView.findViewById(R.id.opisTV);
        opisTV.setText(opis);
        return rootView;
    }
}