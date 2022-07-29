package co.presenca.alunos.adpater;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import co.presenca.alunos.Aluno;
import co.presenca.alunos.R;
import co.presenca.alunos.data.DataSource;

public class myAdpater extends RecyclerView.Adapter<myAdpater.myViewHolder> {

    ArrayList<String> alunos = new ArrayList<>();


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.escola_list, parent, false);

        return new myViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.textView.setText(alunos.get(position));
    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class myViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView1);

        }

        }

    }

