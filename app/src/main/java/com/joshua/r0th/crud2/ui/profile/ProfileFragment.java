package com.joshua.r0th.crud2.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.joshua.r0th.crud2.R;
import com.joshua.r0th.crud2.SqliteHelper;
import com.joshua.r0th.crud2.database1;

public class ProfileFragment extends Fragment {

    private TextView contohText;

    SqliteHelper myDb;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);
        myDb = new SqliteHelper(getActivity());
        contohText = (TextView) rootView.findViewById(R.id.profile1);

        viewData();
        return rootView;
    }
    private void viewData() {
        contohText.setText(myDb.getData() != null ? myDb.getData() : "-");

    }
}