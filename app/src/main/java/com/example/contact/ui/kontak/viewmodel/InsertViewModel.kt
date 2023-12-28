package com.example.contact.ui.kontak.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.contact.repository.KontakRepository

class InsertViewModel (private val kontakRepository: KontakRepository) : ViewModel() {

    var insertKontakState by mutableStateOf(InsertUiState())
        private set

    fun updateInsertKontakState(insertUiEvent: InsertUiEvent) {
        insertKontakState = InserUiState(insertUiEvent = insertUiEvent)
    }
}