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

public class AsssignmentAdapter extends RecyclerView.Adapter<AsssignmentAdapter.AssignmentViewHolder> {
    public static class AssignmentViewHolder extends RecyclerView.ViewHolder {
        public Switch toggleSwitch;
        public TextView textView;

        public AssignmentViewHolder(@NonNull View itemView) {
            super(itemView);

            toggleSwitch = itemView.findViewById(R.id.switch1);
            textView = itemView.findViewById(R.id.textView2);
        }
    }

    ArrayList<Pair<Assignment, Boolean>> Assignments= new ArrayList<>();

    @NonNull
    @Override
    public AssignmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AssignmentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.assignment_adapter, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AssignmentViewHolder holder, int position) {
        holder.textView.setText(Assignments.get(position).first.assignmentName);
        holder.toggleSwitch.setSaveEnabled(Assignments.get(position).second);
    }

    @Override
    public int getItemCount() {
        return Assignments.size();
    }
}
