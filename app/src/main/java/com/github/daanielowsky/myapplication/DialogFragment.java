package com.github.daanielowsky.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DialogFragment extends androidx.fragment.app.DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Dialog")
                .setPositiveButton("Yup", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getContext(), Main2Activity.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", null)
                .setMessage("Do u really wanna move to there?");

        return builder.create();

    }
}
