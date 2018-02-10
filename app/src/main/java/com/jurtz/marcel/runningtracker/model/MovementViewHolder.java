package com.jurtz.marcel.runningtracker.model;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.jurtz.marcel.runningtracker.R;

public class MovementViewHolder extends RecyclerView.ViewHolder {
  /*  protected TextView vTimeStamp;
    protected TextView vDetails;

    public MovementViewHolder(View itemView) {
        super(itemView);
        vTimeStamp = (TextView)itemView.findViewById(R.id.lblMovementTimeStamp);
        vDetails = (TextView)itemView.findViewById(R.id.lblMovementDetails);
    }
*/
    private ViewDataBinding mViewDataBinding;

    public MovementViewHolder( ViewDataBinding viewDataBinding) {
        super(viewDataBinding.getRoot());

        mViewDataBinding = viewDataBinding;
        mViewDataBinding.executePendingBindings();
    }

    public ViewDataBinding getViewDataBinding() {
        return mViewDataBinding;
    }
}
