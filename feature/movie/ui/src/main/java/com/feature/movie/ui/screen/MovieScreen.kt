package com.feature.movie.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MovieScreen(
    viewModel: MovieScreenViewModel
) {
    val state = viewModel.state.value
    val query = viewModel.query.collectAsState()

    Scaffold(
        topBar = {
            TextField(
                value = query.value,
                onValueChange = { viewModel.setQuery(it) }
            )
        }
    ){
        Box {
            if (state.isLoading){
                CircularProgressIndicator(
                    modifier = Modifier.align(
                        Alignment.Center
                    )
                )
            }
            if (state.message.isNotBlank()){
                Text(state.message)
            }
            LazyColumn {
                items(state.movies){
                    SingleItem(
                        image = it.imageUrl,
                        title = it.title,
                        onClick = {}
                    )
                }
            }
        }
    }
}