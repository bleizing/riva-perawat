package bleizing.rivaperawat.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bleizing.rivaperawat.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SiagaFragment extends Fragment {


    public SiagaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_siaga, container, false);
    }

}
