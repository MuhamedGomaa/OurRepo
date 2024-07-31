package com.muhamedgomaaa.ourrepo.ui.theme.presentation.screens.details

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muhamedgomaaa.ourrepo.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Details", fontSize = 30.sp,
                fontWeight = FontWeight.Bold) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.White,
                    titleContentColor = Color.Black
                ))
        },
        content = {
            Content()
        }
    )
}

@Composable
fun Content() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp)
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {Spacer(modifier = Modifier.height(70.dp))
        Image(
            painter = painterResource(R.drawable.google_logo),
            contentDescription = "Google Logo",
            modifier = Modifier.size(150.dp)
                .padding(top = 10.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "language", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "1525",fontWeight = FontWeight.Bold,fontSize = 20.sp)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "⭐",fontSize = 20.sp)
            Spacer(modifier = Modifier.width(16.dp))
            Text(text = "Python",fontSize = 20.sp,fontWeight = FontWeight.Bold, modifier = Modifier
                .padding(5.dp))
            Image(painter = painterResource(id = R.drawable.record), contentDescription ="Python_IC",
               modifier = Modifier.size(15.dp) )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "347",fontWeight = FontWeight.Bold,fontSize = 20.sp)
            Spacer(modifier = Modifier.width(3.dp))
            Image(painter = painterResource(id = R.drawable.git), contentDescription ="NumIC",
                modifier = Modifier.size(50.dp))
        }
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "Shared repository for open-sourced projects from the Google AI Language team.",
            textAlign = TextAlign.Center,fontSize = 20.sp,fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { /* TODO: Handle Show Issues */ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White
            ),
            modifier = Modifier
                .width(300.dp)
                .padding(16.dp)) {
            Text("Show Issues", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        }
    }
}








@Preview
@Composable
private fun PreviewDetailsItem() {
    MyApp()
}

@Composable
fun DetailsItem() {
    TODO("Not yet implemented")
}
