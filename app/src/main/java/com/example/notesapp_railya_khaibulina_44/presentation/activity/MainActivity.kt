package com.example.notesapp_railya_khaibulina_44.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.notesapp_railya_khaibulina_44.R
import com.example.notesapp_railya_khaibulina_44.databinding.ActivityMainBinding
import com.example.notesapp_railya_khaibulina_44.domain.model.Note
import com.example.notesapp_railya_khaibulina_44.presentation.UIState
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.getAllNotes()

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.getAllNotesState.collect {
                    when (it) {
                        is UIState.Loading -> {
                            TODO("show progress bar")
                        }
                        is UIState.Error -> {
                            Toast.makeText(this@MainActivity, it.error, Toast.LENGTH_SHORT).show()
                        }
                        is UIState.Success -> {
                            binding.tvNotes.text = it.data.toString()

                        }
                    }
                }
            }

            var i = 0
            binding.btnAddNote.setOnClickListener {
                i++
                viewModel.createNote(Note(title = i.toString(), text = i.toString()))
            }
            lifecycleScope.launch {
                repeatOnLifecycle(Lifecycle.State.STARTED) {
                    viewModel.createNoteState.collect {
                        when (it) {
                            is UIState.Loading -> {
                                TODO("show progress bar")
                            }
                            is UIState.Error -> {
                                Toast.makeText(this@MainActivity, it.error, Toast.LENGTH_SHORT)
                                    .show()
                            }
                            is UIState.Success -> {
                                viewModel.getAllNotes()

                            }
                        }
                    }
                }
            }

        }
    }
}