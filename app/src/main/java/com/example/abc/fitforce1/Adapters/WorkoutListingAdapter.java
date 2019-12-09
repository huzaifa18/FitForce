package com.example.abc.fitforce1.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.abc.fitforce1.Models.WorkoutListingModel;
import com.example.abc.fitforce1.R;
import com.example.abc.fitforce1.WeekDays;
import com.example.abc.fitforce1.WorkOutDetail;

import java.util.List;

public class WorkoutListingAdapter extends RecyclerView.Adapter<WorkoutListingAdapter.ViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    private List<WorkoutListingModel> workoutList;
    private OnColorPickerClickListener onColorPickerClickListener;
    String day;

    public WorkoutListingAdapter(@NonNull Context context, @NonNull List<WorkoutListingModel> workoutList, String day) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.workoutList = workoutList;
        this.day = day;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.workout_item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv_workout.setText(workoutList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return workoutList.size();
    }

    public void setOnColorPickerClickListener(OnColorPickerClickListener onColorPickerClickListener) {
        this.onColorPickerClickListener = onColorPickerClickListener;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_workout;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_workout = itemView.findViewById(R.id.tv_workout);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, WorkOutDetail.class);
                    intent.putExtra("goal",workoutList.get(getAdapterPosition()).getName());
                    intent.putExtra("day",day);
                    intent.putExtra("workout_id",getAdapterPosition());
                    Log.e("TAG","workout_id: " + getAdapterPosition());
                    Log.e("TAG","goal: " + workoutList.get(getAdapterPosition()).getName());
                    Log.e("TAG","day: " + day);
                    context.startActivity(intent);
                    if (onColorPickerClickListener != null)
                        onColorPickerClickListener.onColorPickerClickListener(workoutList.get(getAdapterPosition()));
                }
            });
        }
    }

    public interface OnColorPickerClickListener {
        void onColorPickerClickListener(WorkoutListingModel colorCode);
    }
}
