package com.example.rapidchidori_mad5254_project.ui.viewmodels

import android.text.InputType
import androidx.lifecycle.ViewModel
import com.example.rapidchidori_mad5254_project.data.models.ui.SignUpQuestionsInfo
import com.example.rapidchidori_mad5254_project.helper.Constants.ALIAS_NAME
import com.example.rapidchidori_mad5254_project.helper.Constants.ALIAS_NAME_QUES
import com.example.rapidchidori_mad5254_project.helper.Constants.CONFIRM_PASSWORD
import com.example.rapidchidori_mad5254_project.helper.Constants.CONFIRM_PASSWORD_QUES
import com.example.rapidchidori_mad5254_project.helper.Constants.EMAIL
import com.example.rapidchidori_mad5254_project.helper.Constants.EMAIL_QUES
import com.example.rapidchidori_mad5254_project.helper.Constants.FULL_NAME
import com.example.rapidchidori_mad5254_project.helper.Constants.FULL_NAME_QUES
import com.example.rapidchidori_mad5254_project.helper.Constants.PASSWORD
import com.example.rapidchidori_mad5254_project.helper.Constants.PASSWORD_QUES

class SignUpViewModel : ViewModel() {

    fun getSignUpQuestionsData(): MutableList<SignUpQuestionsInfo> {
        val questionsList = mutableListOf<SignUpQuestionsInfo>()
        questionsList.add(
            SignUpQuestionsInfo(
                FULL_NAME_QUES, FULL_NAME,
                InputType.TYPE_CLASS_TEXT
            )
        )
        questionsList.add(
            SignUpQuestionsInfo(
                ALIAS_NAME_QUES,
                ALIAS_NAME, InputType.TYPE_CLASS_TEXT
            )
        )
        questionsList.add(
            SignUpQuestionsInfo(
                EMAIL_QUES,
                EMAIL, InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
            )
        )
        questionsList.add(
            SignUpQuestionsInfo(
                PASSWORD_QUES,
                PASSWORD, InputType.TYPE_TEXT_VARIATION_PASSWORD
            )
        )
        questionsList.add(
            SignUpQuestionsInfo(
                CONFIRM_PASSWORD_QUES,
                CONFIRM_PASSWORD, InputType.TYPE_TEXT_VARIATION_PASSWORD
            )
        )
        return questionsList
    }
}