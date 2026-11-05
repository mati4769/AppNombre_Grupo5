package com.example.appnombre_grupo5.repository

import com.example.appnombre_grupo5.data.model.Post
import com.example.appnombre_grupo5.data.remote.RetrofitInstance

// Este repositorio se encarga de acceder a los datos usando Retrofit
class PostRepository {

    // Función que obtiene los posts desde la API
    suspend fun getPosts(): List<Post> {
        return RetrofitInstance.api.getPosts()
    }

    // Punto 11
    suspend fun createPost(post: Post): Post {
        return RetrofitInstance.api.createPost(post)
    }

    suspend fun updatePost(post: Post): Post {
        return RetrofitInstance.api.updatePost(post.id, post)
    }

    suspend fun patchPost(id: Int, campos: Map<String, String>): Post {
        return RetrofitInstance.api.patchPost(id, campos)
    }

    suspend fun deletePost(id: Int) {
        RetrofitInstance.api.deletePost(id)
    }
}