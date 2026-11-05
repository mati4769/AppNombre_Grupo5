package com.example.appnombre_grupo5.data.remote

import com.example.appnombre_grupo5.data.model.Post
import retrofit2.http.*

// Esta interfaz define los endpoints HTTP
interface ApiService {

    // Define una solicitud GET al endpoint /posts
    @GET("/posts")
    suspend fun getPosts(): List<Post>

    // Punto 11: crear un post
    @POST("/posts")
    suspend fun createPost(@Body post: Post): Post

    // Punto 11: reemplazar un post completo
    @PUT("/posts/{id}")
    suspend fun updatePost(@Path("id") id: Int, @Body post: Post): Post

    // Punto 11: modificar solo algunos campos
    @PATCH("/posts/{id}")
    suspend fun patchPost(@Path("id") id: Int, @Body campos: Map<String, String>): Post

    // Punto 11: eliminar un post
    @DELETE("/posts/{id}")
    suspend fun deletePost(@Path("id") id: Int)
}