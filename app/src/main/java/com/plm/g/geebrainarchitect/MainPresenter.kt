package com.plm.g.geebrainarchitect



class MainPresenter(
    private val view: MainView,
    private val model: CountersModel = CountersModel()
) {

    fun incrementCounter1Value(){
        val index = 0
        val nextValue = model.next(index)
        view.setCounter1Text(nextValue.toString())
    }

    fun incrementCounter2Value(){
        val index = 1
        val nextValue = model.next(index)
        view.setCounter2Text(nextValue.toString())
    }

    fun incrementCounter3Value(){
        val index = 2
        val nextValue = model.next(index)
        view.setCounter3Text(nextValue.toString())
    }

}
