package com.doublesnatch.app.common.activity

import com.doublesnatch.app.model.AlertDialogModel


interface IBaseActivityCallback {
    fun showLoading(loading: Boolean)
    fun showAlertDialogTwoButtons(alertDialogModel: AlertDialogModel)
    fun showAlertDialogOneButton(alertDialogModel: AlertDialogModel)
    fun showErrorMessageDialog(descriptionError: Int)
    fun showErrorMessageDialog(descriptionError: String?)
    fun showErrorServerMessageToast()
}
