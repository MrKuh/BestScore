package project.bestscore.ui.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.maps.SupportMapFragment;

import project.bestscore.MainActivity;
import project.bestscore.R;

public class GameHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    private ImageView imgBow;
    private TextView tvName;

    public GameHolder(@NonNull View itemView, TextView tvName, ImageView imgBow, Activity activity, Context context) {
        super(itemView);
        this.imgBow = imgBow;
        this.tvName = tvName;
        
        itemView.setOnClickListener(v -> {

            System.out.println(tvName.getText() + ": ausgewählt");

        });
    }

    public ImageView getImgBow() {
        return imgBow;
    }

    public void setImgBow(ImageView imgBow) {
        this.imgBow = imgBow;
    }

    public TextView getTvName() {
        return tvName;
    }

    public void setTvName(TextView tvName) {
        this.tvName = tvName;
    }

    @Override
    public void onClick(View v) {

    }
}
