package e.vismay.preventionofprocrastination;

import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassAdapter extends RecyclerView.Adapter<ClassAdapter.ClassViewHolder> {
    public static class ClassViewHolder extends RecyclerView.ViewHolder {
        public TextView classView;

        public ClassViewHolder(@NonNull View itemView) {
            super(itemView);

            classView = itemView.findViewById(R.id.textView);
        }
    }

    ArrayList<Course> Courses= new ArrayList<>();

    @NonNull
    @Override
    public ClassViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ClassViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.class_adapter, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ClassViewHolder holder, int position) {
        holder.classView.setText(Courses.get(position).courseName);
    }

    @Override
    public int getItemCount() {
        return -1;
    }
}
