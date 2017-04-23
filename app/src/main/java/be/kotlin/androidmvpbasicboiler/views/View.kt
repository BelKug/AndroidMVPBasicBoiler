package be.kotlin.androidmvpbasicboiler.views

import be.kotlin.androidmvpbasicboiler.base.ScreenBase

/**
 * Created by guyheylens on 23/04/17.
 */
interface View: ScreenBase{
    fun requestAction()
    fun postResult(result: String)
}