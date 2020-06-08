package com.example.alert_dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyDialog extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(R.string.pick_color)
                    .setItems(R.array.colors_array, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which){
                                case 0:
                                    Toast.makeText(getContext(),"Selected color: Red",Toast.LENGTH_SHORT).show();
                                    break;
                                case 1:
                                    Toast.makeText(getContext(),"Selected color: Green",Toast.LENGTH_SHORT).show();
                                    break;
                                case 2:
                                    Toast.makeText(getContext(),"Selected color: Blue",Toast.LENGTH_SHORT).show();
                                    break;
                            }
                        }
                    });
        return builder.create();
    }
}
