package pramonow.com.mvptemplate

/*
    Interactor Contains two Interface
    Both for The View(Activity) and Presenter
    It can be split into two different interactor files
    but it is up to the development team style
    I have decided to pack it into one
    so as it will not dirty the project path with the number of files
 */

interface MainContract{

    interface Activity{
        fun showToast(data:DummyModel)
    }

    interface Presenter{
        fun createDataToShow();
    }
}