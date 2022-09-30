package com.fquesada.appcasos.domain.model


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

//@JsonClass(generateAdapter = true)
data class Casos(
    @Json(name = "id_caso")
    val idCaso: String,
    @Json(name = "aprobado")
    val aprobado: String,
    @Json(name = "aprobado_cliente")
    val aprobadoCliente: String,
    @Json(name = "branch")
    val branch: String,
    @Json(name = "branch_padre")
    val branchPadre: String,
    @Json(name = "cantidad_rechazos")
    val cantidadRechazos: String,
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
    val tipoCaso: String,
    @Json(name = "titulo")
    val titulo: String,
    @Json(name = "usuario_asignado")
    val usuario_asignado: String
)