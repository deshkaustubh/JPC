package com.example.jpc.`15_PullToRefresh`

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun PullToRefreshSample() {
    val scope = rememberCoroutineScope()
    var isRefreshing by remember { mutableStateOf(false) }
    var items by remember { mutableStateOf(List(20) { "item $it" }) }

    fun refreshItem() {

        scope.launch {
            isRefreshing = true
            delay(2000)
            items = List(20) { "#${(0..100).random()} items selected at random" }
            isRefreshing = false
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PullToRefreshCustomIndicatorSample(
    items: List<String>,
    isRefreshing: Boolean,
    onRefresh :Unit,
    modifier: Modifier = Modifier
){

    val state = rememberPullToRefreshState()

    PullToRefreshBox()
}


@Preview(showSystemUi = true)
@Composable
fun RefreshPreview() {

}