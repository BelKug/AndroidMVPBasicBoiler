package be.kotlin.androidmvpbasicboiler.models

import be.kotlin.androidmvpbasicboiler.common.Result
import java.util.*

/**
 * Created by guyheylens on 23/04/17.
 */
class ModelImpl() {
    val random = Random()

    fun requestAction(): Result {

        return Result(random.nextInt(1000).toString())

    }
}