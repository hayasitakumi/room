package com.syabon.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

data class User{
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "first_name") val firstNmae: String?,
    @ColumnInfo(name = "last_name") val lastNmae: String?

}