package com.fquesada.appcasos.data.local


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@Entity
@JsonClass(generateAdapter = true)
data class CasosListingEntity(
    @PrimaryKey
    @Json(name = "id_caso")
    val idCaso: Int,
    @Json(name = "aprobado")
    val aprobado: String,
    @Json(name = "aprobado_cliente")
    val aprobadoCliente: String,
    @Json(name = "branch")
    val branch: String,
    @Json(name = "branch_padre")
    val branchPadre: String,
    @Json(name = "cantidad_rechazos")
    val cantidadRechazos: Int,
    @Json(name = "estado")
    val estado: String,
    @Json(name = "git")
    val git: String,

    @Json(name = "id_ubicacion")
    val idUbicacion: String,
    @Json(name = "img_url")
    val imgUrl: String,
    @Json(name = "link")
    val link: String,
    @Json(name = "notas")
    val notas: String,
    @Json(name = "tipo_caso")
    val tipoCaso: Int,
    @Json(name = "titulo")
    val titulo: String
)