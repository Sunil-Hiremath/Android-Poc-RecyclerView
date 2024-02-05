package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//RecyclerView.Adapter<> this wants view holder(that recycles the views) obj
public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.viewHolder> {

    //this is a helping class so to get reference of the main class we have to get context
    Context context;
    ArrayList<ContactModal> arrContacts;

    RecyclerContactAdapter(Context context, ArrayList<ContactModal> arrContacts){
        this.context=context;
        this.arrContacts=arrContacts;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // i need to pass view to view holder we had already made a layout, to get view from layout we use layoutInflator
        // from needs context so we have get context from the main activity through constructor RecyclerContactAdapter(Context context)
       View view= LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false); // false because i don't want the view to be attached, if attached it will not be able to get recycled

        viewHolder viewHolder=new viewHolder(view);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {



        holder.imgContact.setImageResource(arrContacts.get(position).img);
        holder.txtName.setText(arrContacts.get(position).name);
        holder.txtNumber.setText(arrContacts.get(position).number);



    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }


    // so creating a view holder class that extends below shown
    public class viewHolder extends RecyclerView.ViewHolder {

        TextView txtName,txtNumber;
        ImageView imgContact;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            // as we are not in the main class we can't use findview by id , instead through the reference of the view i.e, itemview  we use findview by id
            txtName=itemView.findViewById(R.id.txtName);
            txtNumber=itemView.findViewById(R.id.txtNumber);
            imgContact=itemView.findViewById(R.id.imgContact);
        }
    }
}
