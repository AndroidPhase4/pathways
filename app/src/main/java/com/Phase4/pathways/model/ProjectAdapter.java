package com.Phase4.pathways.model;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class ProjectAdapterAdapter extends RecyclerView.Adapter<ProjectAdapterAdapter.ProjectViewHolder> {


    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class ProjectViewHolder extends RecyclerView.ViewHolder {


        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
