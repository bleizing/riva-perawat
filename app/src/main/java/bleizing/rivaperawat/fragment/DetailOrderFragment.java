package bleizing.rivaperawat.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import bleizing.rivaperawat.R;
import bleizing.rivaperawat.activity.DetailOrderActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailOrderFragment extends Fragment {


    public DetailOrderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_order, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ((DetailOrderActivity) getActivity()).setActionBarTitle("DETAIL ORDER");

        ImageView img_1 = (ImageView) getActivity().findViewById(R.id.img_1);
        img_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((DetailOrderActivity) getActivity()).changeToNavigasiFragment();
            }
        });

        ImageView img_2 = (ImageView) getActivity().findViewById(R.id.img_2);
        img_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((DetailOrderActivity) getActivity()).changeToTimerFragment();
            }
        });

        ImageView img_3 = (ImageView) getActivity().findViewById(R.id.img_3);
        img_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((DetailOrderActivity) getActivity()).changeToCatatanFragment();
            }
        });

        ImageView img_4 = (ImageView) getActivity().findViewById(R.id.img_4);
        img_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((DetailOrderActivity) getActivity()).changeToPerawatanFragment();
            }
        });
    }
}
