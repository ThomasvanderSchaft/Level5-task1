package com.example.notepad.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
@Entity(tableName = "Note")
data class Note(
    @ColumnInfo(name = "title")
    var title: String,
    @ColumnInfo(name = "lastUpdated")
    var lastUpdated: Date,
    @ColumnInfo(name = "text")
    var text: String,
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    var id: Long? = null
) : Parcelable