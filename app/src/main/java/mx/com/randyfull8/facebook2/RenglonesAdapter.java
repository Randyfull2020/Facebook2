package mx.com.randyfull8.facebook2;

import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.LayoutInflaterCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RenglonesAdapter extends RecyclerView.Adapter<RenglonesAdapter.ViewHolder> {
    private List<Renglon> renglones;
    private Context context;

    public RenglonesAdapter(List<Renglon> renglon) {
        this.renglones = renglon;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_renglones,parent,false );
       context= parent.getContext();
       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
Renglon renglon = renglones.get(position);
holder.lblnombre.setText(renglon.getRenglon());
holder.lblnombre2.setText(renglon.getCodigo());

    }

    @Override
    public int getItemCount() {
        return renglones.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private View view;
        private TextView lblnombre;
        private TextView lblnombre2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lblnombre=itemView.findViewById(R.id.lblnombre);
            lblnombre2=itemView.findViewById(R.id.lblnombre2);
            this.view= itemView;
        }
    }
}
