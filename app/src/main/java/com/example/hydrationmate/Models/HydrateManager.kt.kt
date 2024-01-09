
import androidx.lifecycle.MutableLiveData
import com.example.hydrationmate.Models.HydrationGoalModels
import com.example.hydrationmate.Models.HydrationStore
import timber.log.Timber

object HydrateManager : HydrationStore {

    private val hydration_Array = ArrayList<HydrationGoalModels>()

    override fun findAll(hydrationGoalList: MutableLiveData<HydrationGoalModels>): List<HydrationGoalModels> {
        Timber.d("HydrationManager : $hydration_Array")
        return hydration_Array
    }

    override fun add(hydrationGoalModels: HydrationGoalModels) {
        hydration_Array.add(hydrationGoalModels)
    }

    override fun add(hydrationGoalModels: MutableLiveData<HydrationGoalModels>) {
        hydrationGoalModels.value?.let {
            hydration_Array.add(it)
        }
    }

    override fun update(hydrationGoalModels: MutableLiveData<HydrationGoalModels>) {
        hydrationGoalModels.value?.let {
            hydration_Array[it.id] = it
        }
    }

    override fun delete(hydrationGoalModels: MutableLiveData<HydrationGoalModels>) {
        hydrationGoalModels.value?.let {
            hydration_Array.removeAt(it.id)
        }
    }

    override fun deleteAll() {
        hydration_Array.clear()
    }

    override fun deleteById(id: Int) {
        hydration_Array.removeAt(id)
    }

    override fun logAll(hydrationGoalModels: MutableLiveData<HydrationGoalModels>) {
        if (hydration_Array.isNotEmpty()) {
            Timber.v("** Hydration Goal List **")
            hydration_Array.forEach { Timber.v("Hydration Goal: $it") }
            hydrationGoalModels.value = hydration_Array[0]
            hydrationGoalModels.postValue(hydrationGoalModels.value)
        }
    }

    override fun logAll() {
        if (hydration_Array.isNotEmpty()) {
            Timber.v("** Hydration Goal List **")
            hydration_Array.forEach { Timber.v("Hydration Goal: $it") }
        }
    }

    override fun getHydrationList(): MutableLiveData<ArrayList<HydrationGoalModels>> {
        return MutableLiveData(hydration_Array)
    }
}
