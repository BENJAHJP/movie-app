package com.feature.movie.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MovieScreen(
    viewModel: MovieScreenViewModel
) {
    val state = viewModel.state.value

    Scaffold(
        topBar = {
            TextField(
                value = viewModel.query,
                onValueChange = { viewModel.query = it },
                trailingIcon = {
                    IconButton(onClick = { viewModel.getMovieList() }) {
                        Icon(imageVector = Icons.Rounded.Search, contentDescription = "search")
                    }
                }
            )
        }
    ){
        Box(
            modifier = Modifier.fillMaxSize()
                .padding(top = it.calculateTopPadding())
        ){
            if (state.isLoading){
                CircularProgressIndicator(
                    modifier = Modifier.align(
                        Alignment.Center
                    )
                )
            } else if (state.message.isNotBlank()){
                Text(state.message)
            } else {
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
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
}