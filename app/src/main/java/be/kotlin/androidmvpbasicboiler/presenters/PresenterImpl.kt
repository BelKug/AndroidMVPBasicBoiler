package be.kotlin.androidmvpbasicboiler.presenters

import android.support.v7.app.AppCompatActivity
import be.kotlin.androidmvpbasicboiler.MainActivity
import be.kotlin.androidmvpbasicboiler.models.ModelImpl
import be.kotlin.androidmvpbasicboiler.views.View

class PresenterImpl:Presenter {

    private var modelX: ModelImpl?= null
    private var viewX:View?=null

    override fun addView(view: View) {
        viewX = view
        modelX = ModelImpl()
    }

    override fun removeView() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



    override fun requestAction() {
        viewX?.postResult(modelX?.requestAction().toString())
    }

}