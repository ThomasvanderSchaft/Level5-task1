package com.example.notepad.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.notepad.database.NoteRepo

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    private val noteRepository = NoteRepo(application.applicationContext)

    val note = noteRepository.getNotepad()

}
