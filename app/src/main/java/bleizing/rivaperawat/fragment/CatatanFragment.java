package bleizing.rivaperawat.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bleizing.rivaperawat.R;
import bleizing.rivaperawat.activity.DetailOrderActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class CatatanFragment extends Fragment {


    public CatatanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_catatan, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        ((DetailOrderActivity) getActivity()).setActionBarTitle("ROSY");
    }
}
