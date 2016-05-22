package tipshemat.barakiha.com.tipshemat;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Hanas Subakti on 5/22/2016.
 */
public class PlaceHolderFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    ImageView img;

    int[] bgs = new int[]{R.drawable.ic_flight_24dp, R.drawable.ic_mail_24dp, R.drawable.ic_explore_24dp};

    public PlaceHolderFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PlaceHolderFragment newInstance(int sectionNumber) {
        PlaceHolderFragment fragment = new PlaceHolderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_pager, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        TextView textviewPenjelasan=(TextView) rootView.findViewById(R.id.section_penjelasan);
        textView.setText("olala "+getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
        String[] penjelasan = getResources().getStringArray(R.array.penjelasan);
        textviewPenjelasan.setText(penjelasan[getArguments().getInt(ARG_SECTION_NUMBER)-1]);

        img = (ImageView) rootView.findViewById(R.id.section_img);
        img.setBackgroundResource(bgs[getArguments().getInt(ARG_SECTION_NUMBER) - 1]);


        return rootView;
    }


}

