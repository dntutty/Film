package com.lsx.film;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lsx.film.model.Category;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import me.drakeet.multitype.ItemViewBinder;

public class CategoryViewBinder
        extends ItemViewBinder<Category, CategoryViewBinder.ViewHolder> {

    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View root = inflater.inflate(R.layout.item_category, parent, false);
        return new ViewHolder(root);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull Category category) {
        holder.categoryName.setText(category.name);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        @NonNull private final TextView categoryName;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.categoryName = (TextView) itemView.findViewById(R.id.category_name);
        }
    }
}
