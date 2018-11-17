package pramonow.com.mvptemplate

/*
    Presenter class for our MainActivity
    It contains activity interface in our constructor parameter
    It will allow our Presenter to call any functions contained by our Activity Interface

    NOTES THAT IT WILL NOT CONTAIN APPCOMPAT ACTIVITY METHODS AS WE PUT IN OUR INTERFACE NOT ACTIVITY
    YOU CAN ALSO PUT IN DIRECT ACTIVITY (MAINACTIVITY) INSIDE THE CONSTRUCTOR
    BUT IT IS NOT REGARDED AS BEST PRACTICE
 */

class MainPresenter(private val Activity: MainInteractor.Activity) : MainInteractor.Presenter{

    override fun createDataToShow() {
        var dummyObject = DummyModel("Arnold",17)

        //Here we can pass our activity method
        Activity.showToast(dummyObject)
    }

}