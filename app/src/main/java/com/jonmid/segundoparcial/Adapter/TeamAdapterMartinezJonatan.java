package com.jonmid.segundoparcial.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jonmid.segundoparcial.Array.Images;
import com.jonmid.segundoparcial.Models.TeamModelMartinezJonatan;
import com.jonmid.segundoparcial.R;
import com.jonmid.segundoparcial.TeamActivity;
import com.jonmid.segundoparcial.Views.DetailActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martinez on 17/10/17.
 */

public class TeamAdapterMartinezJonatan extends RecyclerView.Adapter<TeamAdapterMartinezJonatan.ViewHolder> {
    List<TeamModelMartinezJonatan> commentsModelList = new ArrayList<>();
    Context context;

    public TeamAdapterMartinezJonatan(List<TeamModelMartinezJonatan> commentsModelList, Context context) {
        this.commentsModelList = commentsModelList;
        this.context = context;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Configuracion del ViewAdapter

        // Obtener la vista (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_team, parent, false);

        // Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    public void onBindViewHolder(ViewHolder holder, int position) {
        // Encargado de trabajar con el item.xml y sus componentes

        holder.name.setText(commentsModelList.get(position).getName());
        holder.code.setText(commentsModelList.get(position).getCode());
        Picasso.with(context).load(Images.imageRandom()).into(holder.img);




    }
    public int getItemCount() {
        return commentsModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView name;
        TextView code;

        ImageView img;




        public ViewHolder(View item) {
            super(item);

            item.setOnClickListener(this);
            name=(TextView)item.findViewById(R.id.id_tv_name_team);
            code=(TextView)item.findViewById(R.id.id_tv_cod_team);
            img =(ImageView)item.findViewById(R.id.id_img_team);


        }

        @Override
        public void onClick(View view) {
            Context contextItem = view.getContext();
            Intent intent = new Intent(context, DetailActivity.class);

            intent.putExtra("name",commentsModelList.get(getLayoutPosition()).getName());
            intent.putExtra("code",commentsModelList.get(getLayoutPosition()).getCode());





            contextItem.startActivity(intent);
        }
    }


}
