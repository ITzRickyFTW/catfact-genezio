// This is an auto generated code. This code should not be modified since the file can be overwritten
// if new genezio commands are executed.
package com.example.catfact

import com.google.gson.Gson
import com.google.gson.JsonElement
import com.google.gson.reflect.TypeToken

// User Classes 




class TaskService {
     private val remote = Remote("https://i52dwsyfq4zs53hg4fkanagpx40phyuu.lambda-url.eu-central-1.on.aws/TaskService/")
     private val gson = Gson()
     suspend fun fetchFact(): String {
          val params = listOf<JsonElement>(
          )

          val type = object : TypeToken<String>(){}.type
          var res : String

          res = remote.makeRequest(type, "TaskService.fetchFact", params)
          var inter=gson.fromJson(res,CatFact::class.java)

          return inter.fact
     }
}
