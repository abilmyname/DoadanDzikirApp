package com.example.doadandzikirapp

import com.example.doadandzikirapp.model.Artikel

interface OnItemClickCallback {
    fun onItemClicked(data: Artikel)
}