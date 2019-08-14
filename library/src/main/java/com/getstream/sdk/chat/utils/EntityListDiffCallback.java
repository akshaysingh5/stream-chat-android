package com.getstream.sdk.chat.utils;

import androidx.recyclerview.widget.DiffUtil;

import com.getstream.sdk.chat.adapter.Entity;


import java.util.List;

public class EntityListDiffCallback extends DiffUtil.Callback {
    protected List<Entity> oldList, newList;

    public EntityListDiffCallback(List<Entity> oldList, List<Entity> newList) {
        this.oldList = oldList;
        this.newList = newList;
    }

    @Override
    public int getOldListSize() {
        return oldList == null ? 0 : oldList.size();
    }

    @Override
    public int getNewListSize() {
        return newList == null ? 0 : newList.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return oldList.get(oldItemPosition).equals(newList.get(newItemPosition));
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        // read state
        // last message
        // channel members
        // channel name
        // TODO: fix this

        return false;
    }
}