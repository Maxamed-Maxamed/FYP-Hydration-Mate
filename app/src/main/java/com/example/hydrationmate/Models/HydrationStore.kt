package com.example.hydrationmate.Models

import androidx.lifecycle.MutableLiveData
import com.example.hydrationmate.Models.HydrationGoalModels

interface HydrationStore {

//  fun findAll(): List<HydrationGoalModels>

  fun findAll(hydrationGoalList: MutableLiveData<HydrationGoalModels>): List<HydrationGoalModels>

  // create methods for crud operations
  fun add(hydrationGoalModels: HydrationGoalModels)

  fun add(hydrationGoalModels: MutableLiveData<HydrationGoalModels>)

  fun update(hydrationGoalModels: MutableLiveData<HydrationGoalModels>)

  fun delete(hydrationGoalModels: MutableLiveData<HydrationGoalModels>)


  fun logAll(hydrationGoalModels: MutableLiveData<HydrationGoalModels>)






    // crude methods for now
//    fun add(hydrationGoalModels: HydrationGoalModels)
//    fun add(hydrationGoalModels: MutableLiveData<HydrationGoalModels>)
//    fun update(hydrationGoalModels: MutableLiveData<HydrationGoalModels>)
//    fun delete(hydrationGoalModels: MutableLiveData<HydrationGoalModels>)
//    fun deleteAll( hydrationGoalModels: MutableLiveData<HydrationGoalModels>)
//    fun deleteAll()
//    fun deleteById(id: Int, hydrationGoalModels: MutableLiveData<HydrationGoalModels>)
//    fun deleteById(id: Int, hydrationGoalModels: HydrationGoalModels)
//
//    fun logAll(hydrationGoalModels: MutableLiveData<HydrationGoalModels>)
//
//  fun addHydrationGoal(goal: HydrationGoalModels)
  fun getHydrationList(): MutableLiveData<ArrayList<HydrationGoalModels>>
  fun deleteAll()
  fun deleteById(id: Int)
  fun logAll()
}