package com.example.alert_dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.ArrayList;
import java.util.List;

public class MyGroceryList extends DialogFragment {
    private List<String> mSelectedList;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        mSelectedList = new ArrayList<>();
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.pick_toppings)
                .setMultiChoiceItems(R.array.pick_grocery, null, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        String[] items = getActivity().getResources().getStringArray(R.array.pick_grocery);
                        if (isChecked){
                            mSelectedList.add(items[which]);

                        }else if (mSelectedList.contains(items[which])){
                            mSelectedList.remove(items[which]);
                        }
                    }
                })
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String final_selection = "";
                        for (String Item : mSelectedList){
                            final_selection = final_selection+"\n"+Item;
                        }
                        Toast.makeText(getActivity(),final_selection,Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
