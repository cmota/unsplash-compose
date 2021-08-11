package com.cmota.unsplash.ui.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import com.cmota.unsplash.shared.data.model.Image

@Composable
fun HomeContent(
    images: List<Image>,
    onSearchAction: (String) -> Unit
) {

    /* Your Code Goes Here */
}

@Composable
fun AddSearchField(
    search: MutableState<String>,
    onSearchAction: (String) -> Unit
) {

    /* Your Code Goes Here */
}

@Composable
fun AddUnsplashImage(image: Image) {

    /* Your Code Goes Here */
}