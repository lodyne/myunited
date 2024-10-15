package com.example.myunited;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class SquadAdapter extends ArrayAdapter<Squad> {
    Context context;
    private final ArrayList<Squad> squadArrayList;

    public SquadAdapter(Context context, ArrayList<Squad> squadArrayList) {
        super(context, R.layout.custom_squad_list,squadArrayList);
        this.context = context;
        this.squadArrayList = squadArrayList;
    }

    private static class ViewHolder{
        TextView playerName;
        TextView jerseyNumber;
        ImageView playerImage;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Squad squads = getItem(position);

        ViewHolder viewHolder;

        if (convertView == null){
            viewHolder =new ViewHolder();
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(
                    R.layout.custom_squad_list,
                    parent,
                    false
            );

//         Finding Views
            viewHolder.jerseyNumber = convertView.findViewById(R.id.text2);
            viewHolder.playerImage = convertView.findViewById(R.id.image1);
            viewHolder.playerName = convertView.findViewById(R.id.text1);

            convertView.setTag(viewHolder);

        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

//        Getting data from the modal class i.e. Squad
        assert squads != null;
        viewHolder.playerName.setText(squads.getPlayerName());
        viewHolder.playerImage.setImageResource(squads.getPlayerImage());
        viewHolder.jerseyNumber.setText(squads.getJerseyNumber());

        return convertView;
    }


}
