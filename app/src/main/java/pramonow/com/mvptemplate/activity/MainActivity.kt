package pramonow.com.mvptemplate

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

/*
    Our MainActivity Class
    We will have to declare our Presenter here (will be described further below)
 */

class MainActivity : AppCompatActivity(),MainInteractor.Activity {

    /*
        We declare our presenter here with our Activity as parameter
        Notes that we can also declare our presenter this way
        val Presenter:MainInteractor.Presenter = MainPresenter(this)

        As it will regard the presenter as interface
        Why? So if in the future if we have another Presenter that also implements the same interface
        we can easily reuse it without much change
     */
    val Presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Here we call our presenter method
        //Activity doesn't produce and interact with data, it is all from presenter side
        //Cleaner architecture in action
        Presenter.createDataToShow()
    }

    override fun showToast(data: DummyModel) {
        val message = "Hi, my name is ${data.name}, i am ${data.age} years old now."
        Toast.makeText(this,message, Toast.LENGTH_SHORT ).show()
    }
}
