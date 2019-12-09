package com.example.abc.fitforce1.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.example.abc.fitforce1.Models.DietModel;
import com.example.abc.fitforce1.R;
import java.util.List;

public class DietAdapter extends RecyclerView.Adapter<DietAdapter.ViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    private List<DietModel> dietList;
    private OnDietPickerClickListener onDietPickerClickListener;

    public DietAdapter(@NonNull Context context, @NonNull List<DietModel> dietList) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.dietList = dietList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.diet_item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv_food.setText(dietList.get(position).getFood());
        holder.tv_calories.setText(""+dietList.get(position).getCalories());
    }

    @Override
    public int getItemCount() {
        return dietList.size();
    }

    public void setOnDietPickerClickListener(OnDietPickerClickListener onDietPickerClickListener) {
        this.onDietPickerClickListener = onDietPickerClickListener;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_food;
        TextView tv_calories;
        CheckBox cb_calorie;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_food = itemView.findViewById(R.id.tv_food);
            tv_calories = itemView.findViewById(R.id.tv_calories);
            cb_calorie = itemView.findViewById(R.id.cb_calorie);

            cb_calorie.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (onDietPickerClickListener != null)
                        onDietPickerClickListener.onDietPickerClickListener(dietList.get(getAdapterPosition()),b);
                }
            });

            /*itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onDietPickerClickListener != null)
                        onDietPickerClickListener.onDietPickerClickListener(dietList.get(getAdapterPosition()));
                }
            });*/
        }
    }

    public interface OnDietPickerClickListener {
        void onDietPickerClickListener(DietModel diet, boolean b);
    }
}
