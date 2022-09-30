package com.fquesada.appcasos.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CasosDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertarCasosListing(
        casosListingEntities: List<CasosListingEntity>
    )

    @Query("SELECT * FROM CasosListingEntity")
    suspend fun getAllCasos(query: String): List<CasosListingEntity>

}