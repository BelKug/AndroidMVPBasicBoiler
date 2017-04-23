package be.kotlin.androidmvpbasicboiler.presenters

import be.kotlin.androidmvpbasicboiler.base.PresenterBase
import be.kotlin.androidmvpbasicboiler.views.View

/**
 * Created by guyheylens on 23/04/17.
 */
interface Presenter:PresenterBase<View> {
    fun requestAction()


}