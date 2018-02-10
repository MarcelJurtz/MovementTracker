package com.jurtz.marcel.runningtracker.model;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.jurtz.marcel.runningtracker.BR;
import com.jurtz.marcel.runningtracker.R;

import java.util.List;


public class MovementAdapter extends RecyclerView.Adapter<MovementViewHolder> {
    private List<Movement> movements;

    public MovementAdapter(List<Movement> movements) {
        this.movements = movements;
    }

    @Override
    public MovementViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding viewDataBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.list_item_movement, parent, false);
        return new MovementViewHolder(viewDataBinding);
    }

    @Override
    public void onBindViewHolder(MovementViewHolder holder, int position) {
        ViewDataBinding viewDataBinding = holder.getViewDataBinding();
        viewDataBinding.setVariable(BR.viewmodel , movements.get(position));
    }

    @Override
    public int getItemCount() {
        return movements != null ? movements.size() : 0;
    }
}
