package com.fquesada.appcasos.ui.view
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
//import coil.compose.rememberImagePainter
import com.fquesada.appcasos.domain.model.Casos
import com.fquesada.appcasos.ui.theme.AquaBlue
import com.fquesada.appcasos.ui.viewModel.CasosViewModel

@Composable
fun CasosScreen(tipoCaso: Int) {
    val casosViewModel = viewModel(modelClass = CasosViewModel::class.java)
    val state by casosViewModel.state.collectAsState()

    casosViewModel.tipoCaso = tipoCaso

    LazyColumn {
        if (state.isEmpty()) {
            item {
                CircularProgressIndicator(
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(align = Alignment.Center)
                )
            }

        }

        items(state) { casos: Casos ->
            CharacterImageCard(casosItem = casos)
        }


    }

}

@Composable
fun CharacterImageCard(casosItem: Casos) {
//    val imagerPainter = rememberImagePainter(data = character.image)

    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.padding(16.dp),
        elevation = 14.dp,
        border = BorderStroke(1.dp, Color.LightGray),
    ) {
        Box {
            Surface(
                //color = MaterialTheme.colors.onSurface.copy(alpha = .3f),
                color = AquaBlue,
                modifier = Modifier.align(Alignment.BottomCenter),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(4.dp)
                ) {
                    Text(text = "Usua. Asig: ${casosItem.usuario_asignado}")
                    Text(text = "Branch: ${casosItem.branch}")
                    Text(text = "Título: ${casosItem.titulo}")
                }
            }


        }


    }


}