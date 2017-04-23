package be.kotlin.androidmvpbasicboiler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import be.kotlin.androidmvpbasicboiler.presenters.Presenter
import be.kotlin.androidmvpbasicboiler.presenters.PresenterImpl
import be.kotlin.androidmvpbasicboiler.views.View

class MainActivity : AppCompatActivity(), View {



    private lateinit var textView: TextView
    private lateinit var buttonAdd: Button
    var presenter: PresenterImpl?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView1) as TextView
        buttonAdd = findViewById(R.id.buttonAdd) as Button
        presenter = PresenterImpl()
        presenter!!.addView(this)

        requestAction()
        initializeView()

    }

    private fun initializeView() {
        buttonAdd!!.setOnClickListener { requestAction() }
    }


    override fun requestAction() {
        presenter?.requestAction()
    }

    override fun postResult(result: String) {
        textView.setText(result)
    }

}
