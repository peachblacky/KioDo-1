package ru.nsu.fit.kiodo.model.data.training

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "training")
data class Training(
    @PrimaryKey val trainingName: String,
    @ColumnInfo val restBetweenExercises: Int,
    @ColumnInfo val numberCompleted: Int
)
